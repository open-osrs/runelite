import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public final class class291 {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static final void method5478() {
		SceneTilePaint.method4270(class213.field2598, FriendsChat.field4141, class139.field1624); // L: 3601
		class260.method5000(LoginPacket.field3062, Interpreter.field854); // L: 3602
		if (class213.field2598 == class414.cameraX && FriendsChat.field4141 == WorldMapDecoration.cameraY && class139.field1624 == GrandExchangeOfferOwnWorldComparator.cameraZ && LoginPacket.field3062 == class7.cameraPitch && class7.cameraYaw == Interpreter.field854) { // L: 3603
			Client.field755 = false; // L: 3604
			Client.isCameraLocked = false; // L: 3605
			class7.field33 = 0; // L: 3606
			class21.field119 = 0; // L: 3607
			class334.field4057 = 0; // L: 3608
			WorldMapSectionType.field2723 = 0; // L: 3609
			WallDecoration.field2573 = 0; // L: 3610
			class4.field17 = 0; // L: 3611
			SceneTilePaint.field2543 = 0; // L: 3612
			Message.field478 = 0; // L: 3613
			class12.field75 = 0; // L: 3614
			class121.field1492 = 0; // L: 3615
		}

	} // L: 3618
}
