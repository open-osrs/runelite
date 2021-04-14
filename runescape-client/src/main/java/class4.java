import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class4 extends class14 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -464721427
	)
	int field33;
	@ObfuscatedName("o")
	String field34;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field33 = var1.readInt(); // L: 326
		this.field34 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method158(this.field33, this.field34); // L: 331
	} // L: 332

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2084142050"
	)
	static boolean method76(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 679
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1882988132"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field842) { // L: 3093
			class232.method4360(); // L: 3094
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && Login.clientPreferences.musicVolume != 0 && !Client.field842) { // L: 3096
			WorldMapSection0.method3059(2, class8.archive6, var0, 0, Login.clientPreferences.musicVolume, false); // L: 3097
		}

		Client.currentTrackGroupId = var0; // L: 3099
	} // L: 3100

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "1"
	)
	static final void method75(int var0, int var1, boolean var2) {
		if (Client.field820[var0] != null) { // L: 11567
			if (var1 >= 0 && var1 < Client.field820[var0].method46()) { // L: 11568
				class9 var3 = (class9)Client.field820[var0].field27.get(var1); // L: 11569
				PacketWriter var4 = Client.packetWriter; // L: 11570
				PacketBufferNode var5 = ObjectComposition.getPacketBufferNode(ClientPacket.field2298, var4.isaacCipher); // L: 11571
				var5.packetBuffer.writeByte(4 + Friend.stringCp1252NullTerminatedByteSize(var3.field65)); // L: 11572
				var5.packetBuffer.writeByte(var0); // L: 11573
				var5.packetBuffer.writeShort(var1); // L: 11574
				var5.packetBuffer.writeBoolean(var2); // L: 11575
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.field65); // L: 11576
				var4.addNode(var5); // L: 11577
			}
		}
	} // L: 11578

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1616057238"
	)
	static void method77(String var0) {
		class0.field4 = var0; // L: 11620

		try {
			String var1 = class10.client.getParameter(Integer.toString(18)); // L: 11622
			String var2 = class10.client.getParameter(Integer.toString(13)); // L: 11623
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11624
			if (var0.length() == 0) { // L: 11625
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + MouseHandler.method724(ObjectSound.currentTimeMillis() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 11626
			}

			class42.method505(class10.client, "document.cookie=\"" + var3 + "\""); // L: 11627
		} catch (Throwable var4) { // L: 11629
		}

	} // L: 11630
}
