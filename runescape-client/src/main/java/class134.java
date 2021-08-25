import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class134 extends class116 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1400384309
	)
	int field1504;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 986864169
	)
	int field1505;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class134(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1504 = var1.readInt();
		this.field1505 = var1.readInt();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2568(this.field1504, this.field1505);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfk;I)V",
		garbageValue = "1098650008"
	)
	static final void method2665(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0);

		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var15 = var2 + MilliClock.method2795(var11 & 7, var12 & 7, var7);
						int var18 = var11 & 7;
						int var19 = var12 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}

						StructComposition.loadTerrain(var21, var1, var15, var3 + var17, 0, 0, var7);
					} else {
						StructComposition.loadTerrain(var21, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-2109357205"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field3717 != 0 && var3 > AbstractArchive.field3717) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field3717 == 0 || var4 <= AbstractArchive.field3717)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ZLoq;I)V",
		garbageValue = "637231009"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field495 = 0;
		Client.field560 = 0;
		GameObject.method4496();
		Huffman.method5011(var0, var1);
		AttackOption.method2255(var1);

		int var2;
		for (var2 = 0; var2 < Client.field495; ++var2) {
			int var3 = Client.field610[var2];
			if (Client.npcs[var3].npcCycle != Client.cycle) {
				Client.npcs[var3].definition = null;
				Client.npcs[var3] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}

		}
	}
}
