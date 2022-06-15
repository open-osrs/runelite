import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -1703500315
	)
	static int field3306;
	@ObfuscatedName("c")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2067022612"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llc;IB)V",
		garbageValue = "20"
	)
	public static void method5512(Archive var0, int var1) {
		KitDefinition.field1862.offset = var1 * 8 + 5; // L: 87
		if (KitDefinition.field1862.offset >= KitDefinition.field1862.array.length) { // L: 88
			if (var0.field3990) { // L: 89
				var0.method5822(); // L: 90
			} else {
				throw new RuntimeException(""); // L: 93
			}
		} else {
			int var2 = KitDefinition.field1862.readInt(); // L: 95
			int var3 = KitDefinition.field1862.readInt(); // L: 96
			var0.loadIndex(var2, var3); // L: 97
		}
	} // L: 91 98

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1018448231"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 57
		if (var1 == null) { // L: 58
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 59 60
		}
	}
}
