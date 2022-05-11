import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class401 implements class399 {
	@ObfuscatedName("q")
	final Map field4440;

	public class401(Map var1) {
		this.field4440 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2132228640"
	)
	public byte[] vmethod6962() throws UnsupportedEncodingException {
		return this.method6961().getBytes("UTF-8"); // L: 16
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "685635787"
	)
	public String method6961() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 20
		Iterator var2 = this.field4440.entrySet().iterator(); // L: 21

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 22
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?"); // L: 31
			return var1.toString(); // L: 32
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgp;",
		garbageValue = "-961996891"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)Z",
		garbageValue = "-1"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10886
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10887
				int var2 = Players.method2413(var0, var1); // L: 10888
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10889
				if (var0.cs1Comparisons[var1] == 2) { // L: 10890
					if (var2 >= var3) { // L: 10891
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10893
					if (var2 <= var3) { // L: 10894
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10896
					if (var2 == var3) { // L: 10897
						return false;
					}
				} else if (var3 != var2) { // L: 10899
					return false;
				}
			}

			return true; // L: 10901
		}
	}
}
