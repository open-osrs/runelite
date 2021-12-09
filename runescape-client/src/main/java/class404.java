import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class404 extends class371 implements class244 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	final AbstractArchive field4435;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final DemotingHashTable field4436;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1252832733
	)
	final int field4437;

	@ObfuscatedSignature(
		descriptor = "(Lko;ILlf;Lku;)V"
	)
	public class404(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0); // L: 19
		this.field4436 = new DemotingHashTable(64); // L: 15
		this.field4435 = var4; // L: 20
		this.field4437 = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lnp;",
		garbageValue = "1453466959"
	)
	protected class373 vmethod7209(int var1) {
		synchronized(this.field4436) { // L: 26
			class372 var2 = (class372)this.field4436.get((long)var1); // L: 27
			if (var2 == null) { // L: 28
				var2 = this.method7215(var1); // L: 29
				this.field4436.method4958(var2, (long)var1); // L: 30
			}

			return var2; // L: 33
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lnv;",
		garbageValue = "277242473"
	)
	class372 method7215(int var1) {
		byte[] var2 = this.field4435.takeFile(this.field4437, var1); // L: 37
		class372 var3 = new class372(var1); // L: 38
		if (var2 != null) { // L: 39
			var3.method6778(new Buffer(var2));
		}

		return var3; // L: 40
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968440370"
	)
	public void method7216() {
		synchronized(this.field4436) { // L: 44
			this.field4436.clear(); // L: 45
		}
	} // L: 47

	public Iterator iterator() {
		return new class403(this); // L: 51
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "15695"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 17
	}
}
