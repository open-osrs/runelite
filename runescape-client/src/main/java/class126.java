import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class126 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -3842845710666604635L
	)
	long field1526;
	@ObfuscatedName("o")
	String field1527;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1526 = -1L; // L: 74
		this.field1527 = null; // L: 75
	} // L: 77

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-73"
	)
	void vmethod3107(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1526 = var1.readLong(); // L: 82
		}

		this.field1527 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leh;I)V",
		garbageValue = "-1228032820"
	)
	void vmethod3104(ClanSettings var1) {
		var1.method2918(this.field1526, this.field1527, 0); // L: 88
	} // L: 89

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "82"
	)
	public static String method2817(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class123.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1862606861"
	)
	public static void method2819() {
		try {
			if (class273.musicPlayerStatus == 1) { // L: 42
				int var0 = WorldMapEvent.midiPcmStream.method5369(); // L: 43
				if (var0 > 0 && WorldMapEvent.midiPcmStream.isReady()) { // L: 44
					var0 -= class273.pcmSampleLength; // L: 45
					if (var0 < 0) { // L: 46
						var0 = 0;
					}

					WorldMapEvent.midiPcmStream.setPcmStreamVolume(var0); // L: 47
					return; // L: 48
				}

				WorldMapEvent.midiPcmStream.clear(); // L: 50
				WorldMapEvent.midiPcmStream.removeAll(); // L: 51
				if (class147.musicTrackArchive != null) { // L: 52
					class273.musicPlayerStatus = 2;
				} else {
					class273.musicPlayerStatus = 0; // L: 53
				}

				class273.musicTrack = null; // L: 54
				class273.soundCache = null; // L: 55
			}
		} catch (Exception var2) { // L: 58
			var2.printStackTrace(); // L: 59
			WorldMapEvent.midiPcmStream.clear(); // L: 60
			class273.musicPlayerStatus = 0; // L: 61
			class273.musicTrack = null; // L: 62
			class273.soundCache = null; // L: 63
			class147.musicTrackArchive = null; // L: 64
		}

	} // L: 66

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "33"
	)
	static final void method2820(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 177
			for (int var4 = 0; var4 < 8; ++var4) { // L: 178
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 180
			for (var3 = 1; var3 < 8; ++var3) { // L: 181
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 183
			for (var3 = 1; var3 < 8; ++var3) { // L: 184
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 186
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 187
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 188
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 189
}
