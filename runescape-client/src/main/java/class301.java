import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class301 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static final class301 field3780;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static final class301 field3782;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static final class301 field3781;

	static {
		field3780 = new class301();
		field3782 = new class301();
		field3781 = new class301();
	}

	class301() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lbo;",
		garbageValue = "-230325466"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}
}
