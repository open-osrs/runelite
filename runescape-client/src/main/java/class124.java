import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class124 extends class132 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -336591423
	)
	int field1434;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class124(class133 var1) {
		this.this$0 = var1;
		this.field1434 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "35"
	)
	void vmethod2760(Buffer var1) {
		this.field1434 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1634989707"
	)
	void vmethod2759(ClanChannel var1) {
		var1.removeMember(this.field1434);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;IZB)Lht;",
		garbageValue = "40"
	)
	public static Frames method2560(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "287619330"
	)
	static int method2564(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return FloorDecoration.method4104(var0, var1, var2);
		} else if (var0 < 1100) {
			return class121.method2541(var0, var1, var2);
		} else if (var0 < 1200) {
			return FontName.method6619(var0, var1, var2);
		} else if (var0 < 1300) {
			return class113.method2482(var0, var1, var2);
		} else if (var0 < 1400) {
			return Language.method5478(var0, var1, var2);
		} else if (var0 < 1500) {
			return PcmPlayer.method697(var0, var1, var2);
		} else if (var0 < 1600) {
			return MidiPcmStream.method4814(var0, var1, var2);
		} else if (var0 < 1700) {
			return Bounds.method6262(var0, var1, var2);
		} else if (var0 < 1800) {
			return LoginPacket.method4659(var0, var1, var2);
		} else if (var0 < 1900) {
			return UserComparator10.method2451(var0, var1, var2);
		} else if (var0 < 2000) {
			return WorldMapSprite.method3866(var0, var1, var2);
		} else if (var0 < 2100) {
			return class121.method2541(var0, var1, var2);
		} else if (var0 < 2200) {
			return FontName.method6619(var0, var1, var2);
		} else if (var0 < 2300) {
			return class113.method2482(var0, var1, var2);
		} else if (var0 < 2400) {
			return Language.method5478(var0, var1, var2);
		} else if (var0 < 2500) {
			return PcmPlayer.method697(var0, var1, var2);
		} else if (var0 < 2600) {
			return class19.method299(var0, var1, var2);
		} else if (var0 < 2700) {
			return ChatChannel.method1987(var0, var1, var2);
		} else if (var0 < 2800) {
			return class279.method5136(var0, var1, var2);
		} else if (var0 < 2900) {
			return NetFileRequest.method5215(var0, var1, var2);
		} else if (var0 < 3000) {
			return WorldMapSprite.method3866(var0, var1, var2);
		} else if (var0 < 3200) {
			return SoundCache.method780(var0, var1, var2);
		} else if (var0 < 3300) {
			return ScriptEvent.method2066(var0, var1, var2);
		} else if (var0 < 3400) {
			return ApproximateRouteStrategy.method1095(var0, var1, var2);
		} else if (var0 < 3500) {
			return class329.method5931(var0, var1, var2);
		} else if (var0 < 3600) {
			return Interpreter.method1868(var0, var1, var2);
		} else if (var0 < 3700) {
			return class122.method2549(var0, var1, var2);
		} else if (var0 < 3800) {
			return UserComparator3.method2436(var0, var1, var2);
		} else if (var0 < 3900) {
			return WorldMapSection0.method3826(var0, var1, var2);
		} else if (var0 < 4000) {
			return class262.method5063(var0, var1, var2);
		} else if (var0 < 4100) {
			return SecureRandomCallable.method2026(var0, var1, var2);
		} else if (var0 < 4200) {
			return WorldMapSection0.method3827(var0, var1, var2);
		} else if (var0 < 4300) {
			return UserComparator4.method2399(var0, var1, var2);
		} else if (var0 < 5100) {
			return LoginPacket.method4660(var0, var1, var2);
		} else if (var0 < 5400) {
			return AbstractWorldMapIcon.method3945(var0, var1, var2);
		} else if (var0 < 5600) {
			return PlayerType.method5153(var0, var1, var2);
		} else if (var0 < 5700) {
			return ParamComposition.method3129(var0, var1, var2);
		} else if (var0 < 6300) {
			return class264.method5071(var0, var1, var2);
		} else if (var0 < 6600) {
			return class176.method3442(var0, var1, var2);
		} else if (var0 < 6700) {
			return Renderable.method4394(var0, var1, var2);
		} else if (var0 < 6800) {
			return HealthBar.method2220(var0, var1, var2);
		} else if (var0 < 6900) {
			return WallDecoration.method4581(var0, var1, var2);
		} else if (var0 < 7000) {
			return class130.method2683(var0, var1, var2);
		} else if (var0 < 7100) {
			return ObjectSound.method1730(var0, var1, var2);
		} else if (var0 < 7200) {
			return class262.method5062(var0, var1, var2);
		} else {
			return var0 < 7300 ? ReflectionCheck.method1063(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1215104265"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1119903328"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = MidiPcmStream.getTileHeight(var0, var1, VertexNormal.Client_plane) - var2;
			var0 -= Canvas.cameraX;
			var3 -= class14.cameraY;
			var1 -= VarpDefinition.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[WorldMapIcon_1.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[WorldMapIcon_1.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[HealthBarUpdate.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[HealthBarUpdate.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var4 * var3 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
