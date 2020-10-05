import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("ap")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1433563031
	)
	static int field212;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -18311555
	)
	final int objectDefId;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final WorldMapRegion region;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2141926567
	)
	int element;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	WorldMapLabel label;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 578089951
	)
	int subWidth;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -258563275
	)
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhg;Lhg;ILal;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1613828162"
	)
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Laq;",
		garbageValue = "499378708"
	)
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "182515130"
	)
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2001682063"
	)
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1388314285"
	)
	void init() {
		this.element = MidiPcmStream.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(WorldMapSection0.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = WorldMapSection0.WorldMapElement_get(this.getElement()); // L: 26
		Sprite var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1482054985"
	)
	static void method377() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-40638792"
	)
	public static int getSceneXForObjectUnderMouse(int var0) {
		return TileItem.Entity_unpackSceneX(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "126"
	)
	static boolean method380(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class60.field451.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var11.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var5) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Object var10 = class56.method899(class60.applet, var2, new Object[]{(new URL(class60.applet.getCodeBase(), var0)).toString()}); // L: 78
				return var10 != null; // L: 79
			} catch (Throwable var6) { // L: 81
				return false; // L: 82
			}
		} else if (var1 == 2) { // L: 85
			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_blank"); // L: 87
				return true; // L: 88
			} catch (Exception var7) { // L: 90
				return false; // L: 91
			}
		} else if (var1 == 3) { // L: 94
			try {
				Applet var3 = class60.applet; // L: 96
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 99
			} catch (Throwable var9) { // L: 102
			}

			try {
				class60.applet.getAppletContext().showDocument(new URL(class60.applet.getCodeBase(), var0), "_top"); // L: 104
				return true; // L: 105
			} catch (Exception var8) { // L: 107
				return false; // L: 108
			}
		} else {
			throw new IllegalArgumentException(); // L: 111
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1976803623"
	)
	static int method378(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Canvas.field438 : class3.field12; // L: 1104
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1105
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1106
			return 1; // L: 1107
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1109
			if (var3.itemId != -1) { // L: 1110
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1111
			}

			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1114
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1115
			return 1; // L: 1116
		} else {
			return 2; // L: 1118
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Lbs;I)V",
		garbageValue = "777785142"
	)
	static final void method375(PendingSpawn var0) {
		long var1 = 0L; // L: 6635
		int var3 = -1; // L: 6636
		int var4 = 0; // L: 6637
		int var5 = 0; // L: 6638
		if (var0.type == 0) { // L: 6639
			var1 = ScriptEvent.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 6640
			var1 = ScriptEvent.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 6641
			var1 = ScriptEvent.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 6642
			var1 = ScriptEvent.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 6643
			int var6 = ScriptEvent.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 6644
			var3 = UserComparator9.Entity_unpackID(var1); // L: 6645
			var4 = var6 & 31; // L: 6646
			var5 = var6 >> 6 & 3; // L: 6647
		}

		var0.objectId = var3; // L: 6649
		var0.field961 = var4; // L: 6650
		var0.field960 = var5; // L: 6651
	} // L: 6652
}
