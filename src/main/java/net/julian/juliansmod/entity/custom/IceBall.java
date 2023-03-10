package net.julian.juliansmod.entity.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.NetworkHooks;

public class IceBall extends Projectile {
    public IceBall(EntityType<? extends Projectile> p_37248_, Level p_37249_) {
        super(p_37248_, p_37249_);
    }

    @Override
    public void tick() {
        Level level = this.getLevel();

        if (level.isClientSide) {
            level.addParticle(ParticleTypes.FLAME, this.getX(), this.getY(), this.getZ(),
                    0,0 ,0);
        }

        super.tick();
    }

    @Override
    protected void onHitEntity(EntityHitResult p_37259_) {
        LivingEntity hitEntity = (LivingEntity) p_37259_.getEntity();

        hitEntity.hurt(DamageSource.FREEZE, 20 * 6);
        super.onHitEntity(p_37259_);
    }

    @Override
    protected void defineSynchedData() {

    }
    protected void onHitBlock(BlockHitResult p_37239_) {
        super.onHitBlock(p_37239_);
        if (!this.level.isClientSide) {
            this.discard();
        }

    }
    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
