import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements PlayerProvider {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ldp;",
		garbageValue = "-2011148953"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 10
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1976029859"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 9437

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 9438
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 9439
		}

		if (var1.length() > 9) { // L: 9441
			return " " + class23.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class23.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class23.colorStartTag(16776960) + var1 + "</col>"; // L: 9442 9443
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lhe;B)Z",
		garbageValue = "119"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11059
	}
}
