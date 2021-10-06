import java.io.IOException;
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class67 {
	@ObfuscatedName("l")
	static final BigInteger field864;
	@ObfuscatedName("q")
	static final BigInteger field866;
	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	static {
		field864 = new BigInteger("10001", 16);
		field866 = new BigInteger("af87d84e6c1040d7966e705070a42393ba8b386e15205b6fb3d688be49039c3fbcc13093eaef5b4f93aecdafa3f8d486196fe7d33ba78a1683eb448d22bd7b994189c9e52db6f532b86ddcc549b641f2ac0d0b411f3fa2c666c877cb7ab8091b2989a105f84cb69b27eacd98c19d098d6f36e6ba7bbf156c082b45f6aa7fd5db", 16);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkl;IIIZB)V",
		garbageValue = "4"
	)
	public static void method1886(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class247.musicPlayerStatus = 1;
		class113.musicTrackArchive = var0;
		Skills.musicTrackGroupId = var1;
		class137.musicTrackFileId = var2;
		class247.musicTrackVolume = var3;
		class247.musicTrackBoolean = var4;
		class247.pcmSampleLength = 10000;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lcq;",
		garbageValue = "-21"
	)
	static ClientPreferences method1887() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = World.getPreferencesFile("", class392.field4267.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "843333300"
	)
	public static final void method1888(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
