import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ep")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("z")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1355902097
	)
	static int ViewportMouse_x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1743017163
	)
	static int ViewportMouse_y;
	@ObfuscatedName("t")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1199867819
	)
	static int field1768;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1371000863
	)
	static int field1769;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1954448985
	)
	static int field1770;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 91913629
	)
	static int field1771;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1953465913
	)
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("q")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(Liw;Ljava/lang/String;B)V",
		garbageValue = "-71"
	)
	static void method3082(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1421
		Client.archiveLoaders.add(var2); // L: 1422
		Client.field949 += var2.groupCount; // L: 1423
	} // L: 1424

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "173237024"
	)
	static final void logOut() {
		Client.packetWriter.close(); // L: 2485
		Actor.method1805(); // L: 2486
		ScriptEvent.scene.clear(); // L: 2487

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2488
			Client.collisionMaps[var0].clear();
		}

		System.gc(); // L: 2489
		class58.method915(2); // L: 2490
		Client.currentTrackGroupId = -1; // L: 2491
		Client.field704 = false; // L: 2492

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 2494
			if (var1.stream1 != null) { // L: 2495
				Players.pcmStreamMixer.removeSubStream(var1.stream1); // L: 2496
				var1.stream1 = null; // L: 2497
			}

			if (var1.stream2 != null) { // L: 2499
				Players.pcmStreamMixer.removeSubStream(var1.stream2); // L: 2500
				var1.stream2 = null; // L: 2501
			}
		}

		ObjectSound.objectSounds.clear(); // L: 2504
		CollisionMap.updateGameState(10); // L: 2506
	} // L: 2507

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "323383255"
	)
	static void method3098(String var0) {
		class200.field2403 = var0; // L: 10765

		try {
			String var1 = class2.client.getParameter(Integer.toString(18)); // L: 10767
			String var2 = class2.client.getParameter(Integer.toString(13)); // L: 10768
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 10769
			if (var0.length() == 0) { // L: 10770
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + WorldMapSection1.method650(PacketWriter.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 10771
			}

			Client var4 = class2.client; // L: 10772
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 10773
			JSObject.getWindow(var4).eval(var5); // L: 10776
		} catch (Throwable var6) { // L: 10779
		}

	} // L: 10780
}
