package com.pluto7073.teamod.registry;

import com.pluto7073.teamod.TeaMod;
import com.pluto7073.teamod.item.*;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TEA_LEAF = new TeaLeaf();
    public static final Item DRIED_TEA_LEAF = new DriedTeaLeaf();
    public static final Item TEA_BAG = new TeaBag();
    public static final Item TEA = new Tea();
    public static final Item MORNING_TEA = new MorningTea();
    public static final Item MORNING_TEA_BAG = new MorningTeaBag();
    public static final Item HEALING_TEA = new HealingTea();
    public static final Item HEALING_TEA_BAG = new MorningTeaBag();
    public static final Item TEA_SEEDS = new TeaSeeds();
    public static final Item NOTCH_TEA = new NotchTea();

    public static void registerItems() {
        System.out.println("Registering Blocks");
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "tea_leaf"), TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "dried_tea_leaf"), DRIED_TEA_LEAF);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "tea_bag"), TEA_BAG);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "tea"), TEA);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "morning_tea"), MORNING_TEA);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "morning_tea_bag"), MORNING_TEA_BAG);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "healing_tea"), HEALING_TEA);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "healing_tea_bag"), HEALING_TEA_BAG);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "notch_tea"), NOTCH_TEA);
        Registry.register(Registry.ITEM, new Identifier(TeaMod.MOD_ID, "tea_seeds"), new AliasedBlockItem(ModBlocks.TEA_CROP, new Item.Settings().group(ItemGroup.MATERIALS)));
    }
}
