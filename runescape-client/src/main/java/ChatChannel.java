import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -863685229
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1091694625
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 90
	} // L: 93

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbl;",
		garbageValue = "-353859977"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 96

		for (int var6 = this.count; var6 > 0; --var6) { // L: 97
			if (var6 != 100) { // L: 98
				this.messages[var6] = this.messages[var6 - 1]; // L: 99
			}
		}

		if (var5 == null) { // L: 101
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 103
			var5.removeDual(); // L: 104
			var5.set(var1, var2, var4, var3); // L: 105
		}

		this.messages[0] = var5; // L: 107
		if (this.count < 100) { // L: 108
			++this.count;
		}

		return var5; // L: 109
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbl;",
		garbageValue = "2"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 113 114
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1021863211"
	)
	@Export("size")
	int size() {
		return this.count; // L: 118
	}
}
