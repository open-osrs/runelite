import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1060618387
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 85
	} // L: 88

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbf;",
		garbageValue = "-1998830550"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 91

		for (int var6 = this.count; var6 > 0; --var6) { // L: 92
			if (var6 != 100) { // L: 93
				this.messages[var6] = this.messages[var6 - 1]; // L: 94
			}
		}

		if (var5 == null) { // L: 96
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 98
			var5.removeDual(); // L: 99
			var5.set(var1, var2, var4, var3); // L: 100
		}

		this.messages[0] = var5; // L: 102
		if (this.count < 100) { // L: 103
			++this.count;
		}

		return var5; // L: 104
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbf;",
		garbageValue = "5"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 108 109
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1220983055"
	)
	@Export("size")
	int size() {
		return this.count; // L: 113
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "558752868"
	)
	public static byte[] method2013(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? EnumComposition.method3106(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1766338115"
	)
	static int method2012(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4328
			Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 4329
			return 1; // L: 4330
		} else if (var0 == 6950) { // L: 4332
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4333
			return 1; // L: 4334
		} else {
			return 2; // L: 4336
		}
	}
}
