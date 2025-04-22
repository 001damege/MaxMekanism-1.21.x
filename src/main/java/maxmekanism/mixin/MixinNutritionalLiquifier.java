package maxmekanism.mixin;

import mekanism.common.tile.machine.TileEntityNutritionalLiquifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = TileEntityNutritionalLiquifier.class, remap = false)
public class MixinNutritionalLiquifier {

    @ModifyConstant(method = "getInitialFluidTanks", constant = @Constant(intValue = 10000))
    private int modifyFluidTankCapacity(int c) { return Integer.MAX_VALUE;}
}
