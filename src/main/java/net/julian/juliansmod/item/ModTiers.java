package net.julian.juliansmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    //tool tier, like stone or diamond
    public static final ForgeTier ZIRCON = new ForgeTier(2, 1400, 1.5f, 2f, 22,
            BlockTags.NEEDS_IRON_TOOL, ()-> Ingredient.of(ModItems.ZIRCON.get()));


}
