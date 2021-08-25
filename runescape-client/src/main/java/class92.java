import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class class92 {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 301530703
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1153967351
	)
	int field1225;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1540571559
	)
	int field1227;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1163607269
	)
	int field1226;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -242841763
	)
	int field1228;

	class92(int var1, int var2, int var3, int var4) {
		this.field1225 = var1;
		this.field1227 = var2;
		this.field1226 = var3;
		this.field1228 = var4;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "567219096"
	)
	int method2233() {
		return this.field1225;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-57"
	)
	int method2232() {
		return this.field1227;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "877074103"
	)
	int method2243() {
		return this.field1226;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "706409085"
	)
	int method2234() {
		return this.field1228;
	}
}
