import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class295 {
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1052203633"
	)
	static void method5382(String var0) {
		ItemContainer.field1009 = var0;

		try {
			String var1 = class21.client.getParameter(Integer.toString(18));
			String var2 = class21.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + UserComparator3.method2438(UserComparator4.method2406() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class27.method405(class21.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
