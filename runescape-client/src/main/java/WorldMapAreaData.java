import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("aj")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("n")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("x")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("p")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lkb;IZI)V",
		garbageValue = "-1456851235"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lkb;ZI)V",
		garbageValue = "1993639768"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method5851(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "1786307313"
	)
	public static void method791(AbstractArchive var0) {
		StructDefinition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Liw;II)Z",
		garbageValue = "1365673620"
	)
	static boolean method787(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 253
		if (var2 == null) { // L: 254
			return false;
		} else {
			class217.SpriteBuffer_decode(var2); // L: 255
			return true; // L: 256
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-651553364"
	)
	static boolean method786() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4926
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1738497554"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ScriptFrame.loadInterface(var0)) { // L: 10809
			class25.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 10810
		}
	} // L: 10811

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-85"
	)
	static void method790(String var0) {
		WorldMapRegion.field281 = var0; // L: 11557

		try {
			String var1 = ByteArrayPool.client.getParameter(Integer.toString(18)); // L: 11559
			String var2 = ByteArrayPool.client.getParameter(Integer.toString(13)); // L: 11560
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11561
			String var5;
			if (var0.length() == 0) { // L: 11562
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 11564
				long var6 = User.currentTimeMillis() + 94608000000L; // L: 11566
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 11568
				int var8 = Calendar.Calendar_calendar.get(7); // L: 11569
				int var9 = Calendar.Calendar_calendar.get(5); // L: 11570
				int var10 = Calendar.Calendar_calendar.get(2); // L: 11571
				int var11 = Calendar.Calendar_calendar.get(1); // L: 11572
				int var12 = Calendar.Calendar_calendar.get(11); // L: 11573
				int var13 = Calendar.Calendar_calendar.get(12); // L: 11574
				int var14 = Calendar.Calendar_calendar.get(13); // L: 11575
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 11576
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 11578
			}

			Client var16 = ByteArrayPool.client; // L: 11580
			var5 = "document.cookie=\"" + var3 + "\""; // L: 11581
			JSObject.getWindow(var16).eval(var5); // L: 11584
		} catch (Throwable var15) { // L: 11587
		}

	} // L: 11588
}
