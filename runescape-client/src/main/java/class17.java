import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
class class17 implements SSLSession {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("r")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("fu")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -2098489797
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lw;)V"
	)
	class17(class12 var1) {
		this.this$1 = var1; // L: 115
	}

	public int getApplicationBufferSize() {
		return 0; // L: 117
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException(); // L: 121
	}

	public byte[] getId() {
		throw new UnsupportedOperationException(); // L: 129
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException(); // L: 125
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException(); // L: 137
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException(); // L: 141
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null; // L: 149
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field62; // L: 153
	}

	public int getPeerPort() {
		return 0; // L: 161
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null; // L: 165
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException(); // L: 193
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException(); // L: 145
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException(); // L: 181
	}

	public boolean isValid() {
		throw new UnsupportedOperationException(); // L: 189
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException(); // L: 197
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException(); // L: 173
	}

	public String getProtocol() {
		throw new UnsupportedOperationException(); // L: 169
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException(); // L: 133
	}

	public void invalidate() {
		throw new UnsupportedOperationException(); // L: 185
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException(); // L: 157
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException(); // L: 177
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILnw;Llx;I)V",
		garbageValue = "-71140418"
	)
	static void method256(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 18
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 20
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) { // L: 21
					var3 = var5.data; // L: 22
					break; // L: 23
				}
			}
		}

		if (var3 != null) { // L: 27
			var2.load(var1, var0, var3, true); // L: 28
		} else {
			byte[] var4 = var1.read(var0); // L: 31
			var2.load(var1, var0, var4, true); // L: 32
		}
	} // L: 29 33

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-20872"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1219931698"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4702
			var2 = 1;
		}

		if (var3 < 1) { // L: 4703
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4704
		int var6;
		if (var5 < 0) { // L: 4706
			var6 = Client.field760;
		} else if (var5 >= 100) { // L: 4707
			var6 = Client.field761;
		} else {
			var6 = (Client.field761 - Client.field760) * var5 / 100 + Client.field760; // L: 4708
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4709
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field766) { // L: 4710
			var15 = Client.field766; // L: 4711
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4712
			if (var6 > Client.field765) { // L: 4713
				var6 = Client.field765; // L: 4714
				var8 = var3 * var6 * 512 / (var15 * 334); // L: 4715
				var9 = (var2 - var8) / 2; // L: 4716
				if (var4) { // L: 4717
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4718
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4719
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4720
				}

				var0 += var9; // L: 4722
				var2 -= var9 * 2; // L: 4723
			}
		} else if (var7 > Client.field666) { // L: 4726
			var15 = Client.field666; // L: 4727
			var6 = var15 * var2 * 334 / (var3 * 512); // L: 4728
			if (var6 < Client.field764) { // L: 4729
				var6 = Client.field764; // L: 4730
				var8 = var15 * var2 * 334 / (var6 * 512); // L: 4731
				var9 = (var3 - var8) / 2; // L: 4732
				if (var4) { // L: 4733
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4734
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4735
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4736
				}

				var1 += var9; // L: 4738
				var3 -= var9 * 2; // L: 4739
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4742
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4743
			int[] var14 = new int[9]; // L: 4745

			for (var9 = 0; var9 < var14.length; ++var9) { // L: 4746
				int var10 = var9 * 32 + 15 + 128; // L: 4747
				int var11 = var10 * 3 + 600; // L: 4750
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4753
				int var12 = class13.method164(var11, var3); // L: 4754
				var14[var9] = var13 * var12 >> 16; // L: 4755
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, var2 * 334 / var3, 334); // L: 4757
		}

		Client.viewportOffsetX = var0; // L: 4760
		Client.viewportOffsetY = var1; // L: 4761
		Client.viewportWidth = var2; // L: 4762
		Client.viewportHeight = var3; // L: 4763
	} // L: 4764
}
