import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("u")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("p")
	@Export("map")
	Map map;
	@ObfuscatedName("b")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("e")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 93578901250318875L
	)
	long field1366;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = class235.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = GrandExchangeOfferAgeComparator.method4606(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (class235.archive2.method4440(15)) {
			var2 = class235.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "849299209"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1590858521"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "111416311"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "39"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2094662895"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "944550369"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1577659232"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 75
			if (!this.intsPersistence[var1]) { // L: 76
				this.map.remove(var1); // L: 77
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 80
			this.strings[var1] = null; // L: 81
		}

	} // L: 83

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lni;",
		garbageValue = "1031892444"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class15.getPreferencesFile("2", class27.field208.name, var1); // L: 86
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 90

		try {
			int var2 = 3; // L: 92
			int var3 = 0; // L: 93
			Iterator var4 = this.map.entrySet().iterator(); // L: 94

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 95
				int var6 = (Integer)var5.getKey(); // L: 97
				if (this.intsPersistence[var6]) { // L: 98
					Object var7 = var5.getValue(); // L: 99
					var2 += 3; // L: 100
					if (var7 instanceof Integer) { // L: 101
						var2 += 4;
					} else if (var7 instanceof String) { // L: 102
						var2 += Friend.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 103
				}
			}

			Buffer var24 = new Buffer(var2); // L: 107
			var24.writeByte(2); // L: 108
			var24.writeShort(var3); // L: 109
			Iterator var25 = this.map.entrySet().iterator(); // L: 110

			while (var25.hasNext()) {
				Entry var13 = (Entry)var25.next(); // L: 111
				int var14 = (Integer)var13.getKey(); // L: 113
				if (this.intsPersistence[var14]) { // L: 114
					var24.writeShort(var14); // L: 115
					Object var8 = var13.getValue(); // L: 116
					class373 var9 = class373.method6477(var8.getClass()); // L: 117
					var24.writeByte(var9.field4130); // L: 118
					class369 var10 = class373.method6480(var8.getClass()); // L: 120
					var10.vmethod6493(var8, var24); // L: 121
				}
			}

			var1.write(var24.array, 0, var24.offset); // L: 126
		} catch (Exception var22) { // L: 128
		} finally {
			try {
				var1.close(); // L: 131
			} catch (Exception var21) { // L: 133
			}

		}

		this.unwrittenChanges = false; // L: 135
		this.field1366 = ObjectSound.currentTimeMillis(); // L: 136
	} // L: 137

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1853705286"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 140

		label214: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 142

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 143 144 147
					var4 = var1.read(var2, var3, var2.length - var3); // L: 145
					if (var4 == -1) { // L: 146
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2); // L: 149
				if (var15.array.length - var15.offset < 1) { // L: 150
					return;
				}

				int var16 = var15.readUnsignedByte(); // L: 151
				if (var16 >= 0 && var16 <= 2) { // L: 152
					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) { // L: 153
						var17 = var15.readUnsignedShort(); // L: 154
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label214;
							}

							var8 = var15.readUnsignedShort(); // L: 156
							var9 = var15.readUnsignedByte(); // L: 157
							class373[] var10 = new class373[]{class373.field4128, class373.field4134, class373.field4126}; // L: 160
							class373 var11 = (class373)UserComparator8.findEnumerated(var10, var9); // L: 162
							Object var12 = var11.method6482(var15); // L: 163
							if (this.intsPersistence[var8]) { // L: 164
								this.map.put(var8, var12); // L: 165
							}

							++var7; // L: 155
						}
					} else {
						var17 = var15.readUnsignedShort(); // L: 170

						for (var7 = 0; var7 < var17; ++var7) { // L: 171
							var8 = var15.readUnsignedShort(); // L: 172
							var9 = var15.readInt(); // L: 173
							if (this.intsPersistence[var8]) { // L: 174
								this.map.put(var8, var9); // L: 175
							}
						}

						var7 = var15.readUnsignedShort(); // L: 178
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label214;
							}

							var15.readUnsignedShort(); // L: 180
							var15.readStringCp1252NullTerminated(); // L: 181
							++var8; // L: 179
						}
					}
				}
			} catch (Exception var26) { // L: 185
				break label214;
			} finally {
				try {
					var1.close(); // L: 188
				} catch (Exception var25) {
				}

			}

			return; // L: 190
		}

		this.unwrittenChanges = false; // L: 192
	} // L: 193

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "150"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1366 < ObjectSound.currentTimeMillis() - 60000L) { // L: 196
			this.write(); // L: 197
		}

	} // L: 199

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 202
	}

	@ObfuscatedName("o")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 34
			if (var0 % 37L == 0L) { // L: 35
				return null;
			} else {
				int var2 = 0; // L: 36

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 37 38 40
					++var2; // L: 39
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 42 43 52
					long var6 = var0; // L: 44
					var0 /= 37L; // L: 45
					var8 = class304.base37Table[(int)(var6 - 37L * var0)]; // L: 46
					if (var8 == '_') { // L: 47
						int var9 = var5.length() - 1; // L: 48
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 49
						var8 = 160; // L: 50
					}
				}

				var5.reverse(); // L: 54
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 55
				return var5.toString(); // L: 56
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1479918720"
	)
	static final void method2340() {
		class20.method304(false); // L: 4889
		Client.field655 = 0; // L: 4890
		boolean var0 = true; // L: 4891

		int var1;
		for (var1 = 0; var1 < class15.regionLandArchives.length; ++var1) { // L: 4892
			if (WorldMapData_0.regionMapArchiveIds[var1] != -1 && class15.regionLandArchives[var1] == null) { // L: 4893 4894
				class15.regionLandArchives[var1] = class157.archive5.takeFile(WorldMapData_0.regionMapArchiveIds[var1], 0); // L: 4895
				if (class15.regionLandArchives[var1] == null) { // L: 4896
					var0 = false; // L: 4897
					++Client.field655; // L: 4898
				}
			}

			if (class18.regionLandArchiveIds[var1] != -1 && MouseHandler.regionMapArchives[var1] == null) { // L: 4902 4903
				MouseHandler.regionMapArchives[var1] = class157.archive5.takeFileEncrypted(class18.regionLandArchiveIds[var1], 0, NPC.xteaKeys[var1]); // L: 4904
				if (MouseHandler.regionMapArchives[var1] == null) { // L: 4905
					var0 = false; // L: 4906
					++Client.field655; // L: 4907
				}
			}
		}

		if (!var0) { // L: 4912
			Client.field659 = 1; // L: 4913
		} else {
			Client.field657 = 0; // L: 4916
			var0 = true; // L: 4917

			int var3;
			int var4;
			for (var1 = 0; var1 < class15.regionLandArchives.length; ++var1) { // L: 4918
				byte[] var2 = MouseHandler.regionMapArchives[var1]; // L: 4919
				if (var2 != null) { // L: 4920
					var3 = (class11.regions[var1] >> 8) * 64 - ItemLayer.baseX; // L: 4921
					var4 = (class11.regions[var1] & 255) * 64 - Tile.baseY; // L: 4922
					if (Client.isInInstance) { // L: 4923
						var3 = 10; // L: 4924
						var4 = 10; // L: 4925
					}

					var0 &= ItemContainer.method2092(var2, var3, var4); // L: 4927
				}
			}

			if (!var0) { // L: 4930
				Client.field659 = 2; // L: 4931
			} else {
				if (Client.field659 != 0) { // L: 4934
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				BoundaryObject.playPcmPlayers(); // L: 4935
				WorldMapArea.scene.clear(); // L: 4936

				for (var1 = 0; var1 < 4; ++var1) { // L: 4937
					Client.collisionMaps[var1].clear();
				}

				int var13;
				for (var1 = 0; var1 < 4; ++var1) { // L: 4938
					for (var13 = 0; var13 < 104; ++var13) { // L: 4939
						for (var3 = 0; var3 < 104; ++var3) { // L: 4940
							Tiles.Tiles_renderFlags[var1][var13][var3] = 0; // L: 4941
						}
					}
				}

				BoundaryObject.playPcmPlayers(); // L: 4945
				Tiles.Tiles_minPlane = 99; // L: 4947
				class9.field69 = new byte[4][104][104]; // L: 4948
				Tiles.field1092 = new byte[4][104][104]; // L: 4949
				Tiles.field1091 = new byte[4][104][104]; // L: 4950
				class362.field4079 = new byte[4][104][104]; // L: 4951
				MidiPcmStream.field2489 = new int[4][105][105]; // L: 4952
				SecureRandomCallable.field1106 = new byte[4][105][105]; // L: 4953
				WorldMapLabelSize.field1570 = new int[105][105]; // L: 4954
				Tiles.Tiles_hue = new int[104]; // L: 4955
				Tiles.Tiles_saturation = new int[104]; // L: 4956
				Tiles.Tiles_lightness = new int[104]; // L: 4957
				GrandExchangeOfferOwnWorldComparator.Tiles_hueMultiplier = new int[104]; // L: 4958
				class375.field4136 = new int[104]; // L: 4959
				var1 = class15.regionLandArchives.length; // L: 4961

				for (ObjectSound var16 = (ObjectSound)ObjectSound.objectSounds.last(); var16 != null; var16 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4963
					if (var16.stream1 != null) { // L: 4964
						Huffman.pcmStreamMixer.removeSubStream(var16.stream1); // L: 4965
						var16.stream1 = null; // L: 4966
					}

					if (var16.stream2 != null) { // L: 4968
						Huffman.pcmStreamMixer.removeSubStream(var16.stream2); // L: 4969
						var16.stream2 = null; // L: 4970
					}
				}

				ObjectSound.objectSounds.clear(); // L: 4973
				class20.method304(true); // L: 4975
				int var5;
				int var6;
				int var7;
				byte var8;
				int var10;
				int var11;
				if (!Client.isInInstance) { // L: 4976
					byte[] var15;
					for (var13 = 0; var13 < var1; ++var13) { // L: 4977
						var3 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX; // L: 4978
						var4 = (class11.regions[var13] & 255) * 64 - Tile.baseY; // L: 4979
						var15 = class15.regionLandArchives[var13]; // L: 4980
						if (var15 != null) { // L: 4981
							BoundaryObject.playPcmPlayers(); // L: 4982
							MouseRecorder.method2108(var15, var3, var4, class105.field1327 * 8 - 48, Language.field3357 * 8 - 48, Client.collisionMaps); // L: 4983
						}
					}

					for (var13 = 0; var13 < var1; ++var13) { // L: 4986
						var3 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX; // L: 4987
						var4 = (class11.regions[var13] & 255) * 64 - Tile.baseY; // L: 4988
						var15 = class15.regionLandArchives[var13]; // L: 4989
						if (var15 == null && Language.field3357 < 800) { // L: 4990
							BoundaryObject.playPcmPlayers(); // L: 4991
							var6 = var3; // L: 4992
							var7 = var4; // L: 4993
							var8 = 64; // L: 4994
							byte var9 = 64; // L: 4995

							for (var10 = var4; var10 <= var7 + var9; ++var10) { // L: 4997
								for (var11 = var6; var11 <= var6 + var8; ++var11) { // L: 4998
									if (var11 >= 0 && var11 < 104 && var10 >= 0 && var10 < 104) { // L: 4999
										SecureRandomCallable.field1106[0][var11][var10] = 127; // L: 5000
										if (var11 == var6 && var11 > 0) { // L: 5001
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11 - 1][var10];
										}

										if (var11 == var8 + var6 && var11 < 103) { // L: 5002
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11 + 1][var10];
										}

										if (var7 == var10 && var10 > 0) {
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11][var10 - 1]; // L: 5003
										}

										if (var10 == var7 + var9 && var10 < 103) { // L: 5004
											Tiles.Tiles_heights[0][var11][var10] = Tiles.Tiles_heights[0][var11][var10 + 1];
										}
									}
								}
							}
						}
					}

					class20.method304(true); // L: 5011

					for (var13 = 0; var13 < var1; ++var13) { // L: 5012
						byte[] var14 = MouseHandler.regionMapArchives[var13]; // L: 5013
						if (var14 != null) { // L: 5014
							var4 = (class11.regions[var13] >> 8) * 64 - ItemLayer.baseX; // L: 5015
							var5 = (class11.regions[var13] & 255) * 64 - Tile.baseY; // L: 5016
							BoundaryObject.playPcmPlayers(); // L: 5017
							class243.method4399(var14, var4, var5, WorldMapArea.scene, Client.collisionMaps); // L: 5018
						}
					}
				}

				int var19;
				if (Client.isInInstance) { // L: 5022
					int var20;
					for (var13 = 0; var13 < 4; ++var13) { // L: 5023
						BoundaryObject.playPcmPlayers(); // L: 5024

						for (var3 = 0; var3 < 13; ++var3) { // L: 5025
							for (var4 = 0; var4 < 13; ++var4) { // L: 5026
								boolean var17 = false; // L: 5027
								var6 = Client.instanceChunkTemplates[var13][var3][var4]; // L: 5028
								if (var6 != -1) { // L: 5029
									var7 = var6 >> 24 & 3; // L: 5030
									var19 = var6 >> 1 & 3; // L: 5031
									var20 = var6 >> 14 & 1023; // L: 5032
									var10 = var6 >> 3 & 2047; // L: 5033
									var11 = (var20 / 8 << 8) + var10 / 8; // L: 5034

									for (int var12 = 0; var12 < class11.regions.length; ++var12) { // L: 5035
										if (class11.regions[var12] == var11 && class15.regionLandArchives[var12] != null) { // L: 5036
											class7.method104(class15.regionLandArchives[var12], var13, var3 * 8, var4 * 8, var7, (var20 & 7) * 8, (var10 & 7) * 8, var19, Client.collisionMaps); // L: 5037
											var17 = true; // L: 5038
											break;
										}
									}
								}

								if (!var17) { // L: 5043
									class26.method368(var13, var3 * 8, var4 * 8); // L: 5044
								}
							}
						}
					}

					for (var13 = 0; var13 < 13; ++var13) { // L: 5049
						for (var3 = 0; var3 < 13; ++var3) { // L: 5050
							var4 = Client.instanceChunkTemplates[0][var13][var3]; // L: 5051
							if (var4 == -1) { // L: 5052
								var5 = var13 * 8; // L: 5053
								var6 = var3 * 8; // L: 5054
								byte var18 = 8; // L: 5055
								var8 = 8; // L: 5056

								for (var20 = var6; var20 <= var6 + var8; ++var20) { // L: 5058
									for (var10 = var5; var10 <= var18 + var5; ++var10) { // L: 5059
										if (var10 >= 0 && var10 < 104 && var20 >= 0 && var20 < 104) { // L: 5060
											SecureRandomCallable.field1106[0][var10][var20] = 127; // L: 5061
											if (var10 == var5 && var10 > 0) { // L: 5062
												Tiles.Tiles_heights[0][var10][var20] = Tiles.Tiles_heights[0][var10 - 1][var20];
											}

											if (var10 == var5 + var18 && var10 < 103) { // L: 5063
												Tiles.Tiles_heights[0][var10][var20] = Tiles.Tiles_heights[0][var10 + 1][var20];
											}

											if (var6 == var20 && var20 > 0) { // L: 5064
												Tiles.Tiles_heights[0][var10][var20] = Tiles.Tiles_heights[0][var10][var20 - 1];
											}

											if (var20 == var8 + var6 && var20 < 103) { // L: 5065
												Tiles.Tiles_heights[0][var10][var20] = Tiles.Tiles_heights[0][var10][var20 + 1];
											}
										}
									}
								}
							}
						}
					}

					class20.method304(true); // L: 5073

					for (var13 = 0; var13 < 4; ++var13) { // L: 5074
						BoundaryObject.playPcmPlayers(); // L: 5075

						for (var3 = 0; var3 < 13; ++var3) { // L: 5076
							for (var4 = 0; var4 < 13; ++var4) { // L: 5077
								var5 = Client.instanceChunkTemplates[var13][var3][var4]; // L: 5078
								if (var5 != -1) { // L: 5079
									var6 = var5 >> 24 & 3; // L: 5080
									var7 = var5 >> 1 & 3; // L: 5081
									var19 = var5 >> 14 & 1023; // L: 5082
									var20 = var5 >> 3 & 2047; // L: 5083
									var10 = (var19 / 8 << 8) + var20 / 8; // L: 5084

									for (var11 = 0; var11 < class11.regions.length; ++var11) { // L: 5085
										if (class11.regions[var11] == var10 && MouseHandler.regionMapArchives[var11] != null) { // L: 5086
											class157.method3114(MouseHandler.regionMapArchives[var11], var13, var3 * 8, var4 * 8, var6, (var19 & 7) * 8, (var20 & 7) * 8, var7, WorldMapArea.scene, Client.collisionMaps); // L: 5087
											break; // L: 5088
										}
									}
								}
							}
						}
					}
				}

				class20.method304(true); // L: 5096
				BoundaryObject.playPcmPlayers(); // L: 5097
				GameEngine.method680(WorldMapArea.scene, Client.collisionMaps); // L: 5098
				class20.method304(true); // L: 5099
				var13 = Tiles.Tiles_minPlane; // L: 5100
				if (var13 > class26.Client_plane) { // L: 5101
					var13 = class26.Client_plane;
				}

				if (var13 < class26.Client_plane - 1) { // L: 5102
					var13 = class26.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5103
					WorldMapArea.scene.init(Tiles.Tiles_minPlane);
				} else {
					WorldMapArea.scene.init(0); // L: 5104
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5105
					for (var4 = 0; var4 < 104; ++var4) { // L: 5106
						class225.updateItemPile(var3, var4); // L: 5107
					}
				}

				BoundaryObject.playPcmPlayers(); // L: 5110
				NetFileRequest.method4472(); // L: 5111
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5112
				PacketBufferNode var21;
				if (class10.client.hasFrame()) { // L: 5113
					var21 = ObjectComposition.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher); // L: 5115
					var21.packetBuffer.writeInt(1057001181); // L: 5116
					Client.packetWriter.addNode(var21); // L: 5117
				}

				if (!Client.isInInstance) { // L: 5119
					var3 = (class105.field1327 - 6) / 8; // L: 5120
					var4 = (class105.field1327 + 6) / 8; // L: 5121
					var5 = (Language.field3357 - 6) / 8; // L: 5122
					var6 = (Language.field3357 + 6) / 8; // L: 5123

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5124
						for (var19 = var5 - 1; var19 <= var6 + 1; ++var19) { // L: 5125
							if (var7 < var3 || var7 > var4 || var19 < var5 || var19 > var6) { // L: 5126
								class157.archive5.loadRegionFromName("m" + var7 + "_" + var19); // L: 5127
								class157.archive5.loadRegionFromName("l" + var7 + "_" + var19); // L: 5128
							}
						}
					}
				}

				class20.updateGameState(30); // L: 5132
				BoundaryObject.playPcmPlayers(); // L: 5133
				class69.method1166(); // L: 5134
				var21 = ObjectComposition.getPacketBufferNode(ClientPacket.field2236, Client.packetWriter.isaacCipher); // L: 5135
				Client.packetWriter.addNode(var21); // L: 5136
				Decimator.clock.mark(); // L: 5138

				for (var4 = 0; var4 < 32; ++var4) { // L: 5139
					GameEngine.graphicsTickTimes[var4] = 0L;
				}

				for (var4 = 0; var4 < 32; ++var4) { // L: 5140
					GameEngine.clientTickTimes[var4] = 0L;
				}

				class232.gameCyclesToDo = 0; // L: 5141
			}
		}
	} // L: 4914 4932 5143
}
