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
		this.unwrittenChanges = false;
		int var1 = class131.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method3198(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class131.archive2.method5584(15)) {
			var2 = class131.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1323241994"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1511387186"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "34"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
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
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-254051098"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1102785873"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loa;",
		garbageValue = "-624786284"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class231.getPreferencesFile("2", class338.field4054.name, var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1424242195"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class116.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class409 var9 = class409.method7247(var8.getClass());
					var23.writeByte(var9.field4452);
					class409.method7255(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1267 = Ignored.method6459();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1176168777"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label210: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2);
				if (var15.array.length - var15.offset < 1) {
					return;
				}

				int var16 = var15.readUnsignedByte();
				if (var16 >= 0 && var16 <= 2) {
					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) {
						var17 = var15.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label210;
							}

							var8 = var15.readUnsignedShort();
							var9 = var15.readUnsignedByte();
							class409[] var10 = new class409[]{class409.field4442, class409.field4449, class409.field4445};
							class409 var11 = (class409)class130.findEnumerated(var10, var9);
							Object var12 = var11.method7250(var15);
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var12);
							}

							++var7;
						}
					} else {
						var17 = var15.readUnsignedShort();

						for (var7 = 0; var7 < var17; ++var7) {
							var8 = var15.readUnsignedShort();
							var9 = var15.readInt();
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var15.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label210;
							}

							var15.readUnsignedShort();
							var15.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var26) {
				break label210;
			} finally {
				try {
					var1.close();
				} catch (Exception var25) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1321758199"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1267 < Ignored.method6459() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397883931"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-397371798"
	)
	static final void method2411() {
		if (Client.logoutTimer > 0) {
			LoginScreenAnimation.logOut();
		} else {
			Client.timer.method6231();
			VertexNormal.updateGameState(40);
			Coord.field3186 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIB)V",
		garbageValue = "23"
	)
	static void method2427(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.field2075 != null && var0.field2075.containsKey(var1)) {
				class315.method5816((Integer)var0.field2075.get(var1), var2, var3);
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "-39"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			class4.method26(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1075 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1218655419"
	)
	static final void method2426(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != SecureRandomFuture.clientPreferences.musicVolume) {
			if (SecureRandomFuture.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				NetSocket.method3118(WorldMapScaleHandler.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field743 = false;
			} else if (var0 == 0) {
				StructComposition.method3444();
				Client.field743 = false;
			} else if (class260.musicPlayerStatus != 0) {
				ChatChannel.musicTrackVolume = var0;
			} else {
				class260.midiPcmStream.setPcmStreamVolume(var0);
			}

			SecureRandomFuture.clientPreferences.musicVolume = var0;
			class127.savePreferences();
		}

	}
}
