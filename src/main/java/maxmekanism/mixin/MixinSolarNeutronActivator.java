package maxmekanism.mixin;

import mekanism.common.tile.machine.TileEntitySolarNeutronActivator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = TileEntitySolarNeutronActivator.class, remap = false)
public class MixinSolarNeutronActivator {

    @ModifyConstant(method = "getInitialChemicalTanks", constant = @Constant(longValue = 10000L))
    private long modifyChemicalTankCapacity(long c) { return Long.MAX_VALUE;}
}
