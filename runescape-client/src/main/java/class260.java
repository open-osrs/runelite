import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public final class class260 {
	@ObfuscatedName("s")
	static final HashMap field3081;
	@ObfuscatedName("w")
	static byte[][][] field3078;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;

	static {
		field3081 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3081) { // L: 16
			TimeZone var2 = (TimeZone)field3081.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3081.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	static final void method5000(int var0, int var1) {
		if (var0 < 128) { // L: 3648
			var0 = 128;
		}

		if (var0 > 383) { // L: 3649
			var0 = 383;
		}

		if (class7.cameraPitch < var0) { // L: 3650
			class7.cameraPitch = (var0 - class7.cameraPitch) * WallDecoration.field2573 / 1000 + class7.cameraPitch + WorldMapSectionType.field2723; // L: 3651
			if (class7.cameraPitch > var0) { // L: 3652
				class7.cameraPitch = var0;
			}
		}

		if (class7.cameraPitch > var0) { // L: 3654
			class7.cameraPitch -= (class7.cameraPitch - var0) * WallDecoration.field2573 / 1000 + WorldMapSectionType.field2723; // L: 3655
			if (class7.cameraPitch < var0) { // L: 3656
				class7.cameraPitch = var0;
			}
		}

		int var2 = var1 - class7.cameraYaw; // L: 3658
		if (var2 > 1024) { // L: 3659
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3660
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3661
			class7.cameraYaw = class7.cameraYaw + WorldMapSectionType.field2723 + var2 * WallDecoration.field2573 / 1000; // L: 3662
			class7.cameraYaw &= 2047; // L: 3663
		}

		if (var2 < 0) { // L: 3665
			class7.cameraYaw -= -var2 * WallDecoration.field2573 / 1000 + WorldMapSectionType.field2723; // L: 3666
			class7.cameraYaw &= 2047; // L: 3667
		}

		int var3 = var1 - class7.cameraYaw; // L: 3669
		if (var3 > 1024) { // L: 3670
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048; // L: 3671
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3672
			class7.cameraYaw = var1;
		}

	} // L: 3673

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljz;I)Z",
		garbageValue = "-1191528713"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11989
	}
}
