import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
final class class410 implements class405 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "246575309"
	)
	public void vmethod7273(Object var1, Buffer var2) {
		this.method7275((String)var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)Ljava/lang/Object;",
		garbageValue = "3"
	)
	public Object vmethod7271(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lpi;I)V",
		garbageValue = "1797008189"
	)
	void method7275(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbn;",
		garbageValue = "-50"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = TaskHandler.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class145.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
