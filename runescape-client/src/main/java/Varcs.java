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

@ObfuscatedName("cj")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("hc")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1381253271
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("i")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("f")
	@Export("map")
	Map map;
	@ObfuscatedName("b")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("n")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 9211291169100794773L
	)
	long field1296;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = class10.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = TriBool.method6839(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (class10.archive2.method5824(15)) { // L: 34
			var2 = class10.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1258010190"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 42
		if (this.intsPersistence[var1]) { // L: 43
			this.unwrittenChanges = true;
		}

	} // L: 44

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-20847"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1112436939"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1225749706"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-974893641"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "852602780"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lph;",
		garbageValue = "291389659"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return ModeWhere.getPreferencesFile("2", Messages.field1305.name, var1); // L: 86
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-729376145"
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
						var2 += class425.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 103
				}
			}

			Buffer var27 = new Buffer(var2); // L: 107
			var27.writeByte(2); // L: 108
			var27.writeShort(var3); // L: 109
			Iterator var28 = this.map.entrySet().iterator(); // L: 110

			label147:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 140
						break label147;
					}

					var16 = (Entry)var28.next(); // L: 111
					var17 = (Integer)var16.getKey(); // L: 113
				} while(!this.intsPersistence[var17]); // L: 114

				var27.writeShort(var17); // L: 115
				Object var8 = var16.getValue(); // L: 116
				Class var10 = var8.getClass(); // L: 118
				class431[] var11 = class431.method7584(); // L: 121
				int var12 = 0;

				class431 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 132
						break;
					}

					class431 var13 = var11[var12]; // L: 123
					if (var10 == var13.field4593) { // L: 125
						var9 = var13; // L: 126
						break; // L: 127
					}

					++var12; // L: 122
				}

				var27.writeByte(var9.field4596); // L: 135
				class431.method7579(var8, var27); // L: 136
			}
		} catch (Exception var25) { // L: 142
		} finally {
			try {
				var1.close(); // L: 145
			} catch (Exception var24) { // L: 147
			}

		}

		this.unwrittenChanges = false; // L: 149
		this.field1296 = class136.method2931(); // L: 150
	} // L: 151

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1780086074"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 154

		label226: {
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
				if (var14.array.length - var14.offset >= 1) { // L: 164
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
									break label226;
								}

								var8 = var14.readUnsignedShort(); // L: 170
								var9 = var14.readUnsignedByte(); // L: 171
								class431 var10 = (class431)MusicPatchPcmStream.findEnumerated(class431.method7584(), var9); // L: 172
								Object var11 = var10.method7581(var14); // L: 173
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
									break label226;
								}

								var14.readUnsignedShort(); // L: 190
								var14.readStringCp1252NullTerminated(); // L: 191
								++var8; // L: 189
							}
						}
					}

					return; // L: 200
				}
			} catch (Exception var25) { // L: 195
				break label226;
			} finally {
				try {
					var1.close(); // L: 198
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false; // L: 202
	} // L: 203

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2021693946"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1296 < class136.method2931() - 60000L) { // L: 206
			this.write(); // L: 207
		}

	} // L: 209

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-23"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 212
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953067165"
	)
	static void method2463() {
		int var0 = Players.Players_count; // L: 4773
		int[] var1 = Players.Players_indices; // L: 4774

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4775
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4776
				ArchiveLoader.addPlayerToScene(Client.players[var1[var2]], true); // L: 4777
			}
		}

	} // L: 4779

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	static boolean method2441() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4853
	}
}
