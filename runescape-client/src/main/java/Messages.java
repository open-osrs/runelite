import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("m")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llf;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ljq;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 205405157
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("g")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("z")
	public static short[][] field1308;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1486803630"
	)
	static final int method2350(int var0, int var1) {
		int var2 = ClientPreferences.method1914(var0 - 1, var1 - 1) + ClientPreferences.method1914(1 + var0, var1 - 1) + ClientPreferences.method1914(var0 - 1, 1 + var1) + ClientPreferences.method1914(var0 + 1, 1 + var1);
		int var3 = ClientPreferences.method1914(var0 - 1, var1) + ClientPreferences.method1914(1 + var0, var1) + ClientPreferences.method1914(var0, var1 - 1) + ClientPreferences.method1914(var0, var1 + 1);
		int var4 = ClientPreferences.method1914(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
