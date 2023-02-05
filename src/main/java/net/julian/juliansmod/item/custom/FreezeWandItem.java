package net.julian.juliansmod.item.custom;

import net.julian.juliansmod.entity.ModEntitiesTypes;
import net.julian.juliansmod.entity.custom.IceBall;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class FreezeWandItem extends Item {
    //while holding right click, shoot out a blue beam and if it hits an enemy, it damages it
    public FreezeWandItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        if(!p_41432_.isClientSide){
            Vec3 lookVec = p_41433_.getLookAngle();

            IceBall iceBall = new IceBall(ModEntitiesTypes.ICE_BALL.get(), p_41432_);

            p_41432_.addFreshEntity(iceBall);

            iceBall.shoot(lookVec.x, lookVec.y, lookVec.z, 5,0);
        }
        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
