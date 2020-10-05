import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class Varcs {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	static Sprite[] headIconHintSprites;
	@ObfuscatedName("s")
	boolean[] intsPersistence;
	@ObfuscatedName("t")
	Map map;
	@ObfuscatedName("i")
	String[] strings;
	@ObfuscatedName("o")
	boolean unwrittenChanges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 9168454196616585073L
	)
	long field1295;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = NetFileRequest.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = Script.method2324(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (NetFileRequest.archive2.method4350(15)) { // L: 34
			var2 = NetFileRequest.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-500127476"
	)
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 42
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 43
		}

	} // L: 44

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-31"
	)
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1549127087"
	)
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "95"
	)
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1427019178"
	)
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "106"
	)
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-69"
	)
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lmy;",
		garbageValue = "-850108574"
	)
	AccessFile getPreferencesFile(boolean var1) {
		return class2.getPreferencesFile("2", Tiles.field532.name, var1); // L: 86
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
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
					} else if (var7 instanceof String) {
						var2 += Decimator.stringCp1252NullTerminatedByteSize((String)var7); // L: 102
					}

					++var3; // L: 103
				}
			}

			Buffer var27 = new Buffer(var2); // L: 107
			var27.writeByte(2); // L: 108
			var27.writeShort(var3); // L: 109
			Iterator var28 = this.map.entrySet().iterator(); // L: 110

			label148:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 140
						break label148;
					}

					var16 = (Entry)var28.next(); // L: 111
					var17 = (Integer)var16.getKey(); // L: 113
				} while(!this.intsPersistence[var17]); // L: 114

				var27.writeShort(var17); // L: 115
				Object var8 = var16.getValue(); // L: 116
				Class var10 = var8.getClass(); // L: 118
				class3[] var11 = class3.method47(); // L: 121
				int var12 = 0;

				class3 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 132
						break;
					}

					class3 var13 = var11[var12]; // L: 123
					if (var10 == var13.field17) { // L: 125
						var9 = var13; // L: 126
						break; // L: 127
					}

					++var12; // L: 122
				}

				var27.writeByte(var9.field16); // L: 135
				class3.method43(var8, var27); // L: 136
			}
		} catch (Exception var25) { // L: 142
		} finally {
			try {
				var1.close(); // L: 145
			} catch (Exception var24) { // L: 147
			}

		}

		this.unwrittenChanges = false; // L: 149
		this.field1295 = PacketWriter.currentTimeMillis(); // L: 150
	} // L: 151

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 154

		label223: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 156

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 157 158 161
					var4 = var1.read(var2, var3, var2.length - var3); // L: 159
					if (var4 == -1) { // L: 160
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 163
				if (var14.array.length - var14.offset < 1) { // L: 164
					return;
				}

				int var15 = var14.readUnsignedByte(); // L: 165
				if (var15 >= 0 && var15 <= 2) { // L: 166
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 167
						var16 = var14.readUnsignedShort(); // L: 168
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label223;
							}

							var8 = var14.readUnsignedShort(); // L: 170
							var9 = var14.readUnsignedByte(); // L: 171
							class3 var10 = (class3)TextureProvider.findEnumerated(class3.method47(), var9); // L: 172
							Object var11 = var10.method46(var14); // L: 173
							if (this.intsPersistence[var8]) { // L: 174
								this.map.put(var8, var11); // L: 175
							}

							++var7; // L: 169
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 180

						for (var7 = 0; var7 < var16; ++var7) { // L: 181
							var8 = var14.readUnsignedShort(); // L: 182
							var9 = var14.readInt(); // L: 183
							if (this.intsPersistence[var8]) { // L: 184
								this.map.put(var8, var9); // L: 185
							}
						}

						var7 = var14.readUnsignedShort(); // L: 188
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label223;
							}

							var14.readUnsignedShort(); // L: 190
							var14.readStringCp1252NullTerminated(); // L: 191
							++var8; // L: 189
						}
					}
				}
			} catch (Exception var25) { // L: 195
				break label223;
			} finally {
				try {
					var1.close(); // L: 198
				} catch (Exception var24) {
				}

			}

			return; // L: 200
		}

		this.unwrittenChanges = false; // L: 202
	} // L: 203

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	void tryWrite() {
		if (this.unwrittenChanges && this.field1295 < PacketWriter.currentTimeMillis() - 60000L) { // L: 206
			this.write(); // L: 207
		}

	} // L: 209

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1436880111"
	)
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 212
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V",
		garbageValue = "-1997146185"
	)
	public static void method2257(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 19
	} // L: 20
}
