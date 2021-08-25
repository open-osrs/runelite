import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class120 extends class116 {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 571132071
	)
	int field1409;
	@ObfuscatedName("c")
	byte field1408;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class120(class119 var1) {
		this.this$0 = var1;
		this.field1409 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1409 = var1.readUnsignedShort();
		this.field1408 = var1.readByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2581(this.field1409, this.field1408);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1710039893"
	)
	public static int method2512(int var0) {
		return class245.field2885[var0];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	public static void method2516(int var0) {
		if (var0 != -1) {
			if (Widget.Widget_loadedInterfaces[var0]) {
				Widget.Widget_archive.clearFilesGroup(var0);
				if (class139.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < class139.Widget_interfaceComponents[var0].length; ++var2) {
						if (class139.Widget_interfaceComponents[var0][var2] != null) {
							if (class139.Widget_interfaceComponents[var0][var2].type != 2) {
								class139.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						class139.Widget_interfaceComponents[var0] = null;
					}

					Widget.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}
}
