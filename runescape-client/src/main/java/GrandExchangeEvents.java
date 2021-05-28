import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("n")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("f")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("y")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("p")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static Widget field3626;
	@ObfuscatedName("v")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	} // L: 67

	@ObfuscatedSignature(
		descriptor = "(Lnd;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "-1954624010"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1158444411"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 4997
			int var3 = class105.getTileHeight(var0, var1, class22.Client_plane) - var2; // L: 5002
			var0 -= MouseHandler.cameraX; // L: 5003
			var3 -= SecureRandomCallable.cameraY; // L: 5004
			var1 -= class105.cameraZ; // L: 5005
			int var4 = Rasterizer3D.Rasterizer3D_sine[SpotAnimationDefinition.cameraPitch]; // L: 5006
			int var5 = Rasterizer3D.Rasterizer3D_cosine[SpotAnimationDefinition.cameraPitch]; // L: 5007
			int var6 = Rasterizer3D.Rasterizer3D_sine[class376.cameraYaw]; // L: 5008
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class376.cameraYaw]; // L: 5009
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5010
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5011
			var0 = var8; // L: 5012
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5013
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 5014
			if (var1 >= 50) { // L: 5016
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5017
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5018
			} else {
				Client.viewportTempX = -1; // L: 5021
				Client.viewportTempY = -1; // L: 5022
			}

		} else {
			Client.viewportTempX = -1; // L: 4998
			Client.viewportTempY = -1; // L: 4999
		}
	} // L: 5000 5024
}
