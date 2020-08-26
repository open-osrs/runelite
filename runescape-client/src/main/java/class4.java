import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
final class class4 implements class0 {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkf;B)V",
		garbageValue = "21"
	)
	public void vmethod70(Object var1, Buffer var2) {
		this.method59((String)var1, var2); // L: 46
	} // L: 47

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)Ljava/lang/Object;",
		garbageValue = "-453860591"
	)
	public Object vmethod61(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 42
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkf;I)V",
		garbageValue = "-758974757"
	)
	void method59(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 38
	} // L: 39

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lic;I)V",
		garbageValue = "-1502572430"
	)
	public static void method73(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "([Lhq;Lhq;ZB)V",
		garbageValue = "73"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * -1105005447 * -1556531767 : var1.width * 1613274363 * 1200164403; // L: 9211
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 1626628049 * 298473777 : var1.height * 1137118319 * 1991496335; // L: 9212
		KeyHandler.resizeInterface(var0, var1.id, var3, var4, var2); // L: 9213
		if (var1.children != null) { // L: 9214
			KeyHandler.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 9215
		if (var5 != null) { // L: 9216
			int var6 = var5.group; // L: 9217
			if (WorldMapSprite.loadInterface(var6)) { // L: 9219
				KeyHandler.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 9220
			}
		}

		if (var1.contentType == 1337) { // L: 9223
		}

	} // L: 9224

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)Z",
		garbageValue = "1437525598"
	)
	static final boolean method60(Widget var0) {
		int var1 = var0.contentType; // L: 10523
		if (var1 == 205) { // L: 10524
			Client.logoutTimer = 250; // L: 10525
			return true; // L: 10526
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 10528
				var2 = (var1 - 300) / 2; // L: 10529
				var3 = var1 & 1; // L: 10530
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 10531
			}

			if (var1 >= 314 && var1 <= 323) { // L: 10533
				var2 = (var1 - 314) / 2; // L: 10534
				var3 = var1 & 1; // L: 10535
				Client.playerAppearance.method4102(var2, var3 == 1); // L: 10536
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 10538
			}

			if (var1 == 325) { // L: 10539
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 10540
				PacketBufferNode var4 = Client.getPacketBufferNode(ClientPacket.field2307, Client.packetWriter.isaacCipher); // L: 10542
				Client.playerAppearance.write(var4.packetBuffer); // L: 10543
				Client.packetWriter.addNode(var4); // L: 10544
				return true; // L: 10545
			} else {
				return false; // L: 10547
			}
		}
	}
}
