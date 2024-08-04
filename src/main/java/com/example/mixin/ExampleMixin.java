package com.example.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init", remap = false)
	private void init(CallbackInfo info) {
		// This code is injected into the start of Minecraft.init()V
	}
}