package agent.mixins;

import agent.Mappings;
import net.runelite.rs.api.RSClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = Mappings.clientInstanceClass)
public class ClientInstanceMixin {

    @Shadow
    public static RSClient client;

    @Inject(method = "getObjectDefinition", at = @At(value = "RETURN"), remap = false)
    private static void ongetObjectDefinition(int i, CallbackInfoReturnable callbackInfo)
    {
        System.out.println(client == null);
        if (client != null)
            if (client.api$getCameraX() != 0)
                System.out.println(client.api$getCameraX());
    }
}
