import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class117 extends class116 {
	@ObfuscatedName("p")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 408347163
	)
	int field1385;
	@ObfuscatedName("q")
	boolean field1383;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class117(class119 var1) {
		this.this$0 = var1;
		this.field1385 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1385 = var1.readUnsignedShort();
		this.field1383 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2595(this.field1385, this.field1383);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIIB)V",
		garbageValue = "85"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3147 == null) {
			throw new RuntimeException();
		} else {
			var0.field3147[var1] = var2;
			var0.field3066[var1] = var3;
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2104571649"
	)
	static final int method2519() {
		if (WorldMapDecorationType.clientPreferences.roofsHidden) {
			return VertexNormal.Client_plane;
		} else {
			int var0 = 3;
			if (WorldMapIcon_1.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = class132.oculusOrbFocalPointX >> 7;
					var2 = LoginScreenAnimation.oculusOrbFocalPointY >> 7;
				} else {
					var1 = class67.localPlayer.x >> 7;
					var2 = class67.localPlayer.y >> 7;
				}

				int var3 = Canvas.cameraX >> 7;
				int var4 = VarpDefinition.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return VertexNormal.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return VertexNormal.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][var3][var4] & 4) != 0) {
					var0 = VertexNormal.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var3 != var1) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][var3][var4] & 4) != 0) {
							var0 = VertexNormal.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][var3][var4] & 4) != 0) {
								var0 = VertexNormal.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][var3][var4] & 4) != 0) {
							var0 = VertexNormal.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][var3][var4] & 4) != 0) {
								var0 = VertexNormal.Client_plane;
							}
						}
					}
				}
			}

			if (class67.localPlayer.x >= 0 && class67.localPlayer.y >= 0 && class67.localPlayer.x < 13312 && class67.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[VertexNormal.Client_plane][class67.localPlayer.x >> 7][class67.localPlayer.y >> 7] & 4) != 0) {
					var0 = VertexNormal.Client_plane;
				}

				return var0;
			} else {
				return VertexNormal.Client_plane;
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lci;I)Z",
		garbageValue = "-1848205282"
	)
	static boolean method2516(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (class67.localPlayer == var0) {
			return class317.method5800();
		} else {
			boolean var1 = KitDefinition.method2954();
			boolean var2;
			if (!var1) {
				var2 = (Client.drawPlayerNames & 1) != 0;
				var1 = var2 && var0.isFriend();
			}

			var2 = var1;
			if (!var1) {
				boolean var3 = (Client.drawPlayerNames & 2) != 0;
				var2 = var3 && var0.isFriendsChatMember();
			}

			return var2;
		}
	}
}
