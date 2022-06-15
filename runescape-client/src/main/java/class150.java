import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class150 extends class128 {
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8713006525766535939L
	)
	long field1707;
	@ObfuscatedName("v")
	String field1708;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1707 = -1L; // L: 194
		this.field1708 = null; // L: 195
	} // L: 197

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1707 = var1.readLong(); // L: 202
		}

		this.field1708 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2959(this.field1707, this.field1708); // L: 208
	} // L: 209

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-22445945"
	)
	static final void method3135(int var0, int var1) {
		if (Client.menuOptionsCount >= 2 || Client.isItemSelected != 0 || Client.isSpellSelected) { // L: 8437
			if (Client.showMouseOverText) { // L: 8438
				int var2 = class240.method5005(); // L: 8439
				String var3;
				if (Client.isItemSelected == 1 && Client.menuOptionsCount < 2) { // L: 8441
					var3 = "Use" + " " + Client.selectedItemName + " " + "->";
				} else if (Client.isSpellSelected && Client.menuOptionsCount < 2) { // L: 8442
					var3 = Client.selectedSpellActionName + " " + Client.selectedSpellName + " " + "->";
				} else {
					String var4;
					if (var2 < 0) { // L: 8446
						var4 = ""; // L: 8447
					} else if (Client.menuTargets[var2].length() > 0) { // L: 8450
						var4 = Client.menuActions[var2] + " " + Client.menuTargets[var2];
					} else {
						var4 = Client.menuActions[var2]; // L: 8451
					}

					var3 = var4; // L: 8453
				}

				if (Client.menuOptionsCount > 2) { // L: 8455
					var3 = var3 + class122.colorStartTag(16777215) + " " + '/' + " " + (Client.menuOptionsCount - 2) + " more options";
				}

				TileItem.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000); // L: 8456
			}
		}
	} // L: 8457

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lgs;IIZB)V",
		garbageValue = "119"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10868
		byte var6 = -1; // L: 10869
		String var7 = null; // L: 10870
		if (var5 != null && var5[var3] != null) { // L: 10871
			if (var3 == 0) { // L: 10872
				var6 = 33;
			} else if (var3 == 1) { // L: 10873
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 10874
			} else if (var3 == 3) { // L: 10875
				var6 = 36;
			} else {
				var6 = 37; // L: 10876
			}

			var7 = var5[var3]; // L: 10877
		} else if (var3 == 4) { // L: 10880
			var6 = 37; // L: 10881
			var7 = "Drop"; // L: 10882
		}

		if (var6 != -1 && var7 != null) { // L: 10885
			class268.insertMenuItem(var7, class122.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10886
		}

	} // L: 10888
}
