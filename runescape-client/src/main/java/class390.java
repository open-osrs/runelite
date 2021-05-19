import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class390 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -223258731
	)
	public final int field4222;
	@ObfuscatedName("c")
	public Object field4221;

	public class390(int var1) {
		this.field4222 = var1; // L: 8
	} // L: 9

	public class390(int var1, Object var2) {
		this.field4222 = var1; // L: 12
		this.field4221 = var2; // L: 13
	} // L: 14

	public int hashCode() {
		return super.hashCode(); // L: 17
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class390)) { // L: 21
			return false;
		} else {
			class390 var2 = (class390)var1; // L: 22
			if (var2.field4221 == null && this.field4221 != null) { // L: 23
				return false;
			} else if (this.field4221 == null && var2.field4221 != null) { // L: 24
				return false;
			} else {
				return this.field4222 == var2.field4222 && var2.field4221.equals(this.field4221); // L: 25
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	public static void method6744(int var0) {
		class232.musicPlayerStatus = 1; // L: 71
		JagexCache.musicTrackArchive = null; // L: 72
		class232.musicTrackGroupId = -1; // L: 73
		class232.musicTrackFileId = -1; // L: 74
		LoginPacket.musicTrackVolume = 0; // L: 75
		VarpDefinition.musicTrackBoolean = false; // L: 76
		class232.pcmSampleLength = var0; // L: 77
	} // L: 78
}
