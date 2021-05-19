import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -589693927
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("o")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("g")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 706113995
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("z")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("t")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("v")
	double field1303;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1983540285
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1893161511
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 51671271
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("x")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1303 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2233(true); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.field1303 = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.parameters = new LinkedHashMap(); // L: 22
		if (var1 != null && var1.array != null) { // L: 29
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 34
				if (var1.readUnsignedByte() == 1) { // L: 38
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 39
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 40
				}

				if (var2 > 3) { // L: 42
					this.windowMode = var1.readUnsignedByte(); // L: 43
				}

				if (var2 > 2) { // L: 45
					int var3 = var1.readUnsignedByte(); // L: 46

					for (int var4 = 0; var4 < var3; ++var4) { // L: 47
						int var5 = var1.readInt(); // L: 48
						int var6 = var1.readInt(); // L: 49
						this.parameters.put(var5, var6); // L: 50
					}
				}

				if (var2 > 4) { // L: 53
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 54
				}

				if (var2 > 5) { // L: 56
					this.hideUsername = var1.readBoolean(); // L: 57
				}

				if (var2 > 6) { // L: 59
					this.field1303 = (double)var1.readUnsignedByte() / 100.0D; // L: 60
					this.musicVolume = var1.readUnsignedByte(); // L: 61
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 62
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 63
				}
			} else {
				this.method2233(true); // L: 35
			}
		} else {
			this.method2233(true); // L: 30
		}

	} // L: 67

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1649794389"
	)
	void method2233(boolean var1) {
	} // L: 69

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnk;",
		garbageValue = "0"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 72
		var1.writeByte(ClientPreferences_optionCount); // L: 73
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 74
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 75
		var1.writeByte(this.windowMode); // L: 76
		var1.writeByte(this.parameters.size()); // L: 77
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 78

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 79
			var1.writeInt((Integer)var3.getKey()); // L: 81
			var1.writeInt((Integer)var3.getValue()); // L: 82
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 85
		var1.writeBoolean(this.hideUsername); // L: 86
		var1.writeByte((int)(this.field1303 * 100.0D)); // L: 87
		var1.writeByte(this.musicVolume); // L: 88
		var1.writeByte(this.soundEffectsVolume); // L: 89
		var1.writeByte(this.areaSoundEffectsVolume); // L: 90
		return var1; // L: 91
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(ZLnm;I)V",
		garbageValue = "530803334"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5469
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5470
			var2 = var1.method6648(); // L: 5471
			var3 = var1.method6620(); // L: 5472
			int var4 = var1.readUnsignedShort(); // L: 5473
			FriendsList.xteaKeys = new int[var4][4]; // L: 5474

			for (var5 = 0; var5 < var4; ++var5) { // L: 5475
				for (var6 = 0; var6 < 4; ++var6) { // L: 5476
					FriendsList.xteaKeys[var5][var6] = var1.readInt(); // L: 5477
				}
			}

			HealthBar.regions = new int[var4]; // L: 5480
			class264.regionMapArchiveIds = new int[var4]; // L: 5481
			class15.regionLandArchiveIds = new int[var4]; // L: 5482
			Messages.regionLandArchives = new byte[var4][]; // L: 5483
			class159.regionMapArchives = new byte[var4][]; // L: 5484
			boolean var16 = false; // L: 5485
			if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 5486
				var16 = true;
			}

			if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 5487
				var16 = true;
			}

			var4 = 0; // L: 5488

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5489
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 5490
					var8 = var7 + (var6 << 8); // L: 5491
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5492
						HealthBar.regions[var4] = var8; // L: 5493
						class264.regionMapArchiveIds[var4] = WorldMapSection0.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5494
						class15.regionLandArchiveIds[var4] = WorldMapSection0.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5495
						++var4; // L: 5496
					}
				}
			}

			Actor.method2199(var3, var2, true); // L: 5499
		} else {
			var2 = var1.readUnsignedShort(); // L: 5502
			var3 = var1.method6620(); // L: 5503
			boolean var15 = var1.method6478() == 1; // L: 5504
			var5 = var1.readUnsignedShort(); // L: 5505
			var1.importIndex(); // L: 5506

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5507
				for (var7 = 0; var7 < 13; ++var7) { // L: 5508
					for (var8 = 0; var8 < 13; ++var8) { // L: 5509
						var9 = var1.readBits(1); // L: 5510
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5511
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5512
						}
					}
				}
			}

			var1.exportIndex(); // L: 5516
			FriendsList.xteaKeys = new int[var5][4]; // L: 5517

			for (var6 = 0; var6 < var5; ++var6) { // L: 5518
				for (var7 = 0; var7 < 4; ++var7) { // L: 5519
					FriendsList.xteaKeys[var6][var7] = var1.readInt(); // L: 5520
				}
			}

			HealthBar.regions = new int[var5]; // L: 5523
			class264.regionMapArchiveIds = new int[var5]; // L: 5524
			class15.regionLandArchiveIds = new int[var5]; // L: 5525
			Messages.regionLandArchives = new byte[var5][]; // L: 5526
			class159.regionMapArchives = new byte[var5][]; // L: 5527
			var5 = 0; // L: 5528

			for (var6 = 0; var6 < 4; ++var6) { // L: 5529
				for (var7 = 0; var7 < 13; ++var7) { // L: 5530
					for (var8 = 0; var8 < 13; ++var8) { // L: 5531
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5532
						if (var9 != -1) { // L: 5533
							int var10 = var9 >> 14 & 1023; // L: 5534
							int var11 = var9 >> 3 & 2047; // L: 5535
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5536

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5537
								if (HealthBar.regions[var13] == var12) {
									var12 = -1; // L: 5538
									break; // L: 5539
								}
							}

							if (var12 != -1) { // L: 5541
								HealthBar.regions[var5] = var12; // L: 5542
								var13 = var12 >> 8 & 255; // L: 5543
								int var14 = var12 & 255; // L: 5544
								class264.regionMapArchiveIds[var5] = WorldMapSection0.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5545
								class15.regionLandArchiveIds[var5] = WorldMapSection0.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5546
								++var5; // L: 5547
							}
						}
					}
				}
			}

			Actor.method2199(var3, var2, !var15); // L: 5553
		}

	} // L: 5555

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "2116886515"
	)
	public static void method2239(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2650, Client.packetWriter.isaacCipher); // L: 11737
		var4.packetBuffer.method6484(var1); // L: 11738
		var4.packetBuffer.writeInt(var3 ? Client.field839 * 102452491 * -1252190557 : 0); // L: 11739
		var4.packetBuffer.writeByte(var2); // L: 11740
		var4.packetBuffer.method6483(var0); // L: 11741
		Client.packetWriter.addNode(var4); // L: 11742
	} // L: 11743
}
