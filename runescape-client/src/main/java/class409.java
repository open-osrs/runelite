import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class409 extends class376 implements class244 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	final AbstractArchive field4481;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	final DemotingHashTable field4482;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -236164689
	)
	final int field4483;

	@ObfuscatedSignature(
		descriptor = "(Lkr;ILlu;Lkq;)V"
	)
	public class409(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4482 = new DemotingHashTable(64); // L: 15
		this.field4481 = var4; // L: 20
		this.field4483 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lnu;",
		garbageValue = "-1605592337"
	)
	protected class378 vmethod7211(int var1) {
		synchronized(this.field4482) { // L: 26
			class377 var2 = (class377)this.field4482.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7212(var1); // L: 29
				this.field4482.method4917(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Lnt;",
		garbageValue = "1615494544"
	)
	class377 method7212(int var1) {
		byte[] var2 = this.field4481.takeFile(this.field4483, var1); // L: 37
		class377 var3 = new class377(var1); // L: 38
		if (var2 != null) {
			var3.method6797(new Buffer(var2)); // L: 39
		}

		return var3; // L: 40
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1525938940"
	)
	public void method7213() {
		synchronized(this.field4482) { // L: 44
			this.field4482.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class408(this); // L: 51
	}
}
