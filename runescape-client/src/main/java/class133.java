import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class133 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 447785145
	)
	int field1594;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 149851621
	)
	int field1592;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1058395113
	)
	int field1593;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 509471079
	)
	int field1596;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class133(class131 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1594 = var1.readInt(); // L: 292
		this.field1596 = var1.readInt(); // L: 293
		this.field1592 = var1.readUnsignedByte(); // L: 294
		this.field1593 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method3004(this.field1594, this.field1596, this.field1592, this.field1593); // L: 299
	} // L: 300

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lbc;Lbc;IZI)I",
		garbageValue = "1196154271"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 211
			int var4 = var0.population; // L: 212
			int var5 = var1.population; // L: 213
			if (!var3) { // L: 214
				if (var4 == -1) { // L: 215
					var4 = 2001;
				}

				if (var5 == -1) { // L: 216
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 218
		} else if (var2 == 2) { // L: 220
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 221
			if (var0.activity.equals("-")) { // L: 222
				if (var1.activity.equals("-")) { // L: 223
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 224
				}
			} else if (var1.activity.equals("-")) { // L: 226
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 227
			}
		} else if (var2 == 4) { // L: 229
			return var0.method1594() ? (var1.method1594() ? 0 : 1) : (var1.method1594() ? -1 : 0);
		} else if (var2 == 5) { // L: 230
			return var0.method1628() ? (var1.method1628() ? 0 : 1) : (var1.method1628() ? -1 : 0);
		} else if (var2 == 6) { // L: 231
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 232
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 233
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2144459119"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[PacketWriter.Client_plane][var0][var1]; // L: 7857
		if (var2 == null) { // L: 7858
			class356.scene.removeGroundItemPile(PacketWriter.Client_plane, var0, var1); // L: 7859
		} else {
			long var3 = -99999999L; // L: 7862
			TileItem var5 = null; // L: 7863

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7864 7865 7873
				ItemComposition var7 = EnumComposition.ItemDefinition_get(var6.id); // L: 7866
				long var11 = (long)var7.price; // L: 7867
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1); // L: 7868
				}

				if (var11 > var3) { // L: 7869
					var3 = var11; // L: 7870
					var5 = var6; // L: 7871
				}
			}

			if (var5 == null) { // L: 7875
				class356.scene.removeGroundItemPile(PacketWriter.Client_plane, var0, var1); // L: 7876
			} else {
				var2.addLast(var5); // L: 7879
				TileItem var13 = null; // L: 7880
				TileItem var8 = null; // L: 7881

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7882 7883 7888
					if (var5.id != var6.id) { // L: 7884
						if (var13 == null) { // L: 7885
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 7886
							var8 = var6;
						}
					}
				}

				long var9 = TaskHandler.calculateTag(var0, var1, 3, false, 0); // L: 7890
				class356.scene.newGroundItemPile(PacketWriter.Client_plane, var0, var1, SceneTilePaint.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, PacketWriter.Client_plane), var5, var9, var13, var8); // L: 7891
			}
		}
	} // L: 7860 7877 7892
}
