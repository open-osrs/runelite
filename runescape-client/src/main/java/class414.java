import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class414 implements MouseWheel {
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	public static final class414 field4487;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	public static final class414 field4489;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	public static final class414 field4495;
	@ObfuscatedName("ai")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1123084673
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1565635193
	)
	final int field4490;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -199634777
	)
	public final int field4491;
	@ObfuscatedName("o")
	public final Class field4492;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	final class410 field4493;

	static {
		field4487 = new class414(0, 0, Integer.class, new class411()); // L: 10
		field4489 = new class414(2, 1, Long.class, new class413()); // L: 24
		field4495 = new class414(1, 2, String.class, new class415()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Los;)V"
	)
	class414(int var1, int var2, Class var3, class410 var4) {
		this.field4490 = var1; // L: 62
		this.field4491 = var2; // L: 63
		this.field4492 = var3; // L: 64
		this.field4493 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4491; // L: 100
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "-1804233742"
	)
	public Object method7259(Buffer var1) {
		return this.field4493.vmethod7281(var1); // L: 104
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)[Loi;",
		garbageValue = "10"
	)
	public static class414[] method7264() {
		return new class414[]{field4489, field4487, field4495}; // L: 58
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Loi;",
		garbageValue = "-93"
	)
	public static class414 method7269(Class var0) {
		class414[] var1 = new class414[]{field4489, field4487, field4495}; // L: 72
		class414[] var2 = var1; // L: 74

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 75
			class414 var4 = var2[var3]; // L: 76
			if (var4.field4492 == var0) { // L: 78
				return var4;
			}
		}

		return null; // L: 82
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "814751902"
	)
	public static void method7256(Object var0, Buffer var1) {
		class410 var2 = method7257(var0.getClass()); // L: 87
		var2.vmethod7280(var0, var1); // L: 88
	} // L: 89

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Los;",
		garbageValue = "0"
	)
	static class410 method7257(Class var0) {
		class414 var1 = method7269(var0); // L: 93
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 94
		} else {
			return var1.field4493; // L: 95
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "245125320"
	)
	static final void method7279(String var0) {
		PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2921, Client.packetWriter.isaacCipher); // L: 177
		var1.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var0)); // L: 178
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 179
		Client.packetWriter.addNode(var1); // L: 180
	} // L: 181

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366711741"
	)
	static void method7278() {
		if (class6.loadWorlds()) { // L: 2010
			Login.worldSelectOpen = true; // L: 2011
			Login.worldSelectPage = 0; // L: 2012
			Login.worldSelectPagesCount = 0; // L: 2013
		}

	} // L: 2015

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1547646966"
	)
	static void method7254() {
		if (class9.field58 != null) { // L: 12148
			Client.field777 = Client.cycle; // L: 12149
			class9.field58.method5765(); // L: 12150

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12151
				if (Client.players[var0] != null) { // L: 12152
					class9.field58.method5764((Client.players[var0].x >> 7) + Canvas.baseX, (Client.players[var0].y >> 7) + class118.baseY); // L: 12153
				}
			}
		}

	} // L: 12157
}
