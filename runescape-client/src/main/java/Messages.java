import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	public static class312 field1273;
	@ObfuscatedName("c")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1900201555
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		longValue = -3704126848335008397L
	)
	static long field1272;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1932714305
	)
	static int field1277;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}
}
