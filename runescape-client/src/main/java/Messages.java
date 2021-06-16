import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("f")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -993232851
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("br")
	static String field1397;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lcl;I)V",
		garbageValue = "2067592428"
	)
	static final void method2461(Actor var0) {
		int var1 = Math.max(1, var0.field1276 - Client.cycle); // L: 4172
		int var2 = var0.field1225 * 64 + var0.field1264 * 128; // L: 4173
		int var3 = var0.field1225 * 64 + var0.field1268 * 128; // L: 4174
		var0.x += (var2 - var0.x) / var1; // L: 4175
		var0.y += (var3 - var0.y) / var1; // L: 4176
		var0.field1242 = 0; // L: 4177
		var0.orientation = var0.field1270; // L: 4178
	} // L: 4179
}
