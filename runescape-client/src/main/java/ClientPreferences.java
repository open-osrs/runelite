import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1264543347
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("j")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1347880583
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("k")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("t")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("a")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1221768457
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1926347
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1050317019
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 526846849
	)
	int field1209;
	@ObfuscatedName("g")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 8;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1209 = -1;
		this.parameters = new LinkedHashMap();
		this.method2197(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1209 = -1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1209 = var1.readUnsignedByte();
				}
			} else {
				this.method2197(true);
			}
		} else {
			this.method2197(true);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-1937"
	)
	void method2197(boolean var1) {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lot;",
		garbageValue = "31"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1209);
		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)[Lid;",
		garbageValue = "0"
	)
	public static class240[] method2209() {
		return new class240[]{class240.field2767, class240.field2768, class240.field2769, class240.field2770, class240.field2775, class240.field2772, class240.field2773, class240.field2774, class240.field2776, class240.field2771};
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Loy;IB)V",
		garbageValue = "126"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();

		byte[] var10000;
		int var4;
		int var6;
		int var7;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var7 = Players.Players_indices[var4];
			if ((Players.field1247[var7] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1247;
					var10000[var7] = (byte)(var10000[var7] | 2);
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var3 = GrandExchangeEvent.method5402(var0);
						var10000 = Players.field1247;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						class92.readPlayerUpdate(var0, var7);
					}
				}
			}
		}

		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var7 = Players.Players_indices[var4];
				if ((Players.field1247[var7] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1247;
						var10000[var7] = (byte)(var10000[var7] | 2);
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var3 = GrandExchangeEvent.method5402(var0);
							var10000 = Players.field1247;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							class92.readPlayerUpdate(var0, var7);
						}
					}
				}
			}

			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var7 = Players.Players_emptyIndices[var4];
					if ((Players.field1247[var7] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1247;
							var10000[var7] = (byte)(var10000[var7] | 2);
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var3 = GrandExchangeEvent.method5402(var0);
								var10000 = Players.field1247;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else if (ChatChannel.updateExternalPlayer(var0, var7)) {
								var10000 = Players.field1247;
								var10000[var7] = (byte)(var10000[var7] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var7 = Players.Players_emptyIndices[var4];
						if ((Players.field1247[var7] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1247;
								var10000[var7] = (byte)(var10000[var7] | 2);
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var3 = GrandExchangeEvent.method5402(var0);
									var10000 = Players.field1247;
									var10000[var7] = (byte)(var10000[var7] | 2);
								} else if (ChatChannel.updateExternalPlayer(var0, var7)) {
									var10000 = Players.field1247;
									var10000[var7] = (byte)(var10000[var7] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1247;
							var10000[var4] = (byte)(var10000[var4] >> 1);
							Player var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}

						SoundCache.method781(var0);
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1927902759"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}
}
