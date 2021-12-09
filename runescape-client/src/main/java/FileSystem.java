import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("c")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("p")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "497428397"
	)
	static void method3084() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 10063
			if (InvDefinition.method3157(Client.menuOpcodes[var0])) { // L: 10064
				if (var0 < Client.menuOptionsCount - 1) { // L: 10065
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10066
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10067
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10068
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10069
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10070
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10071
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10072
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10073
					}
				}

				--var0; // L: 10076
				--Client.menuOptionsCount; // L: 10077
			}
		}

		Clock.method3144(); // L: 10080
	} // L: 10081
}
