import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 218864089
	)
	public static int field3694;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("k")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lko;",
		garbageValue = "-98"
	)
	public static FontName[] method5456() {
		return new FontName[]{FontName_bold12, FontName_plain11, FontName_verdana11, FontName_verdana13, FontName_plain12, FontName_verdana15}; // L: 16
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1218729276"
	)
	public static void method5459(int var0) {
		if (class206.musicPlayerStatus != 0) { // L: 44
			class206.musicTrackVolume = var0;
		} else {
			class13.midiPcmStream.setPcmStreamVolume(var0); // L: 45
		}

	} // L: 46

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "13921338"
	)
	static int method5455(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F)); // L: 3193
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "18"
	)
	static void method5458(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8749
		int[] var3 = Players.Players_indices; // L: 8750
		boolean var4 = false; // L: 8751
		Username var5 = new Username(var1, UserComparator4.loginType); // L: 8752

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8753
			Player var7 = Client.players[var3[var6]]; // L: 8754
			if (var7 != null && var7 != PlayerType.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8755
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8756
					var8 = class4.getPacketBufferNode(ClientPacket.field2239, Client.packetWriter.isaacCipher); // L: 8758
					var8.packetBuffer.writeByte(0); // L: 8759
					var8.packetBuffer.method5673(var3[var6]); // L: 8760
					Client.packetWriter.addNode(var8); // L: 8761
				} else if (var0 == 4) { // L: 8763
					var8 = class4.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher); // L: 8765
					var8.packetBuffer.writeShort(var3[var6]); // L: 8766
					var8.packetBuffer.writeByte(0); // L: 8767
					Client.packetWriter.addNode(var8); // L: 8768
				} else if (var0 == 6) { // L: 8770
					var8 = class4.getPacketBufferNode(ClientPacket.field2323, Client.packetWriter.isaacCipher); // L: 8772
					var8.packetBuffer.writeShort(var3[var6]); // L: 8773
					var8.packetBuffer.writeIntME(0); // L: 8774
					Client.packetWriter.addNode(var8); // L: 8775
				} else if (var0 == 7) { // L: 8777
					var8 = class4.getPacketBufferNode(ClientPacket.field2324, Client.packetWriter.isaacCipher); // L: 8779
					var8.packetBuffer.method5674(var3[var6]); // L: 8780
					var8.packetBuffer.writeIntME(0); // L: 8781
					Client.packetWriter.addNode(var8); // L: 8782
				}

				var4 = true; // L: 8784
				break;
			}
		}

		if (!var4) { // L: 8788
			DevicePcmPlayerProvider.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8789

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ScriptFrame.loadInterface(var0)) { // L: 11056
			Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 11057

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11058
				Widget var3 = var1[var2]; // L: 11059
				if (var3 != null) { // L: 11060
					var3.modelFrame = 0; // L: 11061
					var3.modelFrameCycle = 0; // L: 11062
				}
			}

		}
	} // L: 11064
}
