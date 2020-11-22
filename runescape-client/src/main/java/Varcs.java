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

@ObfuscatedName("cz")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("l")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("m")
	@Export("map")
	Map map;
	@ObfuscatedName("z")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("q")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -5306156143570405753L
	)
	long field1298;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = WorldMapSection3.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 32
			VarcInt var3;
			if (var4 != null) { // L: 33
				var3 = var4; // L: 34
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 37
				var4 = new VarcInt(); // L: 38
				if (var5 != null) {
					var4.method4552(new Buffer(var5)); // L: 39
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 40
				var3 = var4; // L: 41
			}

			this.intsPersistence[var2] = var3.persist; // L: 44
		}

		var2 = 0; // L: 46
		if (WorldMapSection3.archive2.method4416(15)) { // L: 47
			var2 = WorldMapSection3.archive2.getGroupFileCount(15); // L: 48
		}

		this.strings = new String[var2]; // L: 50
		this.read(); // L: 51
	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1056987732"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 55
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 56
		}

	} // L: 57

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 60
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 61 62 64
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-368948322"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 68
	} // L: 69

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2139997801"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 72
		return var2 instanceof String ? (String)var2 : ""; // L: 73 74 76
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "14747"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 80
	} // L: 81

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-475073463"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 84
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 88
			if (!this.intsPersistence[var1]) { // L: 89
				this.map.remove(var1); // L: 90
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 93
			this.strings[var1] = null; // L: 94
		}

	} // L: 96

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lmr;",
		garbageValue = "229705825"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return WorldMapID.getPreferencesFile("2", GrandExchangeOfferWorldComparator.field58.name, var1); // L: 99
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2018720636"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 103

		try {
			int var2 = 3; // L: 105
			int var3 = 0; // L: 106
			Iterator var4 = this.map.entrySet().iterator(); // L: 107

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 108
				int var6 = (Integer)var5.getKey(); // L: 110
				if (this.intsPersistence[var6]) { // L: 111
					Object var7 = var5.getValue(); // L: 112
					var2 += 3; // L: 113
					if (var7 instanceof Integer) { // L: 114
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += SpriteMask.stringCp1252NullTerminatedByteSize((String)var7); // L: 115
					}

					++var3; // L: 116
				}
			}

			Buffer var27 = new Buffer(var2); // L: 120
			var27.writeByte(2); // L: 121
			var27.writeShort(var3); // L: 122
			Iterator var28 = this.map.entrySet().iterator(); // L: 123

			label146:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 153
						break label146;
					}

					var16 = (Entry)var28.next(); // L: 124
					var17 = (Integer)var16.getKey(); // L: 126
				} while(!this.intsPersistence[var17]); // L: 127

				var27.writeShort(var17); // L: 128
				Object var8 = var16.getValue(); // L: 129
				Class var10 = var8.getClass(); // L: 131
				class3[] var11 = class3.method43(); // L: 134
				int var12 = 0;

				class3 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 145
						break;
					}

					class3 var13 = var11[var12]; // L: 136
					if (var10 == var13.field13) { // L: 138
						var9 = var13; // L: 139
						break; // L: 140
					}

					++var12; // L: 135
				}

				var27.writeByte(var9.field12); // L: 148
				class3.method57(var8, var27); // L: 149
			}
		} catch (Exception var25) { // L: 155
		} finally {
			try {
				var1.close(); // L: 158
			} catch (Exception var24) { // L: 160
			}

		}

		this.unwrittenChanges = false; // L: 162
		this.field1298 = User.currentTimeMillis(); // L: 163
	} // L: 164

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-236281402"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 167

		label224: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 169

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 170 171 174
					var4 = var1.read(var2, var3, var2.length - var3); // L: 172
					if (var4 == -1) { // L: 173
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 176
				if (var14.array.length - var14.offset < 1) { // L: 177
					return;
				}

				int var15 = var14.readUnsignedByte(); // L: 178
				if (var15 >= 0 && var15 <= 2) { // L: 179
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 180
						var16 = var14.readUnsignedShort(); // L: 181
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label224;
							}

							var8 = var14.readUnsignedShort(); // L: 183
							var9 = var14.readUnsignedByte(); // L: 184
							class3 var10 = (class3)class195.findEnumerated(class3.method43(), var9); // L: 185
							Object var11 = var10.method47(var14); // L: 186
							if (this.intsPersistence[var8]) { // L: 187
								this.map.put(var8, var11); // L: 188
							}

							++var7; // L: 182
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 193

						for (var7 = 0; var7 < var16; ++var7) { // L: 194
							var8 = var14.readUnsignedShort(); // L: 195
							var9 = var14.readInt(); // L: 196
							if (this.intsPersistence[var8]) { // L: 197
								this.map.put(var8, var9); // L: 198
							}
						}

						var7 = var14.readUnsignedShort(); // L: 201
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label224;
							}

							var14.readUnsignedShort(); // L: 203
							var14.readStringCp1252NullTerminated(); // L: 204
							++var8; // L: 202
						}
					}
				}
			} catch (Exception var25) { // L: 208
				break label224;
			} finally {
				try {
					var1.close(); // L: 211
				} catch (Exception var24) {
				}

			}

			return; // L: 213
		}

		this.unwrittenChanges = false; // L: 215
	} // L: 216

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "362118254"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1298 < User.currentTimeMillis() - 60000L) { // L: 219
			this.write(); // L: 220
		}

	} // L: 222

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-398043475"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 225
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)Z",
		garbageValue = "322576420"
	)
	static final boolean method2313(Widget var0) {
		int var1 = var0.contentType; // L: 11330
		if (var1 == 205) { // L: 11331
			Client.logoutTimer = 250; // L: 11332
			return true; // L: 11333
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11335
				var2 = (var1 - 300) / 2; // L: 11336
				var3 = var1 & 1; // L: 11337
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11338
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11340
				var2 = (var1 - 314) / 2; // L: 11341
				var3 = var1 & 1; // L: 11342
				Client.playerAppearance.method4148(var2, var3 == 1); // L: 11343
			}

			if (var1 == 324) { // L: 11345
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 11346
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11347
				PacketBufferNode var4 = class4.getPacketBufferNode(ClientPacket.field2335, Client.packetWriter.isaacCipher); // L: 11349
				Client.playerAppearance.write(var4.packetBuffer); // L: 11350
				Client.packetWriter.addNode(var4); // L: 11351
				return true; // L: 11352
			} else {
				return false; // L: 11354
			}
		}
	}
}
