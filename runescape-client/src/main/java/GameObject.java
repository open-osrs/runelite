import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 688960621
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -77952931
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1125235357
	)
	@Export("height")
	int height;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1533148227
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 584505067
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("entity")
	public Entity entity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1255599163
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1704615809
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 285662481
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1961759739
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1646674611
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1353315181
	)
	int field1953;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2024617529
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 5601843375615020219L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 16020691
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19
}
