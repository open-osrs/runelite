import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	ModelData0() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;I)V",
		garbageValue = "-2072967606"
	)
	public static void method4481(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "930571254"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		GrandExchangeEvents.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
