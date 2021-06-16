import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("f")
	byte[] field2821;
	@ObfuscatedName("e")
	byte[] field2828;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 660158301
	)
	int field2823;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1122289667
	)
	int field2824;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1506593887
	)
	int field2825;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1063297041
	)
	int field2822;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1150913277
	)
	int field2826;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1271826479
	)
	int field2827;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -12467387
	)
	int field2829;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1118422723"
	)
	static final void method4537(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 114
		UserComparator10.addGameMessage(30, "", var1); // L: 116
	} // L: 118
}
