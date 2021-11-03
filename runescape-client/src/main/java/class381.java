import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class381 implements class380 {
	@ObfuscatedName("p")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("i")
	Map field4222;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	final class407 field4219;

	@ObfuscatedSignature(
		descriptor = "(Loa;)V"
	)
	public class381(class407 var1) {
		this.field4219 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1882106502"
	)
	public int vmethod6739(int var1) {
		if (this.field4222 != null) { // L: 19
			class408 var2 = (class408)this.field4222.get(var1); // L: 20
			if (var2 != null) {
				return (Integer)var2.field4361; // L: 21
			}
		}

		return (Integer)this.field4219.vmethod7243(var1); // L: 23
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-84615039"
	)
	public void vmethod6736(int var1, Object var2) {
		if (this.field4222 == null) { // L: 27
			this.field4222 = new HashMap(); // L: 28
			this.field4222.put(var1, new class408(var1, var2)); // L: 29
		} else {
			class408 var3 = (class408)this.field4222.get(var1); // L: 32
			if (var3 == null) {
				this.field4222.put(var1, new class408(var1, var2)); // L: 33
			} else {
				var3.field4361 = var2; // L: 34
			}
		}

	} // L: 36

	public Iterator iterator() {
		return this.field4222 == null ? Collections.emptyList().iterator() : this.field4222.values().iterator(); // L: 39 40
	}
}
