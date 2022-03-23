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
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class10 {
	@ObfuscatedName("v")
	HttpsURLConnection field49;
	@ObfuscatedName("o")
	final Map field47;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	class398 field46;
	@ObfuscatedName("g")
	Map field48;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class9 field53;
	@ObfuscatedName("n")
	boolean field51;
	@ObfuscatedName("d")
	boolean field52;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1134154975
	)
	int field50;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lr;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field51 = false; // L: 20
		this.field52 = false; // L: 21
		this.field50 = 300000; // L: 22
		if (!var2.method65()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method73()); // L: 25
		} else {
			this.field49 = (HttpsURLConnection)var1.openConnection(); // L: 26
			this.field49.setSSLSocketFactory(new class15()); // L: 27
			this.field53 = var2; // L: 28
			this.field47 = new HashMap(); // L: 29
			this.field48 = new HashMap(); // L: 30
		}
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "113"
	)
	public void method87(String var1, String var2) {
		if (!this.field51) { // L: 34
			this.field47.put(var1, var2); // L: 35
		}
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1439457532"
	)
	String method100() {
		ArrayList var1 = new ArrayList(this.field48.entrySet()); // L: 39
		Collections.sort(var1, new class18(this)); // L: 40
		StringBuilder var2 = new StringBuilder(); // L: 53
		Iterator var3 = var1.iterator(); // L: 54

		while (var3.hasNext()) { // L: 65
			Entry var4 = (Entry)var3.next(); // L: 55
			if (var2.length() > 0) { // L: 57
				var2.append(",");
			}

			var2.append(((class397)var4.getKey()).method7217()); // L: 58
			float var5 = (Float)var4.getValue(); // L: 59
			if (var5 < 1.0F) { // L: 60
				String var6 = Float.toString(var5).substring(0, 4); // L: 61
				var2.append(";q=" + var6); // L: 62
			}
		}

		return var2.toString(); // L: 66
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1510318175"
	)
	void method89() throws ProtocolException {
		if (!this.field51) { // L: 70
			this.field49.setRequestMethod(this.field53.method73()); // L: 71
			if (!this.field48.isEmpty()) { // L: 72
				this.field47.put("Accept", this.method100());
			}

			Iterator var1 = this.field47.entrySet().iterator(); // L: 73

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 74
				this.field49.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 76
			}

			if (this.field53.method67() && this.field46 != null) { // L: 79
				this.field49.setDoOutput(true); // L: 80
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 81

				try {
					var13.write(this.field46.vmethod7229()); // L: 83
					var13.writeTo(this.field49.getOutputStream()); // L: 84
				} catch (IOException var11) { // L: 86
					var11.printStackTrace(); // L: 87
				} finally {
					if (var13 != null) { // L: 90
						try {
							var13.close(); // L: 92
						} catch (IOException var10) { // L: 94
							var10.printStackTrace(); // L: 95
						}
					}

				}
			}

			this.field49.setConnectTimeout(this.field50); // L: 100
			this.field49.setInstanceFollowRedirects(this.field52); // L: 101
			this.field51 = true; // L: 102
		}
	} // L: 103

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1894788243"
	)
	boolean method105() throws IOException, SocketTimeoutException {
		if (!this.field51) { // L: 106
			this.method89();
		}

		this.field49.connect(); // L: 107
		return this.field49.getResponseCode() == -1; // L: 108
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ly;",
		garbageValue = "84"
	)
	class21 method91() {
		try {
			if (!this.field51 || this.field49.getResponseCode() == -1) { // L: 114
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 116
			this.field49.disconnect(); // L: 117
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 118
		}

		class21 var1 = null; // L: 120

		class21 var3;
		try {
			var1 = new class21(this.field49); // L: 122
			return var1; // L: 130
		} catch (IOException var8) { // L: 124
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 125
		} finally {
			this.field49.disconnect(); // L: 128
		}

		return var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-69"
	)
	static final void method106(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 179
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		Login.addGameMessage(30, "", var1); // L: 181
	} // L: 183

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-13200"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 4980
			int var3 = Archive.getTileHeight(var0, var1, class160.Client_plane) - var2; // L: 4985
			var0 -= EnumComposition.cameraX; // L: 4986
			var3 -= FriendSystem.cameraY; // L: 4987
			var1 -= CollisionMap.cameraZ; // L: 4988
			int var4 = Rasterizer3D.Rasterizer3D_sine[Language.cameraPitch]; // L: 4989
			int var5 = Rasterizer3D.Rasterizer3D_cosine[Language.cameraPitch]; // L: 4990
			int var6 = Rasterizer3D.Rasterizer3D_sine[MusicPatchNode2.cameraYaw]; // L: 4991
			int var7 = Rasterizer3D.Rasterizer3D_cosine[MusicPatchNode2.cameraYaw]; // L: 4992
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 4993
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 4994
			var0 = var8; // L: 4995
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 4996
			var1 = var5 * var1 + var4 * var3 >> 16; // L: 4997
			if (var1 >= 50) { // L: 4999
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5000
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5001
			} else {
				Client.viewportTempX = -1; // L: 5004
				Client.viewportTempY = -1; // L: 5005
			}

		} else {
			Client.viewportTempX = -1; // L: 4981
			Client.viewportTempY = -1; // L: 4982
		}
	} // L: 4983 5007

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1276498116"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class230.friendsChat != null) { // L: 11715
			PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2921, Client.packetWriter.isaacCipher); // L: 11716
			var1.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var0)); // L: 11717
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11718
			Client.packetWriter.addNode(var1); // L: 11719
		}
	} // L: 11720
}
