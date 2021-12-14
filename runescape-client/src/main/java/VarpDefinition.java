import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 2043894385
	)
	static int field1748;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("he")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1559119131
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1334778255"
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
		descriptor = "(Lpi;II)V",
		garbageValue = "-1795168464"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcy;II)V",
		garbageValue = "827099258"
	)
	static final void method3167(Actor var0, int var1) {
		ModeWhere.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "13655"
	)
	static void method3168(int var0) {
		Client.oculusOrbState = var0;
	}
}
