import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class247 {
	@ObfuscatedName("a")
	static int[] field3220;
	@ObfuscatedName("m")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("q")
	int[] field3218;
	@ObfuscatedName("j")
	int[] field3222;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1283374259
	)
	int field3219;

	public class247() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field3218 = new int[2048];
		this.field3222 = new int[2048];
		this.field3219 = 0;
		MouseHandler.method1154();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-170659377"
	)
	void method4486(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = MouseRecorder.method1248(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(256.0D * (var3[var8] * var3[var9] / var4));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		Sprite var11 = new Sprite(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)Llz;",
		garbageValue = "-1626397648"
	)
	Sprite method4487(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method4486(var1);
		}

		return (Sprite)this.spriteMap.get(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1291742689"
	)
	public final void method4504(int var1, int var2) {
		if (this.field3219 < this.field3218.length) {
			this.field3218[this.field3219] = var1;
			this.field3222[this.field3219] = var2;
			++this.field3219;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2033439477"
	)
	public final void method4489() {
		this.field3219 = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(IILlz;FI)V",
		garbageValue = "-2127559947"
	)
	public final void method4490(int var1, int var2, Sprite var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		Sprite var6 = this.method4487(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3219; ++var10) {
			var11 = this.field3218[var10];
			var12 = this.field3222[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6202(var8, var9);
			this.method4512(var6, var3, var9);
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
					if (var11 > field3220.length) {
						var11 = field3220.length;
					}

					var12 = field3220[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Llz;Llz;Llv;B)V",
		garbageValue = "-113"
	)
	void method4512(Sprite var1, Sprite var2, Bounds var3) {
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Lil;",
		garbageValue = "-125199916"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1527669385"
	)
	static final void method4496() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				TaskHandler.updateActorSequence(var2, var2.definition.size);
			}
		}

	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		signature = "(IIIILjava/lang/String;I)V",
		garbageValue = "-870187769"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = WorldMapLabelSize.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				InterfaceParent.runScriptEvent(var6);
			}

			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = MilliClock.method3586(var5);
			}

			if (var11) {
				int var8 = KeyHandler.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = (var8 >> var9 + 1 & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 2) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 3) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2275, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 4) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2332, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 5) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 6) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 7) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2303, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 8) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2264, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 9) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 10) {
						var10 = UserComparator4.getPacketBufferNode(ClientPacket.field2245, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

				}
			}
		}
	}
}
