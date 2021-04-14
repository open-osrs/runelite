import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class5 extends class16 {
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 612354285
	)
	static int field40;
	@ObfuscatedName("o")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 2112256777
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1021832225
	)
	int field42;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field42 = -1; // L: 81
	} // L: 83

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		this.field42 = var1.readUnsignedShort(); // L: 86
		var1.readUnsignedByte(); // L: 87
		if (var1.readUnsignedByte() != 255) { // L: 88
			--var1.offset; // L: 89
			var1.readLong(); // L: 90
		}

	} // L: 92

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		var1.method45(this.field42); // L: 95
	} // L: 96

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILlp;Lig;I)V",
		garbageValue = "1497398389"
	)
	static void method85(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 30
		var3.type = 1; // L: 31
		var3.key = (long)var0; // L: 32
		var3.archiveDisk = var1; // L: 33
		var3.archive = var2; // L: 34
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 35
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 36
		} // L: 37

		ItemLayer.method3271(); // L: 38
	} // L: 39

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "74"
	)
	static final int method83(int var0, int var1) {
		int var2 = class312.method5606(var0 - 1, var1 - 1) + class312.method5606(1 + var0, var1 - 1) + class312.method5606(var0 - 1, var1 + 1) + class312.method5606(var0 + 1, 1 + var1); // L: 977
		int var3 = class312.method5606(var0 - 1, var1) + class312.method5606(1 + var0, var1) + class312.method5606(var0, var1 - 1) + class312.method5606(var0, var1 + 1); // L: 978
		int var4 = class312.method5606(var0, var1); // L: 979
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 980
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "52"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class15.loadInterface(var0)) { // L: 10400
			GameObject.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 10401
		}
	} // L: 10402
}
