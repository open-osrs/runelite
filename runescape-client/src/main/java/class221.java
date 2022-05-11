import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class221 {
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("HitSplatDefinition_cached")
	static class428 HitSplatDefinition_cached;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lfo;",
		garbageValue = "290100921"
	)
	public static Clock method4408() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7815

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7816 7817 7822
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7818
				var9 = var10; // L: 7819
				break;
			}
		}

		if (var9 == null) { // L: 7824
			var9 = new PendingSpawn(); // L: 7825
			var9.plane = var0; // L: 7826
			var9.type = var3; // L: 7827
			var9.x = var1; // L: 7828
			var9.y = var2; // L: 7829
			UrlRequester.method2536(var9); // L: 7830
			Client.pendingSpawns.addFirst(var9); // L: 7831
		}

		var9.id = var4; // L: 7833
		var9.field1126 = var5; // L: 7834
		var9.orientation = var6; // L: 7835
		var9.delay = var7; // L: 7836
		var9.hitpoints = var8; // L: 7837
	} // L: 7838
}
