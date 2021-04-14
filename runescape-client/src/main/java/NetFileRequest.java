import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -8399381
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("u")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-392050849"
	)
	static final void method4472() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6816 6817 6823
			if (var0.hitpoints == -1) { // L: 6818
				var0.delay = 0; // L: 6819
				class341.method6017(var0); // L: 6820
			} else {
				var0.remove(); // L: 6822
			}
		}

	} // L: 6825
}
