import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class20 implements Callable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class10 field94;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ll;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ll;Lx;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field94 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field94.method89()) { // L: 52
				FloorUnderlayDefinition.method3190(10L); // L: 53
			}
		} catch (IOException var2) { // L: 56
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 57
		}

		return this.field94.method100(); // L: 59
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;Lko;I)V",
		garbageValue = "1541093699"
	)
	public static void method295(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field1799 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-23497381"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lbw;",
		garbageValue = "-632858850"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return class91.getNextWorldListWorld(); // L: 248
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	static final void method294() {
		Object var10000 = null; // L: 114
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		class397.addGameMessage(30, "", var0); // L: 116
	} // L: 118

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1226248726"
	)
	static final void method298(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 11843
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method2809()) { // L: 11844
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 11845
				if (var2.rank == -1) { // L: 11846
					PacketWriter var3 = Client.packetWriter; // L: 11847
					PacketBufferNode var4 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2737, var3.isaacCipher); // L: 11848
					var4.packetBuffer.writeByte(3 + Client.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 11849
					var4.packetBuffer.writeByte(var0); // L: 11850
					var4.packetBuffer.writeShort(var1); // L: 11851
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 11852
					var3.addNode(var4); // L: 11853
				}
			}
		}
	} // L: 11854

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)Ljava/lang/String;",
		garbageValue = "2082215061"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var0)) == 0) { // L: 11917
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 11918 11919 11921
		}
	}
}
