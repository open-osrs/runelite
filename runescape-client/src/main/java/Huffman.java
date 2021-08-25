import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("a")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("n")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("c")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("m")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length;
		this.masks = new int[var2];
		this.bits = var1;
		int[] var3 = new int[33];
		this.keys = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			byte var6 = var1[var5];
			if (var6 != 0) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.masks[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;

					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}

						var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (var10 = var6 + 1; var10 <= 32; ++var10) {
					if (var8 == var3[var10]) {
						var3[var10] = var9;
					}
				}

				var10 = 0;

				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (this.keys[var10] == 0) {
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10];
					} else {
						++var10;
					}

					if (var10 >= this.keys.length) {
						int[] var13 = new int[this.keys.length * 2];

						for (int var14 = 0; var14 < this.keys.length; ++var14) {
							var13[var14] = this.keys[var14];
						}

						this.keys = var13;
					}

					var12 >>>= 1;
				}

				this.keys[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BII[BII)I",
		garbageValue = "743911469"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			int var13 = (var12 + var10 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = (byte)(var6 |= var9 >>> var12);
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I",
		garbageValue = "141033837"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 64) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 16) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 1) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				++var7;
			}

			return var7 + 1 - var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljc;B)V",
		garbageValue = "-78"
	)
	public static void method5007(Huffman var0) {
		class264.huffman = var0;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(ZLoq;I)V",
		garbageValue = "-1535090949"
	)
	static final void method5011(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				int var2 = var1.readBits(15);
				if (var2 != 32767) {
					boolean var3 = false;
					if (Client.npcs[var2] == null) {
						Client.npcs[var2] = new NPC();
						var3 = true;
					}

					NPC var4 = Client.npcs[var2];
					Client.npcIndices[++Client.npcCount - 1] = var2;
					var4.npcCycle = Client.cycle;
					int var6;
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					int var8 = Client.defaultRotations[var1.readBits(3)];
					if (var3) {
						var4.orientation = var4.rotation = var8;
					}

					int var5 = var1.readBits(1);
					int var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field533[++Client.field560 - 1] = var2;
					}

					int var7;
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					var4.definition = ScriptEvent.getNpcDefinition(var1.readBits(14));
					boolean var10 = var1.readBits(1) == 1;
					if (var10) {
						var1.readBits(32);
					}

					var4.field1137 = var4.definition.size;
					var4.field1146 = var4.definition.rotation;
					if (var4.field1146 == 0) {
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence;
					var4.walkBackSequence = var4.definition.walkBackSequence;
					var4.walkLeftSequence = var4.definition.walkLeftSequence;
					var4.walkRightSequence = var4.definition.walkRightSequence;
					var4.idleSequence = var4.definition.idleSequence;
					var4.turnLeftSequence = var4.definition.turnLeftSequence;
					var4.turnRightSequence = var4.definition.turnRightSequence;
					var4.method2224(class129.localPlayer.pathX[0] + var6, class129.localPlayer.pathY[0] + var7, var5 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
