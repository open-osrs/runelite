import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -86570713
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 143955813
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1572822193
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
