import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("HitSplatDefinition_cached")
	static class426 HitSplatDefinition_cached;
	@ObfuscatedName("v")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2035077648"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1279201457"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1117680233"
	)
	public static boolean method5516(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}
}
