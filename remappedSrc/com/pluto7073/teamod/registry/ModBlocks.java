package com.pluto7073.teamod.registry;

import com.pluto7073.teamod.TeaMod;
import com.pluto7073.teamod.block.TeaCrop;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.block.Block;
import net.minecraft.world.World;

public class ModBlocks {

    public static final Block TEA_CROP = new TeaCrop();

    public static void registerBlocks() {
        System.out.println("Registering Items");
        Registry.register(Registry.BLOCK, new Identifier(TeaMod.MOD_ID, "tea_crop"), TEA_CROP);
    }
}
