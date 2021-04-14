import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fx")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 290208105
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1592009021
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1758245997
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 528170581
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1400903317
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1333584157
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("d")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 710748349
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1452251067
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("q")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("t")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 551470887
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1164753335
	)
	int field1889;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 210470001
	)
	int field1890;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1446822029
	)
	int field1882;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1; // L: 31
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-20"
	)
	public static byte[] method3356() {
		byte[] var0 = new byte[24]; // L: 275

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 277
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 278

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 279 280 281
			}

			if (var1 >= 24) { // L: 283
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 286
				var0[var2] = -1;
			}
		}

		return var0; // L: 288
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "-860783313"
	)
	static int method3358(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1809
			class16.Interpreter_intStackSize -= 3; // L: 1810
			ArchiveDiskAction.queueSoundEffect(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]); // L: 1811
			return 1; // L: 1812
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1814
			class4.playSong(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1815
			return 1; // L: 1816
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1818
			class16.Interpreter_intStackSize -= 2; // L: 1819
			HealthBarUpdate.method2175(Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]); // L: 1820
			return 1; // L: 1821
		} else {
			int var3;
			if (var0 == 3203) { // L: 1823
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100); // L: 1824
				Messages.method2367(Math.round(2.55F * (float)var3)); // L: 1825
				return 1; // L: 1826
			} else if (var0 == 3204) { // L: 1828
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.musicVolume / 2.55F); // L: 1829
				return 1; // L: 1830
			} else if (var0 == 3205) { // L: 1832
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100); // L: 1833
				Canvas.updateSoundEffectVolume(Math.round((float)var3 * 1.27F)); // L: 1834
				return 1; // L: 1835
			} else if (var0 == 3206) { // L: 1837
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.soundEffectsVolume / 1.27F); // L: 1838
				return 1; // L: 1839
			} else if (var0 == 3207) { // L: 1841
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize], 0), 100); // L: 1842
				MusicPatchPcmStream.method4126(Math.round((float)var3 * 1.27F)); // L: 1843
				return 1; // L: 1844
			} else if (var0 == 3208) { // L: 1846
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Math.round((float)Login.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1847
				return 1; // L: 1848
			} else {
				return 2; // L: 1850
			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "149089395"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field819 = 0L; // L: 3599
		if (var0 >= 2) { // L: 3600
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 3601
		}

		if (WorldMapScaleHandler.getWindowedMode() == 1) { // L: 3602
			class10.client.setMaxCanvasSize(765, 503); // L: 3603
		} else {
			class10.client.setMaxCanvasSize(7680, 2160); // L: 3606
		}

		if (Client.gameState >= 25) { // L: 3608
			ItemContainer.method2093();
		}

	} // L: 3609
}
