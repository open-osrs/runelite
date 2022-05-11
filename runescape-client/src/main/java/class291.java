import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class291 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	UrlRequest field3356;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	SpritePixels field3357;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lce;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3356 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) {
			this.field3356 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lcb;)V"
	)
	class291(UrlRequest var1) {
		this.field3356 = var1; // L: 24
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lqr;",
		garbageValue = "1905006321"
	)
	SpritePixels method5391() {
		if (this.field3357 == null && this.field3356 != null && this.field3356.isDone()) { // L: 28
			if (this.field3356.getResponse() != null) { // L: 29
				this.field3357 = Frames.method4217(this.field3356.getResponse()); // L: 30
			}

			this.field3356 = null; // L: 32
		}

		return this.field3357; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Llk;II)Llk;",
		garbageValue = "-1552191752"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	static final void method5390(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 12054
		if (var0 != class12.clientPreferences.method2248()) { // L: 12055
			if (class12.clientPreferences.method2248() == 0 && Client.currentTrackGroupId != -1) { // L: 12056
				UserComparator8.method2574(AbstractUserComparator.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 12057
				Client.playingJingle = false; // L: 12058
			} else if (var0 == 0) { // L: 12060
				ApproximateRouteStrategy.method1110(); // L: 12061
				Client.playingJingle = false; // L: 12062
			} else if (class273.musicPlayerStatus != 0) { // L: 12065
				Clock.musicTrackVolume = var0;
			} else {
				class273.midiPcmStream.setPcmStreamVolume(var0); // L: 12066
			}

			class12.clientPreferences.method2234(var0); // L: 12068
		}

	} // L: 12070
}
