import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -1981266759
	)
	static int field1569;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2016472085
	)
	static int field1568;
	@ObfuscatedName("h")
	static int[][] field1570;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 464910607
	)
	static int field1572;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -27286113
	)
	final int field1564;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 580411911
	)
	final int field1567;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1572047245
	)
	final int field1571;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1564 = var1; // L: 15
		this.field1567 = var2; // L: 16
		this.field1571 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-1990451087"
	)
	boolean method2671(float var1) {
		return var1 >= (float)this.field1571; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-523449441"
	)
	static void method2677(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ley;",
		garbageValue = "796333939"
	)
	static WorldMapLabelSize method2670(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field1567) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	public static void method2676() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 82
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 83
	} // L: 84

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-888739808"
	)
	public static void method2678() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 572
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 573
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 574
	} // L: 575

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IB)V",
		garbageValue = "-107"
	)
	static void method2679(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 11665
		if (Client.randomDatData == null) { // L: 11667
			Client.randomDatData = new byte[24];
		}

		class305.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 11668
		if (JagexCache.JagexCache_randomDat != null) { // L: 11671
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11673
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11674
			} catch (Exception var4) { // L: 11676
			}
		}

	} // L: 11679
}
