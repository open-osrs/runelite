import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("c")
	@Export("args")
	Object[] args;
	@ObfuscatedName("v")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 708016645
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -768277781
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1223835253
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 308775773
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1014377791
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("i")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 643045145
	)
	int field1056;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1853302577
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1631698731"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-59182126"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2093180066"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 117
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-372949524"
	)
	static void method2101() {
		if (Client.field533 && class101.localPlayer != null) { // L: 12429
			int var0 = class101.localPlayer.pathX[0]; // L: 12430
			int var1 = class101.localPlayer.pathY[0]; // L: 12431
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12432
				return;
			}

			InterfaceParent.oculusOrbFocalPointX = class101.localPlayer.x; // L: 12433
			int var2 = SceneTilePaint.getTileHeight(class101.localPlayer.x, class101.localPlayer.y, PacketWriter.Client_plane) - Client.camFollowHeight; // L: 12434
			if (var2 < class181.field1992) { // L: 12435
				class181.field1992 = var2;
			}

			class141.oculusOrbFocalPointY = class101.localPlayer.y; // L: 12436
			Client.field533 = false; // L: 12437
		}

	} // L: 12439

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-115976306"
	)
	static void method2106() {
		if (UrlRequester.field1362 != null) { // L: 12460
			Client.field770 = Client.cycle; // L: 12461
			UrlRequester.field1362.method6035(); // L: 12462

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12463
				if (Client.players[var0] != null) { // L: 12464
					UrlRequester.field1362.method6048((Client.players[var0].x >> 7) + class28.baseX, (Client.players[var0].y >> 7) + WorldMapLabelSize.baseY); // L: 12465
				}
			}
		}

	} // L: 12469
}
