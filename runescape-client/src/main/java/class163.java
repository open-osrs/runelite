import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class163 extends class166 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2137509577
	)
	int field1761;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lev;Ljava/lang/String;I)V"
	)
	class163(class155 var1, String var2, int var3) {
		super(var1, var2); // L: 372
		this.this$0 = var1; // L: 371
		this.field1761 = var3; // L: 373
	} // L: 374

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1689964957"
	)
	public int vmethod3341() {
		return 0; // L: 377
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "31414"
	)
	public int vmethod3334() {
		return this.field1761; // L: 381
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "760271805"
	)
	public static int method3321(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("v")
	public static final int method3320(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var4 * var2; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var14 + (var12 - var14) * 6.0D * var0;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var14 + var20 * (var12 - var14) * 6.0D;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = var14 + (var12 - var14) * (0.6666666666666666D - var20) * 6.0D;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;ZLmd;I)V",
		garbageValue = "845693367"
	)
	public static void method3318(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		SoundCache.ItemDefinition_archive = var0; // L: 84
		AttackOption.ItemDefinition_modelArchive = var1; // L: 85
		DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var2; // L: 86
		class293.ItemDefinition_fileCount = SoundCache.ItemDefinition_archive.getGroupFileCount(10); // L: 87
		ParamComposition.ItemDefinition_fontPlain11 = var3; // L: 88
	} // L: 89

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgw;",
		garbageValue = "-26"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = class11.SequenceDefinition_archive.takeFile(12, var0); // L: 54
			var1 = new SequenceDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 57
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 58
			return var1; // L: 59
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IIB)Lmd;",
		garbageValue = "3"
	)
	public static Font method3322(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 71
		boolean var4;
		if (var5 == null) { // L: 72
			var4 = false; // L: 73
		} else {
			WorldMapArea.SpriteBuffer_decode(var5); // L: 76
			var4 = true; // L: 77
		}

		return !var4 ? null : ViewportMouse.method5090(var1.takeFile(var2, var3)); // L: 79 80
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "-2096027290"
	)
	static final void method3315(PendingSpawn var0) {
		long var1 = 0L; // L: 7731
		int var3 = -1; // L: 7732
		int var4 = 0; // L: 7733
		int var5 = 0; // L: 7734
		if (var0.type == 0) { // L: 7735
			var1 = ArchiveLoader.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7736
			var1 = ArchiveLoader.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7737
			var1 = ArchiveLoader.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = ArchiveLoader.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7738
		}

		if (var1 != 0L) { // L: 7739
			int var6 = ArchiveLoader.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7740
			var3 = FileSystem.Entity_unpackID(var1); // L: 7741
			var4 = var6 & 31; // L: 7742
			var5 = var6 >> 6 & 3; // L: 7743
		}

		var0.objectId = var3; // L: 7745
		var0.field1105 = var4; // L: 7746
		var0.field1104 = var5; // L: 7747
	} // L: 7748
}
