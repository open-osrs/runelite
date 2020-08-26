import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public final class class13 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-905483159"
	)
	static long method134() {
		try {
			URL var0 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "101"
	)
	public static int method129(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "347660061"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[Huffman.Client_plane][var0][var1]; // L: 6697
		if (var2 == null) { // L: 6698
			ScriptEvent.scene.removeGroundItemPile(Huffman.Client_plane, var0, var1); // L: 6699
		} else {
			long var3 = -99999999L; // L: 6702
			TileItem var5 = null; // L: 6703

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 6704 6705 6713
				ItemDefinition var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6.id); // L: 6706
				long var11 = (long)var7.price; // L: 6707
				if (var7.isStackable == 1) { // L: 6708
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 6709
					var3 = var11; // L: 6710
					var5 = var6; // L: 6711
				}
			}

			if (var5 == null) { // L: 6715
				ScriptEvent.scene.removeGroundItemPile(Huffman.Client_plane, var0, var1); // L: 6716
			} else {
				var2.addLast(var5); // L: 6719
				TileItem var13 = null; // L: 6720
				TileItem var8 = null; // L: 6721

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 6722 6723 6728
					if (var6.id != var5.id) { // L: 6724
						if (var13 == null) { // L: 6725
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 6726
							var8 = var6;
						}
					}
				}

				long var9 = class227.calculateTag(var0, var1, 3, false, 0); // L: 6730
				ScriptEvent.scene.newGroundItemPile(Huffman.Client_plane, var0, var1, ArchiveLoader.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Huffman.Client_plane), var5, var9, var13, var8); // L: 6731
			}
		}
	} // L: 6700 6717 6732

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIB)V",
		garbageValue = "-96"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 10145
			if (var0 != null) { // L: 10147
				Widget var4 = ReflectionCheck.method2381(var0); // L: 10150
				if (var4 == null) { // L: 10151
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 10154
					Client.clickedWidget = var0; // L: 10158
					var4 = ReflectionCheck.method2381(var0); // L: 10161
					if (var4 == null) { // L: 10162
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 10165
					Client.widgetClickX = var1; // L: 10166
					Client.widgetClickY = var2; // L: 10167
					BoundaryObject.widgetDragDuration = 0; // L: 10168
					Client.isDraggingWidget = false; // L: 10169
					int var5 = GrandExchangeOffer.method209(); // L: 10170
					if (var5 != -1) { // L: 10171
						ObjectSound.method1983(var5);
					}

					return; // L: 10172
				}
			}

		}
	} // L: 10156
}
