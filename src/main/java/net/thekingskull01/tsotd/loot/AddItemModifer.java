package net.thekingskull01.tsotd.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import net.thekingskull01.tsotd.enchantment.ModEnchantments;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AddItemModifer extends LootModifier {

    public static final Supplier<Codec<AddItemModifer>> CODEC = Suppliers.memoize(()
    -> RecordCodecBuilder.create(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec()
            .fieldOf("item").forGetter(m -> m.item)).apply(inst, AddItemModifer::new)));
    private final Item item;



    public AddItemModifer(LootItemCondition[] conditionsIn, Item item) {
        super(conditionsIn);
        this.item = item;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.LIFE_STEALER.get(), 1));
                EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.AUTO_SMELTING.get(), 1));
                EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.REACHER.get(), 1));
                EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.LIGHTNING_STRIKER.get(), 1));
                return generatedLoot;
            }
        }
        generatedLoot.add(new ItemStack(this.item));

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
