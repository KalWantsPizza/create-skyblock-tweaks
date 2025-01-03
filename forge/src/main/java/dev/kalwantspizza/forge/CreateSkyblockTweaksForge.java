package dev.kalwantspizza.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.kalwantspizza.CreateSkyblockTweaks;

@Mod(CreateSkyblockTweaks.MOD_ID)
public final class CreateSkyblockTweaksForge {
    public CreateSkyblockTweaksForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(CreateSkyblockTweaks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        CreateSkyblockTweaks.init();
    }
}
