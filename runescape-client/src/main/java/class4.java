import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public final class class4 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1921636813"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1817
		Login.Login_response2 = var1; // L: 1818
		Login.Login_response3 = var2; // L: 1819
	} // L: 1820

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	static void method17() {
		PacketBufferNode var0 = WorldMapSprite.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 4277
		var0.packetBuffer.writeByte(Client.getWindowedMode()); // L: 4278
		var0.packetBuffer.writeShort(InvDefinition.canvasWidth); // L: 4279
		var0.packetBuffer.writeShort(class321.canvasHeight); // L: 4280
		Client.packetWriter.addNode(var0); // L: 4281
	} // L: 4282

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcc;",
		garbageValue = "-1034458506"
	)
	static final InterfaceParent method16(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12149
		var3.group = var1; // L: 12150
		var3.type = var2; // L: 12151
		Client.interfaceParents.put(var3, (long)var0); // L: 12152
		class29.Widget_resetModelFrames(var1); // L: 12153
		Widget var4 = class127.getWidget(var0); // L: 12154
		class346.invalidateWidget(var4); // L: 12155
		if (Client.meslayerContinueWidget != null) { // L: 12156
			class346.invalidateWidget(Client.meslayerContinueWidget); // L: 12157
			Client.meslayerContinueWidget = null; // L: 12158
		}

		AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12160
		class145.runWidgetOnLoadListener(var1); // L: 12161
		if (Client.rootInterface != -1) { // L: 12162
			MouseRecorder.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12163
	}
}
