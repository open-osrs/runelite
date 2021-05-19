import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("h")
	@Export("text")
	String text;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1379711685
	)
	@Export("width")
	int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 972901429
	)
	@Export("height")
	int height;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfi;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "260939477"
	)
	public static int method3582(int var0) {
		return class230.field2816[var0]; // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "20"
	)
	static int method3583(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3463
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3464
			var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3465
			int var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3466
			if (!Client.isCameraLocked) { // L: 3467
				Client.camAngleX = var3; // L: 3468
				Client.camAngleY = var4; // L: 3469
			}

			return 1; // L: 3471
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3473
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3474
			return 1; // L: 3475
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3477
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3478
			return 1; // L: 3479
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3481
			var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3482
			if (var3 < 0) { // L: 3483
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3484
			return 1; // L: 3485
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3487
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3488
			return 1; // L: 3489
		} else {
			return 2; // L: 3491
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-727518714"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4699
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4700
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4701
				int var3 = var2.x >> 7; // L: 4702
				int var4 = var2.y >> 7; // L: 4703
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4704
					if (var2.field1211 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4705
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4706
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4707
					}

					long var5 = class17.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4709
					var2.playerCycle = Client.cycle; // L: 4710
					class5.scene.drawEntity(ParamComposition.Client_plane, var2.x, var2.y, SceneTilePaint.getTileHeight(var2.field1211 * 64 - 64 + var2.x, var2.field1211 * 64 - 64 + var2.y, ParamComposition.Client_plane), var2.field1211 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4711
				}
			}
		}

	} // L: 4715
}
