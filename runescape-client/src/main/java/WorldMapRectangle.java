import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -345392389
	)
	@Export("width")
	int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1589949227
	)
	@Export("height")
	int height;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1759029699
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 594773905
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhv;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 305
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method4987() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 66

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 67
			var1.clearIsFromIgnored(); // L: 69
		}

	} // L: 72
}
