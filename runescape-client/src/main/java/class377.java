import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class377 {
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1164354941"
	)
	static final void method6509() {
		boolean var0 = false; // L: 8768

		while (!var0) { // L: 8769
			var0 = true; // L: 8770

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8771
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 8772
					String var2 = Client.menuTargets[var1]; // L: 8773
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8774
					Client.menuTargets[var1 + 1] = var2; // L: 8775
					String var3 = Client.menuActions[var1]; // L: 8776
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8777
					Client.menuActions[var1 + 1] = var3; // L: 8778
					int var4 = Client.menuOpcodes[var1]; // L: 8779
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8780
					Client.menuOpcodes[var1 + 1] = var4; // L: 8781
					var4 = Client.menuArguments1[var1]; // L: 8782
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8783
					Client.menuArguments1[var1 + 1] = var4; // L: 8784
					var4 = Client.menuArguments2[var1]; // L: 8785
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8786
					Client.menuArguments2[var1 + 1] = var4; // L: 8787
					var4 = Client.menuIdentifiers[var1]; // L: 8788
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8789
					Client.menuIdentifiers[var1 + 1] = var4; // L: 8790
					boolean var5 = Client.menuShiftClick[var1]; // L: 8791
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8792
					Client.menuShiftClick[var1 + 1] = var5; // L: 8793
					var0 = false; // L: 8794
				}
			}
		}

	} // L: 8798
}
