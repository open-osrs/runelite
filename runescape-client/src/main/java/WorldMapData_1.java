import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("aw")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 393401229
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -444387603
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2075814335
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -959045711
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1959285533"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field290.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte(); // L: 27
			super.groupId = var1.method5833(); // L: 28
			super.fileId = var1.method5833(); // L: 29
		}
	} // L: 30

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "36"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 33
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field193 = new byte[super.planes][64][64]; // L: 36
		super.field204 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class39.field283.value) { // L: 40
			throw new IllegalStateException(""); // L: 41
		} else {
			int var3 = var1.readUnsignedByte(); // L: 43
			int var4 = var1.readUnsignedByte(); // L: 44
			int var5 = var1.readUnsignedByte(); // L: 45
			int var6 = var1.readUnsignedByte(); // L: 46
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 47
				for (int var7 = 0; var7 < 8; ++var7) { // L: 50
					for (int var8 = 0; var8 < 8; ++var8) { // L: 51
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 52
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 48
			}
		}
	} // L: 55

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1716602813"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-477911557"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "384332395"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (super.regionX == var2.regionX && super.regionY == var2.regionY) { // L: 62
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "([Lhz;IS)V",
		garbageValue = "11595"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10845
			Widget var3 = var0[var2]; // L: 10846
			if (var3 != null) { // L: 10847
				if (var3.type == 0) { // L: 10848
					if (var3.children != null) { // L: 10849
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10850
					if (var4 != null) { // L: 10851
						class228.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10853
					var5 = new ScriptEvent(); // L: 10854
					var5.widget = var3; // L: 10855
					var5.args = var3.onDialogAbort; // L: 10856
					PacketWriter.runScriptEvent(var5); // L: 10857
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10859
					if (var3.childIndex >= 0) { // L: 10860
						Widget var6 = class237.getWidget(var3.id); // L: 10861
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10862
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10866
					var5.widget = var3; // L: 10867
					var5.args = var3.onSubChange; // L: 10868
					PacketWriter.runScriptEvent(var5); // L: 10869
				}
			}
		}

	} // L: 10872

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static final void method810(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11118
		WorldMapSectionType.clientPreferences.areaSoundEffectsVolume = var0; // L: 11119
		class23.savePreferences(); // L: 11120
	} // L: 11121
}
