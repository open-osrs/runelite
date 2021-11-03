import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("rt")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "655971331"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1027939055"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5633(); // L: 55
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	static void method2242() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromIgnored(); // L: 64
		}

	} // L: 67

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZS)Ljava/lang/String;",
		garbageValue = "-17378"
	)
	static String method2246(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11925
		if (Client.gameBuild == 1) { // L: 11926
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11927
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11928
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11929
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11930
			var0 = "local";
		}

		String var3 = ""; // L: 11931
		if (UserComparator3.field1316 != null) { // L: 11932
			var3 = "/p=" + UserComparator3.field1316;
		}

		String var4 = "runescape.com"; // L: 11933
		return var2 + var0 + "." + var4 + "/l=" + MouseHandler.clientLanguage + "/a=" + TextureProvider.field2483 + var3 + "/"; // L: 11934
	}
}
