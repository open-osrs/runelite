import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -131170417
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1256735251
	)
	final int field2208;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 624849635
	)
	final int field2215;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1061569375
	)
	final int field2210;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2208 = var1; // L: 19
		this.field2215 = var2; // L: 20
		this.field2210 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "89"
	)
	boolean method3902(float var1) {
		return var1 >= (float)this.field2210; // L: 25
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lgp;",
		garbageValue = "10456859"
	)
	static WorldMapLabelSize[] method3901() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_medium, WorldMapLabelSize_large}; // L: 15
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-697751860"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 131
		int var2 = 0; // L: 132

		for (int var3 = 0; var3 < var1; ++var3) { // L: 133
			var2 = (var2 << 5) - var2 + class327.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 134
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2017129698"
	)
	static final void method3903(String var0, int var1) {
		PacketBufferNode var2 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher); // L: 214
		var2.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 215
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 216
		var2.packetBuffer.method7804(var1); // L: 217
		Client.packetWriter.addNode(var2); // L: 218
	} // L: 219

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-40"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ItemComposition.getWidgetChild(var1, var2); // L: 9688
		if (var5 != null) { // L: 9689
			if (var5.onOp != null) { // L: 9690
				ScriptEvent var6 = new ScriptEvent(); // L: 9691
				var6.widget = var5; // L: 9692
				var6.opIndex = var0; // L: 9693
				var6.targetName = var4; // L: 9694
				var6.args = var5.onOp; // L: 9695
				ClanSettings.runScriptEvent(var6); // L: 9696
			}

			boolean var11 = true; // L: 9698
			if (var5.contentType > 0) { // L: 9699
				var11 = ModeWhere.method6100(var5);
			}

			if (var11) { // L: 9700
				int var8 = class326.getWidgetFlags(var5); // L: 9702
				int var9 = var0 - 1; // L: 9703
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9705
				if (var7) { // L: 9707
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9710
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2908, Client.packetWriter.isaacCipher); // L: 9712
						var10.packetBuffer.writeInt(var1); // L: 9713
						var10.packetBuffer.writeShort(var2); // L: 9714
						var10.packetBuffer.writeShort(var3); // L: 9715
						Client.packetWriter.addNode(var10); // L: 9716
					}

					if (var0 == 2) { // L: 9718
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher); // L: 9720
						var10.packetBuffer.writeInt(var1); // L: 9721
						var10.packetBuffer.writeShort(var2); // L: 9722
						var10.packetBuffer.writeShort(var3); // L: 9723
						Client.packetWriter.addNode(var10); // L: 9724
					}

					if (var0 == 3) { // L: 9726
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher); // L: 9728
						var10.packetBuffer.writeInt(var1); // L: 9729
						var10.packetBuffer.writeShort(var2); // L: 9730
						var10.packetBuffer.writeShort(var3); // L: 9731
						Client.packetWriter.addNode(var10); // L: 9732
					}

					if (var0 == 4) { // L: 9734
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2966, Client.packetWriter.isaacCipher); // L: 9736
						var10.packetBuffer.writeInt(var1); // L: 9737
						var10.packetBuffer.writeShort(var2); // L: 9738
						var10.packetBuffer.writeShort(var3); // L: 9739
						Client.packetWriter.addNode(var10); // L: 9740
					}

					if (var0 == 5) { // L: 9742
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher); // L: 9744
						var10.packetBuffer.writeInt(var1); // L: 9745
						var10.packetBuffer.writeShort(var2); // L: 9746
						var10.packetBuffer.writeShort(var3); // L: 9747
						Client.packetWriter.addNode(var10); // L: 9748
					}

					if (var0 == 6) { // L: 9750
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher); // L: 9752
						var10.packetBuffer.writeInt(var1); // L: 9753
						var10.packetBuffer.writeShort(var2); // L: 9754
						var10.packetBuffer.writeShort(var3); // L: 9755
						Client.packetWriter.addNode(var10); // L: 9756
					}

					if (var0 == 7) { // L: 9758
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher); // L: 9760
						var10.packetBuffer.writeInt(var1); // L: 9761
						var10.packetBuffer.writeShort(var2); // L: 9762
						var10.packetBuffer.writeShort(var3); // L: 9763
						Client.packetWriter.addNode(var10); // L: 9764
					}

					if (var0 == 8) { // L: 9766
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 9768
						var10.packetBuffer.writeInt(var1); // L: 9769
						var10.packetBuffer.writeShort(var2); // L: 9770
						var10.packetBuffer.writeShort(var3); // L: 9771
						Client.packetWriter.addNode(var10); // L: 9772
					}

					if (var0 == 9) { // L: 9774
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher); // L: 9776
						var10.packetBuffer.writeInt(var1); // L: 9777
						var10.packetBuffer.writeShort(var2); // L: 9778
						var10.packetBuffer.writeShort(var3); // L: 9779
						Client.packetWriter.addNode(var10); // L: 9780
					}

					if (var0 == 10) { // L: 9782
						var10 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher); // L: 9784
						var10.packetBuffer.writeInt(var1); // L: 9785
						var10.packetBuffer.writeShort(var2); // L: 9786
						var10.packetBuffer.writeShort(var3); // L: 9787
						Client.packetWriter.addNode(var10); // L: 9788
					}

				}
			}
		}
	} // L: 9708 9790
}
