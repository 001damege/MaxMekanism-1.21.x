package maxmekanism;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.common.NeoForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MaxMekanism {

    public static final String MODID = "maxmekanism";
    public static final String MOD_NAME = "MaxMekanism";
    public static final Logger LOGGER = LogManager.getLogger();

    public MaxMekanism(IEventBus modEventBus, ModContainer container) {
        NeoForge.EVENT_BUS.register(this);
    }
}
