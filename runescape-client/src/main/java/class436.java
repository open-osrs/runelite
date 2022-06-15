import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class436 extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lpv;"
	)
	class432[] field4670;
	@ObfuscatedName("j")
	List field4673;

	@ObfuscatedSignature(
		descriptor = "(Llh;I)V"
	)
	public class436(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method7618(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Llh;II)V"
	)
	public class436(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method7618(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-1912545561"
	)
	void method7618(Buffer var1) {
		int var2 = var1.method7754(); // L: 31
		this.field4670 = new class432[var2]; // L: 32
		this.field4673 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field4670[var3] = (class432)Actor.findEnumerated(class432.method7566(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method7754(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field4670[var3].method7565(var1); // L: 39
				int var7 = var1.method7754(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method7754(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field4673.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-1640295603"
	)
	public List method7619(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field4673.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}
}
