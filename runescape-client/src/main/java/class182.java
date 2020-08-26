import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class182 {
	@ObfuscatedName("s")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("t")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 346475307
	)
	static int field2135;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1906338265
	)
	static int field2136;
	@ObfuscatedName("w")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("g")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive0")
	static Archive archive0;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1480646346"
	)
	static void method3683(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 150
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 151
		KeyHandler.field418 = -1; // L: 152
	} // L: 153
}
