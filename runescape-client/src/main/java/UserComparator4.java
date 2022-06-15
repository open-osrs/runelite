import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)I",
		garbageValue = "-8"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(ZLpq;I)V",
		garbageValue = "1468501785"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field615 = 0; // L: 7895
		Client.field538 = 0; // L: 7896
		GrandExchangeOfferUnitPriceComparator.method6024(); // L: 7897

		int var2;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7900
			var2 = var1.readBits(15); // L: 7901
			if (var2 == 32767) { // L: 7902
				break;
			}

			boolean var3 = false; // L: 7903
			if (Client.npcs[var2] == null) { // L: 7904
				Client.npcs[var2] = new NPC(); // L: 7905
				var3 = true; // L: 7906
			}

			NPC var4 = Client.npcs[var2]; // L: 7908
			Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7909
			var4.npcCycle = Client.cycle; // L: 7910
			int var5;
			int var6;
			int var7;
			int var10;
			if (class101.field1366) { // L: 7914
				if (var0) { // L: 7915
					var6 = var1.readBits(8); // L: 7916
					if (var6 > 127) { // L: 7917
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5); // L: 7920
					if (var6 > 15) { // L: 7921
						var6 -= 32;
					}
				}

				boolean var8 = var1.readBits(1) == 1; // L: 7923
				if (var8) { // L: 7924
					var1.readBits(32); // L: 7925
				}

				var5 = var1.readBits(1); // L: 7927
				int var9 = Client.defaultRotations[var1.readBits(3)]; // L: 7928
				if (var3) { // L: 7929
					var4.orientation = var4.rotation = var9;
				}

				if (var0) { // L: 7930
					var7 = var1.readBits(8); // L: 7931
					if (var7 > 127) { // L: 7932
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5); // L: 7935
					if (var7 > 15) { // L: 7936
						var7 -= 32;
					}
				}

				var10 = var1.readBits(1); // L: 7938
				if (var10 == 1) { // L: 7939
					Client.field539[++Client.field538 - 1] = var2;
				}

				var4.definition = BuddyRankComparator.getNpcDefinition(var1.readBits(14)); // L: 7940
			} else {
				int var12 = Client.defaultRotations[var1.readBits(3)]; // L: 7943
				if (var3) { // L: 7944
					var4.orientation = var4.rotation = var12;
				}

				if (var0) { // L: 7945
					var6 = var1.readBits(8); // L: 7946
					if (var6 > 127) { // L: 7947
						var6 -= 256;
					}
				} else {
					var6 = var1.readBits(5); // L: 7950
					if (var6 > 15) { // L: 7951
						var6 -= 32;
					}
				}

				boolean var13 = var1.readBits(1) == 1; // L: 7953
				if (var13) { // L: 7954
					var1.readBits(32); // L: 7955
				}

				if (var0) { // L: 7957
					var7 = var1.readBits(8); // L: 7958
					if (var7 > 127) { // L: 7959
						var7 -= 256;
					}
				} else {
					var7 = var1.readBits(5); // L: 7962
					if (var7 > 15) { // L: 7963
						var7 -= 32;
					}
				}

				var5 = var1.readBits(1); // L: 7965
				var10 = var1.readBits(1); // L: 7966
				if (var10 == 1) { // L: 7967
					Client.field539[++Client.field538 - 1] = var2;
				}

				var4.definition = BuddyRankComparator.getNpcDefinition(var1.readBits(14)); // L: 7968
			}

			var4.field1205 = var4.definition.size; // L: 7970
			var4.field1129 = var4.definition.rotation; // L: 7971
			if (var4.field1129 == 0) { // L: 7972
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence; // L: 7973
			var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7974
			var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7975
			var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7976
			var4.idleSequence = var4.definition.idleSequence; // L: 7977
			var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7978
			var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7979
			var4.runSequence = var4.definition.field1931; // L: 7980
			var4.field1180 = var4.definition.field1944; // L: 7981
			var4.field1144 = var4.definition.field1932; // L: 7982
			var4.field1145 = var4.definition.field1933; // L: 7983
			var4.field1155 = var4.definition.field1934; // L: 7984
			var4.field1179 = var4.definition.field1935; // L: 7985
			var4.field1137 = var4.definition.field1936; // L: 7986
			var4.field1149 = var4.definition.field1930; // L: 7987
			var4.method2362(class101.localPlayer.pathX[0] + var6, class101.localPlayer.pathY[0] + var7, var5 == 1); // L: 7988
		}

		var1.exportIndex(); // L: 7990
		SoundCache.method765(var1); // L: 7992

		for (var2 = 0; var2 < Client.field615; ++var2) { // L: 7993
			int var11 = Client.field616[var2]; // L: 7994
			if (Client.npcs[var11].npcCycle != Client.cycle) { // L: 7995
				Client.npcs[var11].definition = null; // L: 7996
				Client.npcs[var11] = null; // L: 7997
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8000
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8001
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8002
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8003
				}
			}

		}
	} // L: 8006
}
