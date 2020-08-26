import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1732221889
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILhg;Lhg;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1029806693"
	)
	static int method830(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 389
			return ApproximateRouteStrategy.method1274(var0, var1, var2);
		} else if (var0 < 1100) { // L: 390
			return GameBuild.method4218(var0, var1, var2);
		} else if (var0 < 1200) { // L: 391
			return WorldMapLabel.method497(var0, var1, var2);
		} else if (var0 < 1300) { // L: 392
			return class1.method22(var0, var1, var2);
		} else if (var0 < 1400) { // L: 393
			return UrlRequester.method3419(var0, var1, var2);
		} else if (var0 < 1500) { // L: 394
			return SecureRandomCallable.method1200(var0, var1, var2);
		} else if (var0 < 1600) { // L: 395
			return AttackOption.method2152(var0, var1, var2);
		} else if (var0 < 1700) { // L: 396
			return WorldMapLabelSize.method279(var0, var1, var2);
		} else if (var0 < 1800) { // L: 397
			return WorldMapIcon_1.method378(var0, var1, var2);
		} else if (var0 < 1900) { // L: 398
			return PendingSpawn.method1794(var0, var1, var2);
		} else if (var0 < 2000) { // L: 399
			return HitSplatDefinition.method4698(var0, var1, var2);
		} else if (var0 < 2100) { // L: 400
			return GameBuild.method4218(var0, var1, var2);
		} else if (var0 < 2200) { // L: 401
			return WorldMapLabel.method497(var0, var1, var2);
		} else if (var0 < 2300) { // L: 402
			return class1.method22(var0, var1, var2);
		} else if (var0 < 2400) { // L: 403
			return UrlRequester.method3419(var0, var1, var2);
		} else if (var0 < 2500) { // L: 404
			return SecureRandomCallable.method1200(var0, var1, var2);
		} else if (var0 < 2600) { // L: 405
			return KeyHandler.method888(var0, var1, var2);
		} else if (var0 < 2700) { // L: 406
			return KeyHandler.method890(var0, var1, var2);
		} else if (var0 < 2800) { // L: 407
			return GrandExchangeOfferNameComparator.method231(var0, var1, var2);
		} else if (var0 < 2900) { // L: 408
			return WorldMapDecoration.method405(var0, var1, var2);
		} else if (var0 < 3000) { // L: 409
			return HitSplatDefinition.method4698(var0, var1, var2);
		} else if (var0 < 3200) { // L: 410
			return GrandExchangeOfferWorldComparator.method141(var0, var1, var2);
		} else if (var0 < 3300) { // L: 411
			return WorldMapID.method617(var0, var1, var2);
		} else if (var0 < 3400) { // L: 412
			return WorldMapArea.method485(var0, var1, var2);
		} else if (var0 < 3500) { // L: 413
			return class169.method3542(var0, var1, var2);
		} else if (var0 < 3700) { // L: 414
			return Actor.method1798(var0, var1, var2);
		} else if (var0 < 4000) { // L: 415
			return HealthBar.method2112(var0, var1, var2);
		} else if (var0 < 4100) { // L: 416
			return class303.method5451(var0, var1, var2);
		} else if (var0 < 4200) { // L: 417
			return GrandExchangeEvents.method144(var0, var1, var2);
		} else if (var0 < 4300) { // L: 418
			return ArchiveDiskAction.method4231(var0, var1, var2);
		} else if (var0 < 5100) {
			return class171.method3544(var0, var1, var2); // L: 419
		} else if (var0 < 5400) { // L: 420
			return UserComparator7.method3513(var0, var1, var2);
		} else if (var0 < 5600) { // L: 421
			return SoundCache.method2607(var0, var1, var2);
		} else if (var0 < 5700) { // L: 422
			return AbstractWorldMapData.method351(var0, var1, var2);
		} else if (var0 < 6300) { // L: 423
			return class336.method6380(var0, var1, var2);
		} else if (var0 < 6600) { // L: 424
			return ItemDefinition.method4793(var0, var1, var2);
		} else {
			return var0 < 6700 ? Player.method1324(var0, var1, var2) : 2; // L: 425 426
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lct;",
		garbageValue = "-13"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? AbstractByteArrayCopier.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}
}
