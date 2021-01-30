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
		field12 = new class3(0, 0, Integer.class, new class1()); // L: 10
		field13 = new class3(1, 1, Long.class, new class2()); // L: 23
		field8 = new class3(2, 2, String.class, new class4());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lh;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field9 = var1; // L: 55
		this.field10 = var2; // L: 56
		this.field6 = var3; // L: 57
		this.field14 = var4; // L: 58
	} // L: 59

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-275768542"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field10; // L: 93
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)Ljava/lang/Object;",
		garbageValue = "1456492535"
	)
	public Object method28(Buffer var1) {
		return this.field14.vmethod48(var1); // L: 97
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "72391209"
	)
	public static void method43() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null; // L: 39
			} // L: 40
		}

	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkj;I)V",
		garbageValue = "-1494098506"
	)
	public static void method25(Object var0, Buffer var1) {
		class0 var2 = method37(var0.getClass()); // L: 62
		var2.vmethod49(var0, var1); // L: 63
	} // L: 64

	@ObfuscatedName("h")
	public static String method40(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 30
		int var2 = Calendar.Calendar_calendar.get(7); // L: 31
		int var3 = Calendar.Calendar_calendar.get(5); // L: 32
		int var4 = Calendar.Calendar_calendar.get(2); // L: 33
		int var5 = Calendar.Calendar_calendar.get(1); // L: 34
		int var6 = Calendar.Calendar_calendar.get(11); // L: 35
		int var7 = Calendar.Calendar_calendar.get(12); // L: 36
		int var8 = Calendar.Calendar_calendar.get(13); // L: 37
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 38
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lh;",
		garbageValue = "1667520167"
	)
	static class0 method37(Class var0) {
		class3[] var2 = new class3[]{field13, field12, field8}; // L: 72
		class3[] var3 = var2; // L: 74
		int var4 = 0;

		class3 var1;
		while (true) {
			if (var4 >= var3.length) {
				var1 = null; // L: 85
				break;
			}

			class3 var5 = var3[var4]; // L: 76
			if (var5.field6 == var0) { // L: 78
				var1 = var5; // L: 79
				break;
			}

			++var4; // L: 75
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
		ViewportMouse.ViewportMouse_x = var0; // L: 87
		ViewportMouse.ViewportMouse_y = var1; // L: 88
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 89
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 90
		ViewportMouse.ViewportMouse_false0 = false; // L: 91
	} // L: 92

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Lbq;B)Z",
		garbageValue = "0"
	)
	static boolean method42(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4799
			return false;
		} else if (PlayerAppearance.localPlayer != var0) { // L: 4800
			boolean var1 = (Client.drawPlayerNames & 4) != 0; // L: 4803
			boolean var2 = var1; // L: 4805
			if (!var1) { // L: 4806
				boolean var3 = (Client.drawPlayerNames & 1) != 0; // L: 4809
				var2 = var3 && var0.isFriend(); // L: 4811
			}

			return var2 || RouteStrategy.method3649() && var0.isClanMember(); // L: 4813
		} else {
			return MouseHandler.method1150(); // L: 4815
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "2076133641"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class92.getWidgetChild(var1, var2); // L: 8368
		if (var5 != null) { // L: 8369
			if (var5.onOp != null) { // L: 8370
				ScriptEvent var6 = new ScriptEvent(); // L: 8371
				var6.widget = var5; // L: 8372
				var6.opIndex = var0; // L: 8373
				var6.targetName = var4; // L: 8374
				var6.args = var5.onOp; // L: 8375
				class22.runScriptEvent(var6); // L: 8376
			}

			boolean var11 = true; // L: 8378
			if (var5.contentType > 0) { // L: 8379
				var11 = HealthBarUpdate.method1825(var5);
			}

			if (var11) { // L: 8380
				int var8 = FaceNormal.getWidgetFlags(var5); // L: 8382
				int var9 = var0 - 1; // L: 8383
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 8385
				if (var7) { // L: 8387
					PacketBufferNode var10;
					if (var0 == 1) { // L: 8390
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher); // L: 8392
						var10.packetBuffer.writeInt(var1); // L: 8393
						var10.packetBuffer.writeShort(var2); // L: 8394
						var10.packetBuffer.writeShort(var3); // L: 8395
						Client.packetWriter.addNode(var10); // L: 8396
					}

					if (var0 == 2) { // L: 8398
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2286, Client.packetWriter.isaacCipher); // L: 8400
						var10.packetBuffer.writeInt(var1); // L: 8401
						var10.packetBuffer.writeShort(var2); // L: 8402
						var10.packetBuffer.writeShort(var3); // L: 8403
						Client.packetWriter.addNode(var10); // L: 8404
					}

					if (var0 == 3) { // L: 8406
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2249, Client.packetWriter.isaacCipher); // L: 8408
						var10.packetBuffer.writeInt(var1); // L: 8409
						var10.packetBuffer.writeShort(var2); // L: 8410
						var10.packetBuffer.writeShort(var3); // L: 8411
						Client.packetWriter.addNode(var10); // L: 8412
					}

					if (var0 == 4) { // L: 8414
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher); // L: 8416
						var10.packetBuffer.writeInt(var1); // L: 8417
						var10.packetBuffer.writeShort(var2); // L: 8418
						var10.packetBuffer.writeShort(var3); // L: 8419
						Client.packetWriter.addNode(var10); // L: 8420
					}

					if (var0 == 5) { // L: 8422
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2247, Client.packetWriter.isaacCipher); // L: 8424
						var10.packetBuffer.writeInt(var1); // L: 8425
						var10.packetBuffer.writeShort(var2); // L: 8426
						var10.packetBuffer.writeShort(var3); // L: 8427
						Client.packetWriter.addNode(var10); // L: 8428
					}

					if (var0 == 6) { // L: 8430
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2289, Client.packetWriter.isaacCipher); // L: 8432
						var10.packetBuffer.writeInt(var1); // L: 8433
						var10.packetBuffer.writeShort(var2); // L: 8434
						var10.packetBuffer.writeShort(var3); // L: 8435
						Client.packetWriter.addNode(var10); // L: 8436
					}

					if (var0 == 7) { // L: 8438
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher); // L: 8440
						var10.packetBuffer.writeInt(var1); // L: 8441
						var10.packetBuffer.writeShort(var2); // L: 8442
						var10.packetBuffer.writeShort(var3); // L: 8443
						Client.packetWriter.addNode(var10); // L: 8444
					}

					if (var0 == 8) { // L: 8446
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2252, Client.packetWriter.isaacCipher); // L: 8448
						var10.packetBuffer.writeInt(var1); // L: 8449
						var10.packetBuffer.writeShort(var2); // L: 8450
						var10.packetBuffer.writeShort(var3); // L: 8451
						Client.packetWriter.addNode(var10); // L: 8452
					}

					if (var0 == 9) { // L: 8454
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher); // L: 8456
						var10.packetBuffer.writeInt(var1); // L: 8457
						var10.packetBuffer.writeShort(var2); // L: 8458
						var10.packetBuffer.writeShort(var3); // L: 8459
						Client.packetWriter.addNode(var10); // L: 8460
					}

					if (var0 == 10) { // L: 8462
						var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2231, Client.packetWriter.isaacCipher); // L: 8464
						var10.packetBuffer.writeInt(var1); // L: 8465
						var10.packetBuffer.writeShort(var2); // L: 8466
						var10.packetBuffer.writeShort(var3); // L: 8467
						Client.packetWriter.addNode(var10); // L: 8468
					}

				}
			}
		}
	} // L: 8388 8470

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1332893941"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 9896
	}
}
