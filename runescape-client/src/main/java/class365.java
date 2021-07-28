import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
public class class365 implements class364 {
	@ObfuscatedName("s")
	Map field4112;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	final class391 field4110;

	@ObfuscatedSignature(
		descriptor = "(Lob;)V"
	)
	public class365(class391 var1) {
		this.field4110 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1781797183"
	)
	public int vmethod6433(int var1) {
		if (this.field4112 != null) {
			class392 var2 = (class392)this.field4112.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4241;
			}
		}

		return (Integer)this.field4110.vmethod6964(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1423101008"
	)
	public void vmethod6430(int var1, Object var2) {
		if (this.field4112 == null) {
			this.field4112 = new HashMap();
			this.field4112.put(var1, new class392(var1, var2));
		} else {
			class392 var3 = (class392)this.field4112.get(var1);
			if (var3 == null) {
				this.field4112.put(var1, new class392(var1, var2));
			} else {
				var3.field4241 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4112 == null ? Collections.emptyList().iterator() : this.field4112.values().iterator();
	}
}
