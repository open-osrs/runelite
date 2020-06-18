import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("DynamicObject")
public class DynamicObject extends Entity {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 909997849
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2017652637
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1099859107
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1395519623
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1502042193
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1335019499
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 521544259
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1788666009
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		signature = "(IIIIIIIZLel;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = NetSocket.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field3561 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
				this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			label55: {
				do {
					do {
						if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
							break label55;
						}

						var1 -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.sequenceDefinition = null;
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectDefinition var12 = Canvas.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1062154046"
	)
	public static int method2375(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "1312322364"
	)
	static final void method2373(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var3 = Players.Players_indices[var2];
			if ((Players.field1282[var3] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1282;
					var10000[var3] = (byte)(var10000[var3] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var6 = var0.readBits(2);
						if (var6 == 0) {
							var7 = 0;
						} else if (var6 == 1) {
							var7 = var0.readBits(5);
						} else if (var6 == 2) {
							var7 = var0.readBits(8);
						} else {
							var7 = var0.readBits(11);
						}

						var1 = var7;
						var10000 = Players.field1282;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						class92.readPlayerUpdate(var0, var3);
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
				var3 = Players.Players_indices[var2];
				if ((Players.field1282[var3] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1282;
						var10000[var3] = (byte)(var10000[var3] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var6 = var0.readBits(2);
							if (var6 == 0) {
								var7 = 0;
							} else if (var6 == 1) {
								var7 = var0.readBits(5);
							} else if (var6 == 2) {
								var7 = var0.readBits(8);
							} else {
								var7 = var0.readBits(11);
							}

							var1 = var7;
							var10000 = Players.field1282;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							class92.readPlayerUpdate(var0, var3);
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
					var3 = Players.Players_emptyIndices[var2];
					if ((Players.field1282[var3] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1282;
							var10000[var3] = (byte)(var10000[var3] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var6 = var0.readBits(2);
								if (var6 == 0) {
									var7 = 0;
								} else if (var6 == 1) {
									var7 = var0.readBits(5);
								} else if (var6 == 2) {
									var7 = var0.readBits(8);
								} else {
									var7 = var0.readBits(11);
								}

								var1 = var7;
								var10000 = Players.field1282;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else if (ArchiveDiskAction.updateExternalPlayer(var0, var3)) {
								var10000 = Players.field1282;
								var10000[var3] = (byte)(var10000[var3] | 2);
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
						var3 = Players.Players_emptyIndices[var2];
						if ((Players.field1282[var3] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1282;
								var10000[var3] = (byte)(var10000[var3] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var6 = var0.readBits(2);
									if (var6 == 0) {
										var7 = 0;
									} else if (var6 == 1) {
										var7 = var0.readBits(5);
									} else if (var6 == 2) {
										var7 = var0.readBits(8);
									} else {
										var7 = var0.readBits(11);
									}

									var1 = var7;
									var10000 = Players.field1282;
									var10000[var3] = (byte)(var10000[var3] | 2);
								} else if (ArchiveDiskAction.updateExternalPlayer(var0, var3)) {
									var10000 = Players.field1282;
									var10000[var3] = (byte)(var10000[var3] | 2);
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
							var10000 = Players.field1282;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var8 = Client.players[var2];
							if (var8 != null) {
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)I",
		garbageValue = "-627685416"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
