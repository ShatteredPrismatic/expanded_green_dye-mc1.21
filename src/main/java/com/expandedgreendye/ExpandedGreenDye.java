package com.expandedgreendye;
import com.expandedgreendye.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpandedGreenDye implements ModInitializer {
	public static final String MOD_ID = "expanded_green_dye";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
		ModItems.AddToGroups();
	}
}