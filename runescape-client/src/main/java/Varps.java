import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ia")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("n")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("c")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("m")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "56221944"
	)
	static void method4866() {
		GrandExchangeOffer.field3769 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = VarpDefinition.method2819((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
			GrandExchangeOffer.field3769[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < GrandExchangeOffer.field3769.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = VarpDefinition.method2819((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < GrandExchangeOffer.field3769.length; ++var0) {
				GrandExchangeOffer.field3769[var0] = var4;
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-970225027"
	)
	public static boolean method4865(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "1130853046"
	)
	static int method4867(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if (var0 != 5631 && var0 != 5633) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}

	@ObfuscatedName("jy")
	static final void method4858(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0);
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0);
		ItemComposition.ItemDefinition_cachedSprites.clear();
		VarbitComposition.clientPreferences.field1193 = var0;
		DevicePcmPlayerProvider.savePreferences();
	}
}
