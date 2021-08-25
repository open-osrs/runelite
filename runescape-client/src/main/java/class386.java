import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class386 extends class353 implements class231 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	final AbstractArchive field4229;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	final DemotingHashTable field4230;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 77906417
	)
	final int field4231;

	@ObfuscatedSignature(
		descriptor = "(Lju;ILka;Lkk;)V"
	)
	public class386(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4230 = new DemotingHashTable(64);
		this.field4229 = var4;
		this.field4231 = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmi;",
		garbageValue = "0"
	)
	protected class355 vmethod6676(int var1) {
		synchronized(this.field4230) {
			class354 var2 = (class354)this.field4230.get((long)var1);
			if (var2 == null) {
				var2 = this.method6673(var1);
				this.field4230.method4520(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Lmf;",
		garbageValue = "-31879947"
	)
	class354 method6673(int var1) {
		byte[] var2 = this.field4229.takeFile(this.field4231, var1);
		class354 var3 = new class354(var1);
		if (var2 != null) {
			var3.method6257(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	public void method6674() {
		synchronized(this.field4230) {
			this.field4230.clear();
		}
	}

	public Iterator iterator() {
		return new class385(this);
	}
}
