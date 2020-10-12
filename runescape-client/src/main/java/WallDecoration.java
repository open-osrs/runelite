import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public final class WallDecoration {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1170791361
	)
	int orientation;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 85116123
	)
	int tileHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 841011539
	)
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 321574291
	)
	int y;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -429102155
	)
	int orientation2;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -978448895
	)
	int xOffset;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2017479075
	)
	int yOffset;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public Entity entity1;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public Entity entity2;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -8703832368131294063L
	)
	public long tag;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2069520015
	)
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-807916273"
	)
	public static void method3409() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 58
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 59
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 60
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 61
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 62
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 63
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 64
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 65
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 66
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 67
		}
	} // L: 69
}
