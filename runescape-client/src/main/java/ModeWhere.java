import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3995("", 0, new class318[]{class318.field3975}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3992("", 1, new class318[]{class318.field3973, class318.field3975}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3993("", 2, new class318[]{class318.field3973, class318.field3974, class318.field3975}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3994("", 3, new class318[]{class318.field3973}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3991("", 4),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field4007("", 5, new class318[]{class318.field3973, class318.field3975}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3997("", 6, new class318[]{class318.field3975}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3998("", 8, new class318[]{class318.field3973, class318.field3975}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field4001("", 9, new class318[]{class318.field3973, class318.field3974}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field4000("", 10, new class318[]{class318.field3973}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3996("", 11, new class318[]{class318.field3973}),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field4002("", 12, new class318[]{class318.field3973, class318.field3975}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	field3999("", 13, new class318[]{class318.field3973});

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -824392411
	)
	@Export("id")
	final int id;
	@ObfuscatedName("x")
	final Set field4005;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Llx;)V"
	)
	ModeWhere(String var3, int var4, class318[] var5) {
		this.field4005 = new HashSet();
		this.id = var4; // L: 39
		class318[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class318 var8 = var6[var7]; // L: 43
			this.field4005.add(var8); // L: 44
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4005 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;Lkq;I)V",
		garbageValue = "-505919587"
	)
	public static void method5816(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class377.SequenceDefinition_archive = var0; // L: 46
		WorldMapData_0.SequenceDefinition_animationsArchive = var1; // L: 47
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)Ljz;",
		garbageValue = "1578285523"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class130.getWidget(var0); // L: 200
		if (var1 == -1) { // L: 201
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 202 203
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3770"
	)
	static void method5819() {
		if (Login.clearLoginScreen) { // L: 275
			Login.titleboxSprite = null; // L: 276
			class259.titlebuttonSprite = null; // L: 277
			Login.runesSprite = null; // L: 278
			class260.leftTitleSprite = null; // L: 279
			FriendSystem.rightTitleSprite = null; // L: 280
			class28.logoSprite = null; // L: 281
			class371.title_muteSprite = null; // L: 282
			Script.options_buttons_0Sprite = null; // L: 283
			class1.options_buttons_2Sprite = null; // L: 284
			WorldMapRectangle.worldSelectBackSprites = null; // L: 285
			Occluder.worldSelectFlagSprites = null; // L: 286
			VertexNormal.worldSelectArrows = null; // L: 287
			Archive.worldSelectStars = null; // L: 288
			Coord.field3230 = null; // L: 289
			Login.loginScreenRunesAnimation.method2208(); // L: 290
			class259.method4998(2); // L: 291
			UserComparator4.method2434(true); // L: 292
			Login.clearLoginScreen = false; // L: 293
		}
	} // L: 294
}
