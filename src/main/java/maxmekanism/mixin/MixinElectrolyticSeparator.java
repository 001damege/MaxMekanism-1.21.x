package maxmekanism.mixin;

import mekanism.common.tile.machine.TileEntityElectrolyticSeparator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = TileEntityElectrolyticSeparator.class, remap = false)
public class MixinElectrolyticSeparator {

    @ModifyConstant(method = "getInitialChemicalTanks", constant = @Constant(longValue = 2400L))
    private long modifyChemicalTankCapacity(long c) { return Long.MAX_VALUE;}

    @ModifyConstant(method = "getInitialFluidTanks", constant = @Constant(intValue = 24000))
    private int modifyFluidTankCapacity(int c) { return Integer.MAX_VALUE;}
}
