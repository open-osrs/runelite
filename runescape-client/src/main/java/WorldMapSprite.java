import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("q")
	static int[][] field257;
	@ObfuscatedName("l")
	public static short[][] field259;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static Widget field260;
	@ObfuscatedName("v")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-36950090"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 19
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgd;Lmw;S)Lgk;",
		garbageValue = "22306"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20); // L: 35
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lef;IIII)Z",
		garbageValue = "1577408669"
	)
	static final boolean method498(Model var0, int var1, int var2, int var3) {
		boolean var4 = ViewportMouse.ViewportMouse_isInViewport; // L: 112
		if (!var4) { // L: 114
			return false;
		} else {
			int var5;
			int var6;
			int var7;
			int var8;
			int var11;
			int var12;
			int var13;
			int var16;
			int var17;
			if (!ViewportMouse.ViewportMouse_false0) { // L: 116
				var5 = Scene.Scene_cameraPitchSine; // L: 117
				var6 = Scene.Scene_cameraPitchCosine; // L: 118
				var7 = Scene.Scene_cameraYawSine; // L: 119
				var8 = Scene.Scene_cameraYawCosine; // L: 120
				byte var9 = 50; // L: 121
				short var10 = 3500; // L: 122
				var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var9 / Rasterizer3D.Rasterizer3D_zoom; // L: 123
				var12 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var9 / Rasterizer3D.Rasterizer3D_zoom; // L: 124
				var13 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var10 / Rasterizer3D.Rasterizer3D_zoom; // L: 125
				int var14 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var10 / Rasterizer3D.Rasterizer3D_zoom; // L: 126
				int var15 = Rasterizer3D.method3188(var12, var9, var6, var5); // L: 128
				var16 = Rasterizer3D.method3189(var12, var9, var6, var5); // L: 129
				var12 = var15; // L: 130
				var15 = Rasterizer3D.method3188(var14, var10, var6, var5); // L: 131
				var17 = Rasterizer3D.method3189(var14, var10, var6, var5); // L: 132
				var14 = var15; // L: 133
				var15 = Rasterizer3D.method3186(var11, var16, var8, var7); // L: 134
				var16 = Rasterizer3D.method3187(var11, var16, var8, var7); // L: 135
				var11 = var15; // L: 136
				var15 = Rasterizer3D.method3186(var13, var17, var8, var7); // L: 137
				var17 = Rasterizer3D.method3187(var13, var17, var8, var7); // L: 138
				ViewportMouse.field1757 = (var15 + var11) / 2; // L: 140
				class8.field45 = (var14 + var12) / 2; // L: 141
				class39.field288 = (var16 + var17) / 2; // L: 142
				ViewportMouse.field1758 = (var15 - var11) / 2; // L: 143
				ViewportMouse.field1759 = (var14 - var12) / 2; // L: 144
				class25.field146 = (var17 - var16) / 2; // L: 145
				MusicPatchPcmStream.field2516 = Math.abs(ViewportMouse.field1758); // L: 146
				class7.field35 = Math.abs(ViewportMouse.field1759); // L: 147
				DynamicObject.field1311 = Math.abs(class25.field146); // L: 148
			}

			var5 = var0.xMid + var1; // L: 150
			var6 = var2 + var0.yMid; // L: 151
			var7 = var3 + var0.zMid; // L: 152
			var8 = var0.xMidOffset; // L: 153
			var16 = var0.yMidOffset; // L: 154
			var17 = var0.zMidOffset; // L: 155
			var11 = ViewportMouse.field1757 - var5; // L: 156
			var12 = class8.field45 - var6; // L: 157
			var13 = class39.field288 - var7; // L: 158
			if (Math.abs(var11) > var8 + MusicPatchPcmStream.field2516) { // L: 159
				return false; // L: 160
			} else if (Math.abs(var12) > var16 + class7.field35) { // L: 162
				return false; // L: 163
			} else if (Math.abs(var13) > var17 + DynamicObject.field1311) { // L: 165
				return false; // L: 166
			} else if (Math.abs(var13 * ViewportMouse.field1759 - var12 * class25.field146) > var16 * DynamicObject.field1311 + var17 * class7.field35) { // L: 168
				return false; // L: 169
			} else if (Math.abs(var11 * class25.field146 - var13 * ViewportMouse.field1758) > var8 * DynamicObject.field1311 + var17 * MusicPatchPcmStream.field2516) { // L: 171
				return false; // L: 172
			} else {
				return Math.abs(var12 * ViewportMouse.field1758 - var11 * ViewportMouse.field1759) <= var8 * class7.field35 + var16 * MusicPatchPcmStream.field2516; // L: 174
			}
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1984621095"
	)
	static void method496(int var0) {
		Client.oculusOrbState = var0; // L: 11620
	} // L: 11621
}
