import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class13 extends class14 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1404988967
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -8402859884064294097L
	)
	long field124;
	@ObfuscatedName("c")
	String field120;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field124 = -1L; // L: 194
		this.field120 = null; // L: 195
	} // L: 197

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field124 = var1.readLong(); // L: 202
		}

		this.field120 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method120(this.field124, this.field120); // L: 208
	} // L: 209

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lev;",
		garbageValue = "1730592786"
	)
	public static VarcInt method210(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method2659(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "-97122486"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? Messages.World_worlds[++World.World_listCount - 1] : null; // L: 242 243
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Z",
		garbageValue = "-2025189818"
	)
	static boolean method204(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 583
			int[] var1 = var0.transforms; // L: 585

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 586
				int var3 = var1[var2]; // L: 587
				ObjectComposition var4 = AttackOption.getObjectDefinition(var3); // L: 589
				if (var4.mapIconId != -1) { // L: 590
					return true; // L: 591
				}
			}
		} else if (var0.mapIconId != -1) { // L: 597
			return true; // L: 598
		}

		return false; // L: 600
	}

	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	static final void method214() {
		Scene.Scene_isLowDetail = false; // L: 807
		Client.isLowDetail = false; // L: 808
	} // L: 809

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-86"
	)
	static boolean method213() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81]; // L: 10459
	}
}
