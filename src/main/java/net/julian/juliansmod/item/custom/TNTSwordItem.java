package net.julian.juliansmod.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class TNTSwordItem extends SwordItem {

    //Grants explosion resistance
    //can launch tnt on right click

    public TNTSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        p_43280_.level.explode(p_43280_, p_43280_.getX(), p_43280_.getY(0.0625D), p_43280_.getZ(), 0, Level.ExplosionInteraction.TNT);

        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
