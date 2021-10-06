import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
class class18 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ly;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "1973366143"
	)
	int method276(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method276((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-8553"
	)
	public static boolean method271(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1094271448"
	)
	static final void method282() {
		Object var10000 = null;
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		GraphicsDefaults.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1318932458"
	)
	static void method280() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class21.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
