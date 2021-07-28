import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
public class class122 extends class103 {
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1989302825
	)
	static int field1425;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 780925071
	)
	int field1428;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class122(class106 var1) {
		this.this$0 = var1;
		this.field1428 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1428 = var1.readUnsignedShort();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2368(this.field1428);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "176327609"
	)
	static int method2507(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			Interpreter.Interpreter_intStackSize -= 3;
			class127.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class41.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			UrlRequest.method2136(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return 2;
				} else {
					var3 = 0;
					var4 = 0;
					if (var0 == 3210) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					} else if (var0 == 3182) {
						var3 = 6;
					} else if (var0 == 3204) {
						var3 = 7;
					} else if (var0 == 3206) {
						var3 = 8;
					} else if (var0 == 3208) {
						var3 = 9;
					}

					if (var3 == 6) {
						float var5 = 200.0F * ((float)Decimator.clientPreferences.field1117 - 0.5F);
						var4 = 100 - Math.round(var5);
					} else if (var3 == 7) {
						var4 = Math.round((float)Decimator.clientPreferences.musicVolume / 2.55F);
					} else if (var3 == 8) {
						var4 = Math.round((float)Decimator.clientPreferences.soundEffectsVolume / 1.27F);
					} else if (var3 == 9) {
						var4 = Math.round((float)Decimator.clientPreferences.areaSoundEffectsVolume / 1.27F);
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
					return 1;
				}
			} else {
				var3 = 0;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var0 == 3209) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				} else if (var0 == 3181) {
					var3 = 6;
				} else if (var0 == 3203) {
					var3 = 7;
				} else if (var0 == 3205) {
					var3 = 8;
				} else if (var0 == 3207) {
					var3 = 9;
				}

				if (var3 == 6) {
					var4 = 100 - Math.min(Math.max(var4, 0), 100);
					BuddyRankComparator.method2200((double)(0.5F + (float)var4 / 200.0F));
				} else if (var3 == 7) {
					var4 = Math.min(Math.max(var4, 0), 100);
					TaskHandler.method2582(Math.round((float)var4 * 2.55F));
				} else if (var3 == 8) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class98.updateSoundEffectVolume(Math.round(1.27F * (float)var4));
				} else if (var3 == 9) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class16.method175(Math.round(1.27F * (float)var4));
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-17"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7;
			return var8 * (128 - var7) + var7 * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Lio;",
		garbageValue = "906479328"
	)
	static Widget method2505(Widget var0) {
		int var1 = class6.method43(MusicPatchNode.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = UrlRequester.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
