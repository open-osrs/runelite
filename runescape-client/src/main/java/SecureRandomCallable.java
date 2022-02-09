import java.io.File;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("l")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1997162195
	)
	public static int field1009;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "853607102"
	)
	static final void method2059() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7582
		var0.importIndex(); // L: 7583
		int var1 = var0.readBits(8); // L: 7584
		int var2;
		if (var1 < Client.npcCount) { // L: 7585
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7586
				Client.field683[++Client.field625 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7588
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7589

			for (var2 = 0; var2 < var1; ++var2) { // L: 7590
				int var3 = Client.npcIndices[var2]; // L: 7591
				NPC var4 = Client.npcs[var3]; // L: 7592
				int var5 = var0.readBits(1); // L: 7593
				if (var5 == 0) { // L: 7594
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7595
					var4.npcCycle = Client.cycle; // L: 7596
				} else {
					int var6 = var0.readBits(2); // L: 7599
					if (var6 == 0) { // L: 7600
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7601
						var4.npcCycle = Client.cycle; // L: 7602
						Client.field549[++Client.field548 - 1] = var3; // L: 7603
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7606
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7607
							var4.npcCycle = Client.cycle; // L: 7608
							var7 = var0.readBits(3); // L: 7609
							var4.method2265(var7, class185.field2135); // L: 7610
							var8 = var0.readBits(1); // L: 7611
							if (var8 == 1) { // L: 7612
								Client.field549[++Client.field548 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7615
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7616
							var4.npcCycle = Client.cycle; // L: 7617
							if (var0.readBits(1) == 1) { // L: 7618
								var7 = var0.readBits(3); // L: 7619
								var4.method2265(var7, class185.field2132); // L: 7620
								var8 = var0.readBits(3); // L: 7621
								var4.method2265(var8, class185.field2132); // L: 7622
							} else {
								var7 = var0.readBits(3); // L: 7625
								var4.method2265(var7, class185.field2133); // L: 7626
							}

							var7 = var0.readBits(1); // L: 7628
							if (var7 == 1) { // L: 7629
								Client.field549[++Client.field548 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 7632
							Client.field683[++Client.field625 - 1] = var3; // L: 7633
						}
					}
				}
			}

		}
	} // L: 7637
}
