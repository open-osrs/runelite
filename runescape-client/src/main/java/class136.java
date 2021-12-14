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
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1556 = var1.readInt();
		this.field1557 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2873(this.field1556, this.field1557);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-54146153"
	)
	static void method2839(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-10"
	)
	public static boolean method2842(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class328.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
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
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "429003988"
	)
	static void method2840(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, class194.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class340.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2887, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7343(0);
					var8.packetBuffer.method7398(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2807, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7349(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2863, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7390(0);
					var8.packetBuffer.method7398(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7362(0);
					var8.packetBuffer.method7493(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class194.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
