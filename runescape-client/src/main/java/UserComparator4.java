import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;B)I",
		garbageValue = "99"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "109147349"
	)
	static int method2563(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 258
		return NetCache.NetCache_currentResponse != null && NetCache.NetCache_currentResponse.key == var2 ? class291.NetCache_responseArchiveBuffer.offset * 99 / (class291.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1 : 0; // L: 259 260
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "78"
	)
	public static int method2566(int var0) {
		if (var0 > 0) { // L: 183
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 184 185
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "2116886203"
	)
	static int method2567(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3845
			class295.Interpreter_intStackSize -= 2; // L: 3846
			Client.field745 = (short)FaceNormal.method4313(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]); // L: 3847
			if (Client.field745 <= 0) { // L: 3848
				Client.field745 = 256;
			}

			Client.field706 = (short)FaceNormal.method4313(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]); // L: 3849
			if (Client.field706 <= 0) { // L: 3850
				Client.field706 = 256;
			}

			return 1; // L: 3851
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3853
			class295.Interpreter_intStackSize -= 2; // L: 3854
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3855
			if (Client.zoomHeight <= 0) { // L: 3856
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3857
			if (Client.zoomWidth <= 0) { // L: 3858
				Client.zoomWidth = 320;
			}

			return 1; // L: 3859
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3861
			class295.Interpreter_intStackSize -= 4; // L: 3862
			Client.field562 = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3863
			if (Client.field562 <= 0) { // L: 3864
				Client.field562 = 1;
			}

			Client.field750 = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3865
			if (Client.field750 <= 0) { // L: 3866
				Client.field750 = 32767;
			} else if (Client.field750 < Client.field562) { // L: 3867
				Client.field750 = Client.field562;
			}

			Client.field751 = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3868
			if (Client.field751 <= 0) { // L: 3869
				Client.field751 = 1;
			}

			Client.field752 = (short)Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]; // L: 3870
			if (Client.field752 <= 0) { // L: 3871
				Client.field752 = 32767;
			} else if (Client.field752 < Client.field751) { // L: 3872
				Client.field752 = Client.field751;
			}

			return 1; // L: 3873
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3875
			if (Client.viewportWidget != null) { // L: 3876
				Language.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3877
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3878
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3879
			} else {
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3882
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3883
			}

			return 1; // L: 3885
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3887
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3888
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3889
			return 1; // L: 3890
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3892
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = GraphicsObject.method1865(Client.field745); // L: 3893
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = GraphicsObject.method1865(Client.field706); // L: 3894
			return 1; // L: 3895
		} else if (var0 == 6220) { // L: 3897
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3898
			return 1; // L: 3899
		} else if (var0 == 6221) { // L: 3901
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3902
			return 1; // L: 3903
		} else if (var0 == 6222) { // L: 3905
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class4.canvasWidth; // L: 3906
			return 1; // L: 3907
		} else if (var0 == 6223) { // L: 3909
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class309.canvasHeight; // L: 3910
			return 1; // L: 3911
		} else {
			return 2; // L: 3913
		}
	}
}
