import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)I",
		garbageValue = "1682683031"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	static void method2571(int var0, int var1) {
		int var2 = TileItem.fontBold12.stringWidth("Choose Option"); // L: 8663

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8664
			Font var7 = TileItem.fontBold12; // L: 8665
			String var8;
			if (var3 < 0) { // L: 8668
				var8 = ""; // L: 8669
			} else if (Client.menuTargets[var3].length() > 0) { // L: 8672
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 8673
			}

			int var6 = var7.stringWidth(var8); // L: 8675
			if (var6 > var2) { // L: 8676
				var2 = var6;
			}
		}

		var2 += 8; // L: 8678
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8679
		int var4 = var0 - var2 / 2; // L: 8680
		if (var2 + var4 > Script.canvasWidth) { // L: 8681
			var4 = Script.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8682
			var4 = 0;
		}

		int var5 = var1; // L: 8683
		if (var3 + var1 > class78.canvasHeight) { // L: 8684
			var5 = class78.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8685
			var5 = 0;
		}

		UserComparator3.menuX = var4; // L: 8686
		ViewportMouse.menuY = var5; // L: 8687
		Language.menuWidth = var2; // L: 8688
		Player.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8689
	} // L: 8690
}
