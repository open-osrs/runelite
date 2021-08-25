import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class21 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	static IndexedSprite field107;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1947507319
	)
	final int field105;
	@ObfuscatedName("c")
	final String field109;

	class21(String var1) {
		this.field105 = 400;
		this.field109 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field105 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field105 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field109 = var2.toString();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "45126595"
	)
	public int method317() {
		return this.field105;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1396906157"
	)
	public String method316() {
		return this.field109;
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "(Lkx;Ljava/lang/String;I)V",
		garbageValue = "1344267675"
	)
	static void method323(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field763 += var2.groupCount;
	}
}
