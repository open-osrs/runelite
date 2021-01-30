import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("et")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("v")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-323058581"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 24
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-327345288"
	)
	static final int method468(int var0, int var1) {
		int var2 = GrandExchangeOffer.method190(var0 - 1, var1 - 1) + GrandExchangeOffer.method190(var0 + 1, var1 - 1) + GrandExchangeOffer.method190(var0 - 1, 1 + var1) + GrandExchangeOffer.method190(1 + var0, 1 + var1); // L: 848
		int var3 = GrandExchangeOffer.method190(var0 - 1, var1) + GrandExchangeOffer.method190(1 + var0, var1) + GrandExchangeOffer.method190(var0, var1 - 1) + GrandExchangeOffer.method190(var0, 1 + var1); // L: 849
		int var4 = GrandExchangeOffer.method190(var0, var1); // L: 850
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 851
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1287826553"
	)
	static final void method467() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4771 4772 4779
			if (var0.plane == GameObject.Client_plane && !var0.isFinished) { // L: 4773
				if (Client.cycle >= var0.cycleStart) { // L: 4774
					var0.advance(Client.field850); // L: 4775
					if (var0.isFinished) {
						var0.remove(); // L: 4776
					} else {
						ArchiveLoader.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false); // L: 4777
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4781

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "646610765"
	)
	static final int method463() {
		return Client.menuOptionsCount - 1; // L: 8524
	}
}
