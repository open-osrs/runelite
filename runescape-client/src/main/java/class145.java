import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class145 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 802544023
	)
	int field1634;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class145(class129 var1) {
		this.this$0 = var1;
		this.field1634 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1634 = var1.readUnsignedShort(); // L: 149
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2863(this.field1634); // L: 153
	} // L: 154

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbn;",
		garbageValue = "1172830323"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 112
		Buffer var2 = new Buffer(var0); // L: 113
		var2.offset = var2.array.length - 2; // L: 114
		int var3 = var2.readUnsignedShort(); // L: 115
		int var4 = var2.array.length - 2 - var3 - 12; // L: 116
		var2.offset = var4; // L: 117
		int var5 = var2.readInt(); // L: 118
		var1.localIntCount = var2.readUnsignedShort(); // L: 119
		var1.localStringCount = var2.readUnsignedShort(); // L: 120
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 121
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 122
		int var6 = var2.readUnsignedByte(); // L: 123
		int var7;
		int var8;
		if (var6 > 0) { // L: 124
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 125

			for (var7 = 0; var7 < var6; ++var7) { // L: 126
				var8 = var2.readUnsignedShort(); // L: 127
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? SpotAnimationDefinition.method3362(var8) : 1); // L: 128
				var1.switches[var7] = var9; // L: 129

				while (var8-- > 0) { // L: 130
					int var10 = var2.readInt(); // L: 131
					int var11 = var2.readInt(); // L: 132
					var9.put(new IntegerNode(var11), (long)var10); // L: 133
				}
			}
		}

		var2.offset = 0; // L: 137
		var1.field937 = var2.readStringCp1252NullTerminatedOrNull(); // L: 138
		var1.opcodes = new int[var5]; // L: 139
		var1.intOperands = new int[var5]; // L: 140
		var1.stringOperands = new String[var5]; // L: 141

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 142 143 148
			var8 = var2.readUnsignedShort(); // L: 144
			if (var8 == 3) { // L: 145
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 146
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 147
			}
		}

		return var1; // L: 150
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578120171"
	)
	static final void method2985() {
		if (class20.Client_plane != Client.field570) { // L: 4395
			Client.field570 = class20.Client_plane; // L: 4396
			int var0 = class20.Client_plane; // L: 4397
			int[] var1 = class29.sceneMinimapSprite.pixels; // L: 4399
			int var2 = var1.length; // L: 4400

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 4401
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 4402
				var4 = (103 - var3) * 2048 + 24628; // L: 4403

				for (var5 = 1; var5 < 103; ++var5) { // L: 4404
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 4405
						class7.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 4406
						class7.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4; // L: 4407
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 4410
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 4411
			class29.sceneMinimapSprite.setRaster(); // L: 4412

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 4413
				for (var6 = 1; var6 < 103; ++var6) { // L: 4414
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 4415
						class33.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 4416
						class33.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 4419

			for (var5 = 0; var5 < 104; ++var5) { // L: 4420
				for (var6 = 0; var6 < 104; ++var6) { // L: 4421
					long var7 = class7.scene.getFloorDecorationTag(class20.Client_plane, var5, var6); // L: 4422
					if (var7 != 0L) { // L: 4423
						int var9 = PacketWriter.Entity_unpackID(var7); // L: 4424
						int var10 = class148.getObjectDefinition(var9).mapIconId; // L: 4425
						if (var10 >= 0 && class78.WorldMapElement_get(var10).field1759) { // L: 4426 4427
							Client.mapIcons[Client.mapIconCount] = class78.WorldMapElement_get(var10).getSpriteBool(false); // L: 4430
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 4431
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 4432
							++Client.mapIconCount; // L: 4433
						}
					}
				}
			}

			class19.rasterProvider.apply(); // L: 4438
		}

	} // L: 4441
}
