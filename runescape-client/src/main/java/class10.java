import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class10 {
	@ObfuscatedName("l")
	HttpsURLConnection field49;
	@ObfuscatedName("q")
	final Map field51;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	class360 field50;
	@ObfuscatedName("j")
	Map field55;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	final class9 field52;
	@ObfuscatedName("k")
	boolean field53;
	@ObfuscatedName("t")
	boolean field54;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 978288269
	)
	int field57;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Li;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field53 = false;
		this.field54 = false;
		this.field57 = 300000;
		if (!var2.method74()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method85());
		} else {
			this.field49 = (HttpsURLConnection)var1.openConnection();
			this.field49.setSSLSocketFactory(new class15());
			this.field52 = var2;
			this.field51 = new HashMap();
			this.field55 = new HashMap();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1233460295"
	)
	public void method91(String var1, String var2) {
		if (!this.field53) {
			this.field51.put(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-25817"
	)
	String method92() {
		ArrayList var1 = new ArrayList(this.field55.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class359)var4.getKey()).method6333());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2133161377"
	)
	void method102() throws ProtocolException {
		if (!this.field53) {
			this.field49.setRequestMethod(this.field52.method85());
			if (!this.field55.isEmpty()) {
				this.field51.put("Accept", this.method92());
			}

			Iterator var1 = this.field51.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field49.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field52.method76() && this.field50 != null) {
				this.field49.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field50.method6336((byte)89));
					var13.writeTo(this.field49.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field49.setConnectTimeout(this.field57);
			this.field49.setInstanceFollowRedirects(this.field54);
			this.field53 = true;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1708578826"
	)
	boolean method94() throws IOException, SocketTimeoutException {
		if (!this.field53) {
			this.method102();
		}

		this.field49.connect();
		return this.field49.getResponseCode() == -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Lo;",
		garbageValue = "-3416"
	)
	class21 method98() {
		try {
			if (!this.field53 || this.field49.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field49.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field49);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field49.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "516116106"
	)
	static void method104(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, WorldMapSectionType.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class67.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2740, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method6930(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2682, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6931(var3[var6]);
					var8.packetBuffer.method7066(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2695, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7066(0);
					var8.packetBuffer.method6930(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2709, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7117(0);
					var8.packetBuffer.method7029(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			GraphicsDefaults.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
