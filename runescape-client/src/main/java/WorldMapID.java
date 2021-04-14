import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	static final WorldMapID field1741;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	static final WorldMapID field1744;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1654868251
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1211698009
	)
	@Export("value")
	final int value;

	static {
		field1741 = new WorldMapID(0); // L: 4
		field1744 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1238552841"
	)
	static int method3116(int var0) {
		return var0 * 3 + 600; // L: 1277
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "397252901"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8840
			Widget var0 = class231.getWidgetChild(class148.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8841
			if (var0 != null && var0.onTargetLeave != null) { // L: 8842
				ScriptEvent var1 = new ScriptEvent(); // L: 8843
				var1.widget = var0; // L: 8844
				var1.args = var0.onTargetLeave; // L: 8845
				class19.runScriptEvent(var1); // L: 8846
			}

			Client.field874 = -1; // L: 8848
			Client.isSpellSelected = false; // L: 8849
			class29.invalidateWidget(var0); // L: 8850
		}
	} // L: 8851
}
