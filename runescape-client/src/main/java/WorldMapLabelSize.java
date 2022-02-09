import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("v")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 360824335
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1864990741
	)
	final int field2599;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -980270199
	)
	final int field2603;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -576668207
	)
	final int field2602;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2599 = var1;
		this.field2603 = var2;
		this.field2602 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "605395104"
	)
	boolean method4311(float var1) {
		return var1 >= (float)this.field2602; // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhh;",
		garbageValue = "-1884718304"
	)
	static WorldMapLabelSize[] method4309() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium}; // L: 15
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "-613673460"
	)
	public static void method4325(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhh;",
		garbageValue = "81"
	)
	static WorldMapLabelSize method4320(int var0) {
		WorldMapLabelSize[] var1 = method4309(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field2603) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2109628628"
	)
	static void method4324(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163767958"
	)
	static void method4317() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 310
			Login.currentLoginField = 1; // L: 311
		} else {
			Login.currentLoginField = 0; // L: 314
		}

	} // L: 316

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "31"
	)
	static int method4322(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1200
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1201
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class135.Widget_unpackTargetMask(Language.getWidgetFlags(var3)); // L: 1202
			return 1; // L: 1203
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1205
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1212
				if (var3.dataText == null) { // L: 1213
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1214
				}

				return 1; // L: 1215
			} else {
				return 2; // L: 1217
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1206
			--var4; // L: 1207
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1208
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1209
			} else {
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1210
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1940340272"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field764 = 0L; // L: 4138
		if (var0 >= 2) { // L: 4139
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4140
		}

		if (class339.getWindowedMode() == 1) { // L: 4141
			class414.client.setMaxCanvasSize(765, 503); // L: 4142
		} else {
			class414.client.setMaxCanvasSize(7680, 2160); // L: 4145
		}

		if (Client.gameState >= 25) { // L: 4147
			DesktopPlatformInfoProvider.method6847();
		}

	} // L: 4148

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	static void method4321(int var0) {
		if (var0 != Client.loginState) { // L: 12169
			Client.loginState = var0; // L: 12170
		}
	} // L: 12171
}
