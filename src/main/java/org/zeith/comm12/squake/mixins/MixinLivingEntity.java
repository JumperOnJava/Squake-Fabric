package org.zeith.comm12.squake.mixins;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LivingEntity.class)
public interface MixinLivingEntity {

    @Accessor("jumping")
    public boolean getJumping();
}