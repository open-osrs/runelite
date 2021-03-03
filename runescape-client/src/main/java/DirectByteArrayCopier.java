import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("n")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1361682252"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "262833794"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;I)V",
		garbageValue = "292233920"
	)
	public static void method4147(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20
}
