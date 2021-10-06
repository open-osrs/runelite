import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -1805668533
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1283611121
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -812646739
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1799999959
	)
	@Export("z")
	int z;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 261367591
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lha;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILkl;IIIZB)V",
		garbageValue = "84"
	)
	public static void method4560(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class247.musicPlayerStatus = 1;
		class113.musicTrackArchive = var1;
		Skills.musicTrackGroupId = var2;
		class137.musicTrackFileId = var3;
		class247.musicTrackVolume = var4;
		class247.musicTrackBoolean = var5;
		class247.pcmSampleLength = var0;
	}
}
