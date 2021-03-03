import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("ae")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 309353729
	)
	@Export("element")
	final int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1945919631
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1219873699
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhd;Lhd;ILaa;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = InvDefinition.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Laa;",
		garbageValue = "31041"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-413607837"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1875187157"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-344987914"
	)
	static int method286() {
		return 12; // L: 123
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhz;II)V",
		garbageValue = "18479210"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2668 == null) { // L: 937
			throw new RuntimeException(); // L: 938
		} else {
			if (var0.field2660 == null) { // L: 940
				var0.field2660 = new int[var0.field2668.length]; // L: 941
			}

			var0.field2660[var1] = Integer.MAX_VALUE; // L: 943
		}
	} // L: 944

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "1727285517"
	)
	static int method285(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3225
			Interpreter.Interpreter_intStackSize -= 2; // L: 3226
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3227
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3228
			if (!Client.isCameraLocked) { // L: 3229
				Client.camAngleX = var3; // L: 3230
				Client.camAngleY = var4; // L: 3231
			}

			return 1; // L: 3233
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3235
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3236
			return 1; // L: 3237
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3239
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3240
			return 1; // L: 3241
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3243
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3244
			if (var3 < 0) { // L: 3245
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3246
			return 1; // L: 3247
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3249
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3250
			return 1; // L: 3251
		} else {
			return 2; // L: 3253
		}
	}
}
