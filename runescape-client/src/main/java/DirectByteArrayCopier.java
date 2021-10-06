import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 77516077
	)
	static int field3212;
	@ObfuscatedName("l")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-25"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "944891137"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "333873398"
	)
	static int method5102(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
