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
		this.field39 = Executors.newSingleThreadExecutor(); // L: 10
		this.field41 = var1; // L: 16
		this.field38 = var2; // L: 17
		this.method96(); // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "139189298"
	)
	public boolean method112() {
		return this.field43.isDone(); // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1420165485"
	)
	public void method97() {
		this.field39.shutdown(); // L: 26
		this.field39 = null; // L: 27
	} // L: 28

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;",
		garbageValue = "60"
	)
	public Buffer method98() {
		try {
			return (Buffer)this.field43.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-787508892"
	)
	void method96() {
		this.field43 = this.field39.submit(new class8(this, this.field41, this.field38)); // L: 40
	} // L: 41

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "20"
	)
	static final int method101(int var0, int var1) {
		if (var0 == -2) { // L: 870
			return 12345678;
		} else if (var0 == -1) { // L: 871
			if (var1 < 2) {
				var1 = 2; // L: 872
			} else if (var1 > 126) { // L: 873
				var1 = 126;
			}

			return var1; // L: 874
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 876
			if (var1 < 2) { // L: 877
				var1 = 2;
			} else if (var1 > 126) { // L: 878
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 879
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 10996

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 10997
			var1.clearIsFromIgnored(); // L: 10999
		}

		if (WorldMapArea.clanChat != null) { // L: 11003
			WorldMapArea.clanChat.invalidateIgnoreds(); // L: 11004
		}

	} // L: 11006
}
