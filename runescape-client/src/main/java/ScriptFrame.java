import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -186261179
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("v")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("y")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-309151908"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = WorldMapSection2.method3329(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1244477807"
	)
	static void method1231() {
		if (FaceNormal.loadWorlds()) { // L: 1519
			Login.worldSelectOpen = true; // L: 1520
			Login.worldSelectPage = 0; // L: 1521
			Login.worldSelectPagesCount = 0; // L: 1522
		}

	} // L: 1524

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1365321694"
	)
	static int method1233(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 3563
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "242905867"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4396
			if (class20.loadInterface(var0)) { // L: 4397
				Widget[] var1 = GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0]; // L: 4398

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4399
					Widget var3 = var1[var2]; // L: 4400
					if (var3.onLoad != null) { // L: 4401
						ScriptEvent var4 = new ScriptEvent(); // L: 4402
						var4.widget = var3; // L: 4403
						var4.args = var3.onLoad; // L: 4404
						Varcs.runScript(var4, 5000000, 0); // L: 4405
					}
				}

			}
		}
	} // L: 4408

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1037794122"
	)
	static String method1232(String var0) {
		PlayerType[] var1 = class106.PlayerType_values(); // L: 11685

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11686
			PlayerType var3 = var1[var2]; // L: 11687
			if (var3.modIcon != -1 && var0.startsWith(MusicPatchPcmStream.method4743(var3.modIcon))) { // L: 11689 11690
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 11691
				break;
			}
		}

		return var0; // L: 11698
	}
}
