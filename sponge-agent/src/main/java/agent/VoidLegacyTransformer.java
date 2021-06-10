package agent;

import org.spongepowered.asm.service.ILegacyClassTransformer;

public class VoidLegacyTransformer implements ILegacyClassTransformer {
    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public boolean isDelegationExcluded() {
        return false;
    }

    @Override
    public byte[] transformClassBytes(String name, String transformedName, byte[] basicClass) {
        return basicClass;
    }
}
