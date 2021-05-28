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

@ObfuscatedName("dc")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("f")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("y")
	@Export("map")
	Map map;
	@ObfuscatedName("p")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("j")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 8820744470819498935L
	)
	long field1385;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class8.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = WorldMapSectionType.method3591(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (class8.archive2.method4887(15)) { // L: 34
			var2 = class8.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "36"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 42
		if (this.intsPersistence[var1]) { // L: 43
			this.unwrittenChanges = true;
		}

	} // L: 44

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-271438249"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1989718678"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1757644423"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "29886"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-8380"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1787706587"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lnm;",
		garbageValue = "-1288257534"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class82.getPreferencesFile("2", SoundSystem.field461.name, var1); // L: 86
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
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
					} else if (var7 instanceof String) {
						var2 += Tiles.stringCp1252NullTerminatedByteSize((String)var7); // L: 102
					}

					++var3; // L: 103
				}
			}

			Buffer var23 = new Buffer(var2); // L: 107
			var23.writeByte(2); // L: 108
			var23.writeShort(var3); // L: 109
			Iterator var24 = this.map.entrySet().iterator(); // L: 110

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 111
				int var13 = (Integer)var12.getKey(); // L: 113
				if (this.intsPersistence[var13]) { // L: 114
					var23.writeShort(var13); // L: 115
					Object var8 = var12.getValue(); // L: 116
					class374 var9 = class374.method6479(var8.getClass()); // L: 117
					var23.writeByte(var9.field4135); // L: 118
					class374.method6475(var8, var23); // L: 119
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 123
		} catch (Exception var21) { // L: 125
		} finally {
			try {
				var1.close(); // L: 128
			} catch (Exception var20) { // L: 130
			}

		}

		this.unwrittenChanges = false; // L: 132
		this.field1385 = ObjectComposition.currentTimeMillis(); // L: 133
	} // L: 134

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 137

		label212: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 139

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 140 141 144
					var4 = var1.read(var2, var3, var2.length - var3); // L: 142
					if (var4 == -1) { // L: 143
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 146
				if (var14.array.length - var14.offset < 1) { // L: 147
					return;
				}

				int var15 = var14.readUnsignedByte(); // L: 148
				if (var15 >= 0 && var15 <= 2) { // L: 149
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 150
						var16 = var14.readUnsignedShort(); // L: 151
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label212;
							}

							var8 = var14.readUnsignedShort(); // L: 153
							var9 = var14.readUnsignedByte(); // L: 154
							class374 var10 = (class374)Messages.findEnumerated(class374.method6476(), var9); // L: 155
							Object var11 = var10.method6480(var14); // L: 156
							if (this.intsPersistence[var8]) { // L: 157
								this.map.put(var8, var11); // L: 158
							}

							++var7; // L: 152
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 163

						for (var7 = 0; var7 < var16; ++var7) { // L: 164
							var8 = var14.readUnsignedShort(); // L: 165
							var9 = var14.readInt(); // L: 166
							if (this.intsPersistence[var8]) { // L: 167
								this.map.put(var8, var9); // L: 168
							}
						}

						var7 = var14.readUnsignedShort(); // L: 171
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label212;
							}

							var14.readUnsignedShort(); // L: 173
							var14.readStringCp1252NullTerminated(); // L: 174
							++var8; // L: 172
						}
					}
				}
			} catch (Exception var25) { // L: 178
				break label212;
			} finally {
				try {
					var1.close(); // L: 181
				} catch (Exception var24) {
				}

			}

			return; // L: 183
		}

		this.unwrittenChanges = false; // L: 185
	} // L: 186

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1350770877"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1385 < ObjectComposition.currentTimeMillis() - 60000L) { // L: 189
			this.write(); // L: 190
		}

	} // L: 192

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-250797388"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 195
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Leh;",
		garbageValue = "-884874334"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}
}
