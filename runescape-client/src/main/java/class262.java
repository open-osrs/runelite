import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class262 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnv;J)V"
	)
	static void method4896(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (VarcInt.pcmPlayer1 != null) {
			VarcInt.pcmPlayer1.run();
		}

		if (WorldMapDecoration.pcmPlayer0 != null) {
			WorldMapDecoration.pcmPlayer0.run();
		}

	}
}
