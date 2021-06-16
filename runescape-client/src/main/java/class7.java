import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class7 extends class16 {
	@ObfuscatedName("gz")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("f")
	String field52;
	@ObfuscatedName("e")
	byte field55;
	@ObfuscatedName("v")
	byte field53;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1; // L: 154
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field52 = var1.readStringCp1252NullTerminatedOrNull(); // L: 157
		if (this.field52 != null) { // L: 158
			var1.readUnsignedByte(); // L: 159
			this.field55 = var1.readByte(); // L: 160
			this.field53 = var1.readByte(); // L: 161
		}

	} // L: 163

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		var1.name = this.field52; // L: 166
		if (this.field52 != null) { // L: 167
			var1.field27 = this.field55; // L: 168
			var1.field28 = this.field53; // L: 169
		}

	} // L: 171

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "653378140"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class262.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - class15.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - WorldMapSprite.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		SoundSystem.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1362[var1] != null) { // L: 50
			var2.read(Players.field1362[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1372[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1372[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "609615234"
	)
	static int method88(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 432
			return MouseHandler.method718(var0, var1, var2);
		} else if (var0 < 1100) { // L: 433
			return Client.method1745(var0, var1, var2);
		} else if (var0 < 1200) { // L: 434
			return InvDefinition.method2699(var0, var1, var2);
		} else if (var0 < 1300) { // L: 435
			return BufferedSink.method5990(var0, var1, var2);
		} else if (var0 < 1400) { // L: 436
			return ObjectSound.method1889(var0, var1, var2);
		} else if (var0 < 1500) { // L: 437
			return Renderable.method4250(var0, var1, var2);
		} else if (var0 < 1600) { // L: 438
			return TaskHandler.method2626(var0, var1, var2);
		} else if (var0 < 1700) { // L: 439
			return ClanChannelMember.method106(var0, var1, var2);
		} else if (var0 < 1800) { // L: 440
			return Decimator.method1162(var0, var1, var2);
		} else if (var0 < 1900) { // L: 441
			return WorldMapRegion.method3472(var0, var1, var2);
		} else if (var0 < 2000) { // L: 442
			return WorldMapLabel.method3715(var0, var1, var2);
		} else if (var0 < 2100) { // L: 443
			return Client.method1745(var0, var1, var2);
		} else if (var0 < 2200) { // L: 444
			return InvDefinition.method2699(var0, var1, var2);
		} else if (var0 < 2300) { // L: 445
			return BufferedSink.method5990(var0, var1, var2);
		} else if (var0 < 2400) { // L: 446
			return ObjectSound.method1889(var0, var1, var2);
		} else if (var0 < 2500) {
			return Renderable.method4250(var0, var1, var2); // L: 447
		} else if (var0 < 2600) { // L: 448
			return NetCache.method5178(var0, var1, var2);
		} else if (var0 < 2700) { // L: 449
			return Player.method2235(var0, var1, var2);
		} else if (var0 < 2800) { // L: 450
			return MouseHandler.method747(var0, var1, var2);
		} else if (var0 < 2900) { // L: 451
			return StructComposition.method2972(var0, var1, var2);
		} else if (var0 < 3000) { // L: 452
			return WorldMapLabel.method3715(var0, var1, var2);
		} else if (var0 < 3200) { // L: 453
			return class82.method2031(var0, var1, var2);
		} else if (var0 < 3300) { // L: 454
			return StudioGame.method4983(var0, var1, var2);
		} else if (var0 < 3400) { // L: 455
			return class267.method4991(var0, var1, var2);
		} else if (var0 < 3500) { // L: 456
			return class18.method262(var0, var1, var2);
		} else if (var0 < 3600) { // L: 457
			return MilliClock.method2685(var0, var1, var2);
		} else if (var0 < 3700) { // L: 458
			return LoginScreenAnimation.method2314(var0, var1, var2);
		} else if (var0 < 3800) { // L: 459
			return WorldMapData_0.method3267(var0, var1, var2);
		} else if (var0 < 3900) { // L: 460
			return class32.method386(var0, var1, var2);
		} else if (var0 < 4000) { // L: 461
			return class281.method5204(var0, var1, var2);
		} else if (var0 < 4100) { // L: 462
			return NPCComposition.method2857(var0, var1, var2);
		} else if (var0 < 4200) {
			return SoundCache.method929(var0, var1, var2); // L: 463
		} else if (var0 < 4300) { // L: 464
			return class375.method6531(var0, var1, var2);
		} else if (var0 < 5100) { // L: 465
			return class25.method336(var0, var1, var2);
		} else if (var0 < 5400) { // L: 466
			return WorldMapSectionType.method3668(var0, var1, var2);
		} else if (var0 < 5600) { // L: 467
			return LoginScreenAnimation.method2285(var0, var1, var2);
		} else if (var0 < 5700) { // L: 468
			return UserComparator6.method2585(var0, var1, var2);
		} else if (var0 < 6300) { // L: 469
			return class19.method276(var0, var1, var2);
		} else if (var0 < 6600) { // L: 470
			return class8.method102(var0, var1, var2);
		} else if (var0 < 6700) { // L: 471
			return ModeWhere.method5283(var0, var1, var2);
		} else if (var0 < 6800) { // L: 472
			return class43.method527(var0, var1, var2);
		} else if (var0 < 6900) { // L: 473
			return class5.method72(var0, var1, var2);
		} else if (var0 < 7000) { // L: 474
			return UserComparator4.method2529(var0, var1, var2);
		} else if (var0 < 7100) { // L: 475
			return class269.method4996(var0, var1, var2);
		} else if (var0 < 7200) { // L: 476
			return WorldMapScaleHandler.method3857(var0, var1, var2);
		} else {
			return var0 < 7300 ? PcmPlayer.method898(var0, var1, var2) : 2; // L: 477 478
		}
	}
}
