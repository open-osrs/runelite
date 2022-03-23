import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class291 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	UrlRequest field3302;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	SpritePixels field3305;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lci;)V"
	)
	class291(String var1, UrlRequester var2) {
		try {
			this.field3302 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3302 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lct;)V"
	)
	class291(UrlRequest var1) {
		this.field3302 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lql;",
		garbageValue = "-22"
	)
	SpritePixels method5586() {
		if (this.field3305 == null && this.field3302 != null && this.field3302.isDone()) { // L: 28
			if (this.field3302.getResponse() != null) { // L: 29
				this.field3305 = class29.method433(this.field3302.getResponse()); // L: 30
			}

			this.field3302 = null; // L: 32
		}

		return this.field3305; // L: 34
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "4"
	)
	static final boolean method5588(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 36
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-521131129"
	)
	static final void method5587() {
		class428.method7654(class175.field1883, ReflectionCheck.field250, ModeWhere.field4080); // L: 3481
		class132.method2864(WorldMapRegion.field2706, class457.field4747); // L: 3482
		if (EnumComposition.cameraX == class175.field1883 && ReflectionCheck.field250 == FriendSystem.cameraY && CollisionMap.cameraZ == ModeWhere.field4080 && Language.cameraPitch == WorldMapRegion.field2706 && MusicPatchNode2.cameraYaw == class457.field4747) { // L: 3483
			Client.field739 = false; // L: 3484
			Client.isCameraLocked = false; // L: 3485
			class12.field62 = 0; // L: 3486
			WorldMapSectionType.field2778 = 0; // L: 3487
			class351.field4157 = 0; // L: 3488
			ClanChannel.field1660 = 0; // L: 3489
			JagexCache.field1737 = 0; // L: 3490
			class33.field231 = 0; // L: 3491
			Tiles.field996 = 0; // L: 3492
			PcmPlayer.field302 = 0; // L: 3493
			DevicePcmPlayerProvider.field146 = 0; // L: 3494
			ClanSettings.field1608 = 0; // L: 3495
		}

	} // L: 3498

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	static void method5589() {
		Client.packetWriter.addNode(ItemContainer.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher)); // L: 11906
		Client.oculusOrbState = 0; // L: 11907
	} // L: 11908
}
