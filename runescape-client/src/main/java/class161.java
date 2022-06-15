import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class161 {
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("f")
	public String field1775;
	@ObfuscatedName("j")
	public float[] field1776;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1972368239
	)
	public int field1773;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1667706695
	)
	public int field1777;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -7571905
	)
	public int field1779;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class161(class155 var1) {
		this.this$0 = var1;
		this.field1776 = new float[4]; // L: 336
		this.field1773 = 1; // L: 337
		this.field1777 = 1; // L: 338
		this.field1779 = 0; // L: 339
	} // L: 341

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-68"
	)
	static boolean method3289(int var0) {
		for (int var1 = 0; var1 < Client.field719; ++var1) { // L: 11574
			if (Client.field721[var1] == var0) { // L: 11575
				return true;
			}
		}

		return false; // L: 11577
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Lkb;III)V",
		garbageValue = "1253772800"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11616
			if (var0 != null) { // L: 11618
				Widget var4 = UserComparator10.method2610(var0); // L: 11621
				if (var4 == null) { // L: 11622
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11625
					Client.clickedWidget = var0; // L: 11629
					var4 = UserComparator10.method2610(var0); // L: 11632
					if (var4 == null) { // L: 11633
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11636
					Client.widgetClickX = var1; // L: 11637
					Client.widgetClickY = var2; // L: 11638
					Timer.widgetDragDuration = 0; // L: 11639
					Client.isDraggingWidget = false; // L: 11640
					int var5 = class240.method5005(); // L: 11641
					if (var5 != -1) { // L: 11642
						WorldMapLabelSize.method4566(var5);
					}

					return; // L: 11643
				}
			}

		}
	} // L: 11627

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	static final void method3287() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12208
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12209
			var1.clearIsInFriendsChat(); // L: 12210
		}

	} // L: 12212
}
