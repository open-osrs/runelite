import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class92 {
	@ObfuscatedName("h")
	static final BigInteger field1170;
	@ObfuscatedName("v")
	static final BigInteger field1168;
	@ObfuscatedName("l")
	static int[][] field1173;
	@ObfuscatedName("e")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive10")
	static Archive archive10;

	static {
		field1170 = new BigInteger("10001", 16);
		field1168 = new BigInteger("a79020d1617f0ba919c482c16d3ca354b6f489c1fc0f8b7ae13f0b045d400a01909941833566aa78af9725aa374a64c5cab6a9b920c6d77d02e38c969a27c969e05a0b90b46b8bf8d6497f1f5128a7d2007dacc592ac40a393cffb7ed0283be246faabbb3d7b98bc6663678643cd33410b37d2dae42239bf606084415ee4fc97", 16);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lhe;",
		garbageValue = "-100010964"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = CollisionMap.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}
}
