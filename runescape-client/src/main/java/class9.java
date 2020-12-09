import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class9 {
	@ObfuscatedName("j")
	static byte[][][] field40;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[Lhe;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static IndexedSprite field42;
	@ObfuscatedName("h")
	ExecutorService field39;
	@ObfuscatedName("v")
	Future field43;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	final Buffer field41;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class12 field38;

	@ObfuscatedSignature(
		descriptor = "(Lkj;Lm;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field39 = Executors.newSingleThreadExecutor();
		this.field41 = var1;
		this.field38 = var2;
		this.method96();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "139189298"
	)
	public boolean method112() {
		return this.field43.isDone();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1420165485"
	)
	public void method97() {
		this.field39.shutdown();
		this.field39 = null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;",
		garbageValue = "60"
	)
	public Buffer method98() {
		try {
			return (Buffer)this.field43.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-787508892"
	)
	void method96() {
		this.field43 = this.field39.submit(new class8(this, this.field41, this.field38));
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "20"
	)
	static final int method101(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (WorldMapArea.clanChat != null) {
			WorldMapArea.clanChat.invalidateIgnoreds();
		}

	}
}
