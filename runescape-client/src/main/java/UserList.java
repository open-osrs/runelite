import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nq")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 909905761
	)
	static int field4319;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		longValue = 4805265675401059469L
	)
	static long field4320;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -7454885
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 790121473
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lne;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("t")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("z")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("r")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)Lne;",
		garbageValue = "-7122"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)[Lne;",
		garbageValue = "77510907"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1093942076"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1536599093"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-84"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size; // L: 35
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z",
		garbageValue = "158740231"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lne;",
		garbageValue = "-1825895379"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lne;",
		garbageValue = "-1911478952"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1); // L: 51 52
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lne;",
		garbageValue = "-1437986613"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Z",
		garbageValue = "1135653093"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)V",
		garbageValue = "6"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)Lne;",
		garbageValue = "-54334639"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)Lne;",
		garbageValue = "1549647050"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 79
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance(); // L: 80
			var3.set(var1, var2); // L: 81
			this.arrayAddLast(var3); // L: 82
			this.mapPut(var3); // L: 83
			return var3; // L: 84
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lne;",
		garbageValue = "487901750"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1]; // L: 89
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1528140588"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lqa;Lqa;I)V",
		garbageValue = "1207607045"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "-125620587"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lne;S)V",
		garbageValue = "-8938"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername); // L: 116
		}

	} // L: 117

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-133766134"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1; // L: 120
	} // L: 121

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-657827654"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) { // L: 127
				var2.previousUsername = null; // L: 128
			}
		}

	} // L: 131

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1804205416"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 134
		if (var1 < this.size) { // L: 135
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 136
		}

	} // L: 138

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 144
	} // L: 145

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "8"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 148
			this.comparator = var1; // L: 149
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 151
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 152
		}

	} // L: 154

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "-1639564322"
	)
	static int method6754(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4128
			var3 = PacketWriter.Client_plane; // L: 4129
			int var15 = (class101.localPlayer.x >> 7) + class28.baseX; // L: 4130
			int var8 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY; // L: 4131
			GrandExchangeOfferAgeComparator.getWorldMap().method7192(var3, var15, var8, true); // L: 4132
			return 1; // L: 4133
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4135
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4136
				String var16 = ""; // L: 4137
				var9 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4138
				if (var9 != null) { // L: 4139
					var16 = var9.getExternalName(); // L: 4140
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 4142
				return 1; // L: 4143
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4145
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4146
				GrandExchangeOfferAgeComparator.getWorldMap().setCurrentMapAreaId(var3); // L: 4147
				return 1; // L: 4148
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4150
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getZoomLevel(); // L: 4151
				return 1; // L: 4152
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4154
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4155
				GrandExchangeOfferAgeComparator.getWorldMap().setZoomPercentage(var3); // L: 4156
				return 1; // L: 4157
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4159
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4160
				return 1; // L: 4161
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4163
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4164
					GrandExchangeOfferAgeComparator.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4165
					return 1; // L: 4166
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4168
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4169
					GrandExchangeOfferAgeComparator.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4170
					return 1; // L: 4171
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4173
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4174
					GrandExchangeOfferAgeComparator.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4175
					return 1; // L: 4176
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4178
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4179
					GrandExchangeOfferAgeComparator.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4180
					return 1; // L: 4181
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4183
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayX(); // L: 4184
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayY(); // L: 4185
					return 1; // L: 4186
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4188
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4189
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4190
						if (var11 == null) { // L: 4191
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4192
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4195
						}

						return 1; // L: 4197
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4199
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4200
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4201
						if (var11 == null) { // L: 4202
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4203
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4204
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4207
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4208
						}

						return 1; // L: 4210
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4212
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4213
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4214
						if (var11 == null) { // L: 4215
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4216
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4217
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4218
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4219
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4222
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4223
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4224
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4225
						}

						return 1; // L: 4227
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4229
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4230
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4231
						if (var11 == null) { // L: 4232
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4233
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4236
						}

						return 1; // L: 4238
					} else if (var0 == 6615) { // L: 4240
						var14 = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayCoord(); // L: 4241
						if (var14 == null) { // L: 4242
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4243
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4244
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var14.x; // L: 4247
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var14.y; // L: 4248
						}

						return 1; // L: 4250
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4252
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().currentMapAreaId(); // L: 4253
						return 1; // L: 4254
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4256
						var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4257
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getCurrentMapArea(); // L: 4258
						if (var11 == null) { // L: 4259
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4260
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4261
							return 1; // L: 4262
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4264
							if (var12 == null) { // L: 4265
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4266
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4267
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12[0]; // L: 4270
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12[1]; // L: 4271
							}

							return 1; // L: 4273
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4275
							var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4276
							var11 = GrandExchangeOfferAgeComparator.getWorldMap().getCurrentMapArea(); // L: 4277
							if (var11 == null) { // L: 4278
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4279
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4280
								return 1; // L: 4281
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4283
								if (var5 == null) { // L: 4284
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4285
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.packed(); // L: 4288
								}

								return 1; // L: 4290
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4292
								class446.Interpreter_intStackSize -= 2; // L: 4293
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4294
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 4295
								ServerPacket.method5210(var3, var10, false); // L: 4296
								return 1; // L: 4297
							} else if (var0 == 6620) { // L: 4299
								class446.Interpreter_intStackSize -= 2; // L: 4300
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4301
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 4302
								ServerPacket.method5210(var3, var10, true); // L: 4303
								return 1; // L: 4304
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4306
								class446.Interpreter_intStackSize -= 2; // L: 4307
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4308
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 4309
								var9 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3); // L: 4310
								if (var9 == null) { // L: 4311
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4312
									return 1; // L: 4313
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4315
									return 1; // L: 4316
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4318
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayWith(); // L: 4319
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayHeight(); // L: 4320
								return 1; // L: 4321
							} else if (var0 == 6623) { // L: 4323
								var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4324
								var11 = GrandExchangeOfferAgeComparator.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4325
								if (var11 == null) { // L: 4326
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4327
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getId(); // L: 4330
								}

								return 1; // L: 4332
							} else if (var0 == 6624) { // L: 4334
								GrandExchangeOfferAgeComparator.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4335
								return 1; // L: 4336
							} else if (var0 == 6625) { // L: 4338
								GrandExchangeOfferAgeComparator.getWorldMap().resetMaxFlashCount(); // L: 4339
								return 1; // L: 4340
							} else if (var0 == 6626) { // L: 4342
								GrandExchangeOfferAgeComparator.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]); // L: 4343
								return 1; // L: 4344
							} else if (var0 == 6627) { // L: 4346
								GrandExchangeOfferAgeComparator.getWorldMap().resetCyclesPerFlash(); // L: 4347
								return 1; // L: 4348
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4350
									var13 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 4351
									GrandExchangeOfferAgeComparator.getWorldMap().setPerpetualFlash(var13); // L: 4352
									return 1; // L: 4353
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4355
									var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4356
									GrandExchangeOfferAgeComparator.getWorldMap().flashElement(var3); // L: 4357
									return 1; // L: 4358
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4360
									var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4361
									GrandExchangeOfferAgeComparator.getWorldMap().flashCategory(var3); // L: 4362
									return 1; // L: 4363
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4365
									GrandExchangeOfferAgeComparator.getWorldMap().stopCurrentFlashes(); // L: 4366
									return 1; // L: 4367
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4369
									var13 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1; // L: 4370
									GrandExchangeOfferAgeComparator.getWorldMap().setElementsDisabled(var13); // L: 4371
									return 1; // L: 4372
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4374
										class446.Interpreter_intStackSize -= 2; // L: 4375
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4376
										var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1; // L: 4377
										GrandExchangeOfferAgeComparator.getWorldMap().disableElement(var3, var7); // L: 4378
										return 1; // L: 4379
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4381
										class446.Interpreter_intStackSize -= 2; // L: 4382
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4383
										var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1; // L: 4384
										GrandExchangeOfferAgeComparator.getWorldMap().setCategoryDisabled(var3, var7); // L: 4385
										return 1; // L: 4386
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4388
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4389
										return 1; // L: 4390
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4392
										var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4393
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4394
										return 1; // L: 4395
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4397
										var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4398
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4399
										return 1; // L: 4400
									} else if (var0 == 6638) { // L: 4402
										class446.Interpreter_intStackSize -= 2; // L: 4403
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 4404
										var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]); // L: 4405
										var5 = GrandExchangeOfferAgeComparator.getWorldMap().method7235(var3, var10); // L: 4406
										if (var5 == null) { // L: 4407
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4408
										} else {
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.packed(); // L: 4411
										}

										return 1; // L: 4413
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4415
											var6 = GrandExchangeOfferAgeComparator.getWorldMap().iconStart(); // L: 4416
											if (var6 == null) { // L: 4417
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4418
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4419
											} else {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4422
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4423
											}

											return 1; // L: 4425
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4427
											var6 = GrandExchangeOfferAgeComparator.getWorldMap().iconNext(); // L: 4428
											if (var6 == null) { // L: 4429
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4430
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4431
											} else {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4434
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4435
											}

											return 1; // L: 4437
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4439
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4440
												var4 = class432.WorldMapElement_get(var3); // L: 4441
												if (var4.name == null) { // L: 4442
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4443
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 4446
												}

												return 1; // L: 4448
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4450
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4451
												var4 = class432.WorldMapElement_get(var3); // L: 4452
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.textSize; // L: 4453
												return 1; // L: 4454
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4456
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4457
												var4 = class432.WorldMapElement_get(var3); // L: 4458
												if (var4 == null) { // L: 4459
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4460
												} else {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.category; // L: 4463
												}

												return 1; // L: 4465
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4467
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 4468
												var4 = class432.WorldMapElement_get(var3); // L: 4469
												if (var4 == null) { // L: 4470
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4471
												} else {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4474
												}

												return 1; // L: 4476
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4478
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.mapElement; // L: 4479
												return 1; // L: 4480
											} else if (var0 == 6698) { // L: 4482
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.coord1.packed(); // L: 4483
												return 1; // L: 4484
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4486
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.coord2.packed(); // L: 4487
												return 1; // L: 4488
											} else {
												return 2; // L: 4490
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
