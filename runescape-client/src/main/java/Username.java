import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("Username")
public class Username implements Comparable {
	@ObfuscatedName("n")
	@Export("name")
	String name;
	@ObfuscatedName("v")
	@Export("cleanName")
	String cleanName;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lml;)V"
	)
	public Username(String var1, LoginType var2) {
		this.name = var1; // L: 11
		String var4;
		if (var1 == null) { // L: 15
			var4 = null; // L: 16
		} else {
			label124: {
				int var5 = 0; // L: 19

				int var6;
				for (var6 = var1.length(); var5 < var6 && class281.method5194(var1.charAt(var5)); ++var5) { // L: 20 21
				}

				while (var6 > var5 && class281.method5194(var1.charAt(var6 - 1))) { // L: 22
					--var6;
				}

				int var7 = var6 - var5; // L: 23
				if (var7 >= 1) { // L: 25
					byte var9;
					if (var2 == null) { // L: 29
						var9 = 12; // L: 30
					} else {
						switch(var2.field4073) { // L: 33
						case 0:
							var9 = 20; // L: 35
							break; // L: 36
						default:
							var9 = 12; // L: 38
						}
					}

					if (var7 <= var9) { // L: 42
						StringBuilder var15 = new StringBuilder(var7); // L: 47

						for (int var17 = var5; var17 < var6; ++var17) { // L: 48
							char var10 = var1.charAt(var17); // L: 49
							boolean var11;
							if (Character.isISOControl(var10)) { // L: 52
								var11 = false; // L: 53
							} else if (class225.isAlphaNumeric(var10)) { // L: 56
								var11 = true; // L: 57
							} else {
								char[] var12 = class349.field4080; // L: 61
								int var13 = 0;

								label91:
								while (true) {
									char var14;
									if (var13 >= var12.length) {
										var12 = class349.field4078; // L: 71

										for (var13 = 0; var13 < var12.length; ++var13) { // L: 72
											var14 = var12[var13]; // L: 73
											if (var14 == var10) { // L: 74
												var11 = true; // L: 75
												break label91; // L: 76
											}
										}

										var11 = false; // L: 80
										break;
									}

									var14 = var12[var13]; // L: 63
									if (var10 == var14) { // L: 64
										var11 = true; // L: 65
										break; // L: 66
									}

									++var13; // L: 62
								}
							}

							if (var11) { // L: 82
								char var16;
								switch(var10) { // L: 85
								case ' ':
								case '-':
								case '_':
								case ' ':
									var16 = '_'; // L: 102
									break; // L: 103
								case '#':
								case '[':
								case ']':
									var16 = var10; // L: 131
									break; // L: 132
								case 'À':
								case 'Á':
								case 'Â':
								case 'Ã':
								case 'Ä':
								case 'à':
								case 'á':
								case 'â':
								case 'ã':
								case 'ä':
									var16 = 'a'; // L: 96
									break;
								case 'Ç':
								case 'ç':
									var16 = 'c'; // L: 147
									break; // L: 148
								case 'È':
								case 'É':
								case 'Ê':
								case 'Ë':
								case 'è':
								case 'é':
								case 'ê':
								case 'ë':
									var16 = 'e'; // L: 112
									break; // L: 113
								case 'Í':
								case 'Î':
								case 'Ï':
								case 'í':
								case 'î':
								case 'ï':
									var16 = 'i'; // L: 165
									break;
								case 'Ñ':
								case 'ñ':
									var16 = 'n'; // L: 116
									break; // L: 117
								case 'Ò':
								case 'Ó':
								case 'Ô':
								case 'Õ':
								case 'Ö':
								case 'ò':
								case 'ó':
								case 'ô':
								case 'õ':
								case 'ö':
									var16 = 'o'; // L: 143
									break; // L: 144
								case 'Ù':
								case 'Ú':
								case 'Û':
								case 'Ü':
								case 'ù':
								case 'ú':
								case 'û':
								case 'ü':
									var16 = 'u'; // L: 126
									break; // L: 127
								case 'ß':
									var16 = 'b'; // L: 150
									break; // L: 151
								case 'ÿ':
								case 'Ÿ':
									var16 = 'y'; // L: 154
									break; // L: 155
								default:
									var16 = Character.toLowerCase(var10); // L: 157
								}

								if (var16 != 0) { // L: 170
									var15.append(var16); // L: 171
								}
							}
						}

						if (var15.length() == 0) { // L: 173
							var4 = null; // L: 174
						} else {
							var4 = var15.toString(); // L: 177
						}
						break label124;
					}
				}

				var4 = null; // L: 44
			}
		}

		this.cleanName = var4; // L: 179
	} // L: 180

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1565783636"
	)
	@Export("getName")
	public String getName() {
		return this.name; // L: 183
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2035894536"
	)
	@Export("hasCleanName")
	public boolean hasCleanName() {
		return this.cleanName != null; // L: 187
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkk;B)I",
		garbageValue = "120"
	)
	@Export("compareToTyped")
	public int compareToTyped(Username var1) {
		if (this.cleanName == null) { // L: 211
			return var1.cleanName == null ? 0 : 1; // L: 212 213
		} else {
			return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName); // L: 215 216
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Username) { // L: 191
			Username var2 = (Username)var1; // L: 192
			if (this.cleanName == null) {
				return var2.cleanName == null; // L: 193
			} else if (var2.cleanName == null) { // L: 194
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName); // L: 195 196
			}
		} else {
			return false; // L: 198
		}
	}

	public int hashCode() {
		return this.cleanName == null ? 0 : this.cleanName.hashCode(); // L: 202 203
	}

	public int compareTo(Object var1) {
		return this.compareToTyped((Username)var1); // L: 220
	}

	public String toString() {
		return this.getName(); // L: 207
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "296142419"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = MilliClock.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5818
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 5819
			var7 = MilliClock.scene.getObjectFlags(var0, var1, var2, var5); // L: 5820
			var8 = var7 >> 6 & 3; // L: 5821
			var9 = var7 & 31; // L: 5822
			var10 = var3; // L: 5823
			if (TileItem.method2265(var5)) { // L: 5824
				var10 = var4;
			}

			int[] var11 = GrandExchangeOfferAgeComparator.sceneMinimapSprite.pixels; // L: 5825
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5826
			var13 = class25.Entity_unpackID(var5); // L: 5827
			ObjectComposition var14 = WorldMapAreaData.getObjectDefinition(var13); // L: 5828
			if (var14.mapSceneId != -1) { // L: 5829
				IndexedSprite var15 = WorldMapSection1.mapSceneSprites[var14.mapSceneId]; // L: 5830
				if (var15 != null) { // L: 5831
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5832
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5833
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 5834
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5838
					if (var8 == 0) { // L: 5839
						var11[var12] = var10; // L: 5840
						var11[var12 + 512] = var10; // L: 5841
						var11[var12 + 1024] = var10; // L: 5842
						var11[var12 + 1536] = var10; // L: 5843
					} else if (var8 == 1) { // L: 5845
						var11[var12] = var10; // L: 5846
						var11[var12 + 1] = var10; // L: 5847
						var11[var12 + 2] = var10; // L: 5848
						var11[var12 + 3] = var10; // L: 5849
					} else if (var8 == 2) { // L: 5851
						var11[var12 + 3] = var10; // L: 5852
						var11[var12 + 512 + 3] = var10; // L: 5853
						var11[var12 + 1024 + 3] = var10; // L: 5854
						var11[var12 + 1536 + 3] = var10; // L: 5855
					} else if (var8 == 3) { // L: 5857
						var11[var12 + 1536] = var10; // L: 5858
						var11[var12 + 1536 + 1] = var10; // L: 5859
						var11[var12 + 1536 + 2] = var10; // L: 5860
						var11[var12 + 1536 + 3] = var10; // L: 5861
					}
				}

				if (var9 == 3) { // L: 5864
					if (var8 == 0) { // L: 5865
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5866
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5867
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5868
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5870
					if (var8 == 3) { // L: 5871
						var11[var12] = var10; // L: 5872
						var11[var12 + 512] = var10; // L: 5873
						var11[var12 + 1024] = var10; // L: 5874
						var11[var12 + 1536] = var10; // L: 5875
					} else if (var8 == 0) { // L: 5877
						var11[var12] = var10; // L: 5878
						var11[var12 + 1] = var10; // L: 5879
						var11[var12 + 2] = var10; // L: 5880
						var11[var12 + 3] = var10; // L: 5881
					} else if (var8 == 1) { // L: 5883
						var11[var12 + 3] = var10; // L: 5884
						var11[var12 + 512 + 3] = var10; // L: 5885
						var11[var12 + 1024 + 3] = var10; // L: 5886
						var11[var12 + 1536 + 3] = var10; // L: 5887
					} else if (var8 == 2) { // L: 5889
						var11[var12 + 1536] = var10; // L: 5890
						var11[var12 + 1536 + 1] = var10; // L: 5891
						var11[var12 + 1536 + 2] = var10; // L: 5892
						var11[var12 + 1536 + 3] = var10; // L: 5893
					}
				}
			}
		}

		var5 = MilliClock.scene.getGameObjectTag(var0, var1, var2); // L: 5898
		if (var5 != 0L) { // L: 5899
			var7 = MilliClock.scene.getObjectFlags(var0, var1, var2, var5); // L: 5900
			var8 = var7 >> 6 & 3; // L: 5901
			var9 = var7 & 31; // L: 5902
			var10 = class25.Entity_unpackID(var5); // L: 5903
			ObjectComposition var24 = WorldMapAreaData.getObjectDefinition(var10); // L: 5904
			int var19;
			if (var24.mapSceneId != -1) { // L: 5905
				IndexedSprite var20 = WorldMapSection1.mapSceneSprites[var24.mapSceneId]; // L: 5906
				if (var20 != null) { // L: 5907
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5908
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5909
					var20.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 5910
				}
			} else if (var9 == 9) { // L: 5913
				var12 = 15658734; // L: 5914
				if (TileItem.method2265(var5)) { // L: 5915
					var12 = 15597568;
				}

				int[] var18 = GrandExchangeOfferAgeComparator.sceneMinimapSprite.pixels; // L: 5916
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5917
				if (var8 != 0 && var8 != 2) { // L: 5918
					var18[var19] = var12; // L: 5925
					var18[var19 + 1 + 512] = var12; // L: 5926
					var18[var19 + 1024 + 2] = var12; // L: 5927
					var18[var19 + 1536 + 3] = var12; // L: 5928
				} else {
					var18[var19 + 1536] = var12; // L: 5919
					var18[var19 + 1 + 1024] = var12; // L: 5920
					var18[var19 + 512 + 2] = var12; // L: 5921
					var18[var19 + 3] = var12; // L: 5922
				}
			}
		}

		var5 = MilliClock.scene.getFloorDecorationTag(var0, var1, var2); // L: 5932
		if (0L != var5) { // L: 5933
			var7 = class25.Entity_unpackID(var5); // L: 5934
			ObjectComposition var21 = WorldMapAreaData.getObjectDefinition(var7); // L: 5935
			if (var21.mapSceneId != -1) { // L: 5936
				IndexedSprite var22 = WorldMapSection1.mapSceneSprites[var21.mapSceneId]; // L: 5937
				if (var22 != null) { // L: 5938
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5939
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5940
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 5941
				}
			}
		}

	} // L: 5945
}
