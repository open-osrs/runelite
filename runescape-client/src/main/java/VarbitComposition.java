import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("k")
	static final int[] field1784;
	@ObfuscatedName("do")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1254012853
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -590597255
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1105394607
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1784 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1784[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-123239897"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1018512127"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;II)Liq;",
		garbageValue = "-1817307583"
	)
	static MusicPatch method3103(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfb;",
		garbageValue = "4"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lkl;IIB)Z",
		garbageValue = "41"
	)
	public static boolean method3102(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class398.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
