import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 53728519
	)
	int field2479;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhi;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ldp;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lgp;"
	)
	MusicPatchNode2 field2477;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -332172395
	)
	int field2480;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 352043121
	)
	int field2481;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1390443867
	)
	int field2499;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2081977777
	)
	int field2483;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 824681331
	)
	int field2484;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2037828979
	)
	int field2485;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1496244827
	)
	int field2491;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -182332207
	)
	int field2496;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1654304629
	)
	int field2488;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -487308175
	)
	int field2489;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -213876459
	)
	int field2490;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 986422195
	)
	int field2493;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1071893335
	)
	int field2492;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1037928597
	)
	int field2476;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Ldk;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1898603709
	)
	int field2495;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 594099895
	)
	int field2478;

	MusicPatchNode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	void method3963() {
		this.patch = null;
		this.rawSound = null;
		this.field2477 = null;
		this.stream = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lig;II)V",
		garbageValue = "2117396915"
	)
	static void method3968(Archive var0, int var1) {
		if (UserComparator9.NetCache_reference != null) {
			UserComparator9.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = UserComparator9.NetCache_reference.readInt();
			int var3 = UserComparator9.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			WorldMapEvent.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2076016155"
	)
	public static boolean method3966() {
		ReflectionCheck var0 = (ReflectionCheck)class105.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-6"
	)
	static void method3970() {
		try {
			File var0 = new File(ArchiveLoader.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label36:
				for (int var1 = 0; var1 < InterfaceParent.field590.length; ++var1) {
					for (var2 = 0; var2 < class234.field3096.length; ++var2) {
						File var3 = new File(class234.field3096[var2] + InterfaceParent.field590[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label36;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "158312448"
	)
	static int method3964(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "-1086642561"
	)
	static int method3969(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			UrlRequester.Interpreter_intStackSize -= 3;
			AbstractWorldMapIcon.queueSoundEffect(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			UserComparator9.playSong(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			UrlRequester.Interpreter_intStackSize -= 2;
			MouseRecorder.playSoundJingle(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		signature = "(IIIIIIII)V",
		garbageValue = "-1185349902"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UserComparator4.loadInterface(var0)) {
			class9.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
