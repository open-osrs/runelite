import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Players")
public class Players {
	@ObfuscatedName("f")
	static byte[] field1247;
	@ObfuscatedName("j")
	static byte[] field1245;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lot;"
	)
	static Buffer[] field1248;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -929860441
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("t")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1961381127
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("e")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("i")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("y")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("w")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1631297959
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("v")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Buffer field1259;

	static {
		field1247 = new byte[2048];
		field1245 = new byte[2048];
		field1248 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1259 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1246868543"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}
}
