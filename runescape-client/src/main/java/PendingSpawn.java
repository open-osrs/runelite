import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lnx;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1308718051
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 45701607
	)
	@Export("type")
	int type;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -155667971
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1448621267
	)
	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1001354287
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1329191507
	)
	int field1199;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -184031209
	)
	int field1203;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1951692743
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 850261387
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1647401883
	)
	int field1196;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2107117867
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -317675493
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0; // L: 16
		this.hitpoints = -1; // L: 17
	} // L: 19

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "56"
	)
	static char method2152(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 63 64
	}
}
