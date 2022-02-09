import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1692339495
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 92
	} // L: 95

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbd;",
		garbageValue = "0"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Lbd;",
		garbageValue = "-1545065025"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 115 116
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1227633696"
	)
	@Export("size")
	int size() {
		return this.count; // L: 120
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	public static void method2003(Applet var0, String var1) {
		class29.field177 = var0; // L: 22
		if (var1 != null) { // L: 23
			class29.field175 = var1;
		}

	} // L: 24
}
