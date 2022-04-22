import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class113 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static Bounds field1378;
	@ObfuscatedName("fv")
	static String field1372;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1540502007
	)
	int field1373;
	@ObfuscatedName("c")
	float field1376;
	@ObfuscatedName("i")
	float field1371;
	@ObfuscatedName("f")
	float field1377;
	@ObfuscatedName("b")
	float field1369;
	@ObfuscatedName("n")
	float field1374;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	class113 field1375;

	class113() {
		this.field1371 = Float.MAX_VALUE; // L: 8
		this.field1377 = Float.MAX_VALUE; // L: 9
		this.field1369 = Float.MAX_VALUE; // L: 10
		this.field1374 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "51"
	)
	void method2647(Buffer var1, int var2) {
		this.field1373 = var1.readShort(); // L: 17
		this.field1376 = var1.method7681(); // L: 18
		this.field1371 = var1.method7681(); // L: 19
		this.field1377 = var1.method7681(); // L: 20
		this.field1369 = var1.method7681(); // L: 21
		this.field1374 = var1.method7681(); // L: 22
	} // L: 23

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2120622991"
	)
	static final void method2650(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11987
		var0 = 100 - var0; // L: 11988
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 11989
		KitDefinition.method3453((double)var1); // L: 11990
	} // L: 11991

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1995001878"
	)
	public static boolean method2651() {
		return Client.staffModLevel >= 2; // L: 12599
	}
}
