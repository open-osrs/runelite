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

@ObfuscatedName("dp")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("o")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("g")
	@Export("map")
	Map map;
	@ObfuscatedName("l")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("z")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -3093933850404302195L
	)
	long field1364;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = KitDefinition.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = class13.method210(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (KitDefinition.archive2.method4842(15)) { // L: 34
			var2 = KitDefinition.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1963266648"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	} // L: 44

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1125709356"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-725128375"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-484415575"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "950"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2112696076"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-362954670"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lng;",
		garbageValue = "0"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return Buddy.getPreferencesFile("2", NetSocket.field1492.name, var1); // L: 86
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "293338844"
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
						var2 += class4.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 103
				}
			}

			Buffer var28 = new Buffer(var2); // L: 107
			var28.writeByte(2); // L: 108
			var28.writeShort(var3); // L: 109
			Iterator var29 = this.map.entrySet().iterator(); // L: 110

			label146:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset); // L: 143
						break label146;
					}

					var16 = (Entry)var29.next(); // L: 111
					var17 = (Integer)var16.getKey(); // L: 113
				} while(!this.intsPersistence[var17]); // L: 114

				var28.writeShort(var17); // L: 115
				Object var8 = var16.getValue(); // L: 116
				Class var10 = var8.getClass(); // L: 118
				class374[] var11 = class374.method6356(); // L: 121
				int var12 = 0;

				class374 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 132
						break;
					}

					class374 var13 = var11[var12]; // L: 123
					if (var10 == var13.field4134) { // L: 125
						var9 = var13; // L: 126
						break; // L: 127
					}

					++var12; // L: 122
				}

				var28.writeByte(var9.field4138); // L: 135
				class370 var18 = class374.method6350(var8.getClass()); // L: 137
				var18.vmethod6366(var8, var28); // L: 138
			}
		} catch (Exception var26) { // L: 145
		} finally {
			try {
				var1.close(); // L: 148
			} catch (Exception var25) { // L: 150
			}

		}

		this.unwrittenChanges = false; // L: 152
		this.field1364 = Archive.currentTimeMillis(); // L: 153
	} // L: 154

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 157

		try {
			byte[] var2 = new byte[(int)var1.length()]; // L: 159

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 160 161 164
				var4 = var1.read(var2, var3, var2.length - var3); // L: 162
				if (var4 == -1) { // L: 163
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2); // L: 166
			if (var14.array.length - var14.offset < 1) { // L: 167
				return;
			}

			int var15 = var14.readUnsignedByte(); // L: 168
			if (var15 < 0 || var15 > 2) { // L: 169
				return; // L: 203
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) { // L: 170
				var16 = var14.readUnsignedShort(); // L: 171

				for (var7 = 0; var7 < var16; ++var7) { // L: 172
					var8 = var14.readUnsignedShort(); // L: 173
					var9 = var14.readUnsignedByte(); // L: 174
					class374 var10 = (class374)UserComparator4.findEnumerated(class374.method6356(), var9); // L: 175
					Object var11 = var10.method6351(var14); // L: 176
					if (this.intsPersistence[var8]) { // L: 177
						this.map.put(var8, var11); // L: 178
					}
				}
			} else {
				var16 = var14.readUnsignedShort(); // L: 183

				for (var7 = 0; var7 < var16; ++var7) { // L: 184
					var8 = var14.readUnsignedShort(); // L: 185
					var9 = var14.readInt(); // L: 186
					if (this.intsPersistence[var8]) { // L: 187
						this.map.put(var8, var9); // L: 188
					}
				}

				var7 = var14.readUnsignedShort(); // L: 191

				for (var8 = 0; var8 < var7; ++var8) { // L: 192
					var14.readUnsignedShort(); // L: 193
					var14.readStringCp1252NullTerminated(); // L: 194
				}
			}
		} catch (Exception var25) { // L: 198
		} finally {
			try {
				var1.close(); // L: 201
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false; // L: 205
	} // L: 206

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1105689647"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1364 < Archive.currentTimeMillis() - 60000L) { // L: 209
			this.write(); // L: 210
		}

	} // L: 212

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 215
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmo;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "77620903"
	)
	static String method2326(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 40
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 41
			return var3 == null ? var2 : (String)var3.obj; // L: 42 43
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-45"
	)
	public static boolean method2329(int var0) {
		return (var0 >> 30 & 1) != 0; // L: 25
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-380939793"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[ParamComposition.Client_plane][var0][var1]; // L: 7532
		if (var2 == null) { // L: 7533
			class5.scene.removeGroundItemPile(ParamComposition.Client_plane, var0, var1); // L: 7534
		} else {
			long var3 = -99999999L; // L: 7537
			TileItem var5 = null; // L: 7538

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7539 7540 7548
				ItemComposition var7 = Strings.ItemDefinition_get(var6.id); // L: 7541
				long var11 = (long)var7.price; // L: 7542
				if (var7.isStackable == 1) { // L: 7543
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7544
					var3 = var11; // L: 7545
					var5 = var6; // L: 7546
				}
			}

			if (var5 == null) { // L: 7550
				class5.scene.removeGroundItemPile(ParamComposition.Client_plane, var0, var1); // L: 7551
			} else {
				var2.addLast(var5); // L: 7554
				TileItem var13 = null; // L: 7555
				TileItem var8 = null; // L: 7556

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7557 7558 7563
					if (var5.id != var6.id) { // L: 7559
						if (var13 == null) { // L: 7560
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7561
							var8 = var6;
						}
					}
				}

				long var9 = class17.calculateTag(var0, var1, 3, false, 0); // L: 7565
				class5.scene.newGroundItemPile(ParamComposition.Client_plane, var0, var1, SceneTilePaint.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, ParamComposition.Client_plane), var5, var9, var13, var8); // L: 7566
			}
		}
	} // L: 7535 7552 7567
}
