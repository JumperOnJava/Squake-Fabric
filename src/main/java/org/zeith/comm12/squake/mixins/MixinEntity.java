package org.zeith.comm12.squake.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.zeith.comm12.squake.SquakeClientPlayer;

@Mixin(Entity.class)
public class MixinEntity
{
	@Inject(
			method = "updateVelocity",
			at = @At("HEAD"),
			cancellable = true
	)
	public void moveRelativeBase(float friction, Vec3d relative, CallbackInfo ci)
	{
		if(SquakeClientPlayer.moveRelativeBase((Entity) (Object) this, (float) relative.x, (float) relative.y, (float) relative.z, friction))
			ci.cancel();
	}


}