import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ad")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II[IS)Laz;",
		garbageValue = "-5017"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laz;",
		garbageValue = "-25"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laz;",
		garbageValue = "-1852597281"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laz;",
		garbageValue = "-64"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-566030562"
	)
	static long method807() {
		try {
			URL var0 = new URL(HealthBar.method2246("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1520493617"
	)
	static int method799(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2502
			if (class67.guestClanSettings != null) { // L: 2503
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2504
				SoundSystem.field287 = class67.guestClanSettings; // L: 2505
			} else {
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2507
			}

			return 1; // L: 2508
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2510
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2511
				if (Client.currentClanSettings[var3] != null) { // L: 2512
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2513
					SoundSystem.field287 = Client.currentClanSettings[var3]; // L: 2514
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2516
				}

				return 1; // L: 2517
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2519
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.name; // L: 2520
				return 1; // L: 2521
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2523
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.allowGuests ? 1 : 0; // L: 2524
				return 1; // L: 2525
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2527
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1444; // L: 2528
				return 1; // L: 2529
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2531
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1439; // L: 2532
				return 1; // L: 2533
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2535
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1446; // L: 2536
				return 1; // L: 2537
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2539
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1447; // L: 2540
				return 1; // L: 2541
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2543
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.memberCount; // L: 2544
				return 1; // L: 2545
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2547
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2548
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.memberNames[var3]; // L: 2549
				return 1; // L: 2550
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2552
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2553
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.memberRanks[var3]; // L: 2554
				return 1; // L: 2555
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2557
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.bannedMemberCount; // L: 2558
				return 1; // L: 2559
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2561
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2562
				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = SoundSystem.field287.bannedMemberNames[var3]; // L: 2563
				return 1; // L: 2564
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2566
					class14.Interpreter_intStackSize -= 3; // L: 2567
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2568
					var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2569
					var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 2570
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.method2652(var3, var6, var5); // L: 2571
					return 1; // L: 2572
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2574
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.currentOwner; // L: 2575
					return 1; // L: 2576
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2578
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1438; // L: 2579
					return 1; // L: 2580
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2582
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.method2649(Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]); // L: 2583
					return 1; // L: 2584
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2586
					Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1] = SoundSystem.field287.getSortedMembers()[Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1]]; // L: 2587
					return 1; // L: 2588
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2590
					class14.Interpreter_intStackSize -= 2; // L: 2591
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2592
					var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 2593
					class20.method298(var6, var3); // L: 2594
					return 1; // L: 2595
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2597
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2598
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1453[var3]; // L: 2599
					return 1; // L: 2600
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2602
						class14.Interpreter_intStackSize -= 3; // L: 2603
						var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 2604
						boolean var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1; // L: 2605
						var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 2606
						VarpDefinition.method3003(var5, var3, var4); // L: 2607
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2609
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2610
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = SoundSystem.field287.field1454[var3] ? 1 : 0; // L: 2611
						return 1; // L: 2612
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2614
						if (class115.guestClanChannel != null) { // L: 2615
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2616
							WorldMapRegion.field2069 = class115.guestClanChannel; // L: 2617
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2619
						}

						return 1; // L: 2620
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2622
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2623
						if (Client.currentClanChannels[var3] != null) { // L: 2624
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 2625
							WorldMapRegion.field2069 = Client.currentClanChannels[var3]; // L: 2626
							class133.field1499 = var3; // L: 2627
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 2629
						}

						return 1; // L: 2630
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2632
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = WorldMapRegion.field2069.name; // L: 2633
						return 1; // L: 2634
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2636
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.field1511; // L: 2637
						return 1; // L: 2638
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2640
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.field1516; // L: 2641
						return 1; // L: 2642
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2644
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.method2809(); // L: 2645
						return 1; // L: 2646
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2648
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2649
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).username.getName(); // L: 2650
						return 1; // L: 2651
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2653
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2654
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).rank; // L: 2655
						return 1; // L: 2656
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2658
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2659
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapRegion.field2069.members.get(var3)).world; // L: 2660
						return 1; // L: 2661
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2663
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 2664
						HitSplatDefinition.method3267(class133.field1499, var3); // L: 2665
						return 1; // L: 2666
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2668
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.method2817(Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize]); // L: 2669
						return 1; // L: 2670
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2672
						Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1] = WorldMapRegion.field2069.getSortedMembers()[Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize - 1]]; // L: 2673
						return 1; // L: 2674
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2676
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = NPC.field1210 != null ? 1 : 0; // L: 2677
						return 1; // L: 2678
					} else {
						return 2; // L: 2680
					}
				}
			}
		}
	}
}
