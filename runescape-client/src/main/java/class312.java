import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public class class312 {
	@ObfuscatedName("c")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("p")
	int[] field3909;
	@ObfuscatedName("m")
	int[] field3910;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -895131131
	)
	int field3911;

	public class312() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3909 = new int[2048];
		this.field3910 = new int[2048];
		this.field3911 = 0;
		class111.field1348 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class338.method6256((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			class111.field1348[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class111.field1348.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class338.method6256((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class111.field1348.length; ++var1) {
				class111.field1348[var1] = var5;
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	void method5803(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = Canvas.method408((double)(var8 - 0) / var4) / var4;
			var7[var9] = var20;
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var11] * var14[var12] / var15));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "-904544036"
	)
	SpritePixels method5797(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5803(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public final void method5806(int var1, int var2) {
		if (this.field3911 < this.field3909.length) {
			this.field3909[this.field3911] = var1;
			this.field3910[this.field3911] = var2;
			++this.field3911;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	public final void method5795() {
		this.field3911 = 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILpl;FB)V",
		garbageValue = "-56"
	)
	public final void method5800(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method5797(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3911; ++var10) {
			var11 = this.field3909[var10];
			var12 = this.field3910[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6578(var8, var9);
			this.method5801(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > class111.field1348.length) {
						var11 = class111.field1348.length;
					}

					var12 = class111.field1348[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Lme;I)V",
		garbageValue = "-1046616793"
	)
	void method5801(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "586952329"
	)
	static int method5810(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIS)V",
		garbageValue = "-25379"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var8 * var4 + var5 * var7 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = var9 + class340.localPlayer.x >> 7;
					int var12 = class340.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2860, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method7493(var12 + TileItem.baseY);
					var13.packetBuffer.method7349(var11 + class131.baseX);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class340.localPlayer.x);
					var13.packetBuffer.writeShort(class340.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
