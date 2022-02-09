import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 22629131
	)
	@Export("width")
	int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2088042185
	)
	@Export("height")
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 25510589
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -81527557
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhr;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Ljava/lang/String;I)I",
		garbageValue = "-2092007855"
	)
	public static int method4757(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = class126.method2754(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class13.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-851682909"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9183
			Widget var0 = ModeWhere.getWidgetChild(WorldMapLabelSize.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9184
			if (var0 != null && var0.onTargetLeave != null) { // L: 9185
				ScriptEvent var1 = new ScriptEvent(); // L: 9186
				var1.widget = var0; // L: 9187
				var1.args = var0.onTargetLeave; // L: 9188
				class92.runScriptEvent(var1); // L: 9189
			}

			Client.field536 = -1; // L: 9191
			Client.isSpellSelected = false; // L: 9192
			class112.invalidateWidget(var0); // L: 9193
		}
	} // L: 9194
}
