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

@ObfuscatedName("o")
public class class10 {
	@ObfuscatedName("aq")
	static String field58;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 892937659
	)
	static int field59;
	@ObfuscatedName("ht")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("c")
	HttpsURLConnection field53;
	@ObfuscatedName("b")
	final Map field48;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	class377 field50;
	@ObfuscatedName("m")
	Map field49;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class9 field52;
	@ObfuscatedName("s")
	boolean field51;
	@ObfuscatedName("j")
	boolean field57;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 755208065
	)
	int field55;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lr;)V"
	)
	public class10(URL var1, class9 var2) throws IOException {
		this.field51 = false;
		this.field57 = false;
		this.field55 = 300000;
		if (!var2.method85()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method100());
		} else {
			this.field53 = (HttpsURLConnection)var1.openConnection();
			this.field53.setSSLSocketFactory(new class15());
			this.field52 = var2;
			this.field48 = new HashMap();
			this.field49 = new HashMap();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-659899332"
	)
	public void method121(String var1, String var2) {
		if (!this.field51) {
			this.field48.put(var1, var2);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1718208734"
	)
	String method109() {
		ArrayList var1 = new ArrayList(this.field49.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class376)var4.getKey()).method6793());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method104() throws ProtocolException {
		if (!this.field51) {
			this.field53.setRequestMethod(this.field52.method100());
			if (!this.field49.isEmpty()) {
				this.field48.put("Accept", this.method109());
			}

			Iterator var1 = this.field48.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next();
				this.field53.setRequestProperty((String)var2.getKey(), (String)var2.getValue());
			}

			if (this.field52.method86() && this.field50 != null) {
				this.field53.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field50.method6796(-1647266432));
					var13.writeTo(this.field53.getOutputStream());
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

			this.field53.setConnectTimeout(this.field55);
			this.field53.setInstanceFollowRedirects(this.field57);
			this.field51 = true;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-378004067"
	)
	boolean method105() throws IOException, SocketTimeoutException {
		if (!this.field51) {
			this.method104();
		}

		this.field53.connect();
		return this.field53.getResponseCode() == -1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lq;",
		garbageValue = "-2098724409"
	)
	class21 method106() {
		try {
			if (!this.field51 || this.field53.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field53.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field53);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field53.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILmy;Lkz;B)V",
		garbageValue = "16"
	)
	static void method122(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgf;I)V",
		garbageValue = "1276924993"
	)
	static final void method119(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					ScriptFrame.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1542275516"
	)
	static final void method123(String var0) {
		PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2895, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "372010078"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "708882827"
	)
	static final void method124(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field504[var4] = true;
			}
		}

	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Lcl;ZI)V",
		garbageValue = "-1418873427"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class273.method5333(var2);
		}

		TextureProvider.method4185(var2);
		Widget var4 = ChatChannel.getWidget(var3);
		if (var4 != null) {
			SecureRandomCallable.invalidateWidget(var4);
		}

		FileSystem.decrementMenuEntries();
		if (Client.rootInterface != -1) {
			Message.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
