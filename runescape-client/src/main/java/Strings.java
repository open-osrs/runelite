import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bd")
	public static String field3501;
	@ObfuscatedName("cu")
	public static String field3446;
	@ObfuscatedName("jo")
	public static String field3595;
	@ObfuscatedName("jq")
	public static String field3634;
	@ObfuscatedName("ja")
	public static String field3597;

	static {
		field3501 = "Please visit the support page for assistance."; // L: 60
		field3446 = "Please visit the support page for assistance."; // L: 99
		field3595 = ""; // L: 284
		field3634 = "Page has opened in a new window."; // L: 285
		field3597 = "(Please check your popup blocker.)"; // L: 286
	} // L: 324

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1995982953"
	)
	static void method5220() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58
}
