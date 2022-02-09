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
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("hr")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("s")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("e")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("r")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("o")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 7617412601181389901L
	)
	long field1298;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = FriendLoginUpdate.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = HealthBarDefinition.method3244(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (FriendLoginUpdate.archive2.method5530(15)) { // L: 37
			var2 = FriendLoginUpdate.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-263295047"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 46
		}

	} // L: 47

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1030542246"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-147699187"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-80232321"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "28"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1270462568"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-387935350"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 80
			if (!this.intsPersistence[var1]) { // L: 81
				this.map.remove(var1); // L: 82
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 85
			this.strings[var1] = null; // L: 86
		}

	} // L: 88

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Loo;",
		garbageValue = "-1595550053"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return VarbitComposition.getPreferencesFile("2", HorizontalAlignment.field1846.name, var1); // L: 91
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1952727021"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 95

		try {
			int var2 = 3; // L: 97
			int var3 = 0; // L: 98
			Iterator var4 = this.map.entrySet().iterator(); // L: 99

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 100
				int var6 = (Integer)var5.getKey(); // L: 102
				if (this.intsPersistence[var6]) { // L: 103
					Object var7 = var5.getValue(); // L: 104
					var2 += 3; // L: 105
					if (var7 instanceof Integer) { // L: 106
						var2 += 4;
					} else if (var7 instanceof String) { // L: 107
						var2 += GrandExchangeEvents.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 108
				}
			}

			Buffer var23 = new Buffer(var2); // L: 112
			var23.writeByte(2); // L: 113
			var23.writeShort(var3); // L: 114
			Iterator var24 = this.map.entrySet().iterator(); // L: 115

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 116
				int var13 = (Integer)var12.getKey(); // L: 118
				if (this.intsPersistence[var13]) { // L: 119
					var23.writeShort(var13); // L: 120
					Object var8 = var12.getValue(); // L: 121
					class414 var9 = class414.method7269(var8.getClass()); // L: 122
					var23.writeByte(var9.field4491); // L: 123
					class414.method7256(var8, var23); // L: 124
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 128
		} catch (Exception var21) { // L: 130
		} finally {
			try {
				var1.close(); // L: 133
			} catch (Exception var20) { // L: 135
			}

		}

		this.unwrittenChanges = false; // L: 137
		this.field1298 = DirectByteArrayCopier.method5318(); // L: 138
	} // L: 139

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1045416279"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 142

		label224: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 144

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 145 146 149
					var4 = var1.read(var2, var3, var2.length - var3); // L: 147
					if (var4 == -1) { // L: 148
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 151
				if (var14.array.length - var14.offset < 1) {
					return; // L: 152
				}

				int var15 = var14.readUnsignedByte(); // L: 153
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 155
						var16 = var14.readUnsignedShort(); // L: 156
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label224;
							}

							var8 = var14.readUnsignedShort(); // L: 158
							var9 = var14.readUnsignedByte(); // L: 159
							class414 var10 = (class414)class140.findEnumerated(class414.method7264(), var9); // L: 160
							Object var11 = var10.method7259(var14); // L: 161
							if (this.intsPersistence[var8]) { // L: 162
								this.map.put(var8, var11); // L: 163
							}

							++var7; // L: 157
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 168

						for (var7 = 0; var7 < var16; ++var7) { // L: 169
							var8 = var14.readUnsignedShort(); // L: 170
							var9 = var14.readInt(); // L: 171
							if (this.intsPersistence[var8]) { // L: 172
								this.map.put(var8, var9); // L: 173
							}
						}

						var7 = var14.readUnsignedShort(); // L: 176
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label224;
							}

							var14.readUnsignedShort(); // L: 178
							var14.readStringCp1252NullTerminated(); // L: 179
							++var8; // L: 177
						}
					}
				}
			} catch (Exception var25) { // L: 183
				break label224;
			} finally {
				try {
					var1.close(); // L: 186
				} catch (Exception var24) { // L: 188
				}

			}

			return; // L: 154
		}

		this.unwrittenChanges = false; // L: 190
	} // L: 191

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16777215"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1298 < DirectByteArrayCopier.method5318() - 60000L) { // L: 194
			this.write(); // L: 195
		}

	} // L: 197

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 200
	}
}
