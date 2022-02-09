import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1534991819
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("c")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1552068154"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "46"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2011171655"
	)
	public static final synchronized long method5318() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class261.field3087) { // L: 15
			class261.field3083 += class261.field3087 - var0; // L: 16
		}

		class261.field3087 = var0; // L: 18
		return var0 + class261.field3083; // L: 19
	}
}
