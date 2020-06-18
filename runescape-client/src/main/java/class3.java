import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class3 implements Enumerated {
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("sceneMinimapSprite")
	static Sprite sceneMinimapSprite;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lj;"
	)
	public static final class3 field10;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lj;"
	)
	public static final class3 field8;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lj;"
	)
	public static final class3 field9;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1514445555
	)
	final int field14;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -658537441
	)
	public final int field15;
	@ObfuscatedName("g")
	public final Class field12;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lm;"
	)
	public final class0 field13;

	static {
		field10 = new class3(2, 0, Integer.class, new class1());
		field8 = new class3(1, 1, Long.class, new class2());
		field9 = new class3(0, 2, String.class, new class4());
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/Class;Lm;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field14 = var1;
		this.field15 = var2;
		this.field12 = var3;
		this.field13 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkn;I)Ljava/lang/Object;",
		garbageValue = "-1114505867"
	)
	public Object method40(Buffer var1) {
		return this.field13.vmethod47(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)[Lu;",
		garbageValue = "849855680"
	)
	public static class7[] method41() {
		return new class7[]{class7.field30};
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(III)Lbr;",
		garbageValue = "-1323441814"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(B)Lch;",
		garbageValue = "12"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class13.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "-2060767069"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class335.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class335.SpriteBuffer_xOffsets = new int[class335.SpriteBuffer_spriteCount];
		NPC.SpriteBuffer_yOffsets = new int[class335.SpriteBuffer_spriteCount];
		class335.SpriteBuffer_spriteWidths = new int[class335.SpriteBuffer_spriteCount];
		class335.SpriteBuffer_spriteHeights = new int[class335.SpriteBuffer_spriteCount];
		ItemDefinition.SpriteBuffer_pixels = new byte[class335.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class335.SpriteBuffer_spriteCount * 8;
		class335.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		UserComparator8.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			NPC.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			class335.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class335.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class335.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class335.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class335.SpriteBuffer_spritePalette[var3] == 0) {
				class335.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class335.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class335.SpriteBuffer_spriteWidths[var3];
			int var5 = class335.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			ItemDefinition.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2027582422"
	)
	static final void method33() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var2 = Client.players[var0[var1]];
			if (var2 != null && var2.overheadTextCyclesRemaining > 0) {
				--var2.overheadTextCyclesRemaining;
				if (var2.overheadTextCyclesRemaining == 0) {
					var2.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var4 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var4];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}
}
