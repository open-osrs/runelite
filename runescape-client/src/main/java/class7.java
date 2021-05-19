import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class7 extends class16 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("NetCache_currentResponse")
	static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 460316475
	)
	static int field66;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	static class369 field60;
	@ObfuscatedName("h")
	String field59;
	@ObfuscatedName("c")
	byte field62;
	@ObfuscatedName("o")
	byte field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1; // L: 154
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		this.field59 = var1.readStringCp1252NullTerminatedOrNull(); // L: 157
		if (this.field59 != null) { // L: 158
			var1.readUnsignedByte(); // L: 159
			this.field62 = var1.readByte(); // L: 160
			this.field61 = var1.readByte(); // L: 161
		}

	} // L: 163

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		var1.field38 = this.field59; // L: 166
		if (this.field59 != null) { // L: 167
			var1.field36 = this.field62; // L: 168
			var1.field37 = this.field61; // L: 169
		}

	} // L: 171

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "2112804757"
	)
	static final void method87(Actor var0) {
		if (var0.field1261 != 0) { // L: 4185
			if (var0.targetIndex != -1) { // L: 4186
				Object var1 = null; // L: 4187
				if (var0.targetIndex < 32768) { // L: 4188
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 4189
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 4190
					int var2 = var0.x - ((Actor)var1).x; // L: 4191
					int var3 = var0.y - ((Actor)var1).y; // L: 4192
					if (var2 != 0 || var3 != 0) { // L: 4193
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4195
					var0.targetIndex = -1; // L: 4196
					var0.false0 = false; // L: 4197
				}
			}

			if (var0.field1247 != -1 && (var0.pathLength == 0 || var0.field1250 > 0)) { // L: 4200
				var0.orientation = var0.field1247; // L: 4201
				var0.field1247 = -1; // L: 4202
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 4204
			if (var4 == 0 && var0.false0) { // L: 4205
				var0.targetIndex = -1; // L: 4206
				var0.false0 = false; // L: 4207
			}

			if (var4 != 0) { // L: 4209
				++var0.field1248; // L: 4210
				boolean var6;
				if (var4 > 1024) { // L: 4211
					var0.rotation -= var0.field1261; // L: 4212
					var6 = true; // L: 4213
					if (var4 < var0.field1261 || var4 > 2048 - var0.field1261) { // L: 4214
						var0.rotation = var0.orientation; // L: 4215
						var6 = false; // L: 4216
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1248 > 25 || var6)) { // L: 4218
						if (var0.turnLeftSequence != -1) { // L: 4219
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4220
						}
					}
				} else {
					var0.rotation += var0.field1261; // L: 4224
					var6 = true; // L: 4225
					if (var4 < var0.field1261 || var4 > 2048 - var0.field1261) { // L: 4226
						var0.rotation = var0.orientation; // L: 4227
						var6 = false; // L: 4228
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1248 > 25 || var6)) { // L: 4230
						if (var0.turnRightSequence != -1) { // L: 4231
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4232
						}
					}
				}

				var0.rotation &= 2047; // L: 4236
			} else {
				var0.field1248 = 0; // L: 4238
			}

		}
	} // L: 4239

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1389420413"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4426
			byte var2 = 4; // L: 4427
			int var3 = var2 + 6; // L: 4428
			int var4 = var2 + 6; // L: 4429
			int var5 = Message.fontPlain12.lineWidth(var0, 250); // L: 4430
			int var6 = Message.fontPlain12.lineCount(var0, 250) * 13; // L: 4431
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0); // L: 4432
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215); // L: 4433
			Message.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4434
			class179.method3586(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2); // L: 4435
			if (var1) { // L: 4436
				WorldMapDecorationType.rasterProvider.drawFull(0, 0); // L: 4437
			} else {
				int var7 = var3; // L: 4440
				int var8 = var4; // L: 4441
				int var9 = var5; // L: 4442
				int var10 = var6; // L: 4443

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4445
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4446
						Client.field826[var11] = true;
					}
				}
			}

		}
	} // L: 4450
}
