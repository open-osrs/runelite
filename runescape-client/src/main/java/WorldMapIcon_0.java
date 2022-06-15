import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 2063269649
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -717867737
	)
	@Export("element")
	final int element;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -466218723
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1083440853
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lkd;Lkd;ILiz;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = class432.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "781292504"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 31
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Liz;",
		garbageValue = "1473728"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 36
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1263012412"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 41
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-34"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 46
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Ljava/lang/String;",
		garbageValue = "-1970746569"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var0)) == 0) { // L: 12322
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12323 12324 12326
		}
	}
}
