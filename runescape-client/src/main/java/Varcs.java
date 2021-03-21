import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("d")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("c")
	@Export("map")
	Map map;
	@ObfuscatedName("y")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("h")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 3247217840907840609L
	)
	long field1282;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = WorldMapIcon_0.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4; // L: 34
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 37
				var4 = new VarcInt(); // L: 38
				if (var5 != null) {
					var4.method4594(new Buffer(var5)); // L: 39
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 40
				var3 = var4; // L: 41
			}

			this.intsPersistence[var2] = var3.persist; // L: 44
		}

		var2 = 0; // L: 46
		if (WorldMapIcon_0.archive2.method4471(15)) { // L: 47
			var2 = WorldMapIcon_0.archive2.getGroupFileCount(15); // L: 48
		}

		this.strings = new String[var2]; // L: 50
		this.read(); // L: 51
	} // L: 52

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1194686711"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 55
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 56
		}

	} // L: 57

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "16777215"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 60
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 61 62 64
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2044340742"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 68
	} // L: 69

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1459564767"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 72
		return var2 instanceof String ? (String)var2 : ""; // L: 73 74 76
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "81320649"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 80
	} // L: 81

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-82"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 84
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1732763236"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lmc;",
		garbageValue = "1003516163"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return WorldMapRectangle.getPreferencesFile("2", FontName.field3699.name, var1); // L: 99
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2064490955"
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
					} else if (var7 instanceof String) { // L: 115
						var2 += WorldMapLabelSize.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 116
				}
			}

			Buffer var28 = new Buffer(var2); // L: 120
			var28.writeByte(2); // L: 121
			var28.writeShort(var3); // L: 122
			Iterator var29 = this.map.entrySet().iterator(); // L: 123

			label146:
			while (true) {
				Entry var17;
				int var18;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset); // L: 157
						break label146;
					}

					var17 = (Entry)var29.next(); // L: 124
					var18 = (Integer)var17.getKey();
				} while(!this.intsPersistence[var18]);

				var28.writeShort(var18);
				Object var8 = var17.getValue();
				Class var10 = var8.getClass(); // L: 131
				class3[] var11 = new class3[]{class3.field18, class3.field26, class3.field17}; // L: 136
				class3[] var12 = var11; // L: 138
				int var13 = 0;

				class3 var9;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null; // L: 149
						break;
					}

					class3 var14 = var12[var13]; // L: 140
					if (var10 == var14.field21) { // L: 142
						var9 = var14; // L: 143
						break; // L: 144
					}

					++var13; // L: 139
				}

				var28.writeByte(var9.field22); // L: 152
				class3.method30(var8, var28); // L: 153
			}
		} catch (Exception var26) { // L: 159
		} finally {
			try {
				var1.close(); // L: 162
			} catch (Exception var25) { // L: 164
			}

		}

		this.unwrittenChanges = false; // L: 166
		this.field1282 = Tiles.currentTimeMillis(); // L: 167
	} // L: 168

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1389856130"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 171

		try {
			byte[] var2 = new byte[(int)var1.length()]; // L: 173

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 174 175 178
				var4 = var1.read(var2, var3, var2.length - var3); // L: 176
				if (var4 == -1) { // L: 177
					throw new EOFException();
				}
			}

			Buffer var15 = new Buffer(var2); // L: 180
			if (var15.array.length - var15.offset < 1) { // L: 181
				return;
			}

			int var16 = var15.readUnsignedByte(); // L: 182
			if (var16 < 0 || var16 > 2) { // L: 183
				return; // L: 221
			}

			int var7;
			int var8;
			int var9;
			int var17;
			if (var16 >= 2) { // L: 184
				var17 = var15.readUnsignedShort(); // L: 185

				for (var7 = 0; var7 < var17; ++var7) { // L: 186
					var8 = var15.readUnsignedShort(); // L: 187
					var9 = var15.readUnsignedByte(); // L: 188
					class3[] var10 = new class3[]{class3.field18, class3.field26, class3.field17}; // L: 191
					class3 var11 = (class3)InterfaceParent.findEnumerated(var10, var9); // L: 193
					Object var12 = var11.method32(var15); // L: 194
					if (this.intsPersistence[var8]) { // L: 195
						this.map.put(var8, var12); // L: 196
					}
				}
			} else {
				var17 = var15.readUnsignedShort(); // L: 201

				for (var7 = 0; var7 < var17; ++var7) { // L: 202
					var8 = var15.readUnsignedShort(); // L: 203
					var9 = var15.readInt(); // L: 204
					if (this.intsPersistence[var8]) { // L: 205
						this.map.put(var8, var9); // L: 206
					}
				}

				var7 = var15.readUnsignedShort(); // L: 209

				for (var8 = 0; var8 < var7; ++var8) { // L: 210
					var15.readUnsignedShort(); // L: 211
					var15.readStringCp1252NullTerminated(); // L: 212
				}
			}
		} catch (Exception var26) { // L: 216
		} finally {
			try {
				var1.close(); // L: 219
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false; // L: 223
	} // L: 224

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2098120459"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1282 < Tiles.currentTimeMillis() - 60000L) { // L: 227
			this.write(); // L: 228
		}

	} // L: 230

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2106101646"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 233
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcl;",
		garbageValue = "18"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = WorldMapSection0.archive12.takeFile(var0, 0); // L: 27
			if (var2 == null) { // L: 28
				return null; // L: 29
			} else {
				var1 = GameObject.newScript(var2); // L: 31
				Script.Script_cached.put(var1, (long)var0); // L: 32
				return var1; // L: 33
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-73"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 125
			if (KeyHandler.field424 == KeyHandler.field418) { // L: 126
				return false;
			} else {
				ModeWhere.field2417 = KeyHandler.field428[KeyHandler.field418]; // L: 127
				WorldMapID.field299 = KeyHandler.field422[KeyHandler.field418]; // L: 128
				KeyHandler.field418 = KeyHandler.field418 + 1 & 127; // L: 129
				return true; // L: 130
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("findOrCreateRandomDatFile")
	static void findOrCreateRandomDatFile() {
		try {
			File var0 = new File(JagexCache.userHomeDirectory, "random.dat"); // L: 250
			int var2;
			if (var0.exists()) { // L: 251
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 252
			} else {
				label39:
				for (int var1 = 0; var1 < Timer.cacheSubPaths.length; ++var1) { // L: 255
					for (var2 = 0; var2 < MinimapRenderer.cacheParentPaths.length; ++var2) { // L: 256
						File var3 = new File(MinimapRenderer.cacheParentPaths[var2] + Timer.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 257
						if (var3.exists()) { // L: 258
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 259
							break label39; // L: 260
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 265
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 266
				var2 = var4.read(); // L: 267
				var4.seek(0L); // L: 268
				var4.write(var2); // L: 269
				var4.seek(0L); // L: 270
				var4.close(); // L: 271
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 272
			}
		} catch (IOException var5) { // L: 275
		}

	} // L: 276
}