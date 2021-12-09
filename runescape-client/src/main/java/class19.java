import java.security.SecureRandom;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class19 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("fa")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("c")
	Future field100;
	@ObfuscatedName("b")
	String field101;

	class19(Future var1) {
		this.field100 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method306(var1); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1875205384"
	)
	void method306(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field101 = var1; // L: 19
		if (this.field100 != null) { // L: 20
			this.field100.cancel(true);
			this.field100 = null;
		}

	} // L: 24

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1673495368"
	)
	public final String method307() {
		return this.field101; // L: 27
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-274193431"
	)
	public boolean method331() {
		return this.field101 != null || this.field100 == null; // L: 31
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1434821214"
	)
	public final boolean method309() {
		return this.method331() ? true : this.field100.isDone(); // L: 35 36
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lq;",
		garbageValue = "-45"
	)
	public final class21 method310() {
		if (this.method331()) { // L: 40
			return new class21(this.field101);
		} else if (!this.method309()) { // L: 41
			return null;
		} else {
			try {
				return (class21)this.field100.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method306(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1773955351"
	)
	public static void method330(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1264521641"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1665
		Login.Login_response2 = var1; // L: 1666
		Login.Login_response3 = var2; // L: 1667
	} // L: 1668

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Z",
		garbageValue = "111761811"
	)
	static final boolean method329(Widget var0) {
		int var1 = var0.contentType; // L: 12296
		if (var1 == 205) { // L: 12297
			Client.logoutTimer = 250; // L: 12298
			return true; // L: 12299
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12301
				var2 = (var1 - 300) / 2; // L: 12302
				var3 = var1 & 1; // L: 12303
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12304
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12306
				var2 = (var1 - 314) / 2; // L: 12307
				var3 = var1 & 1; // L: 12308
				Client.playerAppearance.method5391(var2, var3 == 1); // L: 12309
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 12311
			}

			if (var1 == 325) { // L: 12312
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 12313
				PacketBufferNode var4 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher); // L: 12315
				Client.playerAppearance.write(var4.packetBuffer); // L: 12316
				Client.packetWriter.addNode(var4); // L: 12317
				return true; // L: 12318
			} else {
				return false; // L: 12320
			}
		}
	}
}
