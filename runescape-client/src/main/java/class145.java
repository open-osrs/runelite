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
		this.field1634 = var1.readUnsignedShort();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2863(this.field1634);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbn;",
		garbageValue = "1172830323"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? SpotAnimationDefinition.method3362(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field937 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "578120171"
	)
	static final void method2985() {
		if (class20.Client_plane != Client.field570) {
			Client.field570 = class20.Client_plane;
			int var0 = class20.Client_plane;
			int[] var1 = class29.sceneMinimapSprite.pixels;
			int var2 = var1.length;

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) {
				var4 = (103 - var3) * 2048 + 24628;

				for (var5 = 1; var5 < 103; ++var5) {
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
						class7.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						class7.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4;
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			class29.sceneMinimapSprite.setRaster();

			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
						class33.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
						class33.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0;

			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = class7.scene.getFloorDecorationTag(class20.Client_plane, var5, var6);
					if (var7 != 0L) {
						int var9 = PacketWriter.Entity_unpackID(var7);
						int var10 = class148.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0 && class78.WorldMapElement_get(var10).field1759) {
							Client.mapIcons[Client.mapIconCount] = class78.WorldMapElement_get(var10).getSpriteBool(false);
							Client.mapIconXs[Client.mapIconCount] = var5;
							Client.mapIconYs[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}

			class19.rasterProvider.apply();
		}

	}
}
