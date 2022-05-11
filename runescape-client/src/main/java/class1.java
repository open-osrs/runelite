import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class1 implements Callable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	static ClanChannel field2;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	final Buffer field1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class3 field3;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;Lpx;Lk;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field3 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field3.vmethod19(this.field1); // L: 54
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "1539440730"
	)
	public static VarbitComposition method9(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 28
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 30
			var1 = new VarbitComposition(); // L: 31
			if (var2 != null) { // L: 32
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 33
			return var1; // L: 34
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)V",
		garbageValue = "-285491852"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset; // L: 71
		Players.Players_pendingUpdateCount = 0; // L: 72
		int var3 = 0; // L: 74
		var0.importIndex(); // L: 75

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 76
			var7 = Players.Players_indices[var4]; // L: 77
			if ((Players.field1301[var7] & 1) == 0) { // L: 78
				if (var3 > 0) { // L: 79
					--var3; // L: 80
					var10000 = Players.field1301; // L: 81
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1); // L: 84
					if (var6 == 0) { // L: 85
						var3 = class18.method249(var0); // L: 86
						var10000 = Players.field1301; // L: 87
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class230.readPlayerUpdate(var0, var7); // L: 90
					}
				}
			}
		}

		var0.exportIndex(); // L: 93
		if (var3 != 0) { // L: 94
			throw new RuntimeException(); // L: 95
		} else {
			var0.importIndex(); // L: 97

			for (var4 = 0; var4 < Players.Players_count; ++var4) { // L: 98
				var7 = Players.Players_indices[var4]; // L: 99
				if ((Players.field1301[var7] & 1) != 0) { // L: 100
					if (var3 > 0) { // L: 101
						--var3; // L: 102
						var10000 = Players.field1301; // L: 103
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1); // L: 106
						if (var6 == 0) { // L: 107
							var3 = class18.method249(var0); // L: 108
							var10000 = Players.field1301; // L: 109
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class230.readPlayerUpdate(var0, var7); // L: 112
						}
					}
				}
			}

			var0.exportIndex(); // L: 115
			if (var3 != 0) { // L: 116
				throw new RuntimeException(); // L: 117
			} else {
				var0.importIndex(); // L: 119

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 120
					var7 = Players.Players_emptyIndices[var4]; // L: 121
					if ((Players.field1301[var7] & 1) != 0) { // L: 122
						if (var3 > 0) { // L: 123
							--var3; // L: 124
							var10000 = Players.field1301; // L: 125
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1); // L: 128
							if (var6 == 0) { // L: 129
								var3 = class18.method249(var0); // L: 130
								var10000 = Players.field1301; // L: 131
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (FloorUnderlayDefinition.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1301; // L: 134
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 137
				if (var3 != 0) { // L: 138
					throw new RuntimeException(); // L: 139
				} else {
					var0.importIndex(); // L: 141

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) { // L: 142
						var7 = Players.Players_emptyIndices[var4]; // L: 143
						if ((Players.field1301[var7] & 1) == 0) { // L: 144
							if (var3 > 0) { // L: 145
								--var3; // L: 146
								var10000 = Players.field1301; // L: 147
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1); // L: 150
								if (var6 == 0) { // L: 151
									var3 = class18.method249(var0); // L: 152
									var10000 = Players.field1301; // L: 153
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (FloorUnderlayDefinition.updateExternalPlayer(var0, var7)) { // L: 156
									var10000 = Players.field1301;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 159
					if (var3 != 0) { // L: 160
						throw new RuntimeException(); // L: 161
					} else {
						Players.Players_count = 0; // L: 163
						Players.Players_emptyIdxCount = 0; // L: 164

						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) { // L: 165
							var10000 = Players.field1301; // L: 166
							var10000[var4] = (byte)(var10000[var4] >> 1);
							var5 = Client.players[var4]; // L: 167
							if (var5 != null) { // L: 168
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4; // L: 169
							}
						}

						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) { // L: 173
							var4 = Players.Players_pendingUpdateIndices[var3]; // L: 174
							var5 = Client.players[var4]; // L: 175
							var6 = var0.readUnsignedByte(); // L: 176
							if ((var6 & 2) != 0) { // L: 177
								var6 += var0.readUnsignedByte() << 8;
							}

							GrandExchangeOfferNameComparator.method5786(var0, var4, var5, var6); // L: 178
						}

						if (var0.offset - var2 != var1) { // L: 181
							throw new RuntimeException(var0.offset - var2 + " " + var1); // L: 182
						}
					}
				}
			}
		}
	} // L: 184

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	public static int method12(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1026103514"
	)
	static final void method11() {
		int var0 = Players.field1317 * 128 + 64; // L: 3977
		int var1 = TileItem.field1292 * 128 + 64; // L: 3978
		int var2 = class202.getTileHeight(var0, var1, class128.Client_plane) - WorldMapSection1.field2898; // L: 3979
		class422.method7303(var0, var2, var1); // L: 3980
		var0 = class267.field3206 * 128 + 64; // L: 3981
		var1 = AbstractWorldMapData.field2851 * 128 + 64; // L: 3982
		var2 = class202.getTileHeight(var0, var1, class128.Client_plane) - ScriptFrame.field457; // L: 3983
		int var3 = var0 - class343.cameraX; // L: 3984
		int var4 = var2 - class295.cameraY; // L: 3985
		int var5 = var1 - FaceNormal.cameraZ; // L: 3986
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 3987
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 3988
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 3989
		class241.method4813(var7, var8); // L: 3990
	} // L: 3991
}
