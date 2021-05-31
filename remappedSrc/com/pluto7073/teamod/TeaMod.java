package com.pluto7073.teamod;

import com.pluto7073.teamod.registry.ModBlocks;
import com.pluto7073.teamod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class TeaMod implements ModInitializer {

    public static final String MOD_ID = "teamod";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
