import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class369 extends class340 implements class216 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	final AbstractArchive field4119;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	final DemotingHashTable field4118;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 640434103
	)
	final int field4117;

	@ObfuscatedSignature(
		descriptor = "(Ljd;ILkk;Ljv;)V"
	)
	public class369(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4118 = new DemotingHashTable(64); // L: 15
		this.field4119 = var4; // L: 20
		this.field4117 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lml;",
		garbageValue = "1996028065"
	)
	protected class342 vmethod6434(int var1) {
		synchronized(this.field4118) { // L: 26
			class341 var2 = (class341)this.field4118.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method6432(var1); // L: 29
				this.field4118.method4290(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Lmq;",
		garbageValue = "1323866848"
	)
	class341 method6432(int var1) {
		byte[] var2 = this.field4119.takeFile(this.field4117, var1); // L: 37
		class341 var3 = new class341(var1); // L: 38
		if (var2 != null) {
			var3.method6035(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-174176415"
	)
	public void method6433() {
		synchronized(this.field4118) { // L: 44
			this.field4118.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class368(this); // L: 50
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Ljava/lang/String;Ljava/lang/String;B)[Loh;",
		garbageValue = "103"
	)
	public static SpritePixels[] method6443(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 115
		int var4 = var0.getFileId(var3, var2); // L: 116
		return ItemComposition.method3087(var0, var3, var4); // L: 117
	}
}
