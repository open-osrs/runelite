import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class277 {
	@ObfuscatedName("m")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1799040781"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field879 = 0L; // L: 4204
		if (var0 >= 2) { // L: 4205
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4206
		}

		if (UrlRequester.getWindowedMode() == 1) { // L: 4207
			ByteArrayPool.client.setMaxCanvasSize(765, 503); // L: 4208
		} else {
			ByteArrayPool.client.setMaxCanvasSize(7680, 2160); // L: 4211
		}

		if (Client.gameState >= 25) { // L: 4213
			Actor.method1855();
		}

	} // L: 4214
}
