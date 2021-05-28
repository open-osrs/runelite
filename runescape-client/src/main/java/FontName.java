import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mv")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("r")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Lee;",
		garbageValue = "743368656"
	)
	public static VarbitComposition method6299(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 32
			var1 = new VarbitComposition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 35
			return var1; // L: 36
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgt;[Lfz;I)V",
		garbageValue = "305716239"
	)
	static final void method6296(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 183
		int var11 = -1; // L: 184

		while (true) {
			int var12 = var10.method6560(); // L: 186
			if (var12 == 0) { // L: 187
				return; // L: 242
			}

			var11 += var12; // L: 188
			int var13 = 0; // L: 189

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 191
				if (var14 == 0) { // L: 192
					break;
				}

				var13 += var14 - 1; // L: 193
				int var15 = var13 & 63; // L: 194
				int var16 = var13 >> 6 & 63; // L: 195
				int var17 = var13 >> 12; // L: 196
				int var18 = var10.readUnsignedByte(); // L: 197
				int var19 = var18 >> 2; // L: 198
				int var20 = var18 & 3; // L: 199
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 200
					ObjectComposition var21 = class23.getObjectDefinition(var11); // L: 201
					int var24 = var16 & 7; // L: 204
					int var25 = var15 & 7; // L: 205
					int var27 = var21.sizeX; // L: 207
					int var28 = var21.sizeY; // L: 208
					int var29;
					if ((var20 & 1) == 1) { // L: 210
						var29 = var27; // L: 211
						var27 = var28; // L: 212
						var28 = var29; // L: 213
					}

					int var26 = var7 & 3; // L: 215
					int var23;
					if (var26 == 0) { // L: 216
						var23 = var24; // L: 217
					} else if (var26 == 1) { // L: 220
						var23 = var25; // L: 221
					} else if (var26 == 2) { // L: 224
						var23 = 7 - var24 - (var27 - 1); // L: 225
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 228
					}

					var29 = var23 + var2; // L: 230
					int var30 = var3 + class179.method3635(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 231
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) { // L: 232
						int var31 = var1; // L: 233
						if ((Tiles.Tiles_renderFlags[1][var29][var30] & 2) == 2) { // L: 234
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 235
						if (var31 >= 0) { // L: 236
							var32 = var9[var31];
						}

						ClanChannelMember.method89(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 237
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1272154519"
	)
	static int method6298(int var0, Script var1, boolean var2) {
		Widget var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1281
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1282
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1283
			return 1; // L: 1284
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1286
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1287
			return 1; // L: 1288
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1290
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1291
			return 1; // L: 1292
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1294
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1295
			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1298
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1302
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1306
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1310
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1314
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1318
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1322
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1326
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color; // L: 1327
			return 1; // L: 1328
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1330
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.color2; // L: 1331
			return 1; // L: 1332
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1334
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1338
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1339
			return 1; // L: 1340
		} else if (var0 != 2615 && var0 != 2616) { // L: 1342
			return 2; // L: 1346
		} else {
			++class44.Interpreter_intStackSize; // L: 1343
			return 1; // L: 1344
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Ljp;",
		garbageValue = "28"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null; // L: 1917
		if (JagexCache.JagexCache_dat2File != null) { // L: 1918
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class93.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, class43.masterDisk, var0, var1, var2, var3); // L: 1919
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-81607341"
	)
	public static boolean method6297() {
		return Client.staffModLevel >= 2; // L: 11491
	}
}
