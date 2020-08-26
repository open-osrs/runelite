import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("ObjectDefinition_modelsArchive")
	public static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static GameBuild field2525;
	@ObfuscatedName("z")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1021172953"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1366071744"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIB)V",
		garbageValue = "47"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9262
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9263
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9264
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9265
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9266
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9267
		}

		if (var0.yAlignment == 0) { // L: 9268
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9269
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9270
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 9271
		} else if (var0.yAlignment == 4) { // L: 9272
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 9273
		}

	} // L: 9274
}
