import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("il")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1649709869
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "-52"
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)V",
		garbageValue = "2103513845"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1737706956"
	)
	static int method4530(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			var3 = WorldMapSprite.getWidget(var4);
		} else {
			var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			UrlRequester.Interpreter_intStackSize -= 2;
			var3.scrollX = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			if (var3.scrollX > var3.scrollWidth - var3.width) {
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) {
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (var3.scrollY > var3.scrollHeight - var3.height) {
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) {
				var3.scrollY = 0;
			}

			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
			class234.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			UrlRequester.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 5];
			class234.invalidateWidget(var3);
			return 1;
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
				var8 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (var8 != var3.sequenceId) {
					var3.sequenceId = var8;
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
					class234.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
				var3.modelOrthog = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) {
				String var7 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
				if (!var7.equals(var3.text)) {
					var3.text = var7;
					class234.invalidateWidget(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
				var3.fontId = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
				UrlRequester.Interpreter_intStackSize -= 3;
				var3.textXAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var3.textYAlignment = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				var3.textLineHeight = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
				var3.textShadowed = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
				var3.outline = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
				var3.spriteShadow = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
				UrlRequester.Interpreter_intStackSize -= 2;
				var3.scrollWidth = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var3.scrollHeight = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				class234.invalidateWidget(var3);
				if (var4 != -1 && var3.type == 0) {
					WorldMapIcon_0.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
				WorldMapArea.resumePauseWidget(var3.id, var3.childIndex);
				Client.meslayerContinueWidget = var3;
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1122) {
				var3.spriteId = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
				var3.color2 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == 1124) {
				var3.transparencyBot = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class234.invalidateWidget(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) {
				var8 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				class332 var6 = (class332)FaceNormal.findEnumerated(MusicPatch.FillMode_values(), var8);
				if (var6 != null) {
					var3.fillMode = var6;
					class234.invalidateWidget(var3);
				}

				return 1;
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
					var5 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					var3.field2633 = var5;
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
					var5 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
					var3.modelTransparency = var5;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "93"
	)
	public static void method4523(boolean var0) {
		if (var0 != SoundCache.ItemDefinition_inMembersWorld) {
			ItemDefinition.ItemDefinition_cached.clear();
			ItemDefinition.ItemDefinition_cachedModels.clear();
			ItemDefinition.ItemDefinition_cachedSprites.clear();
			SoundCache.ItemDefinition_inMembersWorld = var0;
		}

	}
}
