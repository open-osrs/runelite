import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class420 implements class419 {
	@ObfuscatedName("v")
	Map field4549;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class444 field4550;

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public class420(class444 var1) {
		this.field4550 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1911974643"
	)
	public int vmethod7559(int var1) {
		if (this.field4549 != null) { // L: 20
			class445 var2 = (class445)this.field4549.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4681; // L: 22
			}
		}

		return (Integer)this.field4550.vmethod8046(var1); // L: 24
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1473978830"
	)
	public void vmethod7561(int var1, Object var2) {
		if (this.field4549 == null) { // L: 29
			this.field4549 = new HashMap(); // L: 30
			this.field4549.put(var1, new class445(var1, var2)); // L: 31
		} else {
			class445 var3 = (class445)this.field4549.get(var1); // L: 34
			if (var3 == null) {
				this.field4549.put(var1, new class445(var1, var2)); // L: 35
			} else {
				var3.field4681 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4549 == null ? Collections.emptyList().iterator() : this.field4549.values().iterator(); // L: 42 43
	}
}
