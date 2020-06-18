import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Leb;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 923161949
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 126098109
	)
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -662882065
	)
	@Export("z")
	int z;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1696865585
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		signature = "(Let;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}
}
