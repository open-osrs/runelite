package net.runelite.client.plugins.oneclick;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Types
{
	DARTS("Darts"),
	FIREMAKING("Firemaking"),
	BIRDHOUSES("Birdhouses"),
	HERB_TAR("Herb Tar"),
	LAVA_RUNES("Lava Runes"),
	HIGH_ALCH("High Alch"),
	DWARF_CANNON("Dwarf Cannon"),
	BONES("Bones"),
	KARAMBWANS("Karambwans"),
	DARK_ESSENCE("Dark Essence"),
	NONE("None");

	private String name;

	@Override
	public String toString()
	{
		return getName();
	}
}