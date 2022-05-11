import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class129 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -847833425
	)
	int field1579;
	@ObfuscatedName("q")
	boolean field1577;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class129(class131 var1) {
		this.this$0 = var1;
		this.field1579 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-611912046"
	)
	void vmethod3040(Buffer var1) {
		this.field1579 = var1.readUnsignedShort(); // L: 184
		this.field1577 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lek;B)V",
		garbageValue = "-73"
	)
	void vmethod3041(ClanSettings var1) {
		var1.method2895(this.field1579, this.field1577); // L: 189
	} // L: 190

	@ObfuscatedName("v")
	static boolean method2816(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1; // L: 80
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static final void method2812() {
		if (Client.logoutTimer > 0) { // L: 3053
			SecureRandomCallable.logOut(); // L: 3054
		} else {
			Client.timer.method6375(); // L: 3057
			PendingSpawn.updateGameState(40); // L: 3058
			DirectByteArrayCopier.field3337 = Client.packetWriter.getSocket(); // L: 3059
			Client.packetWriter.removeSocket(); // L: 3060
		}
	} // L: 3055 3061

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(Lki;III)V",
		garbageValue = "1747874161"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3854
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Login.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3855
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3856
				if (var3 == null) { // L: 3857
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3858
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3859
				if (var3.contains(var4, var5)) { // L: 3860
					var4 -= var3.width / 2; // L: 3861
					var5 -= var3.height / 2; // L: 3862
					int var6 = Client.camAngleY & 2047; // L: 3863
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3864
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3865
					int var9 = var8 * var4 + var5 * var7 >> 11; // L: 3866
					int var10 = var5 * var8 - var7 * var4 >> 11; // L: 3867
					int var11 = var9 + ModelData0.localPlayer.x >> 7; // L: 3868
					int var12 = ModelData0.localPlayer.y - var10 >> 7; // L: 3869
					PacketBufferNode var13 = WallDecoration.getPacketBufferNode(ClientPacket.field3023, Client.packetWriter.isaacCipher); // L: 3871
					var13.packetBuffer.writeByte(18); // L: 3872
					var13.packetBuffer.method7596(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3873
					var13.packetBuffer.method7641(var12 + GrandExchangeOfferOwnWorldComparator.baseY); // L: 3874
					var13.packetBuffer.writeShort(var11 + SecureRandomCallable.baseX); // L: 3875
					var13.packetBuffer.writeByte(var4); // L: 3876
					var13.packetBuffer.writeByte(var5); // L: 3877
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3878
					var13.packetBuffer.writeByte(57); // L: 3879
					var13.packetBuffer.writeByte(0); // L: 3880
					var13.packetBuffer.writeByte(0); // L: 3881
					var13.packetBuffer.writeByte(89); // L: 3882
					var13.packetBuffer.writeShort(ModelData0.localPlayer.x); // L: 3883
					var13.packetBuffer.writeShort(ModelData0.localPlayer.y); // L: 3884
					var13.packetBuffer.writeByte(63); // L: 3885
					Client.packetWriter.addNode(var13); // L: 3886
					Client.destinationX = var11; // L: 3887
					Client.destinationY = var12; // L: 3888
				}
			}

		}
	} // L: 3891
}
