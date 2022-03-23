import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("v")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1341087359
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -631005359
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 90
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lba;",
		garbageValue = "9760210"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) { // L: 97
			if (var6 != 100) { // L: 98
				this.messages[var6] = this.messages[var6 - 1]; // L: 99
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3); // L: 105
		}

		this.messages[0] = var5; // L: 107
		if (this.count < 100) {
			++this.count;
		}

		return var5; // L: 109
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lba;",
		garbageValue = "-1854040749"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 113 114
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1536"
	)
	@Export("size")
	int size() {
		return this.count; // L: 118
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Lls;II)Lls;",
		garbageValue = "2081962789"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "28"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgf;B)V",
		garbageValue = "16"
	)
	static final void method1991(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					class127.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108
}
