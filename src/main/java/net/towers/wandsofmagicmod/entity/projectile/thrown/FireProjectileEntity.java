package net.towers.wandsofmagicmod.entity.projectile.thrown;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.towers.wandsofmagicmod.WandsOfMagicMod;
import net.towers.wandsofmagicmod.item.ModItems;

public class FireProjectileEntity extends ThrownItemEntity {
    public FireProjectileEntity(EntityType<? extends FireProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public FireProjectileEntity(World world, LivingEntity owner) {
        super(WandsOfMagicMod.FIRE_PROJECTILE_ENTITY_TYPE, owner, world);
    }

    public FireProjectileEntity(World world, double x, double y, double z) {
        super(WandsOfMagicMod.FIRE_PROJECTILE_ENTITY_TYPE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.FIRE_PROJECTILE;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int damage = entity instanceof SnowGolemEntity ? 10 : 5;
        entity.setFireTicks(40);
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), damage);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        BlockPos blockPos;
        super.onBlockHit(blockHitResult);
        if (this.world.isClient) {
            return;
        }
        if (this.world.isAir(blockPos = blockHitResult.getBlockPos().offset(blockHitResult.getSide()))) {
            this.world.setBlockState(blockPos, AbstractFireBlock.getState(this.world, blockPos));
        }
    }
}
