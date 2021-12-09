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

@Deprecated
@ObfuscatedName("ct")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("uk")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("p")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("m")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("t")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("s")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -4836717580474471841L
	)
	long field1267;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class131.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3198(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class131.archive2.method5584(15)) { // L: 50
			var2 = class131.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1323241994"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1511387186"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "34"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "827123605"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-254051098"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1102785873"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loa;",
		garbageValue = "-624786284"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class231.getPreferencesFile("2", class338.field4054.name, var1); // L: 104
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1424242195"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class116.stringCp1252NullTerminatedByteSize((String)var7); // L: 120
					}

					++var3; // L: 121
				}
			}

			Buffer var23 = new Buffer(var2); // L: 125
			var23.writeByte(2); // L: 126
			var23.writeShort(var3); // L: 127
			Iterator var24 = this.map.entrySet().iterator(); // L: 128

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 129
				int var13 = (Integer)var12.getKey(); // L: 131
				if (this.intsPersistence[var13]) { // L: 132
					var23.writeShort(var13); // L: 133
					Object var8 = var12.getValue(); // L: 134
					class409 var9 = class409.method7247(var8.getClass()); // L: 135
					var23.writeByte(var9.field4452); // L: 136
					class409.method7255(var8, var23); // L: 137
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 141
		} catch (Exception var21) { // L: 143
		} finally {
			try {
				var1.close(); // L: 146
			} catch (Exception var20) { // L: 148
			}

		}

		this.unwrittenChanges = false; // L: 150
		this.field1267 = Ignored.method6459(); // L: 151
	} // L: 152

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1176168777"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 155

		label226: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 157

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 158 159 162
					var4 = var1.read(var2, var3, var2.length - var3); // L: 160
					if (var4 == -1) { // L: 161
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2); // L: 164
				if (var15.array.length - var15.offset >= 1) {
					int var16 = var15.readUnsignedByte(); // L: 166
					if (var16 >= 0 && var16 <= 2) {
						int var7;
						int var8;
						int var9;
						int var17;
						if (var16 >= 2) { // L: 168
							var17 = var15.readUnsignedShort(); // L: 169
							var7 = 0;

							while (true) {
								if (var7 >= var17) {
									break label226;
								}

								var8 = var15.readUnsignedShort(); // L: 171
								var9 = var15.readUnsignedByte(); // L: 172
								class409[] var10 = new class409[]{class409.field4442, class409.field4449, class409.field4445}; // L: 175
								class409 var11 = (class409)class130.findEnumerated(var10, var9); // L: 177
								Object var12 = var11.method7250(var15); // L: 178
								if (this.intsPersistence[var8]) { // L: 179
									this.map.put(var8, var12); // L: 180
								}

								++var7; // L: 170
							}
						} else {
							var17 = var15.readUnsignedShort(); // L: 185

							for (var7 = 0; var7 < var17; ++var7) { // L: 186
								var8 = var15.readUnsignedShort(); // L: 187
								var9 = var15.readInt(); // L: 188
								if (this.intsPersistence[var8]) { // L: 189
									this.map.put(var8, var9); // L: 190
								}
							}

							var7 = var15.readUnsignedShort(); // L: 193
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label226;
								}

								var15.readUnsignedShort(); // L: 195
								var15.readStringCp1252NullTerminated(); // L: 196
								++var8; // L: 194
							}
						}
					}

					return; // L: 167
				}
			} catch (Exception var26) { // L: 200
				break label226;
			} finally {
				try {
					var1.close(); // L: 203
				} catch (Exception var25) { // L: 205
				}

			}

			return; // L: 165
		}

		this.unwrittenChanges = false; // L: 207
	} // L: 208

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1321758199"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1267 < Ignored.method6459() - 60000L) { // L: 211
			this.write(); // L: 212
		}

	} // L: 214

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397883931"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 217
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-397371798"
	)
	static final void method2411() {
		if (Client.logoutTimer > 0) { // L: 3647
			LoginScreenAnimation.logOut(); // L: 3648
		} else {
			Client.timer.method6231(); // L: 3651
			VertexNormal.updateGameState(40); // L: 3652
			Coord.field3186 = Client.packetWriter.getSocket(); // L: 3653
			Client.packetWriter.removeSocket(); // L: 3654
		}
	} // L: 3649 3655

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIB)V",
		garbageValue = "23"
	)
	static void method2427(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0) { // L: 4309
			if (var0.field2075 != null && var0.field2075.containsKey(var1)) { // L: 4310
				class315.method5816((Integer)var0.field2075.get(var1), var2, var3); // L: 4311
			}
		}
	} // L: 4312

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-39"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7932

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7933 7934 7939
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7935
				var9 = var10; // L: 7936
				break;
			}
		}

		if (var9 == null) { // L: 7941
			var9 = new PendingSpawn(); // L: 7942
			var9.plane = var0; // L: 7943
			var9.type = var3; // L: 7944
			var9.x = var1; // L: 7945
			var9.y = var2; // L: 7946
			class4.method26(var9); // L: 7947
			Client.pendingSpawns.addFirst(var9); // L: 7948
		}

		var9.id = var4; // L: 7950
		var9.field1075 = var5; // L: 7951
		var9.orientation = var6; // L: 7952
		var9.delay = var7; // L: 7953
		var9.hitpoints = var8; // L: 7954
	} // L: 7955

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1218655419"
	)
	static final void method2426(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12129
		if (var0 != SecureRandomFuture.clientPreferences.musicVolume) { // L: 12130
			if (SecureRandomFuture.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 12131
				NetSocket.method3118(WorldMapScaleHandler.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12132
				Client.field743 = false; // L: 12133
			} else if (var0 == 0) { // L: 12135
				StructComposition.method3444(); // L: 12136
				Client.field743 = false; // L: 12137
			} else if (class260.musicPlayerStatus != 0) { // L: 12140
				ChatChannel.musicTrackVolume = var0;
			} else {
				class260.midiPcmStream.setPcmStreamVolume(var0); // L: 12141
			}

			SecureRandomFuture.clientPreferences.musicVolume = var0; // L: 12143
			class127.savePreferences(); // L: 12144
		}

	} // L: 12146
}
