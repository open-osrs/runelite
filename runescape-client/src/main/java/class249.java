import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class249 {
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-2048976423"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return PcmPlayer.method510(var0, 10, true);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)I",
		garbageValue = "-312257835"
	)
	static int method4826(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "0"
	)
	static final String method4824(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class144.logOut();
		switch(var0) {
		case 1:
			Calendar.method4863();
			break;
		case 2:
			AbstractSocket.method5924();
		}

	}
}
