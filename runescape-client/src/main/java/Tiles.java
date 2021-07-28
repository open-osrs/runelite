import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("s")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("t")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1321271985
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("n")
	static byte[][][] field915;
	@ObfuscatedName("w")
	static byte[][][] field909;
	@ObfuscatedName("o")
	static int[][] field904;
	@ObfuscatedName("r")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("c")
	static final int[] field907;
	@ObfuscatedName("i")
	static final int[] field908;
	@ObfuscatedName("m")
	static final int[] field905;
	@ObfuscatedName("b")
	static final int[] field912;
	@ObfuscatedName("z")
	static final int[] field903;
	@ObfuscatedName("d")
	static final int[] field914;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1747716653
	)
	static int field913;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -589771949
	)
	static int field899;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1644626137
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field907 = new int[]{1, 2, 4, 8};
		field908 = new int[]{16, 32, 64, 128};
		field905 = new int[]{1, 0, -1, 0};
		field912 = new int[]{0, -1, 0, 1};
		field903 = new int[]{1, -1, -1, 1};
		field914 = new int[]{-1, -1, 1, 1};
		field913 = (int)(Math.random() * 17.0D) - 8;
		field899 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lja;",
		garbageValue = "853934177"
	)
	public static GameBuild[] method1769() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.LIVE, GameBuild.WIP};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "2117423398"
	)
	static final void method1747(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1174[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1174;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = class249.method4826(var0);
						var10000 = Players.field1174;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						Renderable.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1174[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1174;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = class249.method4826(var0);
							var10000 = Players.field1174;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							Renderable.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1174[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1174;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = class249.method4826(var0);
								var10000 = Players.field1174;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class102.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1174;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1174[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1174;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = class249.method4826(var0);
									var10000 = Players.field1174;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class102.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1174;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1174;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}
}
