import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("World")
public class World {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -99479259
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 666094335
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("l")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("q")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2132870801
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1264114231
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1643368369
	)
	@Export("population")
	int population;
	@ObfuscatedName("k")
	@Export("host")
	String host;
	@ObfuscatedName("d")
	@Export("activity")
	String activity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 786542067
	)
	@Export("location")
	int location;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -154567813
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1237619504"
	)
	boolean method1637() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1559605214"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-3"
	)
	boolean method1639() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1091774244"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-980357381"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-67"
	)
	boolean method1642() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "248587859"
	)
	static long method1678() {
		try {
			URL var0 = new URL(ArchiveLoader.method2063("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) {
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000);

			return 0L; // L: 52
		} catch (Exception var9) {
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-88"
	)
	public static int method1673(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 49
		int var1 = (int)(var2 >>> 0 & 127L); // L: 51
		return var1; // L: 53
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2080667319"
	)
	public static int method1679(int var0, int var1, int var2) {
		int var3 = class54.method1078(var2 - var1 + 1); // L: 37
		var3 <<= var1; // L: 38
		return var0 & ~var3; // L: 39
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1622392704"
	)
	public static int method1677() {
		return ++MouseHandler.MouseHandler_idleCycles - 1; // L: 59
	}
}
