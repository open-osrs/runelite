package agent.mixins;

import agent.Mappings;
import net.runelite.api.ObjectComposition;
import net.runelite.rs.api.RSClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = Mappings.clientInstanceClass)
public class ClientInstanceMixin {

    @Inject(method = "getObjectDefinition", at = @At(value = "RETURN"), remap = false)
    private static void ongetObjectDefinition(int i, CallbackInfoReturnable<ObjectComposition> callbackInfo)
    {
        System.out.println("blah");
    }
}
