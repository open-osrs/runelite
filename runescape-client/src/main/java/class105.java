import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class105 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("z")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 998916811
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljg;",
		garbageValue = "-595128316"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 40
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}
}
