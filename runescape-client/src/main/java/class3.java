import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class3 implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	public static final class3 field12;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	public static final class3 field13;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lw;"
	)
	public static final class3 field8;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -393546789
	)
	final int field9;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1940834259
	)
	public final int field10;
	@ObfuscatedName("j")
	public final Class field6;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class0 field14;

	static {
		field12 = new class3(0, 0, Integer.class, new class1());
		field13 = new class3(1, 1, Long.class, new class2());
		field8 = new class3(2, 2, String.class, new class4());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lh;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field9 = var1;
		this.field10 = var2;
		this.field6 = var3;
		this.field14 = var4;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field10;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)Ljava/lang/Object;",
		garbageValue = "1456492535"
	)
	public Object method28(Buffer var1) {
		return this.field14.vmethod48(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "72391209"
	)
	public static void method43() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkj;I)V",
		garbageValue = "-1494098506"
	)
	public static void method25(Object var0, Buffer var1) {
		class0 var2 = method37(var0.getClass());
		var2.vmethod49(var0, var1);
	}

	@ObfuscatedName("h")
	public static String method40(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lh;",
		garbageValue = "1667520167"
	)
	static class0 method37(Class var0) {
		class3[] var2 = new class3[]{field13, field12, field8};
		class3[] var3 = var2;
		int var4 = 0;

		class3 var1;
		while (true) {
			if (var4 >= var3.length) {
				var1 = null;
				break;
			}

			class3 var5 = var3[var4];
			if (var5.field6 == var0) {
				var1 = var5;
				break;
			}

			++var4;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field14;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1239840122"
	)
	public static final void method41(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lbq;B)Z",
		garbageValue = "0"
	)
	static boolean method42(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (PlayerAppearance.localPlayer != var0) {
			boolean var1 = (Client.drawPlayerNames & 4) != 0;
			boolean var2 = var1;
			if (!var1) {
				boolean var3 = (Client.drawPlayerNames & 1) != 0;
				var2 = var3 && var0.isFriend();
			}

			return var2 || RouteStrategy.method3649() && var0.isClanMember();
		} else {
			return MouseHandler.method1150();
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "2076133641"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class92.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				class22.runScriptEvent(var6);
			}

			boolean var11 = true;
			if (var5.contentType > 0) {
				var11 = HealthBarUpdate.method1825(var5);
			}

			if (var11) {
				int var8 = FaceNormal.getWidgetFlags(var5);
				int var9 = var0 - 1;
				boolean var7 = (var8 >> var9 + 1 & 1) != 0;
				if (var7) {
					PacketBufferNode var10;
					if (var0 == 1) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 2) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 3) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 4) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 5) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 6) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 7) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 8) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 9) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

					if (var0 == 10) {
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2231, Client.packetWriter.isaacCipher);
						var10.packetBuffer.writeInt(var1);
						var10.packetBuffer.writeShort(var2);
						var10.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var10);
					}

				}
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1332893941"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
