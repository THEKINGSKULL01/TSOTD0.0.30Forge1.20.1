package net.thekingskull01.tsotd.entity.layers;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.thekingskull01.tsotd.TSOTD;

public class ModModelLayers {
    public static final ModelLayerLocation SCULVORT_LAYER = new ModelLayerLocation(
            new ResourceLocation(TSOTD.MOD_ID, "sculvort_layer"), "sculvort_layer"
    );

    public static final ModelLayerLocation FEATHDA_LAYER = new ModelLayerLocation(
            new ResourceLocation(TSOTD.MOD_ID, "feathda_layer"), "feathda_layer"
    );

    public static final ModelLayerLocation DIAMOND_SPEAR_LAYER = new ModelLayerLocation(
            new ResourceLocation(TSOTD.MOD_ID, "diamond_spear"), "diamond_spear"
    );

    public static final ModelLayerLocation DIAMOND_SCYTHE_LAYER = new ModelLayerLocation(
            new ResourceLocation(TSOTD.MOD_ID, "diamond_scythe"), "diamond_scythe"
    );

    public static final ModelLayerLocation RED_CRYSTAL_SCYTHE_LAYER = new ModelLayerLocation(
            new ResourceLocation(TSOTD.MOD_ID, "red_crystal_scythe"), "red_crystal_scythe"
    );
}
