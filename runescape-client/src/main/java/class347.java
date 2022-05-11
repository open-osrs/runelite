import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class347 implements Iterator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	class348 field4175;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1785277143
	)
	int field4174;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -114429441
	)
	int field4173;

	@ObfuscatedSignature(
		descriptor = "(Lmr;)V"
	)
	class347(class348 var1) {
		this.field4174 = 0; // L: 177
		this.field4173 = this.field4175.field4182; // L: 178
		this.field4175 = var1; // L: 181
	} // L: 182

	public boolean hasNext() {
		return this.field4174 < this.field4175.field4181; // L: 186
	}

	public Object next() {
		if (this.field4175.field4182 != this.field4173) { // L: 192
			throw new ConcurrentModificationException();
		} else if (this.field4174 < this.field4175.field4181) { // L: 193
			Object var1 = this.field4175.field4179[this.field4174].field4171; // L: 194
			++this.field4174; // L: 195
			return var1; // L: 196
		} else {
			throw new NoSuchElementException(); // L: 198
		}
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 203
	}
}
