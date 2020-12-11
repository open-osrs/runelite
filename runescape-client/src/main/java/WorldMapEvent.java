import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 972918301
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1211419281
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILhs;Lhs;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method809() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 64
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 65
			} // L: 66

			if (var0 == null) {
				return; // L: 67
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 68
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "787195295"
	)
	public static void method807() {
		if (KeyHandler.KeyHandler_instance != null) { // L: 156
			synchronized(KeyHandler.KeyHandler_instance) { // L: 157
				KeyHandler.KeyHandler_instance = null; // L: 158
			} // L: 159
		}

	} // L: 161

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1393718801"
	)
	static final void method810(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 10652
		if (var0 != Timer.clientPreferences.musicVolume) { // L: 10653
			if (Timer.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 10654
				Interpreter.method2082(class217.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 10655
				Client.field883 = false; // L: 10656
			} else if (var0 == 0) { // L: 10658
				WorldMapRegion.method588(); // L: 10659
				Client.field883 = false; // L: 10660
			} else if (class206.musicPlayerStatus != 0) { // L: 10663
				GrandExchangeEvent.musicTrackVolume = var0;
			} else {
				class206.midiPcmStream.setPcmStreamVolume(var0); // L: 10664
			}

			Timer.clientPreferences.musicVolume = var0; // L: 10666
			GrandExchangeOffer.savePreferences(); // L: 10667
		}

	} // L: 10669

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "-67"
	)
	static void method808(Buffer var0, int var1) {
		AbstractSocket.method5846(var0.array, var1); // L: 11139
		if (JagexCache.JagexCache_randomDat != null) { // L: 11141
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 11143
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 11144
			} catch (Exception var3) { // L: 11146
			}
		}

	} // L: 11149
}
