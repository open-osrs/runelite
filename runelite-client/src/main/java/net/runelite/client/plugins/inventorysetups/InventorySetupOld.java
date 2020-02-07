package net.runelite.client.plugins.inventorysetups;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class InventorySetupOld {
	@Getter(AccessLevel.PUBLIC)
	private List<InventorySetupItem> inventory;
	@Getter(AccessLevel.PUBLIC)
	private List<InventorySetupItem> equipment;
}
