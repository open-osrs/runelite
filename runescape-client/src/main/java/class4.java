import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
final class class4 implements class0 {
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		longValue = 4748047598054050873L
	)
	static long field17;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkj;I)V",
		garbageValue = "781194334"
	)
	public void vmethod49(Object var1, Buffer var2) {
		this.method47((String)var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Ljava/lang/Object;",
		garbageValue = "12"
	)
	public Object vmethod48(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkj;B)V",
		garbageValue = "7"
	)
	void method47(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-78527761"
	)
	public static void method53() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 45
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 46
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 47
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 48
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 49
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 51
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 52
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 53
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 54
		}
	} // L: 56

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-36"
	)
	static final int method56(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 819
		int var4 = var0 & var2 - 1; // L: 820
		int var5 = var1 / var2; // L: 821
		int var6 = var1 & var2 - 1; // L: 822
		int var7 = WorldMapSprite.method468(var3, var5); // L: 823
		int var8 = WorldMapSprite.method468(var3 + 1, var5); // L: 824
		int var9 = WorldMapSprite.method468(var3, var5 + 1); // L: 825
		int var10 = WorldMapSprite.method468(var3 + 1, var5 + 1); // L: 826
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 829
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 830
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 835
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 836
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 841
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16); // L: 842
		return var15; // L: 844
	}
}
