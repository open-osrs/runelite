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
		this.messages = new Message[100];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;",
		garbageValue = "358093741"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99];

		for (int var6 = this.count; var6 > 0; --var6) {
			if (var6 != 100) {
				this.messages[var6] = this.messages[var6 - 1];
			}
		}

		if (var5 == null) {
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove();
			var5.removeDual();
			var5.set(var1, var2, var4, var3);
		}

		this.messages[0] = var5;
		if (this.count < 100) {
			++this.count;
		}

		return var5;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbr;",
		garbageValue = "-91"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1262269232"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)J",
		garbageValue = "-84"
	)
	static long method2054(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "1761147769"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (MouseRecorder.Widget_interfaceComponents[var1] == null || MouseRecorder.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = class242.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return MouseRecorder.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcl;",
		garbageValue = "3"
	)
	static final InterfaceParent method2058(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class140.Widget_resetModelFrames(var1);
		Widget var4 = getWidget(var0);
		SecureRandomCallable.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		FileSystem.decrementMenuEntries();
		class115.revalidateWidgetScroll(MouseRecorder.Widget_interfaceComponents[var0 >> 16], var4, false);
		class33.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Message.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
