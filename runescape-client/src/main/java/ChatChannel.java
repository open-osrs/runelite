import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("l")
	static byte[][][] field894;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1725833491
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lay;",
		garbageValue = "-167767971"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lay;",
		garbageValue = "-1045068186"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-199377669"
	)
	@Export("size")
	int size() {
		return this.count;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljava/lang/String;Ljava/lang/String;B)[Lom;",
		garbageValue = "-4"
	)
	public static SpritePixels[] method1735(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return Actor.method1884(var0, var3, var4);
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1407101410"
	)
	static final void method1734() {
		if (UserComparator8.ClanChat_inClanChat) {
			if (MouseRecorder.friendsChat != null) {
				MouseRecorder.friendsChat.sort();
			}

			ParamComposition.method2911();
			UserComparator8.ClanChat_inClanChat = false;
		}

	}
}
