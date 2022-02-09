import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("bp")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("l")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("s")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-1793389136"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 222
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 223
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 224
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 225
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 226
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 227
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 228
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 229
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 230 231
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lcw;III)V",
		garbageValue = "-586498893"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4111
			int var3 = class78.SequenceDefinition_get(var1).field2109; // L: 4112
			if (var3 == 1) { // L: 4113
				var0.sequenceFrame = 0; // L: 4114
				var0.sequenceFrameCycle = 0; // L: 4115
				var0.sequenceDelay = var2; // L: 4116
				var0.field1129 = 0; // L: 4117
			}

			if (var3 == 2) { // L: 4119
				var0.field1129 = 0; // L: 4120
			}
		} else if (var1 == -1 || var0.sequence == -1 || class78.SequenceDefinition_get(var1).field2095 >= class78.SequenceDefinition_get(var0.sequence).field2095) { // L: 4123
			var0.sequence = var1; // L: 4124
			var0.sequenceFrame = 0; // L: 4125
			var0.sequenceFrameCycle = 0; // L: 4126
			var0.sequenceDelay = var2; // L: 4127
			var0.field1129 = 0; // L: 4128
			var0.field1176 = var0.pathLength; // L: 4129
		}

	} // L: 4131
}
