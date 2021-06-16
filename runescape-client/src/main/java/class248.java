import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class248 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lev;",
		garbageValue = "16"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 59
			var1 = new NPCComposition(); // L: 60
			var1.id = var0; // L: 61
			if (var2 != null) { // L: 62
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 63
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1168533546"
	)
	static int method4915(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 145
		return class34.NetCache_currentResponse != null && var2 == class34.NetCache_currentResponse.key ? class254.NetCache_responseArchiveBuffer.offset * 99 / (class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding) + 1 : 0; // L: 146 147
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1373546761"
	)
	static final void method4916() {
		Client.field882 = Client.cycleCntr; // L: 11461
		class26.ClanChat_inClanChat = true; // L: 11462
	} // L: 11463
}
