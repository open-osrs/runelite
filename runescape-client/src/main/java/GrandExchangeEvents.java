import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("q")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("f")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("j")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("m")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("l")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "-1787305699"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1446894624"
	)
	public static int method5348(int var0, int var1, int var2) {
		int var3 = FloorOverlayDefinition.method3343(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ljt;III)V",
		garbageValue = "135210928"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var6 = Friend.method6003(WorldMapRegion.getWidgetFlags(var0));
				Widget var4;
				int var7;
				if (var6 == 0) {
					var4 = null;
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5;
							break;
						}

						var5 = HealthBarUpdate.getWidget(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var7;
					}
				}

				Widget var8 = var4;
				if (var4 == null) {
					var8 = var0.parent;
				}

				if (var8 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var6 = Friend.method6003(WorldMapRegion.getWidgetFlags(var0));
					if (var6 == 0) {
						var4 = null;
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5;
								break;
							}

							var5 = HealthBarUpdate.getWidget(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var7;
						}
					}

					var8 = var4;
					if (var4 == null) {
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					MouseHandler.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var9 = Client.menuOptionsCount - 1;
					if (var9 != -1) {
						NetFileRequest.method5216(var9);
					}

					return;
				}
			}

		}
	}
}
