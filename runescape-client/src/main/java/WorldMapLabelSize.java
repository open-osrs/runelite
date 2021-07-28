import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1627067465
	)
	final int field1918;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1595583091
	)
	final int field1919;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 660625401
	)
	final int field1920;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field1918 = var1;
		this.field1919 = var2;
		this.field1920 = var3;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1014095385"
	)
	boolean method3231(float var1) {
		return var1 >= (float)this.field1920;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfi;",
		garbageValue = "1"
	)
	static WorldMapLabelSize[] method3237() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfi;",
		garbageValue = "-1751099573"
	)
	static WorldMapLabelSize method3232(int var0) {
		WorldMapLabelSize[] var1 = method3237();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field1919) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "47989270"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field624 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (MusicPatch.getWindowedMode() == 1) {
			Script.client.setMaxCanvasSize(765, 503);
		} else {
			Script.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			PacketBufferNode var1 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(MusicPatch.getWindowedMode());
			var1.packetBuffer.writeShort(MouseRecorder.canvasWidth);
			var1.packetBuffer.writeShort(Client.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
