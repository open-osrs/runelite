import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class150 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -714152859
	)
	int field1680;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -3879933819233761611L
	)
	long field1681;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class150(class129 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1680 = var1.readInt(); // L: 310
		this.field1681 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2869(this.field1680, this.field1681); // L: 315
	} // L: 316

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)V",
		garbageValue = "214617962"
	)
	static final void method3025(PacketBuffer var0) {
		int var1 = 0; // L: 81
		var0.importIndex(); // L: 82

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 83
			var5 = Players.Players_indices[var2]; // L: 84
			if ((Players.field1276[var5] & 1) == 0) { // L: 85
				if (var1 > 0) { // L: 86
					--var1; // L: 87
					var10000 = Players.field1276; // L: 88
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 91
					if (var4 == 0) { // L: 92
						var1 = class4.method15(var0); // L: 93
						var10000 = Players.field1276; // L: 94
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						ApproximateRouteStrategy.readPlayerUpdate(var0, var5); // L: 97
					}
				}
			}
		}

		var0.exportIndex(); // L: 100
		if (var1 != 0) { // L: 101
			throw new RuntimeException(); // L: 102
		} else {
			var0.importIndex(); // L: 104

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 105
				var5 = Players.Players_indices[var2]; // L: 106
				if ((Players.field1276[var5] & 1) != 0) { // L: 107
					if (var1 > 0) { // L: 108
						--var1; // L: 109
						var10000 = Players.field1276; // L: 110
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 113
						if (var4 == 0) { // L: 114
							var1 = class4.method15(var0); // L: 115
							var10000 = Players.field1276; // L: 116
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							ApproximateRouteStrategy.readPlayerUpdate(var0, var5); // L: 119
						}
					}
				}
			}

			var0.exportIndex(); // L: 122
			if (var1 != 0) { // L: 123
				throw new RuntimeException(); // L: 124
			} else {
				var0.importIndex(); // L: 126

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 127
					var5 = Players.Players_emptyIndices[var2]; // L: 128
					if ((Players.field1276[var5] & 1) != 0) { // L: 129
						if (var1 > 0) { // L: 130
							--var1; // L: 131
							var10000 = Players.field1276; // L: 132
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 135
							if (var4 == 0) { // L: 136
								var1 = class4.method15(var0); // L: 137
								var10000 = Players.field1276; // L: 138
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class16.updateExternalPlayer(var0, var5)) { // L: 141
								var10000 = Players.field1276;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 144
				if (var1 != 0) { // L: 145
					throw new RuntimeException(); // L: 146
				} else {
					var0.importIndex(); // L: 148

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 149
						var5 = Players.Players_emptyIndices[var2]; // L: 150
						if ((Players.field1276[var5] & 1) == 0) { // L: 151
							if (var1 > 0) { // L: 152
								--var1; // L: 153
								var10000 = Players.field1276; // L: 154
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 157
								if (var4 == 0) { // L: 158
									var1 = class4.method15(var0); // L: 159
									var10000 = Players.field1276; // L: 160
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class16.updateExternalPlayer(var0, var5)) { // L: 163
									var10000 = Players.field1276;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 166
					if (var1 != 0) { // L: 167
						throw new RuntimeException(); // L: 168
					} else {
						Players.Players_count = 0; // L: 170
						Players.Players_emptyIdxCount = 0; // L: 171

						for (var2 = 1; var2 < 2048; ++var2) { // L: 172
							var10000 = Players.field1276; // L: 173
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 174
							if (var3 != null) { // L: 175
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 176
							}
						}

					}
				}
			}
		}
	} // L: 178
}
