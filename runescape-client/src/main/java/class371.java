import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class371 extends class340 implements class218 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	final AbstractArchive field4150;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	final DemotingHashTable field4151;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1940676039
	)
	final int field4149;

	@ObfuscatedSignature(
		descriptor = "(Ljr;ILkq;Ljy;)V"
	)
	public class371(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4151 = new DemotingHashTable(64);
		this.field4150 = var4;
		this.field4149 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lmd;",
		garbageValue = "-232657382"
	)
	protected class342 vmethod6511(int var1) {
		synchronized(this.field4151) {
			class341 var2 = (class341)this.field4151.get((long)var1);
			if (var2 == null) {
				var2 = this.method6512(var1);
				this.field4151.method4351(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lmm;",
		garbageValue = "1131227731"
	)
	class341 method6512(int var1) {
		byte[] var2 = this.field4150.takeFile(this.field4149, var1);
		class341 var3 = new class341(var1);
		if (var2 != null) {
			var3.method6081(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1602600450"
	)
	public void method6513() {
		synchronized(this.field4151) {
			this.field4151.clear();
		}
	}

	public Iterator iterator() {
		return new class370(this);
	}
}
