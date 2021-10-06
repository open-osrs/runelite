import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	public static AbstractArchive field1799;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -999465827
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1782308297
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -690575575
	)
	public int field1806;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 538257601
	)
	int field1819;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1981932247
	)
	int field1808;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1395271941
	)
	int field1805;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -928172535
	)
	int field1812;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1545387991
	)
	public int field1811;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -994625977
	)
	public int field1810;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1479947563
	)
	public int field1813;
	@ObfuscatedName("o")
	String field1814;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 823337209
	)
	public int field1815;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2097135353
	)
	public int field1798;
	@ObfuscatedName("u")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 223716691
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1419928299
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1806 = 70;
		this.field1819 = -1;
		this.field1808 = -1;
		this.field1805 = -1;
		this.field1812 = -1;
		this.field1811 = 0;
		this.field1810 = 0;
		this.field1813 = -1;
		this.field1814 = "";
		this.field1815 = -1;
		this.field1798 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1523469115"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6977();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1819 = var1.method6977();
		} else if (var2 == 4) {
			this.field1805 = var1.method6977();
		} else if (var2 == 5) {
			this.field1808 = var1.method6977();
		} else if (var2 == 6) {
			this.field1812 = var1.method6977();
		} else if (var2 == 7) {
			this.field1811 = var1.readShort();
		} else if (var2 == 8) {
			this.field1814 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1806 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1810 = var1.readShort();
		} else if (var2 == 11) {
			this.field1813 = 0;
		} else if (var2 == 12) {
			this.field1815 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1798 = var1.readShort();
		} else if (var2 == 14) {
			this.field1813 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lfn;",
		garbageValue = "29382351"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Varcs.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ItemContainer.method2057(var2) : null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1023856164"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1814;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class14.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "-335254490"
	)
	public SpritePixels method3159() {
		if (this.field1819 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1819);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(field1799, this.field1819, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1819);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "-339502433"
	)
	public SpritePixels method3160() {
		if (this.field1808 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1808);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(field1799, this.field1808, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1808);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "325937960"
	)
	public SpritePixels method3161() {
		if (this.field1805 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1805);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(field1799, this.field1805, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1805);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "-2096069020"
	)
	public SpritePixels method3177() {
		if (this.field1812 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1812);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(field1799, this.field1812, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1812);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Llt;",
		garbageValue = "-1973246933"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Actor.method2153(field1799, class17.HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lkn;II)Lis;",
		garbageValue = "1268577977"
	)
	public static PacketBufferNode method3197(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2754, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}

		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		class157.method2985(var4.packetBuffer, var1);
		if (var0 == class269.field3219.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.method6918(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lbo;",
		garbageValue = "255"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lew;IIS)Laq;",
		garbageValue = "-16257"
	)
	public static final PcmPlayer method3194(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field279 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = GraphicsObject.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field272 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (PcmPlayer.field283 > 0 && Skeleton.soundSystem == null) {
					Skeleton.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(Skeleton.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (Skeleton.soundSystem != null) {
					if (Skeleton.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					Skeleton.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "42"
	)
	static final void method3162(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method4127(var17, var18, var19);
			Rasterizer3D.method4130(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4127(var17, var19, var20);
			Rasterizer3D.method4130(var21, var23, var24, var17, var19, var20, var4);
		}
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1703178883"
	)
	static String method3168(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (ItemContainer.field1009 != null) {
			var3 = "/p=" + ItemContainer.field1009;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + ReflectionCheck.clientLanguage + "/a=" + KeyHandler.field142 + var3 + "/";
	}
}
