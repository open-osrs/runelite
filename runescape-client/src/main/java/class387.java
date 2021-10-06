import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class387 extends class354 implements class231 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	final AbstractArchive field4254;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	final DemotingHashTable field4253;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -961082881
	)
	final int field4255;

	@ObfuscatedSignature(
		descriptor = "(Ljz;ILkn;Lkl;)V"
	)
	public class387(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field4253 = new DemotingHashTable(64);
		this.field4254 = var4;
		this.field4255 = var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmp;",
		garbageValue = "110"
	)
	protected class356 vmethod6749(int var1) {
		synchronized(this.field4253) {
			class355 var2 = (class355)this.field4253.get((long)var1);
			if (var2 == null) {
				var2 = this.method6757(var1);
				this.field4253.method4588(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmh;",
		garbageValue = "4"
	)
	class355 method6757(int var1) {
		byte[] var2 = this.field4254.takeFile(this.field4255, var1);
		class355 var3 = new class355(var1);
		if (var2 != null) {
			var3.method6323(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	public void method6750() {
		synchronized(this.field4253) {
			this.field4253.clear();
		}
	}

	public Iterator iterator() {
		return new class386(this);
	}
}
