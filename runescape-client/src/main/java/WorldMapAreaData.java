import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gc")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("k")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("r")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("p")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;IZI)V",
		garbageValue = "1847840337"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnk;ZI)V",
		garbageValue = "-2146987999"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method6464(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Let;",
		garbageValue = "0"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)Low;",
		garbageValue = "633524890"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var2 * var3]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "995249134"
	)
	static int method3668(int var0, Script var1, boolean var2) {
		Widget var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 1376
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1377
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AttackOption.Widget_unpackTargetMask(class26.getWidgetFlags(var3)); // L: 1378
			return 1; // L: 1379
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1381
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1388
				if (var3.dataText == null) { // L: 1389
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1390
				}

				return 1; // L: 1391
			} else {
				return 2; // L: 1393
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 1382
			--var4; // L: 1383
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1384
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1385
			} else {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1386
		}
	}
}
