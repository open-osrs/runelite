import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("bh")
@Implements("World")
public class World {
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 379964613
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1774398663
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("a")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("u")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 193044341
	)
	@Export("id")
	int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1525718377
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 20105997
	)
	@Export("population")
	int population;
	@ObfuscatedName("f")
	@Export("host")
	String host;
	@ObfuscatedName("s")
	@Export("activity")
	String activity;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1040537499
	)
	@Export("location")
	int location;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -479539557
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-311027457"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1475784103"
	)
	boolean method1614() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1562214326"
	)
	boolean method1619() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "23"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "217290344"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2119870644"
	)
	boolean method1616() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1818446610"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "46"
	)
	static int method1661(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = WorldMapCacheName.method3872(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NPCComposition.method2980(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = GraphicsObject.method1871(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
