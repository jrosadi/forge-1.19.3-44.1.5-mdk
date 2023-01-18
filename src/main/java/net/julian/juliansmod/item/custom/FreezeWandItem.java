package net.julian.juliansmod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FreezeWandItem extends Item {
    //while holding right click, shoot out a blue beam and if it hits an enemy, it damages it
    public FreezeWandItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {

        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
