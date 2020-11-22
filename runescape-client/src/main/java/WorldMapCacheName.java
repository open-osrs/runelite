import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1131188791
	)
	static int field326;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final WorldMapCacheName field320;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final WorldMapCacheName field319;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final WorldMapCacheName field321;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final WorldMapCacheName field322;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final WorldMapCacheName field328;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	static {
		field320 = new WorldMapCacheName("details"); // L: 4
		field319 = new WorldMapCacheName("compositemap"); // L: 5
		field321 = new WorldMapCacheName("compositetexture"); // L: 6
		field322 = new WorldMapCacheName("area"); // L: 7
		field328 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("z")
	static boolean method725(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 60
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(ZLks;B)V",
		garbageValue = "10"
	)
	static final void method724(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7532
				int var2 = var1.readBits(15); // L: 7533
				if (var2 != 32767) { // L: 7534
					boolean var3 = false; // L: 7535
					if (Client.npcs[var2] == null) { // L: 7536
						Client.npcs[var2] = new NPC(); // L: 7537
						var3 = true; // L: 7538
					}

					NPC var4 = Client.npcs[var2]; // L: 7540
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7541
					var4.npcCycle = Client.cycle; // L: 7542
					int var5 = var1.readBits(1); // L: 7543
					int var6 = var1.readBits(1); // L: 7544
					if (var6 == 1) { // L: 7545
						Client.field727[++Client.field726 - 1] = var2;
					}

					int var7 = Client.defaultRotations[var1.readBits(3)]; // L: 7546
					if (var3) { // L: 7547
						var4.orientation = var4.rotation = var7;
					}

					int var8;
					if (var0) { // L: 7549
						var8 = var1.readBits(8); // L: 7550
						if (var8 > 127) { // L: 7551
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 7554
						if (var8 > 15) { // L: 7555
							var8 -= 32;
						}
					}

					int var9;
					if (var0) { // L: 7558
						var9 = var1.readBits(8); // L: 7559
						if (var9 > 127) { // L: 7560
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 7563
						if (var9 > 15) { // L: 7564
							var9 -= 32;
						}
					}

					var4.definition = Clock.getNpcDefinition(var1.readBits(14)); // L: 7566
					var4.field1011 = var4.definition.size; // L: 7567
					var4.field1028 = var4.definition.rotation; // L: 7568
					if (var4.field1028 == 0) { // L: 7569
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7570
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7571
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7572
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7573
					var4.idleSequence = var4.definition.idleSequence; // L: 7574
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7575
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7576
					var4.method2144(PlayerType.localPlayer.pathX[0] + var9, PlayerType.localPlayer.pathY[0] + var8, var5 == 1); // L: 7577
					continue; // L: 7578
				}
			}

			var1.exportIndex(); // L: 7579
			return; // L: 7580
		}
	}
}
