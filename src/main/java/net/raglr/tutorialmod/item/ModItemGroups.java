package net.raglr.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raglr.tutorialmod.TutorialMod;
import net.raglr.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup DOMNAH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "domnah_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DOMNAH))
                    .displayName(Text.translatable("itemgroup.tutorialmod.domnah_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DOMNAH);
                        entries.add(ModItems.DOMNAH_INGOT);
                    }).build());

    public static final ItemGroup DOMNAH_Blocks_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "domnah_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DOMNAH_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.domnah_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DOMNAH_BLOCK);
                        entries.add(ModBlocks.DOMNAH_INGOT_BLOCK);
                    }).build());

    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Mod Item Groups for " + TutorialMod.MOD_ID);
    }
}
