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
@ObfuscatedName("cu")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 731803613
	)
	static int field1329;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("l")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("k")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("a")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("m")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -8040896661134893849L
	)
	long field1324;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class356.archive2.getGroupFileCount(19); // L: 29
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
					var4.method3315(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class356.archive2.method5634(15)) { // L: 50
			var2 = class356.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-43"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1629880183"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-89263666"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1860266342"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "409167370"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2082376569"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "181729030"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpu;",
		garbageValue = "-1693869936"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return UserComparator3.getPreferencesFile("2", ApproximateRouteStrategy.field473.name, var1); // L: 104
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += class392.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var28 = new Buffer(var2); // L: 125
			var28.writeByte(2); // L: 126
			var28.writeShort(var3); // L: 127
			Iterator var29 = this.map.entrySet().iterator(); // L: 128

			label145:
			while (true) {
				Entry var17;
				int var18;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset); // L: 162
						break label145;
					}

					var17 = (Entry)var29.next(); // L: 129
					var18 = (Integer)var17.getKey(); // L: 131
				} while(!this.intsPersistence[var18]); // L: 132

				var28.writeShort(var18); // L: 133
				Object var8 = var17.getValue(); // L: 134
				Class var10 = var8.getClass(); // L: 136
				class433[] var11 = new class433[]{class433.field4655, class433.field4656, class433.field4664}; // L: 141
				class433[] var12 = var11; // L: 143
				int var13 = 0;

				class433 var9;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null; // L: 154
						break;
					}

					class433 var14 = var12[var13]; // L: 145
					if (var10 == var14.field4667) { // L: 147
						var9 = var14; // L: 148
						break; // L: 149
					}

					++var13; // L: 144
				}

				var28.writeByte(var9.field4658); // L: 157
				class433.method7420(var8, var28); // L: 158
			}
		} catch (Exception var26) { // L: 164
		} finally {
			try {
				var1.close(); // L: 167
			} catch (Exception var25) { // L: 169
			}

		}

		this.unwrittenChanges = false; // L: 171
		this.field1324 = class113.method2624(); // L: 172
	} // L: 173

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16764"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 176

		label214: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 178

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 179 180 183
					var4 = var1.read(var2, var3, var2.length - var3); // L: 181
					if (var4 == -1) { // L: 182
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2); // L: 185
				if (var15.array.length - var15.offset >= 1) {
					int var16 = var15.readUnsignedByte(); // L: 187
					if (var16 < 0 || var16 > 2) {
						return; // L: 188
					}

					int var7;
					int var8;
					int var9;
					int var17;
					if (var16 >= 2) { // L: 189
						var17 = var15.readUnsignedShort(); // L: 190
						var7 = 0;

						while (true) {
							if (var7 >= var17) {
								break label214;
							}

							var8 = var15.readUnsignedShort(); // L: 192
							var9 = var15.readUnsignedByte(); // L: 193
							class433[] var10 = new class433[]{class433.field4655, class433.field4656, class433.field4664}; // L: 196
							class433 var11 = (class433)class291.findEnumerated(var10, var9); // L: 198
							Object var12 = var11.method7423(var15); // L: 199
							if (this.intsPersistence[var8]) { // L: 200
								this.map.put(var8, var12); // L: 201
							}

							++var7; // L: 191
						}
					} else {
						var17 = var15.readUnsignedShort(); // L: 206

						for (var7 = 0; var7 < var17; ++var7) { // L: 207
							var8 = var15.readUnsignedShort(); // L: 208
							var9 = var15.readInt(); // L: 209
							if (this.intsPersistence[var8]) { // L: 210
								this.map.put(var8, var9); // L: 211
							}
						}

						var7 = var15.readUnsignedShort(); // L: 214
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label214;
							}

							var15.readUnsignedShort(); // L: 216
							var15.readStringCp1252NullTerminated(); // L: 217
							++var8; // L: 215
						}
					}
				}
			} catch (Exception var26) { // L: 221
				break label214;
			} finally {
				try {
					var1.close(); // L: 224
				} catch (Exception var25) { // L: 226
				}

			}

			return; // L: 186
		}

		this.unwrittenChanges = false; // L: 228
	} // L: 229

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-590305740"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1324 < class113.method2624() - 60000L) { // L: 232
			this.write(); // L: 233
		}

	} // L: 235

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2147209332"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 238
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-405806506"
	)
	static void method2466() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class122.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class122.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		SecureRandomCallable.logOut(); // L: 3027
		switch(var0) { // L: 3028
		case 1:
			class126.method2799(24); // L: 3040
			class345.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3041
			break;
		case 2:
			class126.method2799(24); // L: 3032
			class345.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 3033
		}

	} // L: 3046
}
