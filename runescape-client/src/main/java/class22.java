import java.util.LinkedHashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class22 {
	@ObfuscatedName("w")
	static byte[][][] field122;

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-680563104"
	)
	static final void method245(boolean var0) {
		if (var0) { // L: 2596
			Client.field710 = Login.field1223 ? class169.field2046 : class169.field2044; // L: 2597
		} else {
			LinkedHashMap var1 = Tile.clientPreferences.parameters; // L: 2600
			String var3 = Login.Login_username; // L: 2602
			int var4 = var3.length(); // L: 2604
			int var5 = 0; // L: 2605

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2606
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field710 = var1.containsKey(var5) ? class169.field2045 : class169.field2043; // L: 2609
		}

	} // L: 2611

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-916071017"
	)
	static final int method244() {
		if (Tile.clientPreferences.roofsHidden) { // L: 4394
			return Huffman.Client_plane;
		} else {
			int var0 = ArchiveLoader.getTileHeight(VertexNormal.cameraX, AbstractWorldMapData.cameraZ, Huffman.Client_plane); // L: 4395
			return var0 - FaceNormal.cameraY < 800 && (Tiles.Tiles_renderFlags[Huffman.Client_plane][VertexNormal.cameraX >> 7][AbstractWorldMapData.cameraZ >> 7] & 4) != 0 ? Huffman.Client_plane : 3; // L: 4396 4397
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31538"
	)
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8116
			Widget var0 = SecureRandomCallable.getWidgetChild(class232.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8117
			if (var0 != null && var0.onTargetLeave != null) { // L: 8118
				ScriptEvent var1 = new ScriptEvent(); // L: 8119
				var1.widget = var0; // L: 8120
				var1.args = var0.onTargetLeave; // L: 8121
				Script.runScriptEvent(var1); // L: 8122
			}

			Client.isSpellSelected = false; // L: 8124
			class52.invalidateWidget(var0); // L: 8125
		}
	} // L: 8126
}
