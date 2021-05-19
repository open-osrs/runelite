import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1065517543
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laf;",
		garbageValue = "2104545724"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laf;",
		garbageValue = "-814678921"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laf;",
		garbageValue = "-1571869142"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[IS)Laf;",
		garbageValue = "-1177"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lof;",
		garbageValue = "142719067"
	)
	static IndexedSprite method866(boolean var0, boolean var1) {
		return var0 ? (var1 ? class225.field2684 : GrandExchangeEvent.options_buttons_2Sprite) : (var1 ? InterfaceParent.field1134 : GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite); // L: 225
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "453533499"
	)
	static final void method869(int var0, int var1, boolean var2) {
		if (Client.field847[var0] != null) { // L: 11580
			if (var1 >= 0 && var1 < Client.field847[var0].method39()) { // L: 11581
				class9 var3 = (class9)Client.field847[var0].field32.get(var1); // L: 11582
				PacketWriter var4 = Client.packetWriter; // L: 11583
				PacketBufferNode var5 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2665, var4.isaacCipher); // L: 11584
				var5.packetBuffer.writeByte(4 + class4.stringCp1252NullTerminatedByteSize(var3.field73)); // L: 11585
				var5.packetBuffer.writeByte(var0); // L: 11586
				var5.packetBuffer.writeShort(var1); // L: 11587
				var5.packetBuffer.writeBoolean(var2); // L: 11588
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.field73); // L: 11589
				var4.addNode(var5); // L: 11590
			}
		}
	} // L: 11591
}
