import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("k")
	static byte[][][] field3859;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Ljh;I)I",
		garbageValue = "-74930835"
	)
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "788090268"
	)
	static void method6067(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 11518
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 11519
				var1.remove(); // L: 11520
			}
		}

	} // L: 11523
}
