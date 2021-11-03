import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -740973297
	)
	static int field429;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 999048453
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -467081415
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 143972529
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("a")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("o")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("g")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("e")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("p")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Les;",
		garbageValue = "16"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "611566572"
	)
	static int method1115() {
		return Login.field871.length + Login.field885.length; // L: 143
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2023329615"
	)
	static final void method1114() {
		Client.field666 = Client.cycleCntr; // L: 11794
		class6.ClanChat_inClanChat = true; // L: 11795
	} // L: 11796
}
