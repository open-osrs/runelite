import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class432 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	public static final class432 field4658;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	public static final class432 field4656;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	public static final class432 field4657;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 2112320967
	)
	static int field4663;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1402359519
	)
	public final int field4660;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -970810999
	)
	public final int field4655;
	@ObfuscatedName("e")
	public final Class field4659;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	final class428 field4661;

	static {
		field4658 = new class432(2, 0, Integer.class, new class429()); // L: 10
		field4656 = new class432(1, 1, Long.class, new class431());
		field4657 = new class432(0, 2, String.class, new class433());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lpf;)V"
	)
	class432(int var1, int var2, Class var3, class428 var4) {
		this.field4660 = var1;
		this.field4655 = var2;
		this.field4659 = var3; // L: 64
		this.field4661 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4655; // L: 90
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	public Object method7565(Buffer var1) {
		return this.field4661.vmethod7580(var1); // L: 94
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "692269534"
	)
	static void method7572() {
		if (class360.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 126
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 127
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 130
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 131
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 132
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 135
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 136
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 143
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lqe;",
		garbageValue = "-1646762131"
	)
	static SpritePixels method7578(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I[BLnd;B)V",
		garbageValue = "72"
	)
	static void method7576(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 0; // L: 19
		var3.key = (long)var0; // L: 20
		var3.data = var1; // L: 21
		var3.archiveDisk = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		Tiles.method2065(); // L: 26
	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfa;",
		garbageValue = "-43"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpv;",
		garbageValue = "2133763161"
	)
	public static class432[] method7566() {
		return new class432[]{field4657, field4658, field4656}; // L: 58
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lpv;",
		garbageValue = "-1091159826"
	)
	public static class432 method7561(Class var0) {
		class432[] var1 = method7566(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class432 var3 = var1[var2]; // L: 72
			if (var3.field4659 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lpf;",
		garbageValue = "1729544461"
	)
	public static class428 method7577(Class var0) {
		class432 var1 = method7561(var0); // L: 83
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 84
		} else {
			return var1.field4661; // L: 85
		}
	}
}
