import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field1863;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -325466885
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 522457699
	)
	public int field1862;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 685524889
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1399118515
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1978967279
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1746211851
	)
	public int field1866;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -660483005
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1226121631
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1146936599
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1563343657
	)
	@Export("width")
	public int width;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1571067937
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1866 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1265984356"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "7"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) { // L: 61
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte(); // L: 63
		} else if (var2 == 7) { // L: 65
			this.frontSpriteID = var1.method7692();
		} else if (var2 == 8) { // L: 66
			this.backSpriteID = var1.method7692();
		} else if (var2 == 11) { // L: 67
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 68
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 69
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 71

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "1780689910"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) {
				return var1; // L: 76
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1863, this.frontSpriteID, 0); // L: 77
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 78
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1861454537"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = class6.SpriteBuffer_getSprite(field1863, this.backSpriteID, 0); // L: 87
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 88
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1984956667"
	)
	public static void method3473() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 45
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 46
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 47
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 48
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 49
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 51
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 52
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 53
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 54
		}
	} // L: 56

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public static void method3466() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 437
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 438
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 439
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 440
	} // L: 441
}
