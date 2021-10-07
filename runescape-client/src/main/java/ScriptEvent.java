import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("l")
	@Export("args")
	Object[] args;
	@ObfuscatedName("q")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -16564539
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -682131027
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1167365765
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -334465261
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1224571083
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("i")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1064106161
	)
	int field1037;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2078183665
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1467724189"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1722413774"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "460269771"
	)
	static int method2066(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
			class184.queueSoundEffect(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			WorldMapSprite.playSong(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			PcmPlayer.method741(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize], Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
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
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
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
						float var5 = 200.0F * ((float)WorldMapDecorationType.clientPreferences.brightness - 0.5F);
						var4 = 100 - Math.round(var5);
					} else if (var3 == 7) {
						var4 = Math.round((float)WorldMapDecorationType.clientPreferences.musicVolume / 2.55F);
					} else if (var3 == 8) {
						var4 = Math.round((float)WorldMapDecorationType.clientPreferences.soundEffectsVolume / 1.27F);
					} else if (var3 == 9) {
						var4 = Math.round((float)WorldMapDecorationType.clientPreferences.areaSoundEffectsVolume / 1.27F);
					}

					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var4;
					return 1;
				}
			} else {
				var3 = 0;
				var4 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (var0 == 3209) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
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
					class268.method5105((double)(0.5F + (float)var4 / 200.0F));
				} else if (var3 == 7) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class29.method430(Math.round(2.55F * (float)var4));
				} else if (var3 == 8) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class129.updateSoundEffectVolume(Math.round(1.27F * (float)var4));
				} else if (var3 == 9) {
					var4 = Math.min(Math.max(var4, 0), 100);
					GrandExchangeOfferOwnWorldComparator.method1104(Math.round(1.27F * (float)var4));
				}

				return 1;
			}
		}
	}
}
