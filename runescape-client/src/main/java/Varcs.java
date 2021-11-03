import java.io.EOFException;
import java.io.File;
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

@ObfuscatedName("ch")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -908008497
	)
	static int field1263;
	@ObfuscatedName("s")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("a")
	@Export("map")
	Map map;
	@ObfuscatedName("o")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("g")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 7843770770834716127L
	)
	long field1261;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = class1.archive2.getGroupFileCount(19); // L: 26
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
					var4.method3026(new Buffer(var5)); // L: 39
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 40
				var3 = var4; // L: 41
			}

			this.intsPersistence[var2] = var3.persist; // L: 44
		}

		var2 = 0; // L: 46
		if (class1.archive2.method5270(15)) { // L: 47
			var2 = class1.archive2.getGroupFileCount(15); // L: 48
		}

		this.strings = new String[var2]; // L: 50
		this.read(); // L: 51
	} // L: 52

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "118"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 55
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 56
		}

	} // L: 57

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1775073178"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 60
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 61 62 64
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1662383192"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 68
	} // L: 69

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 72
		return var2 instanceof String ? (String)var2 : ""; // L: 73 74 76
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "114"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 80
	} // L: 81

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2025393561"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 84
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lnv;",
		garbageValue = "679727155"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return DevicePcmPlayerProvider.getPreferencesFile("2", RouteStrategy.field1986.name, var1); // L: 99
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-847294066"
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
						var2 += Client.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 116
				}
			}

			Buffer var26 = new Buffer(var2); // L: 120
			var26.writeByte(2); // L: 121
			var26.writeShort(var3); // L: 122
			Iterator var27 = this.map.entrySet().iterator(); // L: 123

			while (var27.hasNext()) {
				Entry var15 = (Entry)var27.next(); // L: 124
				int var16 = (Integer)var15.getKey(); // L: 126
				if (this.intsPersistence[var16]) { // L: 127
					var26.writeShort(var16); // L: 128
					Object var8 = var15.getValue(); // L: 129
					class392 var9 = class392.method6856(var8.getClass()); // L: 130
					var26.writeByte(var9.field4273); // L: 131
					Class var11 = var8.getClass(); // L: 134
					class392 var12 = class392.method6856(var11); // L: 136
					if (var12 == null) { // L: 137
						throw new IllegalArgumentException();
					}

					class388 var10 = var12.field4275; // L: 138
					var10.vmethod6878(var8, var26); // L: 141
				}
			}

			var1.write(var26.array, 0, var26.offset); // L: 146
		} catch (Exception var24) { // L: 148
		} finally {
			try {
				var1.close(); // L: 151
			} catch (Exception var23) { // L: 153
			}

		}

		this.unwrittenChanges = false; // L: 155
		this.field1261 = class111.method2516(); // L: 156
	} // L: 157

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1233938263"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 160

		label212: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 162

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 163 164 167
					var4 = var1.read(var2, var3, var2.length - var3); // L: 165
					if (var4 == -1) { // L: 166
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 169
				if (var14.array.length - var14.offset >= 1) { // L: 170
					int var15 = var14.readUnsignedByte(); // L: 171
					if (var15 < 0 || var15 > 2) { // L: 172
						return;
					}

					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 173
						var16 = var14.readUnsignedShort(); // L: 174
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label212;
							}

							var8 = var14.readUnsignedShort(); // L: 176
							var9 = var14.readUnsignedByte(); // L: 177
							class392 var10 = (class392)UserComparator4.findEnumerated(class392.method6855(), var9); // L: 178
							Object var11 = var10.method6858(var14); // L: 179
							if (this.intsPersistence[var8]) { // L: 180
								this.map.put(var8, var11); // L: 181
							}

							++var7; // L: 175
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 186

						for (var7 = 0; var7 < var16; ++var7) { // L: 187
							var8 = var14.readUnsignedShort(); // L: 188
							var9 = var14.readInt(); // L: 189
							if (this.intsPersistence[var8]) { // L: 190
								this.map.put(var8, var9); // L: 191
							}
						}

						var7 = var14.readUnsignedShort(); // L: 194
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label212;
							}

							var14.readUnsignedShort(); // L: 196
							var14.readStringCp1252NullTerminated(); // L: 197
							++var8; // L: 195
						}
					}
				}
			} catch (Exception var25) { // L: 201
				break label212;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-153672255"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1261 < class111.method2516() - 60000L) { // L: 212
			this.write();
		}

	} // L: 215

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "675810598"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 218
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "16"
	)
	static boolean method2359(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 204
			int var3 = var2.read(); // L: 205
			var2.seek(0L); // L: 206
			var2.write(var3); // L: 207
			var2.seek(0L); // L: 208
			var2.close(); // L: 209
			if (var1) { // L: 210
				var0.delete();
			}

			return true; // L: 211
		} catch (Exception var4) { // L: 213
			return false; // L: 214
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(Ljf;B)Z",
		garbageValue = "-63"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11900
	}
}
