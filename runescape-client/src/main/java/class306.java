import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class306 {
	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class302[] var2 = new class302[]{class302.field3612, class302.field3611}; // L: 14
		class302[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class302 var5 = var3[var4]; // L: 18
			if (var5.field3613 > var0) { // L: 20
				var0 = var5.field3613;
			}

			if (var5.field3610 > var1) { // L: 21
				var1 = var5.field3610;
			}
		}

	} // L: 25

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1403614530"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		UserComparator8.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1939050344"
	)
	static void method5595() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 48
			if (ArchiveDiskActionHandler.field3998 == 0) { // L: 49
				class131.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 50
				class131.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 51
				class131.ArchiveDiskActionHandler_thread.start(); // L: 52
				class131.ArchiveDiskActionHandler_thread.setPriority(5); // L: 53
			}

			ArchiveDiskActionHandler.field3998 = 600; // L: 55
		}
	} // L: 57

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-341201892"
	)
	static void method5593(int var0, int var1) {
		if (class12.clientPreferences.method2248() != 0 && var0 != -1) { // L: 3820
			UserComparator8.method2574(UrlRequest.archive11, var0, 0, class12.clientPreferences.method2248(), false); // L: 3821
			Client.playingJingle = true; // L: 3822
		}

	} // L: 3824
}
