import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 5117713
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -412707653
	)
	@Export("type")
	int type;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 482248501
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 831891069
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1304906077
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 445952397
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1173893765
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1768826999
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLhr;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = class17.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field1961 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (var10.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "18"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			label56: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
							break label56;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.sequenceDefinition = null;
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = HitSplatDefinition.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1870319643"
	)
	static void method1956() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1288 = null;
		Client.packetWriter.field1289 = null;
		Client.packetWriter.field1290 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1279 = 0;
		Client.rebootTimer = 0;
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		class129.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		CollisionMap.method3351();
		HealthBarUpdate.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field697[var0] = true;
		}

		class280.method5087();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1479639989"
	)
	static void method1955() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				class114.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
