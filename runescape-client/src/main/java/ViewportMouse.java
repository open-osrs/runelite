import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("h")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1614350995
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1512195797
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("g")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -260034093
	)
	static int field2486;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 824939567
	)
	static int field2482;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 946591513
	)
	static int field2488;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1495299577
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

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
		descriptor = "(IB)Leq;",
		garbageValue = "110"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 27
			var1 = new EnumComposition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1270821311"
	)
	public static void method4193() {
		class232.midiPcmStream.clear(); // L: 55
		class232.musicPlayerStatus = 1; // L: 56
		JagexCache.musicTrackArchive = null; // L: 57
	} // L: 58

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	static final void method4194() {
		boolean var0 = false; // L: 9050

		while (!var0) { // L: 9051
			var0 = true; // L: 9052

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 9053
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 9054
					String var2 = Client.menuTargets[var1]; // L: 9055
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 9056
					Client.menuTargets[var1 + 1] = var2; // L: 9057
					String var3 = Client.menuActions[var1]; // L: 9058
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 9059
					Client.menuActions[var1 + 1] = var3; // L: 9060
					int var4 = Client.menuOpcodes[var1]; // L: 9061
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 9062
					Client.menuOpcodes[var1 + 1] = var4; // L: 9063
					var4 = Client.menuArguments1[var1]; // L: 9064
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 9065
					Client.menuArguments1[var1 + 1] = var4; // L: 9066
					var4 = Client.menuArguments2[var1]; // L: 9067
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 9068
					Client.menuArguments2[var1 + 1] = var4; // L: 9069
					var4 = Client.menuIdentifiers[var1]; // L: 9070
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 9071
					Client.menuIdentifiers[var1 + 1] = var4; // L: 9072
					boolean var5 = Client.menuShiftClick[var1]; // L: 9073
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 9074
					Client.menuShiftClick[var1 + 1] = var5; // L: 9075
					var0 = false; // L: 9076
				}
			}
		}

	} // L: 9080
}
