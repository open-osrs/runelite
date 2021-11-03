import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("i")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfl;",
		garbageValue = "80"
	)
	public static HitSplatDefinition method372(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(ZLoj;I)V",
		garbageValue = "-1681354127"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5700
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5701
			var2 = var1.method7120(); // L: 5702
			var3 = var1.method7004(); // L: 5703
			int var4 = var1.readUnsignedShort(); // L: 5704
			Client.xteaKeys = new int[var4][4]; // L: 5705

			for (var5 = 0; var5 < var4; ++var5) { // L: 5706
				for (var6 = 0; var6 < 4; ++var6) { // L: 5707
					Client.xteaKeys[var5][var6] = var1.readInt(); // L: 5708
				}
			}

			LoginScreenAnimation.regions = new int[var4]; // L: 5711
			class119.regionMapArchiveIds = new int[var4]; // L: 5712
			class21.regionLandArchiveIds = new int[var4]; // L: 5713
			ModeWhere.regionLandArchives = new byte[var4][]; // L: 5714
			class184.regionMapArchives = new byte[var4][]; // L: 5715
			boolean var16 = false; // L: 5716
			if (Client.field619) { // L: 5717
				if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) { // L: 5718
					var16 = true;
				}

				if (var3 / 8 == 48 && var2 / 8 == 148) { // L: 5719
					var16 = true;
				}
			}

			var4 = 0; // L: 5721

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) { // L: 5722
				for (var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) { // L: 5723
					var8 = var7 + (var6 << 8); // L: 5724
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5725
						LoginScreenAnimation.regions[var4] = var8; // L: 5726
						class119.regionMapArchiveIds[var4] = class11.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5727
						class21.regionLandArchiveIds[var4] = class11.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5728
						++var4; // L: 5729
					}
				}
			}

			EnumComposition.method3107(var3, var2, true); // L: 5732
		} else {
			var2 = var1.method7120(); // L: 5735
			var3 = var1.readUnsignedShort(); // L: 5736
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5737
			var5 = var1.readUnsignedShort(); // L: 5738
			var1.importIndex(); // L: 5739

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5740
				for (var7 = 0; var7 < 13; ++var7) { // L: 5741
					for (var8 = 0; var8 < 13; ++var8) { // L: 5742
						var9 = var1.readBits(1); // L: 5743
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5744
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5745
						}
					}
				}
			}

			var1.exportIndex(); // L: 5749
			Client.xteaKeys = new int[var5][4]; // L: 5750

			for (var6 = 0; var6 < var5; ++var6) { // L: 5751
				for (var7 = 0; var7 < 4; ++var7) { // L: 5752
					Client.xteaKeys[var6][var7] = var1.readInt(); // L: 5753
				}
			}

			LoginScreenAnimation.regions = new int[var5]; // L: 5756
			class119.regionMapArchiveIds = new int[var5]; // L: 5757
			class21.regionLandArchiveIds = new int[var5]; // L: 5758
			ModeWhere.regionLandArchives = new byte[var5][]; // L: 5759
			class184.regionMapArchives = new byte[var5][]; // L: 5760
			var5 = 0; // L: 5761

			for (var6 = 0; var6 < 4; ++var6) { // L: 5762
				for (var7 = 0; var7 < 13; ++var7) { // L: 5763
					for (var8 = 0; var8 < 13; ++var8) { // L: 5764
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5765
						if (var9 != -1) { // L: 5766
							int var10 = var9 >> 14 & 1023; // L: 5767
							int var11 = var9 >> 3 & 2047; // L: 5768
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5769

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5770
								if (LoginScreenAnimation.regions[var13] == var12) {
									var12 = -1; // L: 5771
									break; // L: 5772
								}
							}

							if (var12 != -1) { // L: 5774
								LoginScreenAnimation.regions[var5] = var12; // L: 5775
								var13 = var12 >> 8 & 255; // L: 5776
								int var14 = var12 & 255; // L: 5777
								class119.regionMapArchiveIds[var5] = class11.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5778
								class21.regionLandArchiveIds[var5] = class11.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5779
								++var5; // L: 5780
							}
						}
					}
				}
			}

			EnumComposition.method3107(var2, var3, !var15); // L: 5786
		}

	} // L: 5788
}
