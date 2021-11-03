import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Players")
public class Players {
	@ObfuscatedName("s")
	static byte[] field1244;
	@ObfuscatedName("a")
	static byte[] field1241;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	static Buffer[] field1242;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1178638681
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("e")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1076680873
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("j")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("b")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("x")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("y")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1904641985
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("t")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	static Buffer field1240;
	@ObfuscatedName("do")
	static boolean field1254;

	static {
		field1244 = new byte[2048];
		field1241 = new byte[2048];
		field1242 = new Buffer[2048];
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1240 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "-678131121"
	)
	public static void method2327(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lcq;ZI)V",
		garbageValue = "-1700143526"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11555
		int var3 = (int)var0.key; // L: 11556
		var0.remove(); // L: 11557
		int var5;
		if (var1 && var2 != -1 && class132.Widget_loadedInterfaces[var2]) { // L: 11558 11559 11560
			class283.Widget_archive.clearFilesGroup(var2); // L: 11561
			if (WorldMapSection1.Widget_interfaceComponents[var2] != null) { // L: 11562
				boolean var4 = true; // L: 11563

				for (var5 = 0; var5 < WorldMapSection1.Widget_interfaceComponents[var2].length; ++var5) { // L: 11564
					if (WorldMapSection1.Widget_interfaceComponents[var2][var5] != null) { // L: 11565
						if (WorldMapSection1.Widget_interfaceComponents[var2][var5].type != 2) { // L: 11566
							WorldMapSection1.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 11567
						}
					}
				}

				if (var4) { // L: 11570
					WorldMapSection1.Widget_interfaceComponents[var2] = null;
				}

				class132.Widget_loadedInterfaces[var2] = false; // L: 11571
			}
		}

		class316.method5839(var2); // L: 11573
		Widget var7 = UserComparator9.getWidget(var3); // L: 11574
		if (var7 != null) { // L: 11575
			class184.invalidateWidget(var7);
		}

		for (var5 = 0; var5 < Client.menuOptionsCount; ++var5) { // L: 11577
			if (class122.method2607(Client.menuOpcodes[var5])) { // L: 11578
				if (var5 < Client.menuOptionsCount - 1) { // L: 11579
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) { // L: 11580
						Client.menuActions[var6] = Client.menuActions[var6 + 1]; // L: 11581
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1]; // L: 11582
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1]; // L: 11583
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1]; // L: 11584
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1]; // L: 11585
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1]; // L: 11586
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1]; // L: 11587
					}
				}

				--var5; // L: 11590
				--Client.menuOptionsCount; // L: 11591
			}
		}

		class262.method5136(); // L: 11594
		if (Client.rootInterface != -1) { // L: 11596
			ItemComposition.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11597
}
