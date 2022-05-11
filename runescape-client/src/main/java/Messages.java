import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("o")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -501470971
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}
}
