import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class370 extends class341 implements class217 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	final AbstractArchive field4116;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	final DemotingHashTable field4120;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 283772949
	)
	final int field4118;

	@ObfuscatedSignature(
		descriptor = "(Ljl;ILkn;Ljp;)V"
	)
	public class370(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4120 = new DemotingHashTable(64); // L: 15
		this.field4116 = var4; // L: 20
		this.field4118 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lmq;",
		garbageValue = "-898201969"
	)
	protected class343 vmethod6482(int var1) {
		synchronized(this.field4120) { // L: 26
			class342 var2 = (class342)this.field4120.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method6475(var1); // L: 29
				this.field4120.method4456(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)Lma;",
		garbageValue = "867476406"
	)
	class342 method6475(int var1) {
		byte[] var2 = this.field4116.takeFile(this.field4118, var1); // L: 37
		class342 var3 = new class342(var1); // L: 38
		if (var2 != null) {
			var3.method6070(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method6474() {
		synchronized(this.field4120) { // L: 44
			this.field4120.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class369(this); // L: 50
	}
}
