import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class135 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 696533307
	)
	int field1509;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class135(class119 var1) {
		this.this$0 = var1;
		this.field1509 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1509 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2661(this.field1509); // L: 153
	} // L: 154

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)[Le;",
		garbageValue = "588193737"
	)
	public static class6[] method2797() {
		return new class6[]{class6.field14}; // L: 12
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method2795(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class317.field3854[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class317.field3854[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class317.field3854[(var6 & 15) << 2 | var7 >>> 6]).append(class317.field3854[var7 & 63]); // L: 71
				} else {
					var3.append(class317.field3854[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class317.field3854[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lct;II)V",
		garbageValue = "-1430389228"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1131 >= Client.cycle) { // L: 4255
			var2 = Math.max(1, var0.field1131 - Client.cycle); // L: 4256
			var3 = var0.field1087 * 64 + var0.field1083 * 128; // L: 4257
			var4 = var0.field1087 * 64 + var0.field1100 * 128; // L: 4258
			var0.x += (var3 - var0.x) / var2; // L: 4259
			var0.y += (var4 - var0.y) / var2; // L: 4260
			var0.field1085 = 0; // L: 4261
			var0.orientation = var0.field1133; // L: 4262
		} else if (var0.field1132 >= Client.cycle) { // L: 4264
			if (var0.field1132 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > MouseHandler.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 4265
				var2 = var0.field1132 - var0.field1131; // L: 4266
				var3 = Client.cycle - var0.field1131; // L: 4267
				var4 = var0.field1087 * 64 + var0.field1083 * 128; // L: 4268
				int var5 = var0.field1087 * 64 + var0.field1100 * 128; // L: 4269
				int var6 = var0.field1087 * 64 + var0.field1128 * 128; // L: 4270
				int var7 = var0.field1087 * 64 + var0.field1130 * 128; // L: 4271
				var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2; // L: 4272
				var0.y = (var3 * var7 + var5 * (var2 - var3)) / var2; // L: 4273
			}

			var0.field1085 = 0; // L: 4275
			var0.orientation = var0.field1133; // L: 4276
			var0.rotation = var0.orientation; // L: 4277
		} else {
			class138.method2836(var0); // L: 4279
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4280
			var0.sequence = -1; // L: 4281
			var0.spotAnimation = -1; // L: 4282
			var0.field1131 = 0; // L: 4283
			var0.field1132 = 0; // L: 4284
			var0.x = var0.field1087 * 64 + var0.pathX[0] * 128; // L: 4285
			var0.y = var0.pathY[0] * 128 + var0.field1087 * 64; // L: 4286
			var0.method2165(); // L: 4287
		}

		if (HealthBarDefinition.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4289 4290
			var0.sequence = -1; // L: 4291
			var0.spotAnimation = -1; // L: 4292
			var0.field1131 = 0; // L: 4293
			var0.field1132 = 0; // L: 4294
			var0.x = var0.pathX[0] * 128 + var0.field1087 * 64; // L: 4295
			var0.y = var0.field1087 * 64 + var0.pathY[0] * 128; // L: 4296
			var0.method2165(); // L: 4297
		}

		WorldMapManager.method3814(var0); // L: 4300
		ClientPacket.method4709(var0); // L: 4301
	} // L: 4302

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "([Ljf;II)V",
		garbageValue = "1696973469"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11320
			Widget var3 = var0[var2]; // L: 11321
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Varcs.isComponentHidden(var3))) { // L: 11322 11323 11324
				if (var3.type == 0) { // L: 11325
					if (!var3.isIf3 && Varcs.isComponentHidden(var3) && var3 != WorldMapData_0.mousedOverWidgetIf1) { // L: 11326
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11327
					if (var3.children != null) { // L: 11328
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11329
					if (var4 != null) { // L: 11330
						DirectByteArrayCopier.method5179(var4.group);
					}
				}

				if (var3.type == 6) { // L: 11332
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11333
						boolean var7 = class128.runCs1(var3); // L: 11334
						if (var7) { // L: 11336
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11337
						}

						if (var5 != -1) { // L: 11338
							SequenceDefinition var6 = MouseHandler.SequenceDefinition_get(var5); // L: 11339

							for (var3.modelFrameCycle += Client.field531; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class184.invalidateWidget(var3)) { // L: 11340 11341 11348
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11342
								++var3.modelFrame; // L: 11343
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11344
									var3.modelFrame -= var6.frameCount; // L: 11345
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11346
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3165 != 0 && !var3.isIf3) { // L: 11352
						int var8 = var3.field3165 >> 16; // L: 11353
						var5 = var3.field3165 << 16 >> 16; // L: 11354
						var8 *= Client.field531; // L: 11355
						var5 *= Client.field531; // L: 11356
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11357
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11358
						class184.invalidateWidget(var3); // L: 11359
					}
				}
			}
		}

	} // L: 11363
}
