import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class146 extends class128 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 51449257
	)
	int field1692;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1435457431
	)
	int field1695;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class146(class131 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1692 = var1.readInt(); // L: 274
		this.field1695 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2909(this.field1692, this.field1695); // L: 279
	} // L: 280

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lbx;",
		garbageValue = "-280328153"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "605367947"
	)
	static final int method2993() {
		return ViewportMouse.ViewportMouse_x; // L: 102
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lds;",
		garbageValue = "1375495552"
	)
	static class122 method2997(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 362
		if (var1 != null) { // L: 363
			return var1;
		} else {
			var1 = PendingSpawn.method2161(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 364
			if (var1 != null) { // L: 365
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 366
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)Lki;",
		garbageValue = "-106"
	)
	static Widget method2992(Widget var0) {
		Widget var2 = var0; // L: 11947
		int var4 = UrlRequester.getWidgetFlags(var0); // L: 11950
		int var3 = var4 >> 17 & 7; // L: 11952
		int var5 = var3; // L: 11954
		Widget var1;
		if (var3 == 0) { // L: 11955
			var1 = null; // L: 11956
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2; // L: 11966
					break;
				}

				var2 = class92.getWidget(var2.parentId); // L: 11960
				if (var2 == null) { // L: 11961
					var1 = null; // L: 11962
					break; // L: 11963
				}

				++var6; // L: 11959
			}
		}

		Widget var7 = var1; // L: 11968
		if (var1 == null) { // L: 11969
			var7 = var0.parent;
		}

		return var7; // L: 11970
	}
}
