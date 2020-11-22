import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class206 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("musicPatchesArchive")
	static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("musicSamplesArchive")
	static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("soundEffectsArchive")
	static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 60389351
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2127739397
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2078097639
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1369090733"
	)
	public static boolean method3851() {
		ReflectionCheck var0 = (ReflectionCheck)class105.reflectionChecks.last(); // L: 24
		return var0 != null; // L: 25
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "-1404653901"
	)
	public static PacketBufferNode method3853() {
		PacketBufferNode var0 = ChatChannel.method2363(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2122026664"
	)
	public static void method3852(int var0) {
		if (var0 != -1) { // L: 236
			if (Widget.Widget_loadedInterfaces[var0]) { // L: 237
				Decimator.Widget_archive.clearFilesGroup(var0); // L: 238
				if (Widget.Widget_interfaceComponents[var0] != null) { // L: 239
					boolean var1 = true; // L: 240

					for (int var2 = 0; var2 < Widget.Widget_interfaceComponents[var0].length; ++var2) { // L: 241
						if (Widget.Widget_interfaceComponents[var0][var2] != null) { // L: 242
							if (Widget.Widget_interfaceComponents[var0][var2].type != 2) { // L: 243
								Widget.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 244
							}
						}
					}

					if (var1) {
						Widget.Widget_interfaceComponents[var0] = null; // L: 247
					}

					Widget.Widget_loadedInterfaces[var0] = false; // L: 248
				}
			}
		}
	} // L: 249
}
