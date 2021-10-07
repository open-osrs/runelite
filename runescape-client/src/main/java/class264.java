import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jo")
public class class264 {
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;Lkl;Lig;I)Z",
		garbageValue = "455170296"
	)
	public static boolean method5077(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class247.musicPatchesArchive = var0;
		GrandExchangeOfferWorldComparator.musicSamplesArchive = var1;
		class247.soundEffectsArchive = var2;
		class247.midiPcmStream = var3;
		return true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "-1155481157"
	)
	static int method5071(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			Client.field744 = (short)Friend.method6004(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize]);
			if (Client.field744 <= 0) {
				Client.field744 = 256;
			}

			Client.field747 = (short)Friend.method6004(Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]);
			if (Client.field747 <= 0) {
				Client.field747 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 4;
			Client.field748 = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			if (Client.field748 <= 0) {
				Client.field748 = 1;
			}

			Client.field749 = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			if (Client.field749 <= 0) {
				Client.field749 = 32767;
			} else if (Client.field749 < Client.field748) {
				Client.field749 = Client.field748;
			}

			Client.field750 = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			if (Client.field750 <= 0) {
				Client.field750 = 1;
			}

			Client.field501 = (short)Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3];
			if (Client.field501 <= 0) {
				Client.field501 = 32767;
			} else if (Client.field501 < Client.field750) {
				Client.field501 = Client.field750;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class130.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class300.method5458(Client.field744);
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class300.method5458(Client.field747);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Huffman.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = MouseRecorder.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
