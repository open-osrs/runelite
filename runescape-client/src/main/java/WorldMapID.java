import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	static final WorldMapID field2195;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	static final WorldMapID field2190;
	@ObfuscatedName("t")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1713675959
	)
	@Export("value")
	final int value;

	static {
		field2195 = new WorldMapID(0);
		field2190 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
