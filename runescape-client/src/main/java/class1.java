import java.awt.Image;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class1 implements Callable {
	@ObfuscatedName("av")
	static Image field3;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1311703195
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final Buffer field0;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;Lpi;Lf;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field0 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod12(this.field0); // L: 53
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgv;I)V",
		garbageValue = "1091665610"
	)
	static final void method9(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 93
			for (var7 = 0; var7 < 64; ++var7) { // L: 94
				for (var8 = 0; var8 < 64; ++var8) { // L: 95
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 96
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 100

		for (var7 = 0; var7 < 4; ++var7) { // L: 101
			for (var8 = 0; var8 < 64; ++var8) { // L: 102
				for (int var9 = 0; var9 < 64; ++var9) { // L: 103
					class20.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 104
				}
			}
		}

	} // L: 108

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(Llx;Ljava/lang/String;I)V",
		garbageValue = "-1229961038"
	)
	static void method8(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1452
		Client.archiveLoaders.add(var2); // L: 1453
		Client.field782 += var2.groupCount; // L: 1454
	} // L: 1455

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-43"
	)
	static final void method11(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12008
		if (var0 != class131.clientPreferences.method2321()) { // L: 12009
			if (class131.clientPreferences.method2321() == 0 && Client.currentTrackGroupId != -1) { // L: 12010
				class18.method266(class16.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12011
				Client.field746 = false; // L: 12012
			} else if (var0 == 0) { // L: 12014
				class273.midiPcmStream.clear(); // L: 12016
				class273.musicPlayerStatus = 1; // L: 12017
				class273.musicTrackArchive = null; // L: 12018
				Client.field746 = false; // L: 12020
			} else if (class273.musicPlayerStatus != 0) { // L: 12023
				class273.musicTrackVolume = var0;
			} else {
				class273.midiPcmStream.setPcmStreamVolume(var0); // L: 12024
			}

			class131.clientPreferences.method2241(var0); // L: 12026
		}

	} // L: 12028

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lky;B)Z",
		garbageValue = "-85"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12463
	}
}
