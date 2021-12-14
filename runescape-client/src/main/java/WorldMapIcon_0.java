import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -198838733
	)
	@Export("element")
	final int element;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1320837941
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1830230057
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lju;Lju;ILhm;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class78.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1255702565"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lhm;",
		garbageValue = "-577826789"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21504"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1225820190"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "94"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
