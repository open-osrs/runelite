import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public class class380 implements class379 {
	@ObfuscatedName("n")
	Map field4196;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	final class406 field4195;

	@ObfuscatedSignature(
		descriptor = "(Lof;)V"
	)
	public class380(class406 var1) {
		this.field4195 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-293464898"
	)
	public int vmethod6605(int var1) {
		if (this.field4196 != null) {
			class407 var2 = (class407)this.field4196.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4340;
			}
		}

		return (Integer)this.field4195.vmethod7113(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1068931055"
	)
	public void vmethod6606(int var1, Object var2) {
		if (this.field4196 == null) {
			this.field4196 = new HashMap();
			this.field4196.put(var1, new class407(var1, var2));
		} else {
			class407 var3 = (class407)this.field4196.get(var1);
			if (var3 == null) {
				this.field4196.put(var1, new class407(var1, var2));
			} else {
				var3.field4340 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4196 == null ? Collections.emptyList().iterator() : this.field4196.values().iterator();
	}
}
