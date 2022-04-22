import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("bc")
	@Export("otp")
	static String otp;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-72"
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

			if (var7.cycle <= var1) { // L: 27
				var5 = var7;
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lcp;",
		garbageValue = "675782761"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-107"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6164(); // L: 55
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-31"
	)
	public static int method2344(int var0) {
		return class400.field4389[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1491549945"
	)
	static int method2343(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4511
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4512
			return 1; // L: 4513
		} else if (var0 != 6801 && var0 != 6802) { // L: 4515
			if (var0 == 6850) { // L: 4519
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4520
				return 1; // L: 4521
			} else if (var0 != 6851 && var0 != 6852) { // L: 4523
				if (var0 == 6853) { // L: 4527
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4528
					return 1; // L: 4529
				} else {
					return 2; // L: 4531
				}
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4524
				return 1; // L: 4525
			}
		} else {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4516
			return 1; // L: 4517
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1357746428"
	)
	static final void method2330(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8655
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8656
				Client.field715[var4] = true;
			}
		}

	} // L: 8658

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-66"
	)
	static final void method2328(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class21.guestClanChannel; // L: 12409
		if (var2 != null && var1 >= 0 && var1 < var2.method3119()) { // L: 12410
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12411
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12413
				PacketBufferNode var5 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2900, Client.packetWriter.isaacCipher); // L: 12414
				var5.packetBuffer.writeByte(3 + class425.stringCp1252NullTerminatedByteSize(var4)); // L: 12415
				var5.packetBuffer.writeByte(var0); // L: 12416
				var5.packetBuffer.writeShort(var1); // L: 12417
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12418
				Client.packetWriter.addNode(var5); // L: 12419
			}
		}
	} // L: 12412 12420
}
