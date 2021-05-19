import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -695470779
	)
	final int field1942;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1100584119
	)
	final int field1936;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1415767673
	)
	final int field1939;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1942 = var1; // L: 19
		this.field1936 = var2; // L: 20
		this.field1939 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1579568903"
	)
	boolean method3154(float var1) {
		return var1 >= (float)this.field1939; // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfi;",
		garbageValue = "24"
	)
	static WorldMapLabelSize[] method3155() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 15
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "-4"
	)
	static WorldMapLabelSize method3162(int var0) {
		WorldMapLabelSize[] var1 = method3155(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field1936) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-36"
	)
	static int method3158(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 423
			return GameEngine.method588(var0, var1, var2);
		} else if (var0 < 1100) { // L: 424
			return DevicePcmPlayerProvider.method454(var0, var1, var2);
		} else if (var0 < 1200) { // L: 425
			return class243.method4612(var0, var1, var2);
		} else if (var0 < 1300) { // L: 426
			return Interpreter.method1921(var0, var1, var2);
		} else if (var0 < 1400) { // L: 427
			return ScriptEvent.method2120(var0, var1, var2);
		} else if (var0 < 1500) { // L: 428
			return DynamicObject.method2027(var0, var1, var2);
		} else if (var0 < 1600) { // L: 429
			return class232.method4357(var0, var1, var2);
		} else if (var0 < 1700) { // L: 430
			return FloorOverlayDefinition.method3049(var0, var1, var2);
		} else if (var0 < 1800) { // L: 431
			return class214.method4239(var0, var1, var2);
		} else if (var0 < 1900) { // L: 432
			return NetSocket.method2570(var0, var1, var2);
		} else if (var0 < 2000) { // L: 433
			return class80.method1942(var0, var1, var2);
		} else if (var0 < 2100) { // L: 434
			return DevicePcmPlayerProvider.method454(var0, var1, var2);
		} else if (var0 < 2200) { // L: 435
			return class243.method4612(var0, var1, var2);
		} else if (var0 < 2300) { // L: 436
			return Interpreter.method1921(var0, var1, var2);
		} else if (var0 < 2400) { // L: 437
			return ScriptEvent.method2120(var0, var1, var2);
		} else if (var0 < 2500) {
			return DynamicObject.method2027(var0, var1, var2); // L: 438
		} else if (var0 < 2600) { // L: 439
			return class14.method216(var0, var1, var2);
		} else if (var0 < 2700) { // L: 440
			return class80.method1939(var0, var1, var2);
		} else if (var0 < 2800) { // L: 441
			return class214.method4241(var0, var1, var2);
		} else if (var0 < 2900) { // L: 442
			return WorldMapAreaData.method3668(var0, var1, var2);
		} else if (var0 < 3000) { // L: 443
			return class80.method1942(var0, var1, var2);
		} else if (var0 < 3200) { // L: 444
			return InvDefinition.method2616(var0, var1, var2);
		} else if (var0 < 3300) { // L: 445
			return World.method1713(var0, var1, var2);
		} else if (var0 < 3400) { // L: 446
			return HealthBar.method2250(var0, var1, var2);
		} else if (var0 < 3500) { // L: 447
			return CollisionMap.method3127(var0, var1, var2);
		} else if (var0 < 3700) { // L: 448
			return class303.method5379(var0, var1, var2);
		} else if (var0 < 3800) { // L: 449
			return class22.method290(var0, var1, var2);
		} else if (var0 < 3900) { // L: 450
			return class286.method5056(var0, var1, var2);
		} else if (var0 < 4000) { // L: 451
			return NPCComposition.method2744(var0, var1, var2);
		} else if (var0 < 4100) { // L: 452
			return Player.method2179(var0, var1, var2);
		} else if (var0 < 4200) { // L: 453
			return class142.method2715(var0, var1, var2);
		} else if (var0 < 4300) { // L: 454
			return FriendSystem.method1795(var0, var1, var2);
		} else if (var0 < 5100) { // L: 455
			return SecureRandomFuture.method2000(var0, var1, var2);
		} else if (var0 < 5400) { // L: 456
			return class258.method4787(var0, var1, var2);
		} else if (var0 < 5600) { // L: 457
			return WorldMapLabel.method3583(var0, var1, var2);
		} else if (var0 < 5700) { // L: 458
			return class1.method16(var0, var1, var2);
		} else if (var0 < 6300) { // L: 459
			return WorldMapDecorationType.method4784(var0, var1, var2);
		} else if (var0 < 6600) { // L: 460
			return MouseRecorder.method2125(var0, var1, var2);
		} else if (var0 < 6700) { // L: 461
			return class305.method5411(var0, var1, var2);
		} else if (var0 < 6800) { // L: 462
			return class14.method215(var0, var1, var2);
		} else if (var0 < 6900) { // L: 463
			return Decimator.method1111(var0, var1, var2);
		} else if (var0 < 7000) { // L: 464
			return class249.method4732(var0, var1, var2);
		} else if (var0 < 7100) { // L: 465
			return Renderable.method4078(var0, var1, var2);
		} else if (var0 < 7200) { // L: 466
			return CollisionMap.method3110(var0, var1, var2);
		} else {
			return var0 < 7300 ? class1.method15(var0, var1, var2) : 2; // L: 467 468
		}
	}
}
