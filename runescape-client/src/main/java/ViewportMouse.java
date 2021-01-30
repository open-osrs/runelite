import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("h")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1491760047
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1851429051
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("w")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1457304063
	)
	static int field1758;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2019363501
	)
	static int field1759;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 378915017
	)
	static int field1765;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1817647009
	)
	static int field1761;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -344047059
	)
	static int field1762;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1994634683
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("i")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("au")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("redHintArrowSprite")
	static Sprite redHintArrowSprite;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgw;",
		garbageValue = "12"
	)
	static LoginPacket[] method3062() {
		return new LoginPacket[]{LoginPacket.field2334, LoginPacket.field2332, LoginPacket.field2336, LoginPacket.field2339, LoginPacket.field2335, LoginPacket.field2337}; // L: 22
	}
}
