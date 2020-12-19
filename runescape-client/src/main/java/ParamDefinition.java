import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("ParamDefinition")
public class ParamDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("x")
	@Export("type")
	char type;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1005886373
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("t")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("j")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamDefinition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "65535"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkj;II)V",
		garbageValue = "1000544289"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class298.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V",
		garbageValue = "1899658312"
	)
	public static void method4526(AbstractArchive var0) {
		StructDefinition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljy;",
		garbageValue = "-1708661851"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 41
		if (var1 != null) { // L: 42
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 43
			var1 = new SequenceDefinition(); // L: 44
			if (var2 != null) { // L: 45
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 46
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 47
			return var1; // L: 48
		}
	}

	@ObfuscatedName("x")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 49
			if (var0 % 37L == 0L) { // L: 50
				return null;
			} else {
				int var2 = 0; // L: 51

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 52 53 55
					++var2; // L: 54
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 57 58 67
					long var6 = var0; // L: 59
					var0 /= 37L; // L: 60
					var8 = class299.base37Table[(int)(var6 - var0 * 37L)]; // L: 61
					if (var8 == '_') { // L: 62
						int var9 = var5.length() - 1; // L: 63
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 64
						var8 = 160; // L: 65
					}
				}

				var5.reverse(); // L: 69
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 70
				return var5.toString(); // L: 71
			}
		} else {
			return null;
		}
	}
}
