import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	public static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -72609311
	)
	public int field3314;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2108314947
	)
	public int int1;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1537532305
	)
	public int int2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -778241871
	)
	public int int3;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2007906497
	)
	public int field3310;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1932692413
	)
	public int int5;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2140238063
	)
	int frontSpriteID;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1649741031
	)
	int backSpriteID;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 197104923
	)
	public int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 127920675
	)
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field3310 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "1885032868"
	)
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 43
			if (var2 == 0) { // L: 44
				return; // L: 47
			}

			this.decodeNext(var1, var2); // L: 45
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "808317446"
	)
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 50
			var1.readUnsignedShort(); // L: 51
		} else if (var2 == 2) { // L: 53
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 54
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 55
			this.int3 = 0;
		} else if (var2 == 5) { // L: 56
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 57
			var1.readUnsignedByte(); // L: 58
		} else if (var2 == 7) { // L: 60
			this.frontSpriteID = var1.method5634();
		} else if (var2 == 8) { // L: 61
			this.backSpriteID = var1.method5634();
		} else if (var2 == 11) { // L: 62
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 63
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 64
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 66

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "-1096535425"
	)
	public Sprite getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 69
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 70
			if (var1 != null) {
				return var1; // L: 71
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0); // L: 72
				if (var1 != null) { // L: 73
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 75
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Llp;",
		garbageValue = "1"
	)
	public Sprite getBackSprite() {
		if (this.backSpriteID < 0) { // L: 79
			return null;
		} else {
			Sprite var1 = (Sprite)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 80
			if (var1 != null) { // L: 81
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0); // L: 82
				if (var1 != null) { // L: 83
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 85
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1134464400"
	)
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 183
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 184
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 185
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "-91"
	)
	static String method4563(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 10752
		if (Client.gameBuild == 1) { // L: 10753
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 10754
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 10755
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 10756
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 10757
			var0 = "local";
		}

		String var3 = ""; // L: 10758
		if (class200.field2403 != null) { // L: 10759
			var3 = "/p=" + class200.field2403;
		}

		String var4 = "runescape.com"; // L: 10760
		return var2 + var0 + "." + var4 + "/l=" + class58.clientLanguage + "/a=" + GrandExchangeOffer.field99 + var3 + "/"; // L: 10761
	}
}
