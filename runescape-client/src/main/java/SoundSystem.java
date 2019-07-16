import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -631434243
	)
	@Export("plane")
	static int plane;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "[Lco;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var3) {
			NPCDefinition.sendStackTrace((String)null, var3);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lcg;",
		garbageValue = "1479630296"
	)
	@Export("getScript")
	static Script getScript(int scriptID) {
		Script var1 = (Script)Script.Script_cached.get((long)scriptID);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Formatting.archive12.takeFile(scriptID, 0);
		if (var2 == null) {
			return null;
		}
		var1 = Occluder.newScript(var2);
		Script.Script_cached.put(var1, (long)scriptID);
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "20"
	)
	@Export("WorldMapRegion_clearCachedSprites")
	static void WorldMapRegion_clearCachedSprites() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}
}
