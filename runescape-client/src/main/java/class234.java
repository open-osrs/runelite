import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class234 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IS)Lia;",
		garbageValue = "-3621"
	)
	public static FloorUnderlayDefinition method4260(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public static void method4261() {
		VarbitDefinition.VarbitDefinition_cached.clear(); // L: 34
	} // L: 35

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "969326800"
	)
	static String method4262() {
		String var0 = ""; // L: 84

		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0 = var0 + var2.sender + ':' + var2.text + '\n') { // L: 85 88
			var2 = (Message)var1.next(); // L: 86
		}

		return var0; // L: 91
	}
}
