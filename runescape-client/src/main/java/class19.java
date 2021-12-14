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
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("fa")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("c")
	Future field100;
	@ObfuscatedName("b")
	String field101;

	class19(Future var1) {
		this.field100 = var1;
	}

	class19(String var1) {
		this.method306(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1875205384"
	)
	void method306(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field101 = var1;
		if (this.field100 != null) {
			this.field100.cancel(true);
			this.field100 = null;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1673495368"
	)
	public final String method307() {
		return this.field101;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-274193431"
	)
	public boolean method331() {
		return this.field101 != null || this.field100 == null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1434821214"
	)
	public final boolean method309() {
		return this.method331() ? true : this.field100.isDone();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Lq;",
		garbageValue = "-45"
	)
	public final class21 method310() {
		if (this.method331()) {
			return new class21(this.field101);
		} else if (!this.method309()) {
			return null;
		} else {
			try {
				return (class21)this.field100.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method306(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1773955351"
	)
	public static void method330(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1264521641"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Z",
		garbageValue = "111761811"
	)
	static final boolean method329(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5391(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
