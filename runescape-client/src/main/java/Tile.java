import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 887186055
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 719692751
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2070822957
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1571348595
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1697073381
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lhx;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("w")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -344605411
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1026469489
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("x")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("n")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1027035127
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1807728235
	)
	int field2372;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -588428605
	)
	int field2373;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -720858367
	)
	int field2374;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1;
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Lnw;",
		garbageValue = "-23548"
	)
	public static class388 method3904() {
		synchronized(class388.field4402) { // L: 27
			if (class388.field4401 == 0) { // L: 28
				return new class388();
			} else {
				class388.field4402[--class388.field4401].method6861(); // L: 30
				return class388.field4402[class388.field4401]; // L: 31
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "1"
	)
	static int method3903(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--class12.Interpreter_intStackSize]); // L: 1312
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1313
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.x; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1317
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.y; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1321
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.width; // L: 1322
			return 1; // L: 1323
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1325
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.height; // L: 1326
			return 1; // L: 1327
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1329
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1333
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.parentId; // L: 1334
			return 1; // L: 1335
		} else {
			return 2; // L: 1337
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "-61"
	)
	static int method3902(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4592
			++class12.Interpreter_intStackSize; // L: 4593
			return 1; // L: 4594
		} else if (var0 == 7101) { // L: 4596
			class9.Interpreter_stringStackSize += 2; // L: 4597
			return 1; // L: 4598
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4600
			if (var0 == 7106) { // L: 4604
				++class12.Interpreter_intStackSize; // L: 4605
				return 1; // L: 4606
			} else if (var0 == 7107) { // L: 4608
				++class12.Interpreter_intStackSize; // L: 4609
				return 1; // L: 4610
			} else if (var0 == 7108) { // L: 4612
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = CollisionMap.method3788() ? 1 : 0; // L: 4613
				return 1; // L: 4614
			} else if (var0 == 7110) { // L: 4616
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4617
				return 1; // L: 4618
			} else if (var0 == 7120) { // L: 4620
				--class12.Interpreter_intStackSize; // L: 4621
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4622
				return 1; // L: 4623
			} else if (var0 == 7121) { // L: 4625
				class12.Interpreter_intStackSize -= 2; // L: 4626
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = -1; // L: 4627
				return 1; // L: 4628
			} else if (var0 == 7122) { // L: 4630
				class12.Interpreter_intStackSize -= 2; // L: 4631
				Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = 0; // L: 4632
				return 1; // L: 4633
			} else {
				return 2; // L: 4635
			}
		} else {
			++class12.Interpreter_intStackSize; // L: 4601
			return 1; // L: 4602
		}
	}
}
