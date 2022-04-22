import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class426 extends class392 implements class252 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	final AbstractArchive field4584;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	final DemotingHashTable field4583;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 474099221
	)
	final int field4585;

	@ObfuscatedSignature(
		descriptor = "(Lkt;ILlo;Lln;)V"
	)
	public class426(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4583 = new DemotingHashTable(64); // L: 15
		this.field4584 = var4; // L: 20
		this.field4585 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lox;",
		garbageValue = "60"
	)
	protected class394 vmethod7542(int var1) {
		synchronized(this.field4583) { // L: 26
			class393 var2 = (class393)this.field4583.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7543(var1); // L: 29
				this.field4583.method5124(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Loh;",
		garbageValue = "1788746986"
	)
	class393 method7543(int var1) {
		byte[] var2 = this.field4584.takeFile(this.field4585, var1); // L: 37
		class393 var3 = new class393(var1); // L: 38
		if (var2 != null) {
			var3.method7128(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	public void method7541() {
		synchronized(this.field4583) { // L: 44
			this.field4583.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class425(this); // L: 50
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method7546() {
		Client.field703 = Client.cycleCntr; // L: 12380
		SoundSystem.field309 = true; // L: 12381
	} // L: 12382
}
