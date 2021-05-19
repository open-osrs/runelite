import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hc")
public class class232 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 459547131
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -557844945
	)
	@Export("musicTrackGroupId")
	static int musicTrackGroupId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1204207413
	)
	@Export("musicTrackFileId")
	static int musicTrackFileId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2028429341
	)
	@Export("pcmSampleLength")
	static int pcmSampleLength;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive19")
	static Archive archive19;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "788282461"
	)
	static int method4357(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 1074
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1075
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.x; // L: 1076
			return 1; // L: 1077
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1079
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.y; // L: 1080
			return 1; // L: 1081
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1083
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.width; // L: 1084
			return 1; // L: 1085
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1087
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.height; // L: 1088
			return 1; // L: 1089
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1091
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1092
			return 1; // L: 1093
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1095
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.parentId; // L: 1096
			return 1; // L: 1097
		} else {
			return 2; // L: 1099
		}
	}
}
