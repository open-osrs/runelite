import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class131 extends class116 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1300731739
	)
	static int field1485;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -7049203579552523343L
	)
	long field1487;
	@ObfuscatedName("w")
	String field1486;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -121846283
	)
	int field1489;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class131(class119 var1) {
		this.this$0 = var1;
		this.field1487 = -1L; // L: 93
		this.field1486 = null; // L: 94
		this.field1489 = 0; // L: 95
	} // L: 97

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 100
			--var1.offset; // L: 101
			this.field1487 = var1.readLong(); // L: 102
		}

		this.field1486 = var1.readStringCp1252NullTerminatedOrNull(); // L: 104
		this.field1489 = var1.readUnsignedShort(); // L: 105
	} // L: 106

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2655(this.field1487, this.field1486, this.field1489); // L: 109
	} // L: 110

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-474591339"
	)
	public static void method2753() {
		try {
			if (class247.musicPlayerStatus == 1) { // L: 38
				int var0 = class247.midiPcmStream.method4754(); // L: 39
				if (var0 > 0 && class247.midiPcmStream.isReady()) { // L: 40
					var0 -= class247.pcmSampleLength; // L: 41
					if (var0 < 0) { // L: 42
						var0 = 0;
					}

					class247.midiPcmStream.setPcmStreamVolume(var0); // L: 43
					return; // L: 44
				}

				class247.midiPcmStream.clear(); // L: 46
				class247.midiPcmStream.removeAll(); // L: 47
				if (class128.musicTrackArchive != null) { // L: 48
					class247.musicPlayerStatus = 2;
				} else {
					class247.musicPlayerStatus = 0; // L: 49
				}

				class14.musicTrack = null; // L: 50
				class247.soundCache = null; // L: 51
			}
		} catch (Exception var2) { // L: 54
			var2.printStackTrace(); // L: 55
			class247.midiPcmStream.clear(); // L: 56
			class247.musicPlayerStatus = 0; // L: 57
			class14.musicTrack = null; // L: 58
			class247.soundCache = null; // L: 59
			class128.musicTrackArchive = null; // L: 60
		}

	} // L: 62
}
