import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("ParamDefinition")
public class ParamDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lec;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("n")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("q")
	@Export("type")
	char type;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 153668641
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("p")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("g")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamDefinition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1718151512"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "-115197089"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lkn;II)V",
		garbageValue = "-1727060018"
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
				char var6 = class297.cp1252AsciiExtension[var5 - 128];
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "624673738"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}
}
