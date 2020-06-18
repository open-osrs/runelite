import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class8 implements Callable {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		signature = "Llj;"
	)
	static AbstractSocket field35;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lkn;"
	)
	final Buffer field33;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lc;"
	)
	final class12 field31;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lz;"
	)
	final class9 this$0;

	@ObfuscatedSignature(
		signature = "(Lz;Lkn;Lc;)V"
	)
	class8(class9 var1, Buffer var2, class12 var3) {
		this.this$0 = var1;
		this.field33 = var2;
		this.field31 = var3;
	}

	public Object call() {
		return this.field31.vmethod133(this.field33);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;I)V",
		garbageValue = "2132474559"
	)
	public static void method103(AbstractArchive var0) {
		class198.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1765213617"
	)
	public static int method104(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		signature = "(ZLkb;I)V",
		garbageValue = "-826788637"
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
			var2 = var1.method5757();
			int var3 = var1.method5757();
			var4 = var1.readUnsignedShort();
			WorldMapData_1.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapData_1.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class41.regions = new int[var4];
			StudioGame.regionMapArchiveIds = new int[var4];
			class52.regionLandArchiveIds = new int[var4];
			class90.regionLandArchives = new byte[var4][];
			class1.regionMapArchives = new byte[var4][];
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
						class41.regions[var4] = var8;
						StudioGame.regionMapArchiveIds[var4] = WorldMapRectangle.archive5.getGroupId("m" + var6 + "_" + var7);
						class52.regionLandArchiveIds[var4] = WorldMapRectangle.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			TextureProvider.method2900(var3, var2, true);
		} else {
			var2 = var1.method5867();
			boolean var15 = var1.readUnsignedByte() == 1;
			var4 = var1.method5757();
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
			WorldMapData_1.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapData_1.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class41.regions = new int[var5];
			StudioGame.regionMapArchiveIds = new int[var5];
			class52.regionLandArchiveIds = new int[var5];
			class90.regionLandArchives = new byte[var5][];
			class1.regionMapArchives = new byte[var5][];
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
								if (class41.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class41.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								StudioGame.regionMapArchiveIds[var5] = WorldMapRectangle.archive5.getGroupId("m" + var13 + "_" + var14);
								class52.regionLandArchiveIds[var5] = WorldMapRectangle.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			TextureProvider.method2900(var4, var2, !var15);
		}

	}
}
