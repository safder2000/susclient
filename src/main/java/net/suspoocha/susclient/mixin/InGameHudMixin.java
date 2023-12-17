package net.suspoocha.susclient.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;
import net.suspoocha.susclient.ui.Hud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {
    @Inject(method = "render",at = @At("RETURN"), cancellable = true)
    public void renderHud(DrawContext context, float tickDelta, CallbackInfo ci){
        Hud.render(context,tickDelta );
    }
}