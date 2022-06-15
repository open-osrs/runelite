import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("p")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -196698659
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("q")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-1298247103"
	)
	static SecureRandom method5843() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}
}
