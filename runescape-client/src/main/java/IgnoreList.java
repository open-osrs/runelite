import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 12
		this.loginType = var1; // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "126"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored(); // L: 17
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Llx;",
		garbageValue = "1924184817"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 21
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IS)V",
		garbageValue = "-13688"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 25
				int var3 = var1.readUnsignedByte(); // L: 26
				boolean var4 = (var3 & 1) == 1; // L: 27
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 28
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 29
				var1.readStringCp1252NullTerminated(); // L: 30
				if (var5 != null && var5.hasCleanName()) { // L: 31
					Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 32
					if (var4) { // L: 33
						Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 34
						if (var8 != null && var7 != var8) { // L: 35
							if (var7 != null) { // L: 36
								this.remove(var8); // L: 37
							} else {
								var7 = var8; // L: 40
							}
						}
					}

					if (var7 != null) { // L: 44
						this.changeName(var7, var5, var6); // L: 45
						continue;
					}

					if (this.getSize() < 400) { // L: 47
						int var9 = this.getSize(); // L: 48
						var7 = (Ignored)this.addLast(var5, var6); // L: 49
						var7.id = var9; // L: 50
					}
					continue;
				}

				throw new IllegalStateException(); // L: 53
			}

			return; // L: 54
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "369567526"
	)
	static int method5628(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 423
			return WorldMapDecorationType.method4833(var0, var1, var2);
		} else if (var0 < 1100) { // L: 424
			return class312.method5616(var0, var1, var2);
		} else if (var0 < 1200) { // L: 425
			return InvDefinition.method2619(var0, var1, var2);
		} else if (var0 < 1300) { // L: 426
			return class43.method435(var0, var1, var2);
		} else if (var0 < 1400) { // L: 427
			return ChatChannel.method2009(var0, var1, var2);
		} else if (var0 < 1500) { // L: 428
			return class135.method2600(var0, var1, var2);
		} else if (var0 < 1600) { // L: 429
			return SceneTilePaint.method4258(var0, var1, var2);
		} else if (var0 < 1700) { // L: 430
			return Timer.method5600(var0, var1, var2);
		} else if (var0 < 1800) { // L: 431
			return GrandExchangeOfferAgeComparator.method5064(var0, var1, var2);
		} else if (var0 < 1900) { // L: 432
			return ScriptEvent.method2093(var0, var1, var2);
		} else if (var0 < 2000) { // L: 433
			return class26.method274(var0, var1, var2);
		} else if (var0 < 2100) { // L: 434
			return class312.method5616(var0, var1, var2);
		} else if (var0 < 2200) { // L: 435
			return InvDefinition.method2619(var0, var1, var2);
		} else if (var0 < 2300) { // L: 436
			return class43.method435(var0, var1, var2);
		} else if (var0 < 2400) { // L: 437
			return ChatChannel.method2009(var0, var1, var2);
		} else if (var0 < 2500) {
			return class135.method2600(var0, var1, var2); // L: 438
		} else if (var0 < 2600) { // L: 439
			return VarpDefinition.method2629(var0, var1, var2);
		} else if (var0 < 2700) { // L: 440
			return FontName.method6298(var0, var1, var2);
		} else if (var0 < 2800) { // L: 441
			return class93.method2080(var0, var1, var2);
		} else if (var0 < 2900) { // L: 442
			return Occluder.method4110(var0, var1, var2);
		} else if (var0 < 3000) { // L: 443
			return class26.method274(var0, var1, var2);
		} else if (var0 < 3200) { // L: 444
			return UserComparator9.method2466(var0, var1, var2);
		} else if (var0 < 3300) { // L: 445
			return ObjectComposition.method2964(var0, var1, var2);
		} else if (var0 < 3400) { // L: 446
			return WorldMapSection2.method3257(var0, var1, var2);
		} else if (var0 < 3500) { // L: 447
			return WorldMapLabelSize.method3217(var0, var1, var2);
		} else if (var0 < 3700) { // L: 448
			return class26.method273(var0, var1, var2);
		} else if (var0 < 3800) { // L: 449
			return ClanChannel.method41(var0, var1, var2);
		} else if (var0 < 3900) { // L: 450
			return WorldMapLabelSize.method3219(var0, var1, var2);
		} else if (var0 < 4000) { // L: 451
			return class304.method5528(var0, var1, var2);
		} else if (var0 < 4100) { // L: 452
			return FriendsList.method5647(var0, var1, var2);
		} else if (var0 < 4200) { // L: 453
			return class80.method1902(var0, var1, var2);
		} else if (var0 < 4300) {
			return WorldMapLabelSize.method3209(var0, var1, var2); // L: 454
		} else if (var0 < 5100) { // L: 455
			return class24.method261(var0, var1, var2);
		} else if (var0 < 5400) { // L: 456
			return class7.method74(var0, var1, var2);
		} else if (var0 < 5600) { // L: 457
			return class12.method173(var0, var1, var2);
		} else if (var0 < 5700) { // L: 458
			return HealthBarDefinition.method2727(var0, var1, var2);
		} else if (var0 < 6300) { // L: 459
			return UrlRequester.method2420(var0, var1, var2);
		} else if (var0 < 6600) { // L: 460
			return GraphicsObject.method1892(var0, var1, var2);
		} else if (var0 < 6700) { // L: 461
			return GameBuild.method4843(var0, var1, var2);
		} else if (var0 < 6800) { // L: 462
			return class27.method280(var0, var1, var2);
		} else if (var0 < 6900) { // L: 463
			return class214.method4280(var0, var1, var2);
		} else if (var0 < 7000) { // L: 464
			return Login.method1937(var0, var1, var2);
		} else if (var0 < 7100) { // L: 465
			return SceneTilePaint.method4260(var0, var1, var2);
		} else if (var0 < 7200) { // L: 466
			return class8.method82(var0, var1, var2);
		} else {
			return var0 < 7300 ? KeyHandler.method364(var0, var1, var2) : 2; // L: 467 468
		}
	}
}
