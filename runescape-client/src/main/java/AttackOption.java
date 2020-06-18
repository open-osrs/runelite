import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lco;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lco;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lco;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lco;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		signature = "Lcy;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "[Llz;"
	)
	@Export("mapDotSprites")
	static Sprite[] mapDotSprites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -942694603
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)Llh;",
		garbageValue = "-1275433341"
	)
	public static IndexedSprite method2173() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class335.SpriteBuffer_spriteWidth;
		var0.height = UserComparator8.SpriteBuffer_spriteHeight;
		var0.xOffset = class335.SpriteBuffer_xOffsets[0];
		var0.yOffset = NPC.SpriteBuffer_yOffsets[0];
		var0.subWidth = class335.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class335.SpriteBuffer_spriteHeights[0];
		var0.palette = class335.SpriteBuffer_spritePalette;
		var0.pixels = ItemDefinition.SpriteBuffer_pixels[0];
		GrandExchangeEvent.method158();
		return var0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-37"
	)
	public static void method2181() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(ILcs;ZB)I",
		garbageValue = "-99"
	)
	static int method2180(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			UrlRequester.Interpreter_intStackSize -= 2;
			Client.field727 = (short)GrandExchangeOffer.method176(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize]);
			if (Client.field727 <= 0) {
				Client.field727 = 256;
			}

			Client.field924 = (short)GrandExchangeOffer.method176(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
			if (Client.field924 <= 0) {
				Client.field924 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			UrlRequester.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			UrlRequester.Interpreter_intStackSize -= 4;
			Client.field927 = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			if (Client.field927 <= 0) {
				Client.field927 = 1;
			}

			Client.field928 = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			if (Client.field928 <= 0) {
				Client.field928 = 32767;
			} else if (Client.field928 < Client.field927) {
				Client.field928 = Client.field927;
			}

			Client.field685 = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			if (Client.field685 <= 0) {
				Client.field685 = 1;
			}

			Client.field861 = (short)Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 3];
			if (Client.field861 <= 0) {
				Client.field861 = 32767;
			} else if (Client.field861 < Client.field685) {
				Client.field861 = Client.field685;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				WorldMapID.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection0.method295(Client.field727);
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection0.method295(Client.field924);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Varcs.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = class52.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "-113"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = WorldMapLabelSize.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			InterfaceParent.runScriptEvent(var5);
		}

		Client.field830 = var3;
		Client.isSpellSelected = true;
		ItemContainer.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		WorldMapSprite.selectedSpellFlags = var2;
		class234.invalidateWidget(var4);
	}
}
