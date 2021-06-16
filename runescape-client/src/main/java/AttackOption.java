import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("AttackOption")
public enum AttackOption implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("AttackOption_leftClickWhereAvailable")
	AttackOption_leftClickWhereAvailable(2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3);

	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -31458981
	)
	static int field1351;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_archive")
	static AbstractArchive Widget_archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2122478907
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -183653165
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 11723
	} // L: 11724

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 11727
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "98"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 52
				} catch (Exception var4) { // L: 34
				}
			}

			if (class44.field309.startsWith("win")) { // L: 36
				StudioGame.method4982(var0, 0); // L: 38
			} else if (class44.field309.startsWith("mac")) { // L: 42
				HealthBarUpdate.method2284(var0, 1, "openjs"); // L: 43
			} else {
				StudioGame.method4982(var0, 2); // L: 46
			}
		} else {
			StudioGame.method4982(var0, 3); // L: 49
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1819864841"
	)
	static final int method2382(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 801
		int var4 = var0 & var2 - 1; // L: 802
		int var5 = var1 / var2; // L: 803
		int var6 = var1 & var2 - 1; // L: 804
		int var7 = UrlRequester.method2509(var3, var5); // L: 805
		int var8 = UrlRequester.method2509(var3 + 1, var5); // L: 806
		int var9 = UrlRequester.method2509(var3, var5 + 1); // L: 807
		int var10 = UrlRequester.method2509(var3 + 1, var5 + 1); // L: 808
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 811
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16); // L: 812
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 817
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 818
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 823
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 824
		return var15; // L: 826
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2129644810"
	)
	static final int method2378(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 837
		var2 ^= var2 << 13; // L: 838
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 839
		return var3 >> 19 & 255; // L: 840
	}
}
