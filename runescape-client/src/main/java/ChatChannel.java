import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbe;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 417639835
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 95
	} // L: 98

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbe;",
		garbageValue = "1370316995"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 101

		for (int var6 = this.count; var6 > 0; --var6) { // L: 102
			if (var6 != 100) { // L: 103
				this.messages[var6] = this.messages[var6 - 1]; // L: 104
			}
		}

		if (var5 == null) { // L: 106
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 108
			var5.removeDual(); // L: 109
			var5.set(var1, var2, var4, var3); // L: 110
		}

		this.messages[0] = var5; // L: 112
		if (this.count < 100) { // L: 113
			++this.count;
		}

		return var5; // L: 114
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbe;",
		garbageValue = "-53"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 118 119
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	@Export("size")
	int size() {
		return this.count; // L: 123
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1242212689"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60
}
