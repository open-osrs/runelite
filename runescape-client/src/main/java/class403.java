import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class403 implements class402 {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("c")
	Map field4446;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	final class427 field4444;

	@ObfuscatedSignature(
		descriptor = "(Lpr;)V"
	)
	public class403(class427 var1) {
		this.field4444 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-92913690"
	)
	public int vmethod7139(int var1) {
		if (this.field4446 != null) { // L: 20
			class428 var2 = (class428)this.field4446.get(var1); // L: 21
			if (var2 != null) {
				return (Integer)var2.field4575; // L: 22
			}
		}

		return (Integer)this.field4444.vmethod7649(var1); // L: 24
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "5"
	)
	public void vmethod7140(int var1, Object var2) {
		if (this.field4446 == null) { // L: 29
			this.field4446 = new HashMap(); // L: 30
			this.field4446.put(var1, new class428(var1, var2)); // L: 31
		} else {
			class428 var3 = (class428)this.field4446.get(var1); // L: 34
			if (var3 == null) {
				this.field4446.put(var1, new class428(var1, var2)); // L: 35
			} else {
				var3.field4575 = var2; // L: 36
			}
		}

	} // L: 38

	public Iterator iterator() {
		return this.field4446 == null ? Collections.emptyList().iterator() : this.field4446.values().iterator(); // L: 42 43
	}
}
