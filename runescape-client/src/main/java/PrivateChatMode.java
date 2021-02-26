import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final PrivateChatMode field3829;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	public static final PrivateChatMode field3830;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	static final PrivateChatMode field3831;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -441716017
	)
	public final int field3832;

	static {
		field3829 = new PrivateChatMode(0); // L: 5
		field3830 = new PrivateChatMode(1); // L: 6
		field3831 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field3832 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1722143108"
	)
	public static int method6104(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 35
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 36
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 37
		var0 += var0 >>> 8; // L: 38
		var0 += var0 >>> 16; // L: 39
		return var0 & 255; // L: 40
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lhz;IIIIIII)V",
		garbageValue = "-1992669827"
	)
	static final void method6107(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field731) { // L: 10006
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10007
		}

		Client.field731 = false; // L: 10008
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10009
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10010
				var0.scrollY -= 4; // L: 10011
				IsaacCipher.invalidateWidget(var0); // L: 10012
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10014
				var0.scrollY += 4; // L: 10015
				IsaacCipher.invalidateWidget(var0); // L: 10016
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10018
				var7 = var3 * (var3 - 32) / var4; // L: 10019
				if (var7 < 8) { // L: 10020
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10021
				int var9 = var3 - 32 - var7; // L: 10022
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10023
				IsaacCipher.invalidateWidget(var0); // L: 10024
				Client.field731 = true; // L: 10025
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10028
			var7 = var0.width; // L: 10029
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10030
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10031
				IsaacCipher.invalidateWidget(var0); // L: 10032
			}
		}

	} // L: 10035
}
