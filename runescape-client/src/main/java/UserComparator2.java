import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lnc;I)I",
		garbageValue = "988233292"
	)
	@Export("compare_bridged")
	int compare_bridged(User var1, User var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((User)var1, (User)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZS)I",
		garbageValue = "-23460"
	)
	static int method8042(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 427
			return FontName.method7511(var0, var1, var2);
		} else if (var0 < 1100) { // L: 428
			return class305.method5787(var0, var1, var2);
		} else if (var0 < 1200) { // L: 429
			return class117.method2709(var0, var1, var2);
		} else if (var0 < 1300) { // L: 430
			return WorldMapScaleHandler.method5134(var0, var1, var2);
		} else if (var0 < 1400) { // L: 431
			return ItemLayer.method3896(var0, var1, var2);
		} else if (var0 < 1500) { // L: 432
			return class193.method3879(var0, var1, var2);
		} else if (var0 < 1600) { // L: 433
			return UserComparator10.method2614(var0, var1, var2);
		} else if (var0 < 1700) { // L: 434
			return GameBuild.method5775(var0, var1, var2);
		} else if (var0 < 1800) { // L: 435
			return GrandExchangeEvents.method5993(var0, var1, var2);
		} else if (var0 < 1900) { // L: 436
			return class136.method2896(var0, var1, var2);
		} else if (var0 < 2000) { // L: 437
			return SecureRandomCallable.method2064(var0, var1, var2);
		} else if (var0 < 2100) { // L: 438
			return class305.method5787(var0, var1, var2);
		} else if (var0 < 2200) { // L: 439
			return class117.method2709(var0, var1, var2);
		} else if (var0 < 2300) { // L: 440
			return WorldMapScaleHandler.method5134(var0, var1, var2);
		} else if (var0 < 2400) { // L: 441
			return ItemLayer.method3896(var0, var1, var2);
		} else if (var0 < 2500) { // L: 442
			return class193.method3879(var0, var1, var2);
		} else if (var0 < 2600) { // L: 443
			return SoundCache.method803(var0, var1, var2);
		} else if (var0 < 2700) { // L: 444
			return Client.method1606(var0, var1, var2);
		} else if (var0 < 2800) { // L: 445
			return class115.method2681(var0, var1, var2);
		} else if (var0 < 2900) { // L: 446
			return class305.method5786(var0, var1, var2);
		} else if (var0 < 3000) { // L: 447
			return SecureRandomCallable.method2064(var0, var1, var2);
		} else if (var0 < 3200) { // L: 448
			return class17.method259(var0, var1, var2);
		} else if (var0 < 3300) { // L: 449
			return DirectByteArrayCopier.method5540(var0, var1, var2);
		} else if (var0 < 3400) { // L: 450
			return class119.method2741(var0, var1, var2);
		} else if (var0 < 3500) { // L: 451
			return class14.method184(var0, var1, var2);
		} else if (var0 < 3600) { // L: 452
			return FloorOverlayDefinition.method3773(var0, var1, var2);
		} else if (var0 < 3700) { // L: 453
			return class271.method5256(var0, var1, var2);
		} else if (var0 < 3800) { // L: 454
			return class132.method2861(var0, var1, var2);
		} else if (var0 < 3900) { // L: 455
			return MusicPatchPcmStream.method5485(var0, var1, var2);
		} else if (var0 < 4000) { // L: 456
			return Language.method6125(var0, var1, var2);
		} else if (var0 < 4100) {
			return class17.method280(var0, var1, var2); // L: 457
		} else if (var0 < 4200) { // L: 458
			return class19.method314(var0, var1, var2);
		} else if (var0 < 4300) { // L: 459
			return UserComparator8.method2569(var0, var1, var2);
		} else if (var0 < 5100) { // L: 460
			return DevicePcmPlayerProvider.method384(var0, var1, var2);
		} else if (var0 < 5400) { // L: 461
			return ClanChannel.method3078(var0, var1, var2);
		} else if (var0 < 5600) { // L: 462
			return WorldMapIcon_1.method4559(var0, var1, var2);
		} else if (var0 < 5700) { // L: 463
			return JagexCache.method3227(var0, var1, var2);
		} else if (var0 < 6300) { // L: 464
			return UserComparator4.method2567(var0, var1, var2);
		} else if (var0 < 6600) { // L: 465
			return HitSplatDefinition.method3642(var0, var1, var2);
		} else if (var0 < 6700) { // L: 466
			return class149.method3081(var0, var1, var2);
		} else if (var0 < 6800) { // L: 467
			return Language.method6121(var0, var1, var2);
		} else if (var0 < 6900) { // L: 468
			return MilliClock.method3293(var0, var1, var2);
		} else if (var0 < 7000) { // L: 469
			return Language.method6132(var0, var1, var2);
		} else if (var0 < 7100) { // L: 470
			return UserComparator5.method2595(var0, var1, var2);
		} else if (var0 < 7200) { // L: 471
			return class239.method4999(var0, var1, var2);
		} else if (var0 < 7300) { // L: 472
			return PcmPlayer.method770(var0, var1, var2);
		} else {
			return var0 < 7500 ? ModeWhere.method6144(var0, var1, var2) : 2; // L: 473 474
		}
	}
}
