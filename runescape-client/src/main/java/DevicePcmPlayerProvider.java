import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lal;",
		garbageValue = "-1051033843"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;I)I",
		garbageValue = "654375877"
	)
	static int method338(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field910;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 162
			var5 = var3[var4]; // L: 163
			if (var0.tryLoadFileByNames(var5, "")) { // L: 165
				++var2;
			}
		}

		var3 = Login.field911; // L: 170

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 171
			var5 = var3[var4]; // L: 172
			if (var1.tryLoadFileByNames(var5, "")) { // L: 174
				++var2;
			}
		}

		return var2; // L: 178
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "296751671"
	)
	static void method336(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 157
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2); // L: 158
		if (var4 != null) { // L: 159
			NetCache.NetCache_pendingWritesQueue.addLast(var4); // L: 160
		}
	} // L: 161

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "7"
	)
	static final int method340(int var0, int var1) {
		if (var0 == -1) { // L: 969
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 970
			if (var1 < 2) { // L: 971
				var1 = 2;
			} else if (var1 > 126) { // L: 972
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 973
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZI)I",
		garbageValue = "1672362230"
	)
	static int method335(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4511
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4512
			return 1; // L: 4513
		} else if (var0 != 6801 && var0 != 6802) { // L: 4515
			if (var0 == 6850) { // L: 4519
				Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = ""; // L: 4520
				return 1; // L: 4521
			} else if (var0 != 6851 && var0 != 6852) { // L: 4523
				if (var0 == 6853) { // L: 4527
					Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4528
					return 1; // L: 4529
				} else {
					return 2; // L: 4531
				}
			} else {
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4524
				return 1; // L: 4525
			}
		} else {
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4516
			return 1; // L: 4517
		}
	}
}
