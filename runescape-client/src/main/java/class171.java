import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class171 {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-592340813"
	)
	public static int method3614(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1088637460"
	)
	public static double[] method3616(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 17
		double[] var6 = new double[var5]; // L: 18
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = CollisionMap.method3213((double)var7, var0, var2); // L: 20
			++var7; // L: 19
		}

		return var6; // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILez;II)V",
		garbageValue = "671627265"
	)
	static void method3612(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 59
		var5.plane = var0; // L: 60
		var5.x = var1 * 128; // L: 61
		var5.y = var2 * 128; // L: 62
		int var6 = var3.sizeX; // L: 63
		int var7 = var3.sizeY; // L: 64
		if (var4 == 1 || var4 == 3) { // L: 65
			var6 = var3.sizeY; // L: 66
			var7 = var3.sizeX; // L: 67
		}

		var5.field937 = (var6 + var1) * 128; // L: 69
		var5.field944 = (var7 + var2) * 128; // L: 70
		var5.soundEffectId = var3.ambientSoundId; // L: 71
		var5.field939 = var3.field1801 * 128; // L: 72
		var5.field941 = var3.int5; // L: 73
		var5.field943 = var3.int6; // L: 74
		var5.soundEffectIds = var3.soundEffectIds; // L: 75
		if (var3.transforms != null) { // L: 76
			var5.obj = var3; // L: 77
			var5.set(); // L: 78
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 80
		if (var5.soundEffectIds != null) { // L: 81
			var5.field945 = var5.field941 + (int)(Math.random() * (double)(var5.field943 - var5.field941));
		}

	} // L: 82

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1022341437"
	)
	public static int[] method3615() {
		int[] var0 = new int[KeyHandler.field271]; // L: 249

		for (int var1 = 0; var1 < KeyHandler.field271; ++var1) { // L: 250
			var0[var1] = KeyHandler.field257[var1]; // L: 251
		}

		return var0; // L: 253
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1497317992"
	)
	public static void method3613() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 177
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 178
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 179
	} // L: 180

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "81"
	)
	static boolean method3611() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4856
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	static final void method3610() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7678
		var0.importIndex(); // L: 7679
		int var1 = var0.readBits(8); // L: 7680
		int var2;
		if (var1 < Client.npcCount) { // L: 7681
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7682
				Client.field859[++Client.field783 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7684
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7685

			for (var2 = 0; var2 < var1; ++var2) { // L: 7686
				int var3 = Client.npcIndices[var2]; // L: 7687
				NPC var4 = Client.npcs[var3]; // L: 7688
				int var5 = var0.readBits(1); // L: 7689
				if (var5 == 0) { // L: 7690
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7691
					var4.npcCycle = Client.cycle; // L: 7692
				} else {
					int var6 = var0.readBits(2); // L: 7695
					if (var6 == 0) { // L: 7696
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7697
						var4.npcCycle = Client.cycle; // L: 7698
						Client.field763[++Client.field636 - 1] = var3; // L: 7699
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7702
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7703
							var4.npcCycle = Client.cycle; // L: 7704
							var7 = var0.readBits(3); // L: 7705
							var4.method2343(var7, (byte)1); // L: 7706
							var8 = var0.readBits(1); // L: 7707
							if (var8 == 1) { // L: 7708
								Client.field763[++Client.field636 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7711
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7712
							var4.npcCycle = Client.cycle; // L: 7713
							var7 = var0.readBits(3); // L: 7714
							var4.method2343(var7, (byte)2); // L: 7715
							var8 = var0.readBits(3); // L: 7716
							var4.method2343(var8, (byte)2); // L: 7717
							int var9 = var0.readBits(1); // L: 7718
							if (var9 == 1) {
								Client.field763[++Client.field636 - 1] = var3; // L: 7719
							}
						} else if (var6 == 3) { // L: 7722
							Client.field859[++Client.field783 - 1] = var3; // L: 7723
						}
					}
				}
			}

		}
	} // L: 7727
}
