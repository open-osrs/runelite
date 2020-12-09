import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1081581953
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -297749373
	)
	@Export("x")
	int x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 791976009
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1711892485
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1589340577
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1872177181
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1614504195
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("entity2")
	public Entity entity2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 3554481859042868621L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 542501961
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Lbg;",
		garbageValue = "-876680442"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "613088833"
	)
	public static void method3379() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}
}
