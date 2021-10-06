import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 630113855
	)
	static int field954;
	@ObfuscatedName("q")
	String field956;
	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("j")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("m")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 738752155
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1783554177
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -276096773
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1841585005
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lnz;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnz;",
		garbageValue = "-287949117"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Loz;",
		garbageValue = "-1258113861"
	)
	static IndexedSprite method1955(boolean var0, boolean var1) {
		return var0 ? (var1 ? Login.field877 : FileSystem.options_buttons_2Sprite) : (var1 ? Login.field876 : class397.options_buttons_0Sprite);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Ljava/lang/String;Ljava/lang/String;I)[Lon;",
		garbageValue = "9795538"
	)
	public static SpritePixels[] method1970(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		SpritePixels[] var5;
		if (!VarbitComposition.method3102(var0, var3, var4)) {
			var5 = null;
		} else {
			SpritePixels[] var7 = new SpritePixels[class414.SpriteBuffer_spriteCount];

			for (int var8 = 0; var8 < class414.SpriteBuffer_spriteCount; ++var8) {
				SpritePixels var9 = var7[var8] = new SpritePixels();
				var9.width = class414.SpriteBuffer_spriteWidth;
				var9.height = class408.SpriteBuffer_spriteHeight;
				var9.xOffset = class135.SpriteBuffer_xOffsets[var8];
				var9.yOffset = class131.SpriteBuffer_yOffsets[var8];
				var9.subWidth = class414.SpriteBuffer_spriteWidths[var8];
				var9.subHeight = class16.SpriteBuffer_spriteHeights[var8];
				int var10 = var9.subHeight * var9.subWidth;
				byte[] var11 = class414.SpriteBuffer_pixels[var8];
				var9.pixels = new int[var10];

				for (int var12 = 0; var12 < var10; ++var12) {
					var9.pixels[var12] = class351.SpriteBuffer_spritePalette[var11[var12] & 255];
				}
			}

			StudioGame.method5130();
			var5 = var7;
		}

		return var5;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-348336461"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		AttackOption.logOut();
		switch(var0) {
		case 1:
			class112.method2474(24);
			class17.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			NPC.method2233();
		}

	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(Lcx;I)V",
		garbageValue = "379416409"
	)
	static final void method1969(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = PlayerComposition.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = PlayerComposition.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = PlayerComposition.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = PlayerComposition.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = PlayerComposition.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = InterfaceParent.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1096 = var4;
		var0.field1095 = var5;
	}
}
