import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class16 implements ThreadFactory {
	@ObfuscatedName("v")
	final ThreadGroup field83;
	@ObfuscatedName("o")
	final AtomicInteger field84;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lp;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field84 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field83 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field83, var1, this.this$0.field74 + "-rest-request-" + this.field84.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llq;III)Lqx;",
		garbageValue = "-1536668938"
	)
	static IndexedSprite method218(AbstractArchive var0, int var1, int var2) {
		return !GrandExchangeEvent.method6045(var0, var1, var2) ? null : Clock.method3323(); // L: 45 46
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-805964566"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 130
			if (KeyHandler.field137 == KeyHandler.field135) { // L: 131
				return false;
			} else {
				class241.field2833 = KeyHandler.field130[KeyHandler.field135]; // L: 132
				class1.field3 = KeyHandler.field115[KeyHandler.field135]; // L: 133
				KeyHandler.field135 = KeyHandler.field135 + 1 & 127; // L: 134
				return true; // L: 135
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1927967311"
	)
	public static int method217(CharSequence var0) {
		return FloorOverlayDefinition.method3788(var0, 10, true); // L: 68
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(Lco;I)V",
		garbageValue = "362811494"
	)
	static final void method215(Actor var0) {
		if (var0.field1180 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > ItemContainer.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3761
			int var1 = var0.field1180 - var0.field1179; // L: 3762
			int var2 = Client.cycle - var0.field1179; // L: 3763
			int var3 = var0.field1145 * 64 + var0.field1175 * 128; // L: 3764
			int var4 = var0.field1145 * 64 + var0.field1177 * 128; // L: 3765
			int var5 = var0.field1145 * 64 + var0.field1176 * 128; // L: 3766
			int var6 = var0.field1145 * 64 + var0.field1178 * 128; // L: 3767
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1; // L: 3768
			var0.y = (var6 * var2 + var4 * (var1 - var2)) / var1; // L: 3769
		}

		var0.field1197 = 0; // L: 3771
		var0.orientation = var0.field1181; // L: 3772
		var0.rotation = var0.orientation; // L: 3773
	} // L: 3774

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2114031741"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11723
			PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher); // L: 11725
			var1.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var0)); // L: 11726
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11727
			Client.packetWriter.addNode(var1); // L: 11728
		}
	} // L: 11729
}
