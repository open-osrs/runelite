import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class5 extends class16 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1071759603
	)
	static int field53;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -625073017
	)
	int field56;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field56 = -1; // L: 81
	} // L: 83

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		this.field56 = var1.readUnsignedShort(); // L: 86
		var1.readUnsignedByte(); // L: 87
		if (var1.readUnsignedByte() != 255) { // L: 88
			--var1.offset; // L: 89
			var1.readLong(); // L: 90
		}

	} // L: 92

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(ClanChannel var1) {
		var1.removeMember(this.field56); // L: 95
	} // L: 96

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1508723564"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IS)[B",
		garbageValue = "3296"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 72
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "30"
	)
	public static int method58(int var0) {
		return VarpDefinition.method2630(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 60
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "113"
	)
	static final boolean method51(int var0) {
		if (var0 < 0) { // L: 7764
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 7765
			if (var1 >= 2000) { // L: 7766
				var1 -= 2000;
			}

			return var1 == 1007; // L: 7767
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1850055815"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8647
			Widget var0 = ModeWhere.getWidgetChild(Decimator.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8648
			if (var0 != null && var0.onTargetLeave != null) { // L: 8649
				ScriptEvent var1 = new ScriptEvent(); // L: 8650
				var1.widget = var0; // L: 8651
				var1.args = var0.onTargetLeave; // L: 8652
				PacketWriter.runScriptEvent(var1); // L: 8653
			}

			Client.field788 = -1; // L: 8655
			Client.isSpellSelected = false; // L: 8656
			WorldMapCacheName.invalidateWidget(var0); // L: 8657
		}
	} // L: 8658
}
