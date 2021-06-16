import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class15 extends class14 {
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1795345059
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -809778825
	)
	static int field128;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 2042655841
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("f")
	String field125;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class15(class2 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field125 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.name = this.field125; // L: 237
	} // L: 238

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;IZI)Lgi;",
		garbageValue = "-91677995"
	)
	public static Frames method240(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) { // L: 25
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "201138696"
	)
	static void method238() {
		if (Client.renderSelf) { // L: 4766
			class160.addPlayerToScene(class262.localPlayer, false); // L: 4767
		}

	} // L: 4769

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "959129058"
	)
	static final void method241(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 7744
			if (Client.showMouseOverText) { // L: 7745
				int var2 = HealthBarUpdate.method2283(); // L: 7746
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 7748
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 7749
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					var3 = class0.method1(var2); // L: 7750
				}

				if (Client.menuOptionsCount > 2) { // L: 7751
					var3 = var3 + SecureRandomFuture.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				class309.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 7752
			}
		}
	} // L: 7753
}
