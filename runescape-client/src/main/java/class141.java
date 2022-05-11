import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class141 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -390226113
	)
	int field1670;
	@ObfuscatedName("q")
	byte field1668;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1954797197
	)
	int field1669;
	@ObfuscatedName("k")
	String field1671;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1670 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1670 = var1.readUnsignedShort(); // L: 134
		this.field1668 = var1.readByte(); // L: 135
		this.field1669 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1671 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1670); // L: 143
		var2.rank = this.field1668; // L: 144
		var2.world = this.field1669; // L: 145
		var2.username = new Username(this.field1671); // L: 146
	} // L: 147

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[Lcm;",
		garbageValue = "-33"
	)
	static class83[] method2962() {
		return new class83[]{class83.field1087, class83.field1088, class83.field1092, class83.field1084, class83.field1086, class83.field1083}; // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgt;",
		garbageValue = "19"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 316
		if (var1 != null) { // L: 317
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 319
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 320
			boolean var5 = true; // L: 322
			int[] var6 = var3.getGroupFileIds(var0); // L: 323

			for (int var7 = 0; var7 < var6.length; ++var7) { // L: 324
				byte[] var8 = var3.getFile(var0, var6[var7]); // L: 325
				if (var8 == null) { // L: 326
					var5 = false; // L: 327
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255; // L: 330
					byte[] var10 = var4.getFile(var9, 0); // L: 333
					if (var10 == null) { // L: 334
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) { // L: 336
				var2 = null; // L: 337
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false); // L: 341
				} catch (Exception var12) { // L: 343
					var2 = null; // L: 344
				}
			}

			if (var2 != null) { // L: 348
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2; // L: 349
		}
	}
}
