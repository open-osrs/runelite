import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 303463081
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -445557769
	)
	@Export("element")
	int element;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1466979619
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -392436281
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lhk;Lhk;ILew;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-88183345"
	)
	@Export("init")
	void init() {
		this.element = class19.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(ByteArrayPool.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = ByteArrayPool.WorldMapElement_get(this.getElement()); // L: 26
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-52"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 39
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lfi;",
		garbageValue = "634413820"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 43
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1975622360"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 47
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1420825097"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 51
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "637154064"
	)
	public static void method2699() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 150
			++KeyHandler.KeyHandler_idleCycles; // L: 151
			KeyHandler.field264 = KeyHandler.field271; // L: 152
			KeyHandler.field263 = 0; // L: 153
			int var1;
			if (KeyHandler.field259 < 0) { // L: 154
				for (var1 = 0; var1 < 112; ++var1) { // L: 155
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field259 = KeyHandler.field258; // L: 156
			} else {
				while (KeyHandler.field259 != KeyHandler.field258) { // L: 159
					var1 = KeyHandler.field257[KeyHandler.field258]; // L: 160
					KeyHandler.field258 = KeyHandler.field258 + 1 & 127; // L: 161
					if (var1 < 0) { // L: 162
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field263 < KeyHandler.field262.length - 1) { // L: 164
							KeyHandler.field262[++KeyHandler.field263 - 1] = var1; // L: 165
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true; // L: 167
					}
				}
			}

			if (KeyHandler.field263 > 0) { // L: 171
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field271 = KeyHandler.field265; // L: 172
		}
	} // L: 174

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BB)Lcc;",
		garbageValue = "40"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 76
		Buffer var2 = new Buffer(var0); // L: 77
		var2.offset = var2.array.length - 2; // L: 78
		int var3 = var2.readUnsignedShort(); // L: 79
		int var4 = var2.array.length - 2 - var3 - 12; // L: 80
		var2.offset = var4; // L: 81
		int var5 = var2.readInt(); // L: 82
		var1.localIntCount = var2.readUnsignedShort(); // L: 83
		var1.localStringCount = var2.readUnsignedShort(); // L: 84
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 85
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 86
		int var6 = var2.readUnsignedByte(); // L: 87
		int var7;
		int var8;
		if (var6 > 0) { // L: 88
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 89

			for (var7 = 0; var7 < var6; ++var7) { // L: 90
				var8 = var2.readUnsignedShort(); // L: 91
				int var9;
				int var11;
				if (var8 > 0) { // L: 93
					var11 = var8 - 1; // L: 97
					var11 |= var11 >>> 1; // L: 98
					var11 |= var11 >>> 2; // L: 99
					var11 |= var11 >>> 4; // L: 100
					var11 |= var11 >>> 8; // L: 101
					var11 |= var11 >>> 16; // L: 102
					int var10 = var11 + 1; // L: 103
					var9 = var10; // L: 105
				} else {
					var9 = 1; // L: 107
				}

				IterableNodeHashTable var13 = new IterableNodeHashTable(var9); // L: 108
				var1.switches[var7] = var13; // L: 109

				while (var8-- > 0) { // L: 110
					var11 = var2.readInt(); // L: 111
					int var12 = var2.readInt(); // L: 112
					var13.put(new IntegerNode(var12), (long)var11); // L: 113
				}
			}
		}

		var2.offset = 0; // L: 117
		var1.field1058 = var2.readStringCp1252NullTerminatedOrNull(); // L: 118
		var1.opcodes = new int[var5]; // L: 119
		var1.intOperands = new int[var5]; // L: 120
		var1.stringOperands = new String[var5]; // L: 121

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 122 123 128
			var8 = var2.readUnsignedShort(); // L: 124
			if (var8 == 3) { // L: 125
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 126
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 127
			}
		}

		return var1; // L: 130
	}
}
