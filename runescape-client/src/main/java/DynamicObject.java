import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("DynamicObject")
public class DynamicObject extends Entity {
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = 2126595663
	)
	static int field1316;
	@ObfuscatedName("b")
	public static String[] field1318;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -517336583
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1717972659
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 345674945
	)
	@Export("type")
	int type;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 92935987
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1741952123
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 433284603
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 189208991
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1563491791
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -542544735
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLer;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = ParamDefinition.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field3548 == 0 && var9 != null && var9 instanceof DynamicObject) {
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
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

		ObjectDefinition var12 = WorldMapDecoration.getObjectDefinition(this.id);
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
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BB)Laq;",
		garbageValue = "92"
	)
	static WorldMapSprite method2300(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(WorldMapSection0.convertJpgToSprite(var0).pixels);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1772389683"
	)
	static int method2304() {
		return 12;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "-35"
	)
	public static int method2305(byte[] var0, int var1) {
		return WorldMapRectangle.method334(var0, 0, var1);
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1991750086"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ItemContainer.getPacketBufferNode(ClientPacket.field2266, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeInt(var0);
		var2.packetBuffer.writeShort(var1);
		Client.packetWriter.addNode(var2);
	}
}
