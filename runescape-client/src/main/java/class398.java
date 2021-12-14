import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class398 implements class397 {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1895021105
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("c")
	Map field4396;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	final class425 field4394;

	@ObfuscatedSignature(
		descriptor = "(Lpq;)V"
	)
	public class398(class425 var1) {
		this.field4394 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "233631954"
	)
	public int vmethod7128(int var1) {
		if (this.field4396 != null) {
			class426 var2 = (class426)this.field4396.get(var1);
			if (var2 != null) {
				return (Integer)var2.field4537;
			}
		}

		return (Integer)this.field4394.vmethod7625(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "3016419"
	)
	public void vmethod7129(int var1, Object var2) {
		if (this.field4396 == null) {
			this.field4396 = new HashMap();
			this.field4396.put(var1, new class426(var1, var2));
		} else {
			class426 var3 = (class426)this.field4396.get(var1);
			if (var3 == null) {
				this.field4396.put(var1, new class426(var1, var2));
			} else {
				var3.field4537 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field4396 == null ? Collections.emptyList().iterator() : this.field4396.values().iterator();
	}
}
