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
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method809() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return;
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "787195295"
	)
	public static void method807() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1393718801"
	)
	static final void method810(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != Timer.clientPreferences.musicVolume) {
			if (Timer.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				Interpreter.method2082(class217.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field883 = false;
			} else if (var0 == 0) {
				WorldMapRegion.method588();
				Client.field883 = false;
			} else if (class206.musicPlayerStatus != 0) {
				GrandExchangeEvent.musicTrackVolume = var0;
			} else {
				class206.midiPcmStream.setPcmStreamVolume(var0);
			}

			Timer.clientPreferences.musicVolume = var0;
			GrandExchangeOffer.savePreferences();
		}

	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Lkj;IB)V",
		garbageValue = "-67"
	)
	static void method808(Buffer var0, int var1) {
		AbstractSocket.method5846(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
