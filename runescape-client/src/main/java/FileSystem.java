import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("s")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("t")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("v")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -321551563
	)
	static int field1484;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;III)[Lof;",
		garbageValue = "-2007880048"
	)
	public static IndexedSprite[] method2628(AbstractArchive var0, int var1, int var2) {
		if (!class290.method5208(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class398.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class398.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class398.SpriteBuffer_spriteWidth;
				var6.height = class398.SpriteBuffer_spriteHeight;
				var6.xOffset = class398.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class398.SpriteBuffer_yOffsets[var5];
				var6.subWidth = ClanChannelMember.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class374.SpriteBuffer_spriteHeights[var5];
				var6.palette = class118.SpriteBuffer_spritePalette;
				var6.pixels = class398.SpriteBuffer_pixels[var5];
			}

			class398.SpriteBuffer_xOffsets = null;
			class398.SpriteBuffer_yOffsets = null;
			ClanChannelMember.SpriteBuffer_spriteWidths = null;
			class374.SpriteBuffer_spriteHeights = null;
			class118.SpriteBuffer_spritePalette = null;
			class398.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "954710146"
	)
	static int method2621(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--class1.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--Interpreter.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--Interpreter.Interpreter_intStackSize;
										return 1;
									}
								} else {
									Interpreter.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class1.Interpreter_stringStackSize;
								--Interpreter.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--Interpreter.Interpreter_intStackSize;
							return 1;
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					Interpreter.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
