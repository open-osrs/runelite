import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -326529945
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -777918577
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1953592577
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
