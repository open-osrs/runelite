import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class219 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("huffman")
	static Huffman huffman;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "1786599747"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = class1.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;I)Z",
		garbageValue = "1703173158"
	)
	public static boolean method4010(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1; // L: 44
		if (!var0.isFullyLoaded()) { // L: 45
			return false; // L: 46
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35); // L: 48
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 49

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 50
				byte[] var3 = var0.takeFile(35, var2); // L: 51
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2); // L: 52
				if (var3 != null) { // L: 53
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3)); // L: 54
					WorldMapElement.WorldMapElement_cached[var2].method4391(); // L: 55
				}
			}

			return true; // L: 58
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2069010716"
	)
	static void method4009() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 208
			if (Timer.clientPreferences.rememberedUsername != null) { // L: 209
				Login.Login_username = Timer.clientPreferences.rememberedUsername; // L: 210
				Client.Login_isUsernameRemembered = true; // L: 211
			} else {
				Client.Login_isUsernameRemembered = false; // L: 213
			}

		}
	} // L: 214

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-317727770"
	)
	static final void method4003(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 119
		class234.addGameMessage(30, "", var1); // L: 121
	} // L: 123

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Llr;",
		garbageValue = "1"
	)
	public static AbstractSocket method4011(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}
}
