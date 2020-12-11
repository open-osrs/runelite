import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkz;Lkz;B)I",
		garbageValue = "96"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lky;B)V",
		garbageValue = "10"
	)
	static final void method3515(PacketBuffer var0) {
		int var1 = 0; // L: 89
		var0.importIndex(); // L: 90

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 91
			var5 = Players.Players_indices[var2]; // L: 92
			if ((Players.field1252[var5] & 1) == 0) { // L: 93
				if (var1 > 0) { // L: 94
					--var1; // L: 95
					var10000 = Players.field1252; // L: 96
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 99
					if (var4 == 0) { // L: 100
						var1 = Skills.method4146(var0); // L: 101
						var10000 = Players.field1252; // L: 102
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						class349.readPlayerUpdate(var0, var5); // L: 105
					}
				}
			}
		}

		var0.exportIndex(); // L: 108
		if (var1 != 0) { // L: 109
			throw new RuntimeException(); // L: 110
		} else {
			var0.importIndex(); // L: 112

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 113
				var5 = Players.Players_indices[var2]; // L: 114
				if ((Players.field1252[var5] & 1) != 0) { // L: 115
					if (var1 > 0) { // L: 116
						--var1; // L: 117
						var10000 = Players.field1252; // L: 118
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 121
						if (var4 == 0) { // L: 122
							var1 = Skills.method4146(var0); // L: 123
							var10000 = Players.field1252; // L: 124
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							class349.readPlayerUpdate(var0, var5); // L: 127
						}
					}
				}
			}

			var0.exportIndex(); // L: 130
			if (var1 != 0) { // L: 131
				throw new RuntimeException(); // L: 132
			} else {
				var0.importIndex(); // L: 134

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 135
					var5 = Players.Players_emptyIndices[var2]; // L: 136
					if ((Players.field1252[var5] & 1) != 0) { // L: 137
						if (var1 > 0) { // L: 138
							--var1; // L: 139
							var10000 = Players.field1252; // L: 140
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 143
							if (var4 == 0) { // L: 144
								var1 = Skills.method4146(var0); // L: 145
								var10000 = Players.field1252; // L: 146
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (WorldMapSection0.updateExternalPlayer(var0, var5)) { // L: 149
								var10000 = Players.field1252;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 152
				if (var1 != 0) { // L: 153
					throw new RuntimeException(); // L: 154
				} else {
					var0.importIndex(); // L: 156

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 157
						var5 = Players.Players_emptyIndices[var2]; // L: 158
						if ((Players.field1252[var5] & 1) == 0) { // L: 159
							if (var1 > 0) { // L: 160
								--var1; // L: 161
								var10000 = Players.field1252; // L: 162
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 165
								if (var4 == 0) { // L: 166
									var1 = Skills.method4146(var0); // L: 167
									var10000 = Players.field1252; // L: 168
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (WorldMapSection0.updateExternalPlayer(var0, var5)) { // L: 171
									var10000 = Players.field1252;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 174
					if (var1 != 0) { // L: 175
						throw new RuntimeException(); // L: 176
					} else {
						Players.Players_count = 0; // L: 178
						Players.Players_emptyIdxCount = 0; // L: 179

						for (var2 = 1; var2 < 2048; ++var2) { // L: 180
							var10000 = Players.field1252; // L: 181
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 182
							if (var3 != null) { // L: 183
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 184
							}
						}

					}
				}
			}
		}
	} // L: 186
}
