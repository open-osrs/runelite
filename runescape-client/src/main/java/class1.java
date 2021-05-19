import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
public class class1 extends class14 {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("em")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 923743135
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1481109389
	)
	int field13;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2117262147
	)
	int field9;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1231074137
	)
	int field10;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1287195157
	)
	int field15;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class1(class2 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field13 = var1.readInt(); // L: 292
		this.field15 = var1.readInt(); // L: 293
		this.field9 = var1.readUnsignedByte(); // L: 294
		this.field10 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method127(this.field13, this.field15, this.field9, this.field10); // L: 299
	} // L: 300

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Lhp;I)Z",
		garbageValue = "-1785830430"
	)
	public static boolean method13(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class232.musicPatchesArchive = var0; // L: 26
		class232.musicSamplesArchive = var1; // L: 27
		UserComparator10.soundEffectsArchive = var2; // L: 28
		class232.midiPcmStream = var3; // L: 29
		return true; // L: 30
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "1"
	)
	static int method16(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3495
			Client.logoutTimer = 250; // L: 3496
			return 1; // L: 3497
		} else if (var0 != 5631 && var0 != 5633) { // L: 3499
			if (var0 == 5632) { // L: 3503
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 26; // L: 3504
				return 1; // L: 3505
			} else {
				return 2; // L: 3507
			}
		} else {
			class13.Interpreter_stringStackSize -= 2; // L: 3500
			return 1; // L: 3501
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-281573132"
	)
	static int method15(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) { // L: 4290
			WorldMapCacheName.Interpreter_intStackSize -= 5; // L: 4291
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 4292
			return 1; // L: 4293
		} else if (var0 == 7204) { // L: 4295
			WorldMapCacheName.Interpreter_intStackSize -= 6; // L: 4296
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 4297
			return 1; // L: 4298
		} else if (var0 >= 7205 && var0 < 7209) { // L: 4300
			Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 4301
			return 1; // L: 4302
		} else if (var0 == 7209) { // L: 4304
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4305
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 4306
			return 1; // L: 4307
		} else if (var0 >= 7210 && var0 < 7214) { // L: 4309
			--WorldMapCacheName.Interpreter_intStackSize; // L: 4310
			return 1; // L: 4311
		} else if (var0 == 7214) { // L: 4313
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 4314
			return 1; // L: 4315
		} else {
			return 2; // L: 4317
		}
	}
}
