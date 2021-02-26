import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	public static final LoginPacket field2342;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	static final LoginPacket field2339;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	public static final LoginPacket field2336;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	public static final LoginPacket field2338;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	public static final LoginPacket field2337;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	static final LoginPacket field2340;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2092030193
	)
	@Export("id")
	public final int id;

	static {
		field2342 = new LoginPacket(14, 0); // L: 5
		field2339 = new LoginPacket(15, 4); // L: 6
		field2336 = new LoginPacket(16, -2); // L: 7
		field2338 = new LoginPacket(18, -2); // L: 8
		field2337 = new LoginPacket(19, -2); // L: 9
		field2340 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = Tiles.method1217();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1633316338"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111; // L: 26
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Llm;",
		garbageValue = "-560730174"
	)
	static SpritePixels method3816(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(AttackOption.method2203(var0, var1, var2)); // L: 42
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "818544201"
	)
	public static void method3815() {
		try {
			if (class206.musicPlayerStatus == 1) { // L: 66
				int var0 = VertexNormal.midiPcmStream.method3912(); // L: 67
				if (var0 > 0 && VertexNormal.midiPcmStream.isReady()) { // L: 68
					var0 -= class7.pcmSampleLength; // L: 69
					if (var0 < 0) { // L: 70
						var0 = 0;
					}

					VertexNormal.midiPcmStream.setPcmStreamVolume(var0); // L: 71
					return; // L: 72
				}

				VertexNormal.midiPcmStream.clear(); // L: 74
				VertexNormal.midiPcmStream.removeAll(); // L: 75
				if (class206.musicTrackArchive != null) { // L: 76
					class206.musicPlayerStatus = 2;
				} else {
					class206.musicPlayerStatus = 0; // L: 77
				}

				class204.musicTrack = null; // L: 78
				class182.soundCache = null; // L: 79
			}
		} catch (Exception var2) { // L: 82
			var2.printStackTrace(); // L: 83
			VertexNormal.midiPcmStream.clear(); // L: 84
			class206.musicPlayerStatus = 0; // L: 85
			class204.musicTrack = null; // L: 86
			class182.soundCache = null; // L: 87
			class206.musicTrackArchive = null; // L: 88
		}

	} // L: 90

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-73"
	)
	static void method3812(int var0, int var1) {
		MenuAction var2 = class195.tempMenuAction; // L: 10986
		AbstractWorldMapIcon.menuAction(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.action, var2.action, var0, var1); // L: 10988
		class195.tempMenuAction = null; // L: 10990
	} // L: 10991
}
