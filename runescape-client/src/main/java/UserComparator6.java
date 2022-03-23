import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;B)I",
		garbageValue = "114"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "551180200"
	)
	static final int method2631(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 970
		int var4 = var0 & var2 - 1; // L: 971
		int var5 = var1 / var2; // L: 972
		int var6 = var1 & var2 - 1; // L: 973
		int var7 = Language.method6137(var3, var5); // L: 974
		int var8 = Language.method6137(var3 + 1, var5); // L: 975
		int var9 = Language.method6137(var3, var5 + 1); // L: 976
		int var10 = Language.method6137(var3 + 1, var5 + 1); // L: 977
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 980
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 981
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 986
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 987
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 992
		int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16); // L: 993
		return var15; // L: 995
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-328819266"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field529 = 0L; // L: 3924
		if (var0 >= 2) { // L: 3925
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 3926
		}

		if (ReflectionCheck.getWindowedMode() == 1) { // L: 3927
			UserComparator10.client.setMaxCanvasSize(765, 503); // L: 3928
		} else {
			UserComparator10.client.setMaxCanvasSize(7680, 2160); // L: 3931
		}

		if (Client.gameState >= 25) { // L: 3933
			class17.method228();
		}

	} // L: 3934
}
