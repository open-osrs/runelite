import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 741550747
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 757684467
	)
	@Export("size")
	int size;
	@ObfuscatedName("l")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("k")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("a")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("m")
	@Export("arguments")
	byte[][][] arguments;
	@ObfuscatedName("p")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("s")
	@Export("methods")
	Method[] methods;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Loo;FFFB)F",
		garbageValue = "3"
	)
	static float method601(class390 var0, float var1, float var2, float var3) {
		float var4 = Ignored.method6616(var0.field4416, var0.field4417, var1); // L: 116
		if (Math.abs(var4) < class114.field1435) { // L: 117
			return var1;
		} else {
			float var5 = Ignored.method6616(var0.field4416, var0.field4417, var2); // L: 118
			if (Math.abs(var5) < class114.field1435) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class114.field1436 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = 0.5F * (var6 - var2); // L: 148
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var1 == var6) { // L: 157
								var9 = var12 * 2.0F * var17; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = var12 * ((var10 - var11) * var10 * var17 * 2.0F - (var11 - 1.0F) * (var2 - var1)); // L: 164
								var10 = (var11 - 1.0F) * (var10 - 1.0F) * (var12 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (2.0F * var9 < var17 * 3.0F * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var10 * var12 * 0.5F)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = Ignored.method6616(var0.field4416, var0.field4417, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "-926243112"
	)
	static int method598(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4535
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4536
			return 1; // L: 4537
		} else if (var0 == 6950) { // L: 4539
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4540
			return 1; // L: 4541
		} else {
			return 2; // L: 4543
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "92197601"
	)
	static final void method600() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7841 7842 7848
			if (var0.hitpoints == -1) { // L: 7843
				var0.delay = 0; // L: 7844
				UrlRequester.method2536(var0); // L: 7845
			} else {
				var0.remove(); // L: 7847
			}
		}

	} // L: 7850

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)Z",
		garbageValue = "1785924836"
	)
	static final boolean method599(Widget var0) {
		int var1 = var0.contentType; // L: 12260
		if (var1 == 205) { // L: 12261
			Client.logoutTimer = 250; // L: 12262
			return true; // L: 12263
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12265
				var2 = (var1 - 300) / 2; // L: 12266
				var3 = var1 & 1; // L: 12267
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12268
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12270
				var2 = (var1 - 314) / 2; // L: 12271
				var3 = var1 & 1; // L: 12272
				Client.playerAppearance.method5394(var2, var3 == 1); // L: 12273
			}

			if (var1 == 324) { // L: 12275
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 12276
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 12277
				PacketBufferNode var4 = WallDecoration.getPacketBufferNode(ClientPacket.field3012, Client.packetWriter.isaacCipher); // L: 12279
				Client.playerAppearance.write(var4.packetBuffer); // L: 12280
				Client.packetWriter.addNode(var4); // L: 12281
				return true; // L: 12282
			} else {
				return false; // L: 12284
			}
		}
	}
}
