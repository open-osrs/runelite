import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("m")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "300747627"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "92"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		signature = "(Lcc;II)V",
		garbageValue = "1934042219"
	)
	static final void method4090(Actor var0, int var1) {
		HealthBar.worldToScreen(var0.x, var0.y, var1);
	}
}
