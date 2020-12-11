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

@ObfuscatedName("cg")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 329492753
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("c")
	static int[] field1283;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -69113617
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("x")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("w")
	@Export("map")
	Map map;
	@ObfuscatedName("t")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("j")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 442917365631683491L
	)
	long field1276;

	Varcs() {
		this.unwrittenChanges = false; // L: 22
		int var1 = DynamicObject.archive2.getGroupFileCount(19); // L: 26
		this.map = new HashMap(); // L: 27
		this.intsPersistence = new boolean[var1]; // L: 28

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 29
			VarcInt var3 = TextureProvider.method2843(var2); // L: 30
			this.intsPersistence[var2] = var3.persist; // L: 31
		}

		var2 = 0; // L: 33
		if (DynamicObject.archive2.method4305(15)) { // L: 34
			var2 = DynamicObject.archive2.getGroupFileCount(15); // L: 35
		}

		this.strings = new String[var2]; // L: 37
		this.read(); // L: 38
	} // L: 39

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-298220081"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 42
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 43
		}

	} // L: 44

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2112992813"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 47
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 48 49 51
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-387665729"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 55
	} // L: 56

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-99"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 59
		return var2 instanceof String ? (String)var2 : ""; // L: 60 61 63
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 67
	} // L: 68

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "343264324"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 71
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1770667153"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lmy;",
		garbageValue = "-102"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return WorldMapRegion.getPreferencesFile("2", AttackOption.field1174.name, var1); // L: 86
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929534435"
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
						var2 += FloorDecoration.stringCp1252NullTerminatedByteSize((String)var7);
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
				Entry var17;
				int var18;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset); // L: 144
						break label146;
					}

					var17 = (Entry)var29.next(); // L: 111
					var18 = (Integer)var17.getKey(); // L: 113
				} while(!this.intsPersistence[var18]); // L: 114

				var28.writeShort(var18); // L: 115
				Object var8 = var17.getValue(); // L: 116
				Class var10 = var8.getClass(); // L: 118
				class3[] var11 = new class3[]{class3.field13, class3.field12, class3.field8}; // L: 123
				class3[] var12 = var11; // L: 125
				int var13 = 0;

				class3 var9;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null; // L: 136
						break;
					}

					class3 var14 = var12[var13]; // L: 127
					if (var10 == var14.field6) { // L: 129
						var9 = var14; // L: 130
						break; // L: 131
					}

					++var13; // L: 126
				}

				var28.writeByte(var9.field10); // L: 139
				class3.method25(var8, var28); // L: 140
			}
		} catch (Exception var26) { // L: 146
		} finally {
			try {
				var1.close(); // L: 149
			} catch (Exception var25) { // L: 151
			}

		}

		this.unwrittenChanges = false; // L: 153
		this.field1276 = class298.currentTimeMillis(); // L: 154
	} // L: 155

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 158

		label222: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 160

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 161 162 165
					var4 = var1.read(var2, var3, var2.length - var3); // L: 163
					if (var4 == -1) { // L: 164
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2); // L: 167
				if (var15.array.length - var15.offset < 1) { // L: 168
					return;
				}

				int var16 = var15.readUnsignedByte(); // L: 169
				if (var16 >= 0 && var16 <= 2) { // L: 170
					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) { // L: 171
						var17 = var15.readUnsignedShort(); // L: 172
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label222;
							}

							var8 = var15.readUnsignedShort(); // L: 174
							var9 = var15.readUnsignedByte(); // L: 175
							class3[] var10 = new class3[]{class3.field13, class3.field12, class3.field8}; // L: 178
							class3 var11 = (class3)UrlRequester.findEnumerated(var10, var9); // L: 180
							Object var12 = var11.method28(var15); // L: 181
							if (this.intsPersistence[var8]) { // L: 182
								this.map.put(var8, var12); // L: 183
							}

							++var7; // L: 173
						}
					} else {
						var17 = var15.readUnsignedShort(); // L: 188

						for (var7 = 0; var7 < var17; ++var7) { // L: 189
							var8 = var15.readUnsignedShort(); // L: 190
							var9 = var15.readInt(); // L: 191
							if (this.intsPersistence[var8]) { // L: 192
								this.map.put(var8, var9); // L: 193
							}
						}

						var7 = var15.readUnsignedShort(); // L: 196
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label222;
							}

							var15.readUnsignedShort(); // L: 198
							var15.readStringCp1252NullTerminated(); // L: 199
							++var8; // L: 197
						}
					}
				}
			} catch (Exception var26) { // L: 203
				break label222;
			} finally {
				try {
					var1.close(); // L: 206
				} catch (Exception var25) { // L: 208
				}

			}

			return;
		}

		this.unwrittenChanges = false; // L: 210
	} // L: 211

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201076072"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1276 < class298.currentTimeMillis() - 60000L) { // L: 214
			this.write(); // L: 215
		}

	} // L: 217

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1775213978"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 220
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "1243916403"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIII)V",
		garbageValue = "842543427"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 10957
		if (var4 != null) { // L: 10958
			if (Client.minimapState < 3) { // L: 10959
				UrlRequester.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 10960
			}

		}
	} // L: 10961

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1893534902"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11029
			PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 11031
			var1.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0)); // L: 11032
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11033
			Client.packetWriter.addNode(var1); // L: 11034
		}
	} // L: 11035
}
