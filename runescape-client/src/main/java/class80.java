import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
public class class80 {
	@ObfuscatedName("l")
	static final BigInteger field972;
	@ObfuscatedName("z")
	static final BigInteger field973;

	static {
		field972 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field973 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1294898247"
	)
	static int method1942(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1211
			int var4;
			if (var0 == 1928) { // L: 1228
				var6 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1229
				var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1230
				if (var4 >= 1 && var4 <= 10) { // L: 1231
					class245.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, ""); // L: 1234
					return 1; // L: 1235
				} else {
					throw new RuntimeException(); // L: 1232
				}
			} else if (var0 == 2928) { // L: 1237
				WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 1238
				int var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 1239
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 1240
				int var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 1241
				if (var5 >= 1 && var5 <= 10) { // L: 1242
					class245.widgetDefaultMenuAction(var5, var3, var4, DevicePcmPlayerProvider.getWidget(var3).itemId, ""); // L: 1245
					return 1; // L: 1246
				} else {
					throw new RuntimeException(); // L: 1243
				}
			} else {
				return 2; // L: 1248
			}
		} else if (Interpreter.field956 >= 10) { // L: 1212
			throw new RuntimeException(); // L: 1213
		} else {
			if (var0 >= 2000) { // L: 1216
				var6 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1217
			} else {
				var6 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1219
			}

			if (var6.onResize == null) { // L: 1220
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent(); // L: 1221
				var7.widget = var6; // L: 1222
				var7.args = var6.onResize; // L: 1223
				var7.field1140 = Interpreter.field956 + 1; // L: 1224
				Client.scriptEvents.addFirst(var7); // L: 1225
				return 1; // L: 1226
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2078983117"
	)
	static int method1939(int var0, Script var1, boolean var2) {
		Widget var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1281
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1282
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1283
			return 1; // L: 1284
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1286
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1287
			return 1; // L: 1288
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1290
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.text; // L: 1291
			return 1; // L: 1292
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1294
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1295
			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1298
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1299
			return 1; // L: 1300
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1302
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1303
			return 1; // L: 1304
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1306
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1307
			return 1; // L: 1308
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1310
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1311
			return 1; // L: 1312
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1314
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1315
			return 1; // L: 1316
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1318
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1319
			return 1; // L: 1320
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1322
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1323
			return 1; // L: 1324
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1326
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color; // L: 1327
			return 1; // L: 1328
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1330
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.color2; // L: 1331
			return 1; // L: 1332
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1334
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1335
			return 1; // L: 1336
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1338
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1339
			return 1; // L: 1340
		} else if (var0 != 2615 && var0 != 2616) { // L: 1342
			return 2; // L: 1346
		} else {
			++WorldMapCacheName.Interpreter_intStackSize; // L: 1343
			return 1; // L: 1344
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-66"
	)
	static final void method1943() {
		PacketBufferNode var0 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher); // L: 11309
		Client.packetWriter.addNode(var0); // L: 11310

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11311
			if (var1.type == 0 || var1.type == 3) { // L: 11312
				class18.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11314
			VerticalAlignment.invalidateWidget(Client.meslayerContinueWidget); // L: 11315
			Client.meslayerContinueWidget = null; // L: 11316
		}

	} // L: 11318
}
