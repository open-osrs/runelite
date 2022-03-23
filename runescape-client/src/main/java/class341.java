import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class341 implements Iterator {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	class342 field4112;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 203290691
	)
	int field4114;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1571350147
	)
	int field4113;

	@ObfuscatedSignature(
		descriptor = "(Lmj;)V"
	)
	class341(class342 var1) {
		this.field4114 = 0; // L: 177
		this.field4113 = this.field4112.field4115; // L: 178
		this.field4112 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4114 < this.field4112.field4117; // L: 186
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}

	public Object next() {
		if (this.field4112.field4115 != this.field4113) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4114 < this.field4112.field4117) { // L: 193
			Object var1 = this.field4112.field4121[this.field4114].field4107; // L: 194
			++this.field4114; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lal;B)V",
		garbageValue = "81"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 270
		if (var0.sound != null) { // L: 271
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 272
		}

	} // L: 273
}
