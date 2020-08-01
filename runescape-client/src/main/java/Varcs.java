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

@ObfuscatedName("cy")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1058708955
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("q")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("j")
	@Export("map")
	Map map;
	@ObfuscatedName("p")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("g")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7654666675170575125L
	)
	long field1291;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = Clock.archive2.getGroupFileCount(19);
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
					var4.method4573(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (Clock.archive2.method4452(15)) {
			var2 = Clock.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1324015283"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "16"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "105969632"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1642204852"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "14"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "658470799"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-943211657"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lmy;",
		garbageValue = "-297386898"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return GameShell.getPreferencesFile("2", GrandExchangeOfferWorldComparator.field54.name, var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1923811872"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += DynamicObject.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var33 = new Buffer(var2);
			var33.writeByte(2);
			var33.writeShort(var3);
			Iterator var34 = this.map.entrySet().iterator();

			label183:
			while (true) {
				Entry var21;
				int var22;
				do {
					if (!var34.hasNext()) {
						var1.write(var33.array, 0, var33.offset);
						break label183;
					}

					var21 = (Entry)var34.next();
					var22 = (Integer)var21.getKey();
				} while(!this.intsPersistence[var22]);

				var33.writeShort(var22);
				Object var8 = var21.getValue();
				Class var10 = var8.getClass();
				class3[] var11 = new class3[]{class3.field9, class3.field8, class3.field10};
				class3[] var12 = var11;
				int var13 = 0;

				class3 var9;
				class3 var14;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null;
						break;
					}

					var14 = var12[var13];
					if (var10 == var14.field12) {
						var9 = var14;
						break;
					}

					++var13;
				}

				var33.writeByte(var9.field15);
				Class var23 = var8.getClass();
				class3[] var15 = new class3[]{class3.field9, class3.field8, class3.field10};
				class3[] var16 = var15;
				int var17 = 0;

				while (true) {
					if (var17 >= var16.length) {
						var14 = null;
						break;
					}

					class3 var18 = var16[var17];
					if (var23 == var18.field12) {
						var14 = var18;
						break;
					}

					++var17;
				}

				if (var14 == null) {
					throw new IllegalArgumentException();
				}

				class0 var35 = var14.field13;
				var35.vmethod59(var8, var33);
			}
		} catch (Exception var31) {
		} finally {
			try {
				var1.close();
			} catch (Exception var30) {
			}

		}

		this.unwrittenChanges = false;
		this.field1291 = MilliClock.currentTimeMillis();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label230: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var15 = new Buffer(var2);
				if (var15.array.length - var15.offset >= 1) {
					int var16 = var15.readUnsignedByte();
					if (var16 >= 0 && var16 <= 2) {
						int var7;
						int var8;
						int var9;
						int var17;
						if (var16 >= 2) {
							var17 = var15.readUnsignedShort();
							var7 = 0;

							while (true) {
								if (var7 >= var17) {
									break label230;
								}

								var8 = var15.readUnsignedShort();
								var9 = var15.readUnsignedByte();
								class3[] var10 = new class3[]{class3.field9, class3.field8, class3.field10};
								class3 var11 = (class3)FaceNormal.findEnumerated(var10, var9);
								Object var12 = var11.method40(var15);
								if (this.intsPersistence[var8]) {
									this.map.put(var8, var12);
								}

								++var7;
							}
						} else {
							var17 = var15.readUnsignedShort();

							for (var7 = 0; var7 < var17; ++var7) {
								var8 = var15.readUnsignedShort();
								var9 = var15.readInt();
								if (this.intsPersistence[var8]) {
									this.map.put(var8, var9);
								}
							}

							var7 = var15.readUnsignedShort();
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label230;
								}

								var15.readUnsignedShort();
								var15.readStringCp1252NullTerminated();
								++var8;
							}
						}
					}

					return;
				}
			} catch (Exception var26) {
				break label230;
			} finally {
				try {
					var1.close();
				} catch (Exception var25) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "999745813"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1291 < MilliClock.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}
}
