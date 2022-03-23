import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class67 {
	@ObfuscatedName("v")
	static final BigInteger field875;
	@ObfuscatedName("o")
	static final BigInteger field878;

	static {
		field875 = new BigInteger("10001", 16); // L: 6
		field878 = new BigInteger("a297f6692a7a1d8b2786f93cf85ef1d85f2a702a6f04b4503c079d0c3970d7a7bda84292dd1c8249b1cd8d0eb0fe10e16ad2d42a7fbbb321f4f5603afec3f13a03d534b8e2233ba479c346208306d2d816ef9f8f1ee69896d2cd1f3dfcb7d8e5987ed6e9412f962811bfbfb59b689ce506438d4f3c8dfb5c95c1670ad4d2e767", 16); // L: 7
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgz;",
		garbageValue = "-61"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = WorldMapID.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemComposition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!HealthBar.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 105
					var1.groundActions[var3] = null; // L: 106
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 108
					if (var3 != 4) { // L: 109
						var1.inventoryActions[var3] = null; // L: 110
					}
				}

				var1.shiftClickIndex = -2; // L: 113
				var1.team = 0; // L: 114
				if (var1.params != null) { // L: 115
					boolean var6 = false; // L: 116

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 117
						ParamComposition var5 = class182.getParamDefinition((int)var4.key); // L: 118
						if (var5.autoDisable) { // L: 119
							var4.remove();
						} else {
							var6 = true; // L: 120
						}
					}

					if (!var6) { // L: 122
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0); // L: 125
			return var1; // L: 126
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-945554584"
	)
	public static byte[] method1878() {
		byte[] var0 = new byte[24]; // L: 222

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 224
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 225

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 226 227 228
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 230
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 233
				var0[var2] = -1;
			}
		}

		return var0; // L: 235
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "0"
	)
	static final boolean method1879(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 249
		Buffer var4 = new Buffer(var0); // L: 250
		int var5 = -1; // L: 251

		label71:
		while (true) {
			int var6 = var4.method7775(); // L: 253
			if (var6 == 0) { // L: 254
				return var3; // L: 285
			}

			var5 += var6; // L: 255
			int var7 = 0; // L: 256
			boolean var8 = false; // L: 257

			while (true) {
				int var9;
				while (!var8) { // L: 259
					var9 = var4.readUShortSmart(); // L: 265
					if (var9 == 0) { // L: 266
						continue label71;
					}

					var7 += var9 - 1; // L: 267
					int var10 = var7 & 63; // L: 268
					int var11 = var7 >> 6 & 63; // L: 269
					int var12 = var4.readUnsignedByte() >> 2; // L: 270
					int var13 = var11 + var1; // L: 271
					int var14 = var10 + var2; // L: 272
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 273
						ObjectComposition var15 = class116.getObjectDefinition(var5); // L: 274
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 275
							if (!var15.needsModelFiles()) { // L: 276
								++Client.field543; // L: 277
								var3 = false; // L: 278
							}

							var8 = true; // L: 280
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 260
				if (var9 == 0) { // L: 261
					break;
				}

				var4.readUnsignedByte(); // L: 262
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "12"
	)
	public static final void method1881(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			SecureRandomFuture.field949 = var0; // L: 50
			PcmPlayer.PcmPlayer_stereo = var1; // L: 51
			class33.field237 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53
}
