import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class133 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 3705068716980878955L
	)
	long field1501;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 4198128011964420903L
	)
	long field1500;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field1499;

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	public class133(Buffer var1) {
		this.field1500 = -1L;
		this.field1499 = new IterableNodeDeque();
		this.method2660(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-793618033"
	)
	void method2660(Buffer var1) {
		this.field1501 = var1.readLong();
		this.field1500 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class128(this);
			} else if (var2 == 4) {
				var3 = new class139(this);
			} else if (var2 == 3) {
				var3 = new class124(this);
			} else if (var2 == 2) {
				var3 = new class122(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class129(this);
			}

			((class132)var3).vmethod2703(var1);
			this.field1499.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "120"
	)
	public void method2655(ClanChannel var1) {
		if (this.field1501 == var1.key && var1.field1516 == this.field1500) {
			for (class132 var2 = (class132)this.field1499.last(); var2 != null; var2 = (class132)this.field1499.previous()) {
				var2.vmethod2702(var1);
			}

			++var1.field1516;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1225255244"
	)
	public static final void method2654() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
