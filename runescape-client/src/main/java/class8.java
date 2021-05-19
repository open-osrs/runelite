import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class8 extends class14 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1034378325
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 1767734013338974575L
	)
	long field69;
	@ObfuscatedName("c")
	String field68;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field69 = -1L; // L: 74
		this.field68 = null; // L: 75
	} // L: 77

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field69 = var1.readLong(); // L: 82
		}

		this.field68 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method117(this.field69, this.field68, 0); // L: 88
	} // L: 89

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)Ley;",
		garbageValue = "788"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 59
			var1 = new NPCComposition(); // L: 60
			var1.id = var0; // L: 61
			if (var2 != null) { // L: 62
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 63
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}
}
