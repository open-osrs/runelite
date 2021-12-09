import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 1987554027
	)
	static int field956;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -764291983
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 587145695
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 92
	} // L: 95

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;",
		garbageValue = "358093741"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbr;",
		garbageValue = "-91"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 115 116
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1262269232"
	)
	@Export("size")
	int size() {
		return this.count; // L: 120
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "-84"
	)
	static long method2054(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') { // L: 23
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) { // L: 24
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) { // L: 26
			var1 /= 37L;
		}

		return var1; // L: 27
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "1761147769"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 199
		int var2 = var0 & 65535; // L: 200
		if (MouseRecorder.Widget_interfaceComponents[var1] == null || MouseRecorder.Widget_interfaceComponents[var1][var2] == null) { // L: 201
			boolean var3 = class242.loadInterface(var1); // L: 202
			if (!var3) { // L: 203
				return null;
			}
		}

		return MouseRecorder.Widget_interfaceComponents[var1][var2]; // L: 205
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcl;",
		garbageValue = "3"
	)
	static final InterfaceParent method2058(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12265
		var3.group = var1; // L: 12266
		var3.type = var2; // L: 12267
		Client.interfaceParents.put(var3, (long)var0); // L: 12268
		class140.Widget_resetModelFrames(var1); // L: 12269
		Widget var4 = getWidget(var0); // L: 12270
		SecureRandomCallable.invalidateWidget(var4); // L: 12271
		if (Client.meslayerContinueWidget != null) { // L: 12272
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget); // L: 12273
			Client.meslayerContinueWidget = null; // L: 12274
		}

		FileSystem.method3084(); // L: 12276
		class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12277
		class33.runWidgetOnLoadListener(var1); // L: 12278
		if (Client.rootInterface != -1) { // L: 12279
			Message.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12280
	}
}
