import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1772389683
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1686806459
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 987567799
	)
	@Export("z")
	int z;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -730921547
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Leb;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2064562109"
	)
	static final void method3068() {
		boolean var0 = false; // L: 8473

		while (!var0) { // L: 8474
			var0 = true; // L: 8475

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8476
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 8477
					String var2 = Client.menuTargets[var1]; // L: 8478
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8479
					Client.menuTargets[var1 + 1] = var2; // L: 8480
					String var3 = Client.menuActions[var1]; // L: 8481
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8482
					Client.menuActions[var1 + 1] = var3; // L: 8483
					int var4 = Client.menuOpcodes[var1]; // L: 8484
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8485
					Client.menuOpcodes[var1 + 1] = var4; // L: 8486
					var4 = Client.menuArguments1[var1]; // L: 8487
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8488
					Client.menuArguments1[var1 + 1] = var4; // L: 8489
					var4 = Client.menuArguments2[var1]; // L: 8490
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8491
					Client.menuArguments2[var1 + 1] = var4; // L: 8492
					var4 = Client.menuIdentifiers[var1]; // L: 8493
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8494
					Client.menuIdentifiers[var1 + 1] = var4; // L: 8495
					boolean var5 = Client.menuShiftClick[var1]; // L: 8496
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8497
					Client.menuShiftClick[var1 + 1] = var5; // L: 8498
					var0 = false; // L: 8499
				}
			}
		}

	} // L: 8503
}
