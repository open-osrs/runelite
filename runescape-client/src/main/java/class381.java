import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class381 implements class380 {
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 185677137
	)
	static int field4217;
	@ObfuscatedName("l")
	Map field4216;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	final class407 field4215;

	@ObfuscatedSignature(
		descriptor = "(Loa;)V"
	)
	public class381(class407 var1) {
		this.field4215 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "974003866"
	)
	public int vmethod6668(int var1) {
		if (this.field4216 != null) {
			class408 var2 = (class408)this.field4216.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4353;
			}
		}

		return (Integer)this.field4215.vmethod7174(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-1271528922"
	)
	public void vmethod6669(int var1, Object var2) {
		if (this.field4216 == null) {
			this.field4216 = new HashMap();
			this.field4216.put(var1, new class408(var1, var2));
		} else {
			class408 var3 = (class408)this.field4216.get(var1);
			if (var3 == null) {
				this.field4216.put(var1, new class408(var1, var2));
			} else {
				var3.field4353 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4216 == null ? Collections.emptyList().iterator() : this.field4216.values().iterator();
	}
}
