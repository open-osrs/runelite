import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2100372523
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			SequenceDefinition.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-422098598"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 3920
			if (WorldMapCacheName.loadInterface(var0)) { // L: 3921
				Widget[] var1 = DefaultsGroup.Widget_interfaceComponents[var0]; // L: 3922

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 3923
					Widget var3 = var1[var2]; // L: 3924
					if (var3.onLoad != null) { // L: 3925
						ScriptEvent var4 = new ScriptEvent(); // L: 3926
						var4.widget = var3; // L: 3927
						var4.args = var3.onLoad; // L: 3928
						GrandExchangeOfferWorldComparator.runScript(var4, 5000000); // L: 3929
					}
				}

			}
		}
	} // L: 3932
}
