import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("pv")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("cf")
	public static char field200;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1040342565
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1070346919
	)
	@Export("element")
	int element;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 807187901
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1506081143
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhs;Lhs;ILam;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-359753179"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lah;",
		garbageValue = "1889474780"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1082591682"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1102738521"
	)
	@Export("init")
	void init() {
		this.element = WorldMapDecoration.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(UserComparator10.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = UserComparator10.WorldMapElement_get(this.getElement()); // L: 26
		Sprite var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	static void method354() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 119
			KeyHandler.KeyHandler_keyCodes[186] = 57;
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26;
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 127
			KeyHandler.KeyHandler_keyCodes[220] = 74;
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 129
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 130
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 131
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 140
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 141
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 145
		}

	} // L: 147

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "982246175"
	)
	public static boolean method355() {
		try {
			if (class206.musicPlayerStatus == 2) { // L: 102
				if (FileSystem.musicTrack == null) { // L: 103
					FileSystem.musicTrack = MusicTrack.readTrack(Varps.musicTrackArchive, HealthBarUpdate.musicTrackGroupId, class206.musicTrackFileId); // L: 104
					if (FileSystem.musicTrack == null) { // L: 105
						return false;
					}
				}

				if (class206.soundCache == null) { // L: 107
					class206.soundCache = new SoundCache(class206.soundEffectsArchive, class206.musicSamplesArchive);
				}

				if (class206.midiPcmStream.loadMusicTrack(FileSystem.musicTrack, class206.musicPatchesArchive, class206.soundCache, 22050)) { // L: 108
					class206.midiPcmStream.clearAll(); // L: 109
					class206.midiPcmStream.setPcmStreamVolume(GrandExchangeEvent.musicTrackVolume); // L: 110
					class206.midiPcmStream.setMusicTrack(FileSystem.musicTrack, class231.musicTrackBoolean); // L: 111
					class206.musicPlayerStatus = 0; // L: 112
					FileSystem.musicTrack = null; // L: 113
					class206.soundCache = null; // L: 114
					Varps.musicTrackArchive = null; // L: 115
					return true; // L: 116
				}
			}
		} catch (Exception var1) { // L: 120
			var1.printStackTrace(); // L: 121
			class206.midiPcmStream.clear(); // L: 122
			class206.musicPlayerStatus = 0; // L: 123
			FileSystem.musicTrack = null; // L: 124
			class206.soundCache = null; // L: 125
			Varps.musicTrackArchive = null; // L: 126
		}

		return false; // L: 128
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "620552386"
	)
	public static void method339() {
		NPCDefinition.NpcDefinition_cached.clear(); // L: 285
		NPCDefinition.NpcDefinition_cachedModels.clear(); // L: 286
	} // L: 287

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "1021880804"
	)
	static int method336(int var0, Script var1, boolean var2) {
		Widget var3 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1215
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1216
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1217
			return 1; // L: 1218
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1220
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1221
			return 1; // L: 1222
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1224
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text; // L: 1225
			return 1; // L: 1226
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1228
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1229
			return 1; // L: 1230
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1232
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1233
			return 1; // L: 1234
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1236
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1237
			return 1; // L: 1238
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1240
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1241
			return 1; // L: 1242
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1244
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1245
			return 1; // L: 1246
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1248
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1249
			return 1; // L: 1250
		} else if (var0 == ScriptOpcodes.IF_GETTRANSTOP) { // L: 1252
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1253
			return 1; // L: 1254
		} else if (var0 == ScriptOpcodes.IF_GETTRANSBOT) { // L: 1256
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1257
			return 1; // L: 1258
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1260
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.color; // L: 1261
			return 1; // L: 1262
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1264
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.color2; // L: 1265
			return 1; // L: 1266
		} else if (var0 == ScriptOpcodes.IF_GETFILLMODE) { // L: 1268
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1269
			return 1; // L: 1270
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1272
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1273
			return 1; // L: 1274
		} else {
			return 2; // L: 1276
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZS)I",
		garbageValue = "255"
	)
	static int method345(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1280
			var5 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1281
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.itemId; // L: 1282
			return 1; // L: 1283
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1285
			var5 = CollisionMap.getWidget(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]); // L: 1286
			if (var5.itemId != -1) { // L: 1287
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1288
			}

			return 1; // L: 1289
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1291
			int var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 1292
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1293
			if (var4 != null) { // L: 1294
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0; // L: 1295
			}

			return 1; // L: 1296
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1298
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1299
			return 1; // L: 1300
		} else {
			return 2; // L: 1302
		}
	}
}
