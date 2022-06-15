import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
class class18 implements Comparator {
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = 872496551
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 437863053
	)
	@Export("cameraX")
	static int cameraX;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-175722815"
	)
	int method233(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 52
	}

	public int compare(Object var1, Object var2) {
		return this.method233((Entry)var1, (Entry)var2); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 60
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbr;",
		garbageValue = "123"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 35
		return var2.getMessage(var1); // L: 36
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-80"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 175
			if (KeyHandler.field127 == KeyHandler.field147) { // L: 176
				return false;
			} else {
				class272.field3196 = KeyHandler.field148[KeyHandler.field147]; // L: 177
				HealthBar.field1258 = KeyHandler.field149[KeyHandler.field147]; // L: 178
				KeyHandler.field147 = KeyHandler.field147 + 1 & 127; // L: 179
				return true; // L: 180
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	static final boolean method234() {
		return Client.isMenuOpen; // L: 8499
	}
}
