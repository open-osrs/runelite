import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -883300141
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1588811347
	)
	static int field1819;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1180145881
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "-59"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;IB)V",
		garbageValue = "24"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-319794716"
	)
	public static byte[] method3353(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? class359.method6624(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static final void method3345() {
		int[] var0 = Players.Players_indices; // L: 3434

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3435
			Player var4 = Client.players[var0[var1]]; // L: 3436
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3437
				--var4.overheadTextCyclesRemaining; // L: 3438
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3439
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3442
			int var2 = Client.npcIndices[var1]; // L: 3443
			NPC var3 = Client.npcs[var2]; // L: 3444
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3445
				--var3.overheadTextCyclesRemaining; // L: 3446
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3447
					var3.overheadText = null;
				}
			}
		}

	} // L: 3450

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1906831681"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class268.method5228(); // L: 8019
		Client.menuActions[0] = "Cancel"; // L: 8020
		Client.menuTargets[0] = ""; // L: 8021
		Client.menuOpcodes[0] = 1006; // L: 8022
		Client.menuShiftClick[0] = false; // L: 8023
		Client.menuOptionsCount = 1; // L: 8024
	} // L: 8025
}
