import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1178399769
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1300782503
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1809063501
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1681239955
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("p")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([BZI)Ljava/lang/Object;",
		garbageValue = "1257898423"
	)
	public static Object method2169(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;I)V",
		garbageValue = "1591696142"
	)
	public static void method2171(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		NPC.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(ILic;IIIZI)V",
		garbageValue = "896837453"
	)
	@Export("playMusicTrack")
	public static void playMusicTrack(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class206.field2439 = 1;
		Huffman.musicTrackArchive = var1;
		class206.musicTrackGroupId = var2;
		MilliClock.musicTrackFileId = var3;
		class206.musicTrackVolume = var4;
		class336.musicTrackBoolean = var5;
		class206.field2442 = var0;
	}
}
