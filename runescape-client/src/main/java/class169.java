import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public enum class169 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field2025(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field2019(3, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field2021(1, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	field2020(2, 3);

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -53306941
	)
	public final int field2022;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2018130907
	)
	@Export("id")
	final int id;

	class169(int var3, int var4) {
		this.field2022 = var3; // L: 16
		this.id = var4; // L: 17
	} // L: 18

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 21
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;Ljava/lang/String;Ljava/lang/String;B)Lku;",
		garbageValue = "35"
	)
	public static Font method3534(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 145
		int var5 = var0.getFileId(var4, var3); // L: 146
		return PrivateChatMode.method5934(var0, var1, var4, var5); // L: 147
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIILeo;[Lfo;I)V",
		garbageValue = "-1437204785"
	)
	static final void method3533(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 197
		int var6 = -1; // L: 198

		while (true) {
			int var7 = var5.method5557(); // L: 200
			if (var7 == 0) { // L: 201
				return; // L: 225
			}

			var6 += var7; // L: 202
			int var8 = 0; // L: 203

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 205
				if (var9 == 0) { // L: 206
					break;
				}

				var8 += var9 - 1; // L: 207
				int var10 = var8 & 63; // L: 208
				int var11 = var8 >> 6 & 63; // L: 209
				int var12 = var8 >> 12; // L: 210
				int var13 = var5.readUnsignedByte(); // L: 211
				int var14 = var13 >> 2; // L: 212
				int var15 = var13 & 3; // L: 213
				int var16 = var11 + var1; // L: 214
				int var17 = var10 + var2; // L: 215
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 216
					int var18 = var12; // L: 217
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 218
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 219
					if (var18 >= 0) { // L: 220
						var19 = var4[var18];
					}

					class7.method90(var12, var16, var17, var6, var15, var14, var3, var19); // L: 221
				}
			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "725246299"
	)
	static boolean method3529() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 9900
	}
}
