import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
public class class111 {
	@ObfuscatedName("n")
	static int[] field1348;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1184619433
	)
	int field1359;
	@ObfuscatedName("b")
	float field1349;
	@ObfuscatedName("p")
	float field1350;
	@ObfuscatedName("m")
	float field1351;
	@ObfuscatedName("t")
	float field1352;
	@ObfuscatedName("s")
	float field1357;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	class111 field1354;

	class111() {
		this.field1350 = Float.MAX_VALUE;
		this.field1351 = Float.MAX_VALUE;
		this.field1352 = Float.MAX_VALUE;
		this.field1357 = Float.MAX_VALUE;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-972356321"
	)
	void method2558(Buffer var1, int var2) {
		this.field1359 = var1.readShort();
		this.field1349 = var1.method7369();
		this.field1350 = var1.method7369();
		this.field1351 = var1.method7369();
		this.field1352 = var1.method7369();
		this.field1357 = var1.method7369();
	}
}
