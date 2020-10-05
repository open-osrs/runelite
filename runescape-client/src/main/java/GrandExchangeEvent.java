import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class GrandExchangeEvent {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static Archive archive11;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	static Widget field79;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 152068117
	)
	public final int world;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 3809481130081136381L
	)
	public final long age;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("t")
	String offerName;
	@ObfuscatedName("i")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lkf;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated(); // L: 111
		this.previousOfferName = var1.readStringCp1252NullTerminated(); // L: 112
		this.world = var1.readUnsignedShort(); // L: 113
		this.age = var1.readLong(); // L: 114
		int var4 = var1.readInt(); // L: 115
		int var5 = var1.readInt(); // L: 116
		this.grandExchangeOffer = new GrandExchangeOffer(); // L: 117
		this.grandExchangeOffer.method189(2); // L: 118
		this.grandExchangeOffer.method184(var2); // L: 119
		this.grandExchangeOffer.unitPrice = var4; // L: 120
		this.grandExchangeOffer.totalQuantity = var5; // L: 121
		this.grandExchangeOffer.currentQuantity = 0; // L: 122
		this.grandExchangeOffer.currentPrice = 0; // L: 123
		this.grandExchangeOffer.id = var3; // L: 124
	} // L: 125

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-820260328"
	)
	public String getOfferName() {
		return this.offerName; // L: 128
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2082763364"
	)
	public String getPreviousOfferName() {
		return this.previousOfferName; // L: 132
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIB)V",
		garbageValue = "6"
	)
	static void addSequenceSoundEffect(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Client.areaSoundEffectVolume != 0) { // L: 3259
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3260
				int var4 = var0.soundEffects[var1]; // L: 3261
				if (var4 != 0) { // L: 3262
					int var5 = var4 >> 8; // L: 3263
					int var6 = var4 >> 4 & 7; // L: 3264
					int var7 = var4 & 15; // L: 3265
					Client.soundEffectIds[Client.soundEffectCount] = var5; // L: 3266
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6; // L: 3267
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3268
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3269
					int var8 = (var2 - 64) / 128; // L: 3270
					int var9 = (var3 - 64) / 128; // L: 3271
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16); // L: 3272
					++Client.soundEffectCount; // L: 3273
				}
			}
		}
	} // L: 3274

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Lhq;III)V",
		garbageValue = "-570952041"
	)
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3365
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3366
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3367
				if (var3 == null) { // L: 3368
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3369
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3370
				if (var3.contains(var4, var5)) { // L: 3371
					var4 -= var3.width / 2; // L: 3372
					var5 -= var3.height / 2; // L: 3373
					int var6 = Client.camAngleY & 2047; // L: 3374
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3375
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3376
					int var9 = var4 * var8 + var5 * var7 >> 11; // L: 3377
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3378
					int var11 = var9 + WorldMapLabelSize.localPlayer.x >> 7; // L: 3379
					int var12 = WorldMapLabelSize.localPlayer.y - var10 >> 7; // L: 3380
					PacketBufferNode var13 = Client.getPacketBufferNode(ClientPacket.field2317, Client.packetWriter.isaacCipher); // L: 3382
					var13.packetBuffer.writeByte(18); // L: 3383
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3384
					var13.packetBuffer.method5654(var11 + WorldMapManager.baseX); // L: 3385
					var13.packetBuffer.writeShort(var12 + WorldMapLabel.baseY); // L: 3386
					var13.packetBuffer.writeByte(var4); // L: 3387
					var13.packetBuffer.writeByte(var5); // L: 3388
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3389
					var13.packetBuffer.writeByte(57); // L: 3390
					var13.packetBuffer.writeByte(0); // L: 3391
					var13.packetBuffer.writeByte(0); // L: 3392
					var13.packetBuffer.writeByte(89); // L: 3393
					var13.packetBuffer.writeShort(WorldMapLabelSize.localPlayer.x); // L: 3394
					var13.packetBuffer.writeShort(WorldMapLabelSize.localPlayer.y); // L: 3395
					var13.packetBuffer.writeByte(63); // L: 3396
					Client.packetWriter.addNode(var13); // L: 3397
					Client.destinationX = var11; // L: 3398
					Client.destinationY = var12; // L: 3399
				}
			}

		}
	} // L: 3402

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	static void method160() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2341, Client.packetWriter.isaacCipher); // L: 3880
		var0.packetBuffer.writeByte(class39.getWindowedMode()); // L: 3881
		var0.packetBuffer.writeShort(FloorDecoration.canvasWidth); // L: 3882
		var0.packetBuffer.writeShort(GameShell.canvasHeight); // L: 3883
		Client.packetWriter.addNode(var0); // L: 3884
	} // L: 3885
}
