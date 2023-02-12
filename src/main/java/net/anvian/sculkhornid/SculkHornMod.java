package net.anvian.sculkhornid;

import com.mojang.logging.LogUtils;
import net.anvian.sculkhornid.config.ModConfigs;
import net.anvian.sculkhornid.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SculkHornMod.MOD_ID)
public class SculkHornMod
{
    public static final String MOD_ID = "sculkhornid";
    private static final Logger LOGGER = LogUtils.getLogger();
    public SculkHornMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModConfigs.registerConfig();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }
}
