import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class3 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	static final class3 field11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	static final class3 field9;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	static final class3 field10;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 914942415
	)
	final int field14;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1840148541
	)
	public final int field12;
	@ObfuscatedName("q")
	public final Class field13;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class0 field16;

	static {
		field11 = new class3(0, 0, Integer.class, new class1()); // L: 10
		field9 = new class3(1, 1, Long.class, new class2()); // L: 23
		field10 = new class3(2, 2, String.class, new class4());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lf;)V"
	)
	class3(int var1, int var2, Class var3, class0 var4) {
		this.field14 = var1; // L: 59
		this.field12 = var2; // L: 60
		this.field13 = var3; // L: 61
		this.field16 = var4; // L: 62
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "23"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field12; // L: 93
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1763369505"
	)
	public Object method47(Buffer var1) {
		return this.field16.vmethod72(var1); // L: 97
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lm;",
		garbageValue = "-100"
	)
	public static class3[] method43() {
		return new class3[]{field10, field11, field9}; // L: 55
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "1153774479"
	)
	public static void method57(Object var0, Buffer var1) {
		class0 var2 = method45(var0.getClass());
		var2.vmethod69(var0, var1);
	} // L: 68

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-2079467882"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lf;",
		garbageValue = "-1368179689"
	)
	static class0 method45(Class var0) {
		class3[] var2 = method43(); // L: 74
		int var3 = 0;

		class3 var1;
		while (true) {
			if (var3 >= var2.length) {
				var1 = null; // L: 85
				break;
			}

			class3 var4 = var2[var3]; // L: 76
			if (var4.field13 == var0) { // L: 78
				var1 = var4; // L: 79
				break;
			}

			++var3; // L: 75
		}

		if (var1 == null) { // L: 88
			throw new IllegalArgumentException();
		} else {
			return var1.field16; // L: 89
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-268310381"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1886603944"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 151
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2004525575"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ItemContainer.getWidgetChild(var0, var1); // L: 8792
		if (var4 != null && var4.onTargetEnter != null) { // L: 8793
			ScriptEvent var5 = new ScriptEvent(); // L: 8794
			var5.widget = var4; // L: 8795
			var5.args = var4.onTargetEnter; // L: 8796
			Entity.runScriptEvent(var5); // L: 8797
		}

		Client.field838 = var3; // L: 8799
		Client.isSpellSelected = true; // L: 8800
		class307.selectedSpellWidget = var0; // L: 8801
		Client.selectedSpellChildIndex = var1; // L: 8802
		class105.selectedSpellFlags = var2; // L: 8803
		GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4); // L: 8804
	} // L: 8805
}
