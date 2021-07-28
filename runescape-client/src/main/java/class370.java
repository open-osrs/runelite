import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
class class370 implements Iterator {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 54109273
	)
	int field4147;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	final class371 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lns;)V"
	)
	class370(class371 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field4147 - 1;
		class341 var2 = (class341)this.this$0.field4151.get((long)var1);
		return var2 != null ? var2 : this.this$0.method6512(var1);
	}

	public boolean hasNext() {
		return this.field4147 < this.this$0.method6061();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Ljy;I)Z",
		garbageValue = "631428287"
	)
	public static boolean method6509(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method2735();
				}
			}

			return true;
		}
	}
}
