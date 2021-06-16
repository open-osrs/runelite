import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3701("", 0, new class287[]{class287.field3673}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3690("", 1, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3691("", 2, new class287[]{class287.field3671, class287.field3672, class287.field3673}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3692("", 3, new class287[]{class287.field3671}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3697("", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3694("", 5, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3695("", 6, new class287[]{class287.field3673}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3696("", 8, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3693("", 9, new class287[]{class287.field3671, class287.field3672}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3698("", 10, new class287[]{class287.field3671}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3699("", 11, new class287[]{class287.field3671}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3700("", 12, new class287[]{class287.field3671, class287.field3673}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	field3704("", 13, new class287[]{class287.field3671});

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1725478607
	)
	@Export("id")
	final int id;
	@ObfuscatedName("g")
	final Set field3703;

	static {
		method5289();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkc;)V"
	)
	ModeWhere(String var3, int var4, class287[] var5) {
		this.field3703 = new HashSet();
		this.id = var4;
		class287[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class287 var8 = var6[var7];
			this.field3703.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field3703 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Ljava/lang/String;I)I",
		garbageValue = "-1585565275"
	)
	public static int method5292(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		int var4 = var1.length(); // L: 21
		byte[] var5 = new byte[var4]; // L: 22

		for (int var6 = 0; var6 < var4; ++var6) { // L: 23
			char var7 = var1.charAt(var6); // L: 24
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 25
				var5[var6] = (byte)var7;
			} else if (var7 == 8364) { // L: 26
				var5[var6] = -128;
			} else if (var7 == 8218) { // L: 27
				var5[var6] = -126;
			} else if (var7 == 402) { // L: 28
				var5[var6] = -125;
			} else if (var7 == 8222) { // L: 29
				var5[var6] = -124;
			} else if (var7 == 8230) { // L: 30
				var5[var6] = -123;
			} else if (var7 == 8224) { // L: 31
				var5[var6] = -122;
			} else if (var7 == 8225) { // L: 32
				var5[var6] = -121;
			} else if (var7 == 710) { // L: 33
				var5[var6] = -120;
			} else if (var7 == 8240) { // L: 34
				var5[var6] = -119;
			} else if (var7 == 352) {
				var5[var6] = -118;
			} else if (var7 == 8249) { // L: 36
				var5[var6] = -117;
			} else if (var7 == 338) { // L: 37
				var5[var6] = -116;
			} else if (var7 == 381) { // L: 38
				var5[var6] = -114;
			} else if (var7 == 8216) { // L: 39
				var5[var6] = -111;
			} else if (var7 == 8217) { // L: 40
				var5[var6] = -110;
			} else if (var7 == 8220) { // L: 41
				var5[var6] = -109;
			} else if (var7 == 8221) { // L: 42
				var5[var6] = -108;
			} else if (var7 == 8226) { // L: 43
				var5[var6] = -107;
			} else if (var7 == 8211) {
				var5[var6] = -106; // L: 44
			} else if (var7 == 8212) { // L: 45
				var5[var6] = -105;
			} else if (var7 == 732) { // L: 46
				var5[var6] = -104;
			} else if (var7 == 8482) { // L: 47
				var5[var6] = -103;
			} else if (var7 == 353) { // L: 48
				var5[var6] = -102;
			} else if (var7 == 8250) { // L: 49
				var5[var6] = -101;
			} else if (var7 == 339) { // L: 50
				var5[var6] = -100;
			} else if (var7 == 382) { // L: 51
				var5[var6] = -98;
			} else if (var7 == 376) { // L: 52
				var5[var6] = -97;
			} else {
				var5[var6] = 63; // L: 53
			}
		}

		var0.writeSmartByteShort(var5.length); // L: 58
		var0.offset += class250.huffman.compress(var5, 0, var5.length, var0.array, var0.offset); // L: 59
		return var0.offset - var2; // L: 60
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkg;",
		garbageValue = "1172185177"
	)
	static ModeWhere[] method5289() {
		return new ModeWhere[]{field3701, field3693, field3696, field3699, field3694, field3704, field3691, field3690, field3700, field3695, field3698, field3692, field3697}; // L: 35
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-963755121"
	)
	static int method5283(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3844
			var3 = SoundSystem.Client_plane; // L: 3845
			int var15 = (class262.localPlayer.x >> 7) + class15.baseX; // L: 3846
			int var8 = (class262.localPlayer.y >> 7) + WorldMapSprite.baseY; // L: 3847
			BZip2State.getWorldMap().method6287(var3, var15, var8, true); // L: 3848
			return 1; // L: 3849
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3851
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3852
				String var16 = ""; // L: 3853
				var9 = BZip2State.getWorldMap().getMapArea(var3); // L: 3854
				if (var9 != null) { // L: 3855
					var16 = var9.getExternalName(); // L: 3856
				}

				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var16; // L: 3858
				return 1; // L: 3859
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3861
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3862
				BZip2State.getWorldMap().setCurrentMapAreaId(var3); // L: 3863
				return 1; // L: 3864
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3866
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getZoomLevel(); // L: 3867
				return 1; // L: 3868
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3870
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3871
				BZip2State.getWorldMap().setZoomPercentage(var3); // L: 3872
				return 1; // L: 3873
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3875
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3876
				return 1; // L: 3877
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3879
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3880
					BZip2State.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3881
					return 1; // L: 3882
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3884
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3885
					BZip2State.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3886
					return 1; // L: 3887
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3889
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3890
					BZip2State.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3891
					return 1; // L: 3892
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3894
					var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3895
					BZip2State.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3896
					return 1; // L: 3897
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3899
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayX(); // L: 3900
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayY(); // L: 3901
					return 1; // L: 3902
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3904
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3905
						var11 = BZip2State.getWorldMap().getMapArea(var3); // L: 3906
						if (var11 == null) { // L: 3907
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3908
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3911
						}

						return 1; // L: 3913
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3915
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3916
						var11 = BZip2State.getWorldMap().getMapArea(var3); // L: 3917
						if (var11 == null) { // L: 3918
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3919
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3920
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3923
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3924
						}

						return 1; // L: 3926
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3928
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3929
						var11 = BZip2State.getWorldMap().getMapArea(var3); // L: 3930
						if (var11 == null) { // L: 3931
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3932
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3933
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3934
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3935
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 3938
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 3939
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 3940
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 3941
						}

						return 1; // L: 3943
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 3945
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3946
						var11 = BZip2State.getWorldMap().getMapArea(var3); // L: 3947
						if (var11 == null) { // L: 3948
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3949
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 3952
						}

						return 1; // L: 3954
					} else if (var0 == 6615) { // L: 3956
						var14 = BZip2State.getWorldMap().getDisplayCoord(); // L: 3957
						if (var14 == null) { // L: 3958
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3959
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3960
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var14.x; // L: 3963
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var14.y; // L: 3964
						}

						return 1; // L: 3966
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 3968
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().currentMapAreaId(); // L: 3969
						return 1; // L: 3970
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 3972
						var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3973
						var11 = BZip2State.getWorldMap().getCurrentMapArea(); // L: 3974
						if (var11 == null) { // L: 3975
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3976
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3977
							return 1; // L: 3978
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 3980
							if (var12 == null) { // L: 3981
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3982
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3983
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12[0]; // L: 3986
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12[1]; // L: 3987
							}

							return 1; // L: 3989
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 3991
							var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 3992
							var11 = BZip2State.getWorldMap().getCurrentMapArea(); // L: 3993
							if (var11 == null) { // L: 3994
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3995
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3996
								return 1; // L: 3997
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 3999
								if (var5 == null) { // L: 4000
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4001
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.packed(); // L: 4004
								}

								return 1; // L: 4006
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4008
								ChatChannel.Interpreter_intStackSize -= 2; // L: 4009
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4010
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 4011
								Canvas.method497(var3, var10, false); // L: 4012
								return 1; // L: 4013
							} else if (var0 == 6620) { // L: 4015
								ChatChannel.Interpreter_intStackSize -= 2; // L: 4016
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4017
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 4018
								Canvas.method497(var3, var10, true); // L: 4019
								return 1; // L: 4020
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4022
								ChatChannel.Interpreter_intStackSize -= 2; // L: 4023
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4024
								var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 4025
								var9 = BZip2State.getWorldMap().getMapArea(var3); // L: 4026
								if (var9 == null) { // L: 4027
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 4028
									return 1; // L: 4029
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4031
									return 1; // L: 4032
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4034
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayWith(); // L: 4035
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getDisplayHeight(); // L: 4036
								return 1; // L: 4037
							} else if (var0 == 6623) { // L: 4039
								var14 = new Coord(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 4040
								var11 = BZip2State.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4041
								if (var11 == null) { // L: 4042
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4043
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var11.getId(); // L: 4046
								}

								return 1; // L: 4048
							} else if (var0 == 6624) { // L: 4050
								BZip2State.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 4051
								return 1; // L: 4052
							} else if (var0 == 6625) { // L: 4054
								BZip2State.getWorldMap().resetMaxFlashCount(); // L: 4055
								return 1; // L: 4056
							} else if (var0 == 6626) { // L: 4058
								BZip2State.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 4059
								return 1; // L: 4060
							} else if (var0 == 6627) { // L: 4062
								BZip2State.getWorldMap().resetCyclesPerFlash(); // L: 4063
								return 1; // L: 4064
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4066
									var13 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 4067
									BZip2State.getWorldMap().setPerpetualFlash(var13); // L: 4068
									return 1; // L: 4069
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4071
									var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4072
									BZip2State.getWorldMap().flashElement(var3); // L: 4073
									return 1; // L: 4074
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4076
									var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4077
									BZip2State.getWorldMap().flashCategory(var3); // L: 4078
									return 1; // L: 4079
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4081
									BZip2State.getWorldMap().stopCurrentFlashes(); // L: 4082
									return 1; // L: 4083
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4085
									var13 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 4086
									BZip2State.getWorldMap().setElementsDisabled(var13); // L: 4087
									return 1; // L: 4088
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4090
										ChatChannel.Interpreter_intStackSize -= 2; // L: 4091
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4092
										var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1; // L: 4093
										BZip2State.getWorldMap().disableElement(var3, var7); // L: 4094
										return 1; // L: 4095
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4097
										ChatChannel.Interpreter_intStackSize -= 2; // L: 4098
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4099
										var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1; // L: 4100
										BZip2State.getWorldMap().setCategoryDisabled(var3, var7); // L: 4101
										return 1; // L: 4102
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4104
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4105
										return 1; // L: 4106
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4108
										var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4109
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4110
										return 1; // L: 4111
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4113
										var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4114
										Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = BZip2State.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4115
										return 1; // L: 4116
									} else if (var0 == 6638) { // L: 4118
										ChatChannel.Interpreter_intStackSize -= 2; // L: 4119
										var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 4120
										var10 = new Coord(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 4121
										var5 = BZip2State.getWorldMap().method6184(var3, var10); // L: 4122
										if (var5 == null) { // L: 4123
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4124
										} else {
											Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.packed(); // L: 4127
										}

										return 1; // L: 4129
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4131
											var6 = BZip2State.getWorldMap().iconStart(); // L: 4132
											if (var6 == null) { // L: 4133
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4134
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4135
											} else {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4138
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4139
											}

											return 1; // L: 4141
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4143
											var6 = BZip2State.getWorldMap().iconNext(); // L: 4144
											if (var6 == null) { // L: 4145
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4146
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4147
											} else {
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4150
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4151
											}

											return 1; // L: 4153
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4155
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4156
												var4 = Archive.WorldMapElement_get(var3); // L: 4157
												if (var4.name == null) { // L: 4158
													Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 4159
												} else {
													Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.name; // L: 4162
												}

												return 1; // L: 4164
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4166
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4167
												var4 = Archive.WorldMapElement_get(var3); // L: 4168
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.textSize; // L: 4169
												return 1; // L: 4170
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4172
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4173
												var4 = Archive.WorldMapElement_get(var3); // L: 4174
												if (var4 == null) { // L: 4175
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4176
												} else {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.category; // L: 4179
												}

												return 1; // L: 4181
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4183
												var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 4184
												var4 = Archive.WorldMapElement_get(var3); // L: 4185
												if (var4 == null) { // L: 4186
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 4187
												} else {
													Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4190
												}

												return 1; // L: 4192
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4194
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.mapElement; // L: 4195
												return 1; // L: 4196
											} else if (var0 == 6698) { // L: 4198
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.coord1.packed(); // L: 4199
												return 1; // L: 4200
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4202
												Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Occluder.worldMapEvent.coord2.packed(); // L: 4203
												return 1; // L: 4204
											} else {
												return 2; // L: 4206
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
