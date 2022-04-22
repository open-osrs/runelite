import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 711415979
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -905507323
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llx;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method5824(var1) || this.archive.method5814(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1372726492"
	)
	public static void method2061(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 43
			FloorOverlayDefinition.ByteArrayPool_alternativeSizes = var0; // L: 50
			class128.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 51
			BoundaryObject.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 52

			for (int var2 = 0; var2 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 53
				BoundaryObject.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 54
				ByteArrayPool.field4167.add(var0[var2]); // L: 55
			}

			Collections.sort(ByteArrayPool.field4167); // L: 57
		} else {
			FloorOverlayDefinition.ByteArrayPool_alternativeSizes = null; // L: 44
			class128.ByteArrayPool_altSizeArrayCounts = null; // L: 45
			BoundaryObject.ByteArrayPool_arrays = null; // L: 46
			Login.method1960(); // L: 47
		}
	} // L: 48 58

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lcz;ZI)V",
		garbageValue = "784160741"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4782
			var0.isUnanimated = false; // L: 4783
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4784 4785
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4787
			int var3 = var0.y >> 7; // L: 4788
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4789
				long var4 = GameObject.calculateTag(0, 0, 0, false, var0.index); // L: 4790
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4791
					var0.isUnanimated = false; // L: 4792
					var0.tileHeight = WorldMapLabel.getTileHeight(var0.x, var0.y, class18.Client_plane); // L: 4793
					var0.playerCycle = Client.cycle; // L: 4794
					scene.addNullableObject(class18.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4795
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4798
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4799
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4800
					}

					var0.tileHeight = WorldMapLabel.getTileHeight(var0.x, var0.y, class18.Client_plane); // L: 4802
					var0.playerCycle = Client.cycle; // L: 4803
					scene.drawEntity(class18.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4804
				}
			}
		}

	} // L: 4808

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1332589491"
	)
	static boolean method2062(int var0) {
		for (int var1 = 0; var1 < Client.field731; ++var1) { // L: 11711
			if (Client.field733[var1] == var0) { // L: 11712
				return true;
			}
		}

		return false; // L: 11714
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1401650476"
	)
	static String method2063(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12488
		if (Client.gameBuild == 1) { // L: 12489
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12490
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12491
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12492
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12493
			var0 = "local";
		}

		String var3 = ""; // L: 12494
		if (class65.field868 != null) { // L: 12495
			var3 = "/p=" + class65.field868;
		}

		String var4 = "runescape.com"; // L: 12496
		return var2 + var0 + "." + var4 + "/l=" + Skills.clientLanguage + "/a=" + GrandExchangeOfferOwnWorldComparator.field483 + var3 + "/"; // L: 12497
	}
}
