import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("et")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("eq")
	static int[] field1603;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1268318299
	)
	public int field1596;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -786020391
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1840545813
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2113389855
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -490506125
	)
	public int field1608;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 181606605
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -714777503
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1753833631
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -567773935
	)
	@Export("width")
	public int width;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1691333321
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
		this.field1608 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1613150424"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "98"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			var1.readUnsignedShort(); // L: 51
		} else if (var2 == 2) { // L: 53
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 54
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 55
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 57
			var1.readUnsignedByte(); // L: 58
		} else if (var2 == 7) { // L: 60
			this.frontSpriteID = var1.method6583();
		} else if (var2 == 8) { // L: 61
			this.backSpriteID = var1.method6583();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 62
		} else if (var2 == 14) { // L: 63
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 64
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 66

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Loh;",
		garbageValue = "-48"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 69
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 70
			if (var1 != null) {
				return var1; // L: 71
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 72
				if (var1 != null) { // L: 73
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 75
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)Loh;",
		garbageValue = "-6435"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 79
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 80
			if (var1 != null) {
				return var1; // L: 81
			} else {
				var1 = ClientPacket.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 82
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 83
				}

				return var1; // L: 85
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "459943946"
	)
	public static long method2720(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 56
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "42"
	)
	static final int method2728(int var0, int var1) {
		if (var0 == -1) { // L: 847
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 848
			if (var1 < 2) { // L: 849
				var1 = 2;
			} else if (var1 > 126) { // L: 850
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 851
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-849038542"
	)
	static int method2727(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3495
			Client.logoutTimer = 250; // L: 3496
			return 1; // L: 3497
		} else if (var0 != 5631 && var0 != 5633) { // L: 3499
			if (var0 == 5632) { // L: 3503
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 26; // L: 3504
				return 1; // L: 3505
			} else {
				return 2; // L: 3507
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2; // L: 3500
			return 1; // L: 3501
		}
	}
}
