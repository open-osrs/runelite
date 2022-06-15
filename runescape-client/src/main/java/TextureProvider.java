import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1240613953
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 131497903
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("j")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2025819025
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque(); // L: 9
		this.remaining = 0; // L: 11
		this.brightness = 1.0D; // L: 12
		this.textureSize = 128; // L: 13
		this.archive = var2; // L: 17
		this.capacity = var3; // L: 18
		this.remaining = this.capacity; // L: 19
		this.brightness = var4; // L: 20
		this.textureSize = var6; // L: 21
		int[] var7 = var1.getGroupFileIds(0); // L: 22
		int var8 = var7.length; // L: 23
		this.textures = new Texture[var1.getGroupFileCount(0)]; // L: 24

		for (int var9 = 0; var9 < var8; ++var9) { // L: 25
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9])); // L: 26
			this.textures[var7[var9]] = new Texture(var10); // L: 27
		}

	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0; // L: 32
		int var2 = 0; // L: 33
		Texture[] var3 = this.textures; // L: 35

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 36
			Texture var5 = var3[var4]; // L: 37
			if (var5 != null && var5.fileIds != null) { // L: 39
				var1 += var5.fileIds.length; // L: 40
				int[] var6 = var5.fileIds; // L: 42

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 43
					int var8 = var6[var7]; // L: 44
					if (this.archive.method5849(var8)) { // L: 46
						++var2; // L: 47
					}
				}
			}
		}

		if (var1 == 0) { // L: 55
			return 0;
		} else {
			return var2 * 100 / var1; // L: 56
		}
	}

	@ObfuscatedName("v")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1; // L: 60
		this.clear(); // L: 61
	} // L: 62

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "24"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1]; // L: 65
		if (var2 != null) { // L: 66
			if (var2.pixels != null) { // L: 67
				this.deque.addLast(var2); // L: 68
				var2.isLoaded = true; // L: 69
				return var2.pixels; // L: 70
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive); // L: 72
			if (var3) { // L: 73
				if (this.remaining == 0) { // L: 74
					Texture var4 = (Texture)this.deque.removeFirst(); // L: 75
					var4.reset(); // L: 76
				} else {
					--this.remaining; // L: 78
				}

				this.deque.addLast(var2); // L: 79
				var2.isLoaded = true; // L: 80
				return var2.pixels; // L: 81
			}
		}

		return null; // L: 84
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-3917"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0; // L: 88 89
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-52"
	)
	public boolean vmethod4538(int var1) {
		return this.textures[var1].field2293; // L: 93
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1596996574"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64; // L: 97
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "586737024"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) { // L: 101
			if (this.textures[var1] != null) { // L: 102
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque(); // L: 104
		this.remaining = this.capacity; // L: 105
	} // L: 106

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-924908553"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) { // L: 109
			Texture var3 = this.textures[var2]; // L: 110
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) { // L: 111
				var3.animate(var1); // L: 112
				var3.isLoaded = false; // L: 113
			}
		}

	} // L: 116

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-18765802"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ScriptFrame.getWidgetChild(var1, var2); // L: 9595
		if (var5 != null) { // L: 9596
			if (var5.onOp != null) { // L: 9597
				ScriptEvent var6 = new ScriptEvent(); // L: 9598
				var6.widget = var5; // L: 9599
				var6.opIndex = var0; // L: 9600
				var6.targetName = var4; // L: 9601
				var6.args = var5.onOp; // L: 9602
				BoundaryObject.runScriptEvent(var6); // L: 9603
			}

			boolean var11 = true; // L: 9605
			if (var5.contentType > 0) { // L: 9606
				var11 = Message.method1065(var5);
			}

			if (var11) { // L: 9607
				int var8 = class124.getWidgetFlags(var5); // L: 9609
				int var9 = var0 - 1; // L: 9610
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 9612
				if (var7) { // L: 9614
					PacketBufferNode var10;
					if (var0 == 1) { // L: 9617
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher); // L: 9619
						var10.packetBuffer.writeInt(var1); // L: 9620
						var10.packetBuffer.writeShort(var2); // L: 9621
						var10.packetBuffer.writeShort(var3); // L: 9622
						Client.packetWriter.addNode(var10); // L: 9623
					}

					if (var0 == 2) { // L: 9625
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher); // L: 9627
						var10.packetBuffer.writeInt(var1); // L: 9628
						var10.packetBuffer.writeShort(var2); // L: 9629
						var10.packetBuffer.writeShort(var3); // L: 9630
						Client.packetWriter.addNode(var10); // L: 9631
					}

					if (var0 == 3) { // L: 9633
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher); // L: 9635
						var10.packetBuffer.writeInt(var1); // L: 9636
						var10.packetBuffer.writeShort(var2); // L: 9637
						var10.packetBuffer.writeShort(var3); // L: 9638
						Client.packetWriter.addNode(var10); // L: 9639
					}

					if (var0 == 4) { // L: 9641
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher); // L: 9643
						var10.packetBuffer.writeInt(var1); // L: 9644
						var10.packetBuffer.writeShort(var2); // L: 9645
						var10.packetBuffer.writeShort(var3); // L: 9646
						Client.packetWriter.addNode(var10); // L: 9647
					}

					if (var0 == 5) { // L: 9649
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher); // L: 9651
						var10.packetBuffer.writeInt(var1); // L: 9652
						var10.packetBuffer.writeShort(var2); // L: 9653
						var10.packetBuffer.writeShort(var3); // L: 9654
						Client.packetWriter.addNode(var10); // L: 9655
					}

					if (var0 == 6) { // L: 9657
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 9659
						var10.packetBuffer.writeInt(var1); // L: 9660
						var10.packetBuffer.writeShort(var2); // L: 9661
						var10.packetBuffer.writeShort(var3); // L: 9662
						Client.packetWriter.addNode(var10); // L: 9663
					}

					if (var0 == 7) { // L: 9665
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher); // L: 9667
						var10.packetBuffer.writeInt(var1); // L: 9668
						var10.packetBuffer.writeShort(var2); // L: 9669
						var10.packetBuffer.writeShort(var3); // L: 9670
						Client.packetWriter.addNode(var10); // L: 9671
					}

					if (var0 == 8) { // L: 9673
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher); // L: 9675
						var10.packetBuffer.writeInt(var1); // L: 9676
						var10.packetBuffer.writeShort(var2); // L: 9677
						var10.packetBuffer.writeShort(var3); // L: 9678
						Client.packetWriter.addNode(var10); // L: 9679
					}

					if (var0 == 9) { // L: 9681
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 9683
						var10.packetBuffer.writeInt(var1); // L: 9684
						var10.packetBuffer.writeShort(var2); // L: 9685
						var10.packetBuffer.writeShort(var3); // L: 9686
						Client.packetWriter.addNode(var10); // L: 9687
					}

					if (var0 == 10) { // L: 9689
						var10 = EnumComposition.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 9691
						var10.packetBuffer.writeInt(var1); // L: 9692
						var10.packetBuffer.writeShort(var2); // L: 9693
						var10.packetBuffer.writeShort(var3); // L: 9694
						Client.packetWriter.addNode(var10); // L: 9695
					}

				}
			}
		}
	} // L: 9615 9697
}
