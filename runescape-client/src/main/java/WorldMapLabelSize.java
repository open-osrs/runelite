import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -794445137
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1344743675
	)
	final int field2671;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1890052329
	)
	final int field2672;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -241742535
	)
	final int field2676;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2671 = var1; // L: 19
		this.field2672 = var2; // L: 20
		this.field2676 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "2012056978"
	)
	boolean method4567(float var1) {
		return var1 >= (float)this.field2676; // L: 25
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhq;",
		garbageValue = "2063977691"
	)
	static WorldMapLabelSize[] method4568() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium}; // L: 15
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-480347083"
	)
	public static boolean method4575(int var0) {
		return var0 == WorldMapDecorationType.field3544.id; // L: 47
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 4972
			if (WorldMapSection2.loadInterface(var0)) { // L: 4973
				Widget[] var1 = SoundCache.Widget_interfaceComponents[var0]; // L: 4974

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 4975
					Widget var3 = var1[var2]; // L: 4976
					if (var3.onLoad != null) { // L: 4977
						ScriptEvent var4 = new ScriptEvent(); // L: 4978
						var4.widget = var3; // L: 4979
						var4.args = var3.onLoad; // L: 4980
						class135.runScript(var4, 5000000, 0); // L: 4981
					}
				}

			}
		}
	} // L: 4984

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-23388"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field711 = 0L; // L: 4371
		if (var0 >= 2) { // L: 4372
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4373
		}

		if (class9.getWindowedMode() == 1) { // L: 4374
			class353.client.setMaxCanvasSize(765, 503); // L: 4375
		} else {
			class353.client.setMaxCanvasSize(7680, 2160); // L: 4378
		}

		if (Client.gameState >= 25) { // L: 4380
			SpriteMask.method5522();
		}

	} // L: 4381

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1407297152"
	)
	static void method4566(int var0) {
		class20.tempMenuAction = new MenuAction(); // L: 11719
		class20.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11720
		class20.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11721
		class20.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11722
		class20.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11723
		class20.tempMenuAction.action = Client.menuActions[var0]; // L: 11724
	} // L: 11725
}
