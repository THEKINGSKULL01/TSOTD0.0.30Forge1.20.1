package net.thekingskull01.tsotd.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AddEnchantedItemModifier extends LootModifier {
    public static final Supplier<Codec<AddEnchantedItemModifier>> CODEC = Suppliers.memoize(
            () -> RecordCodecBuilder.create(inst -> codecStart(inst).and(inst.group(
                    ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item),
                    ForgeRegistries.ENCHANTMENTS.getCodec().fieldOf("enchantment").forGetter(m -> m.enchantment),
                    Codec.INT.fieldOf("level").forGetter(m -> m.level)
            )).apply(inst, AddEnchantedItemModifier::new)
            ));

    private final Item item;
    private final Enchantment enchantment;
    private final int level;
    public AddEnchantedItemModifier(LootItemCondition[] conditionsIn,
                                       Item item, Enchantment enchantment, int level) {
        super(conditionsIn);
        this.item = item;
        this.enchantment = enchantment;
        this.level = level;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }

        ItemStack enchantedItem = new ItemStack(this.item);
        enchantedItem.enchant(this.enchantment, this.level);
        generatedLoot.add(enchantedItem);

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
