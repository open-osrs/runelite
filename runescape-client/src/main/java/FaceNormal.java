import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1410868853
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 855520165
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1494276377
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1343156262"
	)
	static int method3345(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class231.method4154(var0, var1, var2);
		} else if (var0 < 1100) {
			return class200.method3711(var0, var1, var2);
		} else if (var0 < 1200) {
			return WorldMapData_1.method736(var0, var1, var2);
		} else if (var0 < 1300) {
			return UserComparator9.method3478(var0, var1, var2);
		} else if (var0 < 1400) {
			return ScriptFrame.method1213(var0, var1, var2);
		} else if (var0 < 1500) {
			return ModeWhere.method3717(var0, var1, var2);
		} else if (var0 < 1600) {
			return Messages.method2283(var0, var1, var2);
		} else if (var0 < 1700) {
			return GrandExchangeOfferUnitPriceComparator.method200(var0, var1, var2);
		} else if (var0 < 1800) {
			return class277.method5005(var0, var1, var2);
		} else if (var0 < 1900) {
			return WorldMapRectangle.method331(var0, var1, var2);
		} else if (var0 < 2000) {
			return Frames.method3354(var0, var1, var2);
		} else if (var0 < 2100) {
			return class200.method3711(var0, var1, var2);
		} else if (var0 < 2200) {
			return WorldMapData_1.method736(var0, var1, var2);
		} else if (var0 < 2300) {
			return UserComparator9.method3478(var0, var1, var2);
		} else if (var0 < 2400) {
			return ScriptFrame.method1213(var0, var1, var2);
		} else if (var0 < 2500) {
			return ModeWhere.method3717(var0, var1, var2);
		} else if (var0 < 2600) {
			return class22.method221(var0, var1, var2);
		} else if (var0 < 2700) {
			return WorldMapIcon_1.method336(var0, var1, var2);
		} else if (var0 < 2800) {
			return WorldMapIcon_1.method345(var0, var1, var2);
		} else if (var0 < 2900) {
			return AbstractWorldMapData.method328(var0, var1, var2);
		} else if (var0 < 3000) {
			return Frames.method3354(var0, var1, var2);
		} else if (var0 < 3200) {
			return WorldMapID.method600(var0, var1, var2);
		} else if (var0 < 3300) {
			return WorldMapData_0.method245(var0, var1, var2);
		} else if (var0 < 3400) {
			return Language.method3709(var0, var1, var2);
		} else if (var0 < 3500) {
			return TileItemPile.method2850(var0, var1, var2);
		} else if (var0 < 3700) {
			return ApproximateRouteStrategy.method1302(var0, var1, var2);
		} else if (var0 < 4000) {
			return GrandExchangeEvents.method146(var0, var1, var2);
		} else if (var0 < 4100) {
			return class41.method602(var0, var1, var2);
		} else if (var0 < 4200) {
			return GrandExchangeOfferAgeComparator.method218(var0, var1, var2);
		} else if (var0 < 4300) {
			return StudioGame.method4186(var0, var1, var2);
		} else if (var0 < 5100) {
			return class258.method4516(var0, var1, var2);
		} else if (var0 < 5400) {
			return class58.method916(var0, var1, var2);
		} else if (var0 < 5600) {
			return FloorUnderlayDefinition.method4460(var0, var1, var2);
		} else if (var0 < 5700) {
			return AbstractWorldMapIcon.method656(var0, var1, var2);
		} else if (var0 < 6300) {
			return WorldMapID.method599(var0, var1, var2);
		} else if (var0 < 6600) {
			return HorizontalAlignment.method4729(var0, var1, var2);
		} else {
			return var0 < 6700 ? class52.method845(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "398077002"
	)
	public static final void method3344(PlayerProvider var0) {
		Varps.pcmPlayerProvider = var0;
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)I",
		garbageValue = "1443888680"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32));
		return var1 != null ? var1.integer : var0.flags;
	}
}
