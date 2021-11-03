import java.awt.Component;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3803("", 0, new class301[]{class301.field3769}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3791("", 1, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3792("", 2, new class301[]{class301.field3770, class301.field3767, class301.field3769}),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3793("", 3, new class301[]{class301.field3770}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3794("", 4),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3796("", 5, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3807("", 6, new class301[]{class301.field3769}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3790("", 8, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3798("", 9, new class301[]{class301.field3770, class301.field3767}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3799("", 10, new class301[]{class301.field3770}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3800("", 11, new class301[]{class301.field3770}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3801("", 12, new class301[]{class301.field3770, class301.field3769}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	field3802("", 13, new class301[]{class301.field3770});

	@ObfuscatedName("hs")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1276405955
	)
	@Export("id")
	final int id;
	@ObfuscatedName("l")
	final Set field3804;

	static {
		method5536(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkq;)V"
	)
	ModeWhere(String var3, int var4, class301[] var5) {
		this.field3804 = new HashSet();
		this.id = var4; // L: 43
		class301[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class301 var8 = var6[var7]; // L: 47
			this.field3804.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field3804 = new HashSet(); // L: 32
		this.id = var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "84"
	)
	static void method5543(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 39
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 40
	} // L: 41

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)[Lks;",
		garbageValue = "-88"
	)
	static ModeWhere[] method5536() {
		return new ModeWhere[]{field3802, field3803, field3801, field3790, field3792, field3796, field3791, field3807, field3793, field3799, field3794, field3798, field3800}; // L: 35
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	public static void method5542() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 52
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 53
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 54
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 55
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 56
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 57
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 58
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 59
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 60
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 61
		}
	} // L: 63

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1212689938"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.field710) { // L: 4078
			WorldMapCacheName.method4027(); // L: 4079
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && class408.clientPreferences.musicVolume != 0 && !Client.field710) { // L: 4081
			Archive var1 = Messages.archive6; // L: 4082
			int var2 = class408.clientPreferences.musicVolume; // L: 4083
			class247.musicPlayerStatus = 1; // L: 4085
			class128.musicTrackArchive = var1; // L: 4086
			FillMode.musicTrackGroupId = var0; // L: 4087
			ArchiveDiskActionHandler.musicTrackFileId = 0; // L: 4088
			class247.musicTrackVolume = var2; // L: 4089
			SecureRandomCallable.musicTrackBoolean = false; // L: 4090
			class247.pcmSampleLength = 2; // L: 4091
		}

		Client.currentTrackGroupId = var0; // L: 4094
	} // L: 4095
}
