import java.io.File;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("y")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return GrandExchangeOfferOwnWorldComparator.method1271(); // L: 45
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2065815479"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 167
			if (KeyHandler.field276 == KeyHandler.field277) { // L: 168
				return false;
			} else {
				SoundCache.field446 = KeyHandler.field270[KeyHandler.field276]; // L: 169
				Timer.field3780 = KeyHandler.field269[KeyHandler.field276]; // L: 170
				KeyHandler.field276 = KeyHandler.field276 + 1 & 127; // L: 171
				return true; // L: 172
			}
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Liv;S)Ljava/lang/String;",
		garbageValue = "32547"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (ModelData0.Widget_unpackTargetMask(class22.getWidgetFlags(var0)) == 0) { // L: 11566
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11567 11568 11570
		}
	}
}
