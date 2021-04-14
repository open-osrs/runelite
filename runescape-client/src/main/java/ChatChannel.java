import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("g")
	public static short[][] field1086;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static Bounds field1084;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lbs;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 93372497
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 81
	} // L: 84

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbs;",
		garbageValue = "20"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 87

		for (int var6 = this.count; var6 > 0; --var6) { // L: 88
			if (var6 != 100) { // L: 89
				this.messages[var6] = this.messages[var6 - 1]; // L: 90
			}
		}

		if (var5 == null) { // L: 92
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 94
			var5.removeDual(); // L: 95
			var5.set(var1, var2, var4, var3); // L: 96
		}

		this.messages[0] = var5; // L: 98
		if (this.count < 100) { // L: 99
			++this.count;
		}

		return var5; // L: 100
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lbs;",
		garbageValue = "1201057009"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 104 105
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2861"
	)
	@Export("size")
	int size() {
		return this.count; // L: 109
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1715360982"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)V",
		garbageValue = "-466644748"
	)
	static final void method2017(Widget var0) {
		int var1 = var0.contentType; // L: 11252
		if (var1 == 324) { // L: 11253
			if (Client.field871 == -1) { // L: 11254
				Client.field871 = var0.spriteId2; // L: 11255
				Client.field713 = var0.spriteId; // L: 11256
			}

			if (Client.playerAppearance.isFemale) { // L: 11258
				var0.spriteId2 = Client.field871;
			} else {
				var0.spriteId2 = Client.field713; // L: 11259
			}

		} else if (var1 == 325) { // L: 11262
			if (Client.field871 == -1) { // L: 11263
				Client.field871 = var0.spriteId2; // L: 11264
				Client.field713 = var0.spriteId; // L: 11265
			}

			if (Client.playerAppearance.isFemale) { // L: 11267
				var0.spriteId2 = Client.field713;
			} else {
				var0.spriteId2 = Client.field871; // L: 11268
			}

		} else if (var1 == 327) { // L: 11271
			var0.modelAngleX = 150; // L: 11272
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11273
			var0.modelType = 5; // L: 11274
			var0.modelId = 0; // L: 11275
		} else if (var1 == 328) { // L: 11278
			var0.modelAngleX = 150; // L: 11279
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11280
			var0.modelType = 5; // L: 11281
			var0.modelId = 1; // L: 11282
		}
	} // L: 11260 11269 11276 11283 11285
}
