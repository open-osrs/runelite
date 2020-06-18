import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		signature = "Lko;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("compass")
	static Sprite compass;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ls;Ls;I)I",
		garbageValue = "1584423872"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)[Ljc;",
		garbageValue = "491674021"
	)
	static HorizontalAlignment[] method207() {
		return new HorizontalAlignment[]{HorizontalAlignment.field3492, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field3488};
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-678921308"
	)
	static void method213() {
		Login.loginIndex = 24;
		MusicPatchPcmStream.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-350266063"
	)
	static void method214(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class310.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		DevicePcmPlayerProvider.method914(var0, var1);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2098531910"
	)
	static void method206() {
		Client.packetWriter.addNode(UserComparator4.getPacketBufferNode(ClientPacket.field2339, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
