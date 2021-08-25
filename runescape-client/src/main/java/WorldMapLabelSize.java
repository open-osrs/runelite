import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fb")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static class386 field2011;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -1581418795
	)
	static int field2012;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 449162423
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 511339007
	)
	final int field2005;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2121496851
	)
	final int field2010;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1251340533
	)
	final int field2007;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2005 = var1;
		this.field2010 = var2;
		this.field2007 = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FS)Z",
		garbageValue = "9554"
	)
	boolean method3379(float var1) {
		return var1 >= (float)this.field2007;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfb;",
		garbageValue = "54"
	)
	static WorldMapLabelSize method3380(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium};
		WorldMapLabelSize[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			WorldMapLabelSize var4 = var2[var3];
			if (var0 == var4.field2010) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "-1348368073"
	)
	static int method3385(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class247.method4617(var0, var1, var2);
		} else if (var0 < 1100) {
			return class14.method185(var0, var1, var2);
		} else if (var0 < 1200) {
			return WorldMapElement.method2852(var0, var1, var2);
		} else if (var0 < 1300) {
			return HealthBarUpdate.method2142(var0, var1, var2);
		} else if (var0 < 1400) {
			return WorldMapRegion.method3638(var0, var1, var2);
		} else if (var0 < 1500) {
			return method3386(var0, var1, var2);
		} else if (var0 < 1600) {
			return class283.method5093(var0, var1, var2);
		} else if (var0 < 1700) {
			return EnumComposition.method2941(var0, var1, var2);
		} else if (var0 < 1800) {
			return class295.method5305(var0, var1, var2);
		} else if (var0 < 1900) {
			return SpriteMask.method4856(var0, var1, var2);
		} else if (var0 < 2000) {
			return UserComparator4.method2388(var0, var1, var2);
		} else if (var0 < 2100) {
			return class14.method185(var0, var1, var2);
		} else if (var0 < 2200) {
			return WorldMapElement.method2852(var0, var1, var2);
		} else if (var0 < 2300) {
			return HealthBarUpdate.method2142(var0, var1, var2);
		} else if (var0 < 2400) {
			return WorldMapRegion.method3638(var0, var1, var2);
		} else if (var0 < 2500) {
			return method3386(var0, var1, var2);
		} else if (var0 < 2600) {
			return ApproximateRouteStrategy.method1123(var0, var1, var2);
		} else if (var0 < 2700) {
			return WorldMapArea.method3455(var0, var1, var2);
		} else if (var0 < 2800) {
			return class176.method3377(var0, var1, var2);
		} else if (var0 < 2900) {
			return class14.method190(var0, var1, var2);
		} else if (var0 < 3000) {
			return UserComparator4.method2388(var0, var1, var2);
		} else if (var0 < 3200) {
			return class184.method3721(var0, var1, var2);
		} else if (var0 < 3300) {
			return BuddyRankComparator.method2457(var0, var1, var2);
		} else if (var0 < 3400) {
			return class139.method2708(var0, var1, var2);
		} else if (var0 < 3500) {
			return class29.method421(var0, var1, var2);
		} else if (var0 < 3600) {
			return World.method1661(var0, var1, var2);
		} else if (var0 < 3700) {
			return ClientPreferences.method2200(var0, var1, var2);
		} else if (var0 < 3800) {
			return Renderable.method4319(var0, var1, var2);
		} else if (var0 < 3900) {
			return MusicPatchPcmStream.method4837(var0, var1, var2);
		} else if (var0 < 4000) {
			return class91.method2230(var0, var1, var2);
		} else if (var0 < 4100) {
			return WorldMapDecoration.method3801(var0, var1, var2);
		} else if (var0 < 4200) {
			return UserComparator8.method2398(var0, var1, var2);
		} else if (var0 < 4300) {
			return Ignored.method6061(var0, var1, var2);
		} else if (var0 < 5100) {
			return class112.method2468(var0, var1, var2);
		} else if (var0 < 5400) {
			return KeyHandler.method360(var0, var1, var2);
		} else if (var0 < 5600) {
			return class323.method5819(var0, var1, var2);
		} else if (var0 < 5700) {
			return Varps.method4867(var0, var1, var2);
		} else if (var0 < 6300) {
			return Friend.method5916(var0, var1, var2);
		} else if (var0 < 6600) {
			return Language.method5401(var0, var1, var2);
		} else if (var0 < 6700) {
			return class12.method173(var0, var1, var2);
		} else if (var0 < 6800) {
			return class29.method423(var0, var1, var2);
		} else if (var0 < 6900) {
			return class78.method2043(var0, var1, var2);
		} else if (var0 < 7000) {
			return EnumComposition.method2938(var0, var1, var2);
		} else if (var0 < 7100) {
			return WorldMapSectionType.method3769(var0, var1, var2);
		} else if (var0 < 7200) {
			return GrandExchangeOffer.method5345(var0, var1, var2);
		} else {
			return var0 < 7300 ? Renderable.method4326(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "10"
	)
	static int method3386(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class87.getWidget(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3174 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3159 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3160 = var8;
		} else if (var0 == 1430) {
			var3.field3155 = var8;
		} else {
			if (var0 != 1431) {
				return 2;
			}

			var3.field3069 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "123867900"
	)
	static void method3387() {
		if (Client.renderSelf) {
			class114.addPlayerToScene(class129.localPlayer, false);
		}

	}
}
