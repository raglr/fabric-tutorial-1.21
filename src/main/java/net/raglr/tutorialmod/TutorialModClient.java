package net.raglr.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.raglr.tutorialmod.item.ModItems;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModItems.registerModItems();
    }
}
