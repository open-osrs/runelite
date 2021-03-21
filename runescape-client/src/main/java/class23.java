import java.io.File;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("r")
public class class23 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-1646838359"
	)
	@Export("isWriteable")
	static boolean isWriteable(File var0, boolean deleteAfterWrite) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 206
			int var3 = var2.read(); // L: 207
			var2.seek(0L); // L: 208
			var2.write(var3); // L: 209
			var2.seek(0L); // L: 210
			var2.close(); // L: 211
			if (deleteAfterWrite) { // L: 212
				var0.delete();
			}

			return true; // L: 213
		} catch (Exception var4) { // L: 215
			return false; // L: 216
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-981908924"
	)
	static void method232() {
		Tiles.field517 = null; // L: 64
		class200.field2399 = null; // L: 65
		Tiles.field530 = null; // L: 66
		class1.field1 = null; // L: 67
		class2.field12 = null; // L: 68
		TaskHandler.field2045 = null; // L: 69
		WorldMapSprite.field257 = null; // L: 70
		GrandExchangeOfferAgeComparator.Tiles_hue = null; // L: 71
		Tiles.Tiles_saturation = null;
		WorldMapLabel.Tiles_lightness = null; // L: 73
		TaskHandler.Tiles_hueMultiplier = null; // L: 74
		WorldMapID.field292 = null; // L: 75
	} // L: 76

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1513413924"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 72
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1738423224"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 95

		try {
			var0 = WorldMapRectangle.getPreferencesFile("", FontName.field3699.name, true); // L: 97
			Buffer var1 = WorldMapSectionType.clientPreferences.toBuffer(); // L: 98
			var0.write(var1.array, 0, var1.offset); // L: 99
		} catch (Exception var3) { // L: 101
		}

		try {
			if (var0 != null) { // L: 103
				var0.closeSync(true); // L: 104
			}
		} catch (Exception var2) { // L: 107
		}

	} // L: 108

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1098573147"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 222
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 223
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 224
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 225
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 226
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 227
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 228
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 229
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 230 231
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-354639322"
	)
	static final void method234(boolean var0) {
		if (var0) { // L: 2650
			Client.field661 = Login.field1217 ? class169.field2011 : class169.field2018; // L: 2651
		} else {
			LinkedHashMap var1 = WorldMapSectionType.clientPreferences.parameters; // L: 2654
			String var3 = Login.Login_username; // L: 2656
			int var4 = var3.length(); // L: 2658
			int var5 = 0; // L: 2659

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2660
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field661 = var1.containsKey(var5) ? class169.field2013 : class169.field2012; // L: 2663
		}

	} // L: 2665
}