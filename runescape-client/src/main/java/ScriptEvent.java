import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("c")
	@Export("args")
	Object[] args;
	@ObfuscatedName("b")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1316811587
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 429308499
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2143189111
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1992981497
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1481039273
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("r")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2063557447
	)
	int field1018;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -170521561
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "1"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1783513885"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ldh;",
		garbageValue = "665811152"
	)
	static class114 method2154(int var0) {
		class114 var1 = (class114)class130.findEnumerated(LoginScreenAnimation.method2251(), var0);
		if (var1 == null) {
			var1 = class114.field1390;
		}

		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	static final void method2152() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		class194.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "95"
	)
	static final void method2147(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method3853(var17, var18, var19);
			Rasterizer3D.method3856(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3853(var17, var19, var20);
			Rasterizer3D.method3856(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}
