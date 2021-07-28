import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Liv;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Liu;[IIIII)V",
		garbageValue = "-1715787417"
	)
	void method4648(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2830[var1.field2902] & 4) != 0 && var1.field2896 < 0) {
			int var6 = this.superStream.field2841[var1.field2902] / GrandExchangeOfferAgeComparator.field3633;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2898) / var6;
				if (var7 > var4) {
					var1.field2898 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2898 += var6 * var7 - 1048576;
				int var8 = GrandExchangeOfferAgeComparator.field3633 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2839[var1.field2902] == 0) {
					var1.stream = RawPcmStream.method554(var1.rawSound, var10.method569(), var10.method560(), var10.method561());
				} else {
					var1.stream = RawPcmStream.method554(var1.rawSound, var10.method569(), 0, var10.method561());
					this.superStream.method4472(var1, var1.patch.field2868[var1.field2893] < 0);
					var1.stream.method565(var8, var10.method560());
				}

				if (var1.patch.field2868[var1.field2893] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method567(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method571()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Liu;IB)V",
		garbageValue = "4"
	)
	void method4645(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2830[var1.field2902] & 4) != 0 && var1.field2896 < 0) {
			int var3 = this.superStream.field2841[var1.field2902] / GrandExchangeOfferAgeComparator.field3633;
			int var4 = (var3 + 1048575 - var1.field2898) / var3;
			var1.field2898 = var3 * var2 + var1.field2898 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2839[var1.field2902] == 0) {
					var1.stream = RawPcmStream.method554(var1.rawSound, var1.stream.method569(), var1.stream.method560(), var1.stream.method561());
				} else {
					var1.stream = RawPcmStream.method554(var1.rawSound, var1.stream.method569(), 0, var1.stream.method561());
					this.superStream.method4472(var1, var1.patch.field2868[var1.field2893] < 0);
				}

				if (var1.patch.field2868[var1.field2893] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2898 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Laq;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("f")
	protected int vmethod4662() {
		return 0;
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4507(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2901) {
						this.method4648(var6, var1, var4, var5, var5 + var4);
						var6.field2901 -= var5;
						break;
					}

					this.method4648(var6, var1, var4, var6.field2901, var5 + var4);
					var4 += var6.field2901;
					var5 -= var6.field2901;
				} while(!this.superStream.method4508(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("r")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4507(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2901) {
						this.method4645(var3, var2);
						var3.field2901 -= var2;
						break;
					}

					this.method4645(var3, var3.field2901);
					var2 -= var3.field2901;
				} while(!this.superStream.method4508(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1801326233"
	)
	static final void method4644() {
		if (Players.field1182) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method1825();
			}

			Players.field1182 = false;
		}

	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(ZLnu;I)V",
		garbageValue = "793662428"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method6696();
			int var3 = var1.method6785();
			var4 = var1.readUnsignedShort();
			ScriptFrame.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					ScriptFrame.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class234.regions = new int[var4];
			Huffman.regionMapArchiveIds = new int[var4];
			UserComparator6.regionLandArchiveIds = new int[var4];
			ClientPacket.regionLandArchives = new byte[var4][];
			PlatformInfo.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class234.regions[var4] = var8;
						Huffman.regionMapArchiveIds[var4] = Skeleton.archive5.getGroupId("m" + var6 + "_" + var7);
						UserComparator6.regionLandArchiveIds[var4] = Skeleton.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			class98.method2208(var3, var2, true);
		} else {
			var2 = var1.method6697();
			boolean var15 = var1.method6688() == 1;
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			ScriptFrame.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					ScriptFrame.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class234.regions = new int[var5];
			Huffman.regionMapArchiveIds = new int[var5];
			UserComparator6.regionLandArchiveIds = new int[var5];
			ClientPacket.regionLandArchives = new byte[var5][];
			PlatformInfo.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class234.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class234.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								Huffman.regionMapArchiveIds[var5] = Skeleton.archive5.getGroupId("m" + var13 + "_" + var14);
								UserComparator6.regionLandArchiveIds[var5] = Skeleton.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class98.method2208(var2, var4, !var15);
		}

	}
}
