import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class160 {
	@ObfuscatedName("x")
	public static short[][] field1747;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1196067177
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	static Widget field1750;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	public UrlRequest field1749;
	@ObfuscatedName("o")
	public float[] field1748;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1748 = new float[4]; // L: 326
	} // L: 328

	@ObfuscatedName("v")
	public static String method3236(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 31
		int var2 = Calendar.Calendar_calendar.get(7); // L: 32
		int var3 = Calendar.Calendar_calendar.get(5); // L: 33
		int var4 = Calendar.Calendar_calendar.get(2); // L: 34
		int var5 = Calendar.Calendar_calendar.get(1); // L: 35
		int var6 = Calendar.Calendar_calendar.get(11); // L: 36
		int var7 = Calendar.Calendar_calendar.get(12); // L: 37
		int var8 = Calendar.Calendar_calendar.get(13); // L: 38
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 39
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-235461419"
	)
	public static void method3237() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 43
			synchronized(MouseHandler.MouseHandler_instance) { // L: 44
				MouseHandler.MouseHandler_instance = null; // L: 45
			} // L: 46
		}

	} // L: 48

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2025153042"
	)
	static final void method3238() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4351 4352 4359
			if (var0.plane == Client_plane && !var0.isFinished) { // L: 4353
				if (Client.cycle >= var0.cycleStart) { // L: 4354
					var0.advance(Client.field550); // L: 4355
					if (var0.isFinished) { // L: 4356
						var0.remove();
					} else {
						FriendSystem.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 4357
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4361
}
