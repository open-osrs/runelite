import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class268 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1895350617"
	)
	static void method5104() {
		KeyHandler.field145 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = class134.method2708((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F));
			KeyHandler.field145[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < KeyHandler.field145.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = class134.method2708((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < KeyHandler.field145.length; ++var0) {
				KeyHandler.field145[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	static final boolean method5103() {
		return Client.isMenuOpen;
	}

	@ObfuscatedName("jg")
	static final void method5105(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		WorldMapDecorationType.clientPreferences.brightness = var0;
		ScriptFrame.savePreferences();
	}
}
