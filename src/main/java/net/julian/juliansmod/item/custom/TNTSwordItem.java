package net.julian.juliansmod.item.custom;

import net.julian.juliansmod.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class TNTSwordItem extends SwordItem {

    //Every time that you hit a mob, it causes explosion damage
    //Grants explosion resistance
    //can launch tnt on right click

    public TNTSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
