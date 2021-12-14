import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("p")
	@Export("type")
	char type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -871462947
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("t")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("s")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "630650762"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-46"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1961413058"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class279.method5406(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "404236453"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-893226045"
	)
	static int method3397(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			IsaacCipher.Interpreter_intStackSize -= 3;
			LoginScreenAnimation.queueSoundEffect(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			class18.playSong(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			IsaacCipher.Interpreter_intStackSize -= 2;
			class315.method5822(Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize], Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = 0;
					var4 = 0;
					if (var0 == 3210) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
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
						float var5 = 200.0F * ((float)SecureRandomFuture.clientPreferences.brightness - 0.5F);
						var4 = 100 - Math.round(var5);
					} else if (var3 == 7) {
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.musicVolume / 2.55F);
					} else if (var3 == 8) {
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.soundEffectsVolume / 1.27F);
					} else if (var3 == 9) {
						var4 = Math.round((float)SecureRandomFuture.clientPreferences.areaSoundEffectsVolume / 1.27F);
					}

					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var4;
					return 1;
				}
			} else {
				var3 = 0;
				var4 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (var0 == 3209) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
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
					InterfaceParent.method2142((double)(0.5F + (float)var4 / 200.0F));
				} else if (var3 == 7) {
					var4 = Math.min(Math.max(var4, 0), 100);
					Varcs.method2426(Math.round((float)var4 * 2.55F));
				} else if (var3 == 8) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class20.updateSoundEffectVolume(Math.round((float)var4 * 1.27F));
				} else if (var3 == 9) {
					var4 = Math.min(Math.max(var4, 0), 100);
					Players.method2383(Math.round(1.27F * (float)var4));
				}

				return 1;
			}
		}
	}
}
