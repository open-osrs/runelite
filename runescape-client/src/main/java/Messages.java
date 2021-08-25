import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("rj")
	static boolean field1275;
	@ObfuscatedName("n")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1104839785
	)
	@Export("Messages_count")
	static int Messages_count;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Ljava/lang/String;Ljava/lang/String;B)[Loc;",
		garbageValue = "37"
	)
	public static SpritePixels[] method2332(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		SpritePixels[] var5;
		if (!VertexNormal.method4477(var0, var3, var4)) {
			var5 = null;
		} else {
			var5 = class174.method3364();
		}

		return var5;
	}
}
