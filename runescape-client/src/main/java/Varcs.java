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
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 492154065
	)
	static int field1266;
	@ObfuscatedName("d")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("m")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("k")
	@Export("map")
	Map map;
	@ObfuscatedName("o")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("g")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 2195379915719374585L
	)
	long field1263;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class115.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = class407.method7122(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class115.archive2.method5126(15)) {
			var2 = class115.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-2"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1624749457"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-67"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "64"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-329372696"
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
		descriptor = "(ZB)Lnn;",
		garbageValue = "1"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class4.getPreferencesFile("2", class16.field83.name, var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1727219824"
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
						var2 += BufferedSink.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class391 var9 = class391.method6710(var8.getClass());
					var23.writeByte(var9.field4237);
					class391.method6711(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1263 = Occluder.method4335();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
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
					class391[] var10 = new class391[]{class391.field4240, class391.field4238, class391.field4241};
					class391 var11 = (class391)class260.findEnumerated(var10, var9);
					Object var12 = var11.method6713(var15);
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1656264467"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1263 < Occluder.method4335() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1321276012"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "507371463"
	)
	static final void method2303(boolean var0) {
		if (var0) {
			Client.field518 = Login.field893 ? class112.field1356 : class112.field1359;
		} else {
			Client.field518 = VarbitComposition.clientPreferences.parameters.containsKey(GameBuild.method5072(Login.Login_username)) ? class112.field1355 : class112.field1357;
		}

	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1975228173"
	)
	static final void method2302() {
		Client.field664 = Client.cycleCntr;
		Messages.field1275 = true;
	}
}
