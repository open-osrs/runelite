import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class136 extends class126 {
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1563253375
	)
	int field1556;
	@ObfuscatedName("b")
	String field1557;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class136(class129 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1556 = var1.readInt(); // L: 326
		this.field1557 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2873(this.field1556, this.field1557); // L: 331
	} // L: 332

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-54146153"
	)
	static void method2839(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-10"
	)
	public static boolean method2842(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class328.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true;
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-56"
	)
	public static boolean method2841(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 25
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "429003988"
	)
	static void method2840(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9822
		int[] var3 = Players.Players_indices; // L: 9823
		boolean var4 = false; // L: 9824
		Username var5 = new Username(var1, class194.loginType); // L: 9825

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9826
			Player var7 = Client.players[var3[var6]]; // L: 9827
			if (var7 != null && var7 != class340.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9828
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9829
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2887, Client.packetWriter.isaacCipher); // L: 9831
					var8.packetBuffer.method7343(0); // L: 9832
					var8.packetBuffer.method7398(var3[var6]); // L: 9833
					Client.packetWriter.addNode(var8); // L: 9834
				} else if (var0 == 4) { // L: 9836
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2807, Client.packetWriter.isaacCipher); // L: 9838
					var8.packetBuffer.method7349(var3[var6]); // L: 9839
					var8.packetBuffer.writeByte(0); // L: 9840
					Client.packetWriter.addNode(var8); // L: 9841
				} else if (var0 == 6) { // L: 9843
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2863, Client.packetWriter.isaacCipher); // L: 9845
					var8.packetBuffer.method7390(0); // L: 9846
					var8.packetBuffer.method7398(var3[var6]); // L: 9847
					Client.packetWriter.addNode(var8); // L: 9848
				} else if (var0 == 7) { // L: 9850
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher); // L: 9852
					var8.packetBuffer.method7362(0); // L: 9853
					var8.packetBuffer.method7493(var3[var6]); // L: 9854
					Client.packetWriter.addNode(var8); // L: 9855
				}

				var4 = true; // L: 9857
				break;
			}
		}

		if (!var4) { // L: 9861
			class194.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9862
}
