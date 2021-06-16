import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -560532763
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1091706599
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 973044997
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 950758231
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1091816693
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1250349999
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 238064293
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1153448059
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgr;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = WorldMapScaleHandler.SequenceDefinition_get(var7); // L: 27
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field1894 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 39
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 40
			}
		}

	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) { // L: 46
			int var1 = Client.cycle - this.cycleStart; // L: 47
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 48
				var1 = 100;
			}

			label56: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 49
							break label56;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 50
						++this.frame; // L: 51
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 52

					this.frame -= this.sequenceDefinition.frameCount; // L: 53
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 54

				this.sequenceDefinition = null; // L: 55
			}

			this.cycleStart = Client.cycle - var1; // L: 60
		}

		ObjectComposition var12 = Tiles.getObjectDefinition(this.id); // L: 62
		if (var12.transforms != null) { // L: 63
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 64
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 67
				var2 = var12.sizeX; // L: 72
				var3 = var12.sizeY; // L: 73
			} else {
				var2 = var12.sizeY; // L: 68
				var3 = var12.sizeX; // L: 69
			}

			int var4 = (var2 >> 1) + this.x; // L: 75
			int var5 = (var2 + 1 >> 1) + this.x; // L: 76
			int var6 = (var3 >> 1) + this.y; // L: 77
			int var7 = (var3 + 1 >> 1) + this.y; // L: 78
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 79
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2; // L: 80
			int var10 = (this.x << 7) + (var2 << 6); // L: 81
			int var11 = (this.y << 7) + (var3 << 6); // L: 82
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 83
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-593608457"
	)
	public static boolean method2103() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "17436"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 166
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1180457180"
	)
	static final void method2099(boolean var0) {
		class233.playPcmPlayers(); // L: 5702
		++Client.packetWriter.pendingWrites; // L: 5703
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5704
			Client.packetWriter.pendingWrites = 0; // L: 5705
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5706
				PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2647, Client.packetWriter.isaacCipher); // L: 5708
				Client.packetWriter.addNode(var1); // L: 5709

				try {
					Client.packetWriter.flush(); // L: 5711
				} catch (IOException var3) { // L: 5713
					Client.hadNetworkError = true; // L: 5714
				}
			}

		}
	} // L: 5717

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIZI)V",
		garbageValue = "466452320"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9951
			Widget var6 = var0[var5]; // L: 9952
			if (var6 != null && var6.parentId == var1) { // L: 9953 9954
				FontName.alignWidgetSize(var6, var2, var3, var4); // L: 9955
				class43.alignWidgetPosition(var6, var2, var3); // L: 9956
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9957
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9958
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 9959
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 9960
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9961
					WorldMapLabelSize.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9963
}
