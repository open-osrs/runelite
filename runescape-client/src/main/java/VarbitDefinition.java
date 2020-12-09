import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("VarbitDefinition")
public class VarbitDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("z")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1845026741
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -974081687
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1357944677
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1196473375"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "-1699368159"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lmu;B)Ljava/lang/String;",
		garbageValue = "3"
	)
	public static String method4525(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var10 = var3 - var2;
			if (var10 >= 1 && var10 <= ArchiveLoader.method1232(var1)) {
				StringBuilder var9 = new StringBuilder(var10);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (ObjectDefinition.method4657(var7)) {
						char var8 = UserComparator10.method3492(var7);
						if (var8 != 0) {
							var9.append(var8);
						}
					}
				}

				if (var9.length() == 0) {
					return null;
				} else {
					return var9.toString();
				}
			} else {
				return null;
			}
		}
	}
}
