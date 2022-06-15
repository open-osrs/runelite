import java.awt.Image;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class162 extends class165 {
	@ObfuscatedName("aj")
	static Image field1781;
	@ObfuscatedName("av")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -454332877
	)
	int field1784;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;Ljava/lang/String;I)V"
	)
	class162(class155 var1, String var2, int var3) {
		super(var1, var2); // L: 372
		this.this$0 = var1; // L: 371
		this.field1784 = var3; // L: 373
	} // L: 374

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-118"
	)
	public int vmethod3314() {
		return 0; // L: 377
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16777215"
	)
	public int vmethod3318() {
		return this.field1784; // L: 382
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "540611824"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = class328.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1499243899"
	)
	static int method3298(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4521
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4522
			return 1; // L: 4523
		} else if (var0 != 6801 && var0 != 6802) { // L: 4525
			if (var0 == 6850) { // L: 4529
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4530
				return 1; // L: 4531
			} else if (var0 != 6851 && var0 != 6852) { // L: 4533
				if (var0 == 6853) { // L: 4537
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 4538
					return 1; // L: 4539
				} else {
					return 2; // L: 4541
				}
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4534
				return 1; // L: 4535
			}
		} else {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1; // L: 4526
			return 1; // L: 4527
		}
	}
}
