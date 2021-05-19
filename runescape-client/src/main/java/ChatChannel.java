import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		longValue = 9135333041797517911L
	)
	static long field1081;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 426962571
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 92
	} // L: 95

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;",
		garbageValue = "-17263542"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 98

		for (int var6 = this.count; var6 > 0; --var6) { // L: 99
			if (var6 != 100) { // L: 100
				this.messages[var6] = this.messages[var6 - 1]; // L: 101
			}
		}

		if (var5 == null) { // L: 103
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 105
			var5.removeDual(); // L: 106
			var5.set(var1, var2, var4, var3); // L: 107
		}

		this.messages[0] = var5; // L: 109
		if (this.count < 100) { // L: 110
			++this.count;
		}

		return var5; // L: 111
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbv;",
		garbageValue = "29"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 115 116
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-294918247"
	)
	@Export("size")
	int size() {
		return this.count; // L: 120
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "1815997374"
	)
	public static int method2042(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 21
		int var4 = var1; // L: 22

		for (int var5 = 0; var5 < var3; ++var5) { // L: 23
			char var6 = var2.charAt(var5); // L: 24
			if (var6 <= 127) { // L: 25
				var0[var4++] = (byte)var6; // L: 26
			} else if (var6 <= 2047) { // L: 28
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 29
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 30
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 33
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 34
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 35
			}
		}

		return var4 - var1; // L: 38
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljp;II)Lof;",
		garbageValue = "-2132120014"
	)
	public static IndexedSprite method2043(AbstractArchive var0, int var1) {
		return !UserComparator5.method2465(var0, var1) ? null : GraphicsObject.method1938(); // L: 160 161
	}
}
