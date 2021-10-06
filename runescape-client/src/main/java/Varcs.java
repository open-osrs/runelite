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

@ObfuscatedName("cf")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1235978781
	)
	static int field1272;
	@ObfuscatedName("fo")
	static String field1264;
	@ObfuscatedName("f")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("j")
	@Export("map")
	Map map;
	@ObfuscatedName("m")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("k")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 8254502909318544887L
	)
	long field1268;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = RouteStrategy.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = ClanChannel.method2747(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (RouteStrategy.archive2.method5180(15)) {
			var2 = RouteStrategy.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1268577977"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-802312399"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-376908276"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2025584250"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "30677597"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-959424715"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1851906342"
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lnj;",
		garbageValue = "3487029"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return World.getPreferencesFile("2", class392.field4267.name, var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1764400814"
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
						var2 += class113.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var28 = new Buffer(var2);
			var28.writeByte(2);
			var28.writeShort(var3);
			Iterator var29 = this.map.entrySet().iterator();

			label147:
			while (true) {
				Entry var17;
				int var18;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset);
						break label147;
					}

					var17 = (Entry)var29.next();
					var18 = (Integer)var17.getKey();
				} while(!this.intsPersistence[var18]);

				var28.writeShort(var18);
				Object var8 = var17.getValue();
				Class var10 = var8.getClass();
				class392[] var11 = new class392[]{class392.field4266, class392.field4264, class392.field4273};
				class392[] var12 = var11;
				int var13 = 0;

				class392 var9;
				while (true) {
					if (var13 >= var12.length) {
						var9 = null;
						break;
					}

					class392 var14 = var12[var13];
					if (var10 == var14.field4265) {
						var9 = var14;
						break;
					}

					++var13;
				}

				var28.writeByte(var9.field4260);
				class392.method6797(var8, var28);
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
		this.field1268 = UserComparator4.method2406();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

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
			if (var15.array.length - var15.offset < 1) {
				return;
			}

			int var16 = var15.readUnsignedByte();
			if (var16 < 0 || var16 > 2) {
				return;
			}

			int var7;
			int var8;
			int var9;
			int var17;
			if (var16 >= 2) {
				var17 = var15.readUnsignedShort();

				for (var7 = 0; var7 < var17; ++var7) {
					var8 = var15.readUnsignedShort();
					var9 = var15.readUnsignedByte();
					class392[] var10 = new class392[]{class392.field4266, class392.field4264, class392.field4273};
					class392 var11 = (class392)class128.findEnumerated(var10, var9);
					Object var12 = var11.method6800(var15);
					if (this.intsPersistence[var8]) {
						this.map.put(var8, var12);
					}
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

				for (var8 = 0; var8 < var7; ++var8) {
					var15.readUnsignedShort();
					var15.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-734766189"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1268 < UserComparator4.method2406() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lny;I)Ljava/lang/String;",
		garbageValue = "1855496954"
	)
	public static String method2322(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var14 = var3 - var2;
			if (var14 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field4229) {
					case 6:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var14 <= var6) {
					StringBuilder var12 = new StringBuilder(var14);

					for (int var15 = var2; var15 < var3; ++var15) {
						char var7 = var0.charAt(var15);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (KeyHandler.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class383.field4231;
							int var10 = 0;

							label103:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class383.field4232;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label103;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var7 == var11) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13 = class280.method5139(var7);
							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "70881375"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = AttackOption.method2263(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}
}
