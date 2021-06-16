import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class20 extends class16 {
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -114026065
	)
	static int field166;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 468630141
	)
	int field162;
	@ObfuscatedName("e")
	byte field163;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 658289705
	)
	int field161;
	@ObfuscatedName("y")
	String field164;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field162 = -1; // L: 100
	} // L: 105

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		this.field162 = var1.readUnsignedShort(); // L: 108
		this.field163 = var1.readByte(); // L: 109
		this.field161 = var1.readUnsignedShort(); // L: 110
		var1.readLong(); // L: 111
		this.field164 = var1.readStringCp1252NullTerminated(); // L: 112
	} // L: 113

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field162); // L: 116
		var2.rank = this.field163; // L: 117
		var2.world = this.field161; // L: 118
		var2.name = this.field164; // L: 119
	} // L: 120

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-8931"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 216
			return true;
		} else if (!AttackOption.Widget_archive.tryLoadGroup(var0)) { // L: 217
			return false;
		} else {
			int var1 = AttackOption.Widget_archive.getGroupFileCount(var0); // L: 218
			if (var1 == 0) { // L: 219
				Widget.Widget_loadedInterfaces[var0] = true; // L: 220
				return true; // L: 221
			} else {
				if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] == null) { // L: 223
					GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 224
					if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] == null) { // L: 225
						byte[] var3 = AttackOption.Widget_archive.takeFile(var0, var2); // L: 226
						if (var3 != null) { // L: 227
							GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 228
							GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 229
							if (var3[0] == -1) { // L: 230
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 231
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 235
				return true; // L: 236
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8796
			Widget var0 = class17.getWidgetChild(class15.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8797
			if (var0 != null && var0.onTargetLeave != null) { // L: 8798
				ScriptEvent var1 = new ScriptEvent(); // L: 8799
				var1.widget = var0; // L: 8800
				var1.args = var0.onTargetLeave; // L: 8801
				WorldMapSection1.runScriptEvent(var1); // L: 8802
			}

			Client.field634 = -1; // L: 8804
			Client.isSpellSelected = false; // L: 8805
			Script.invalidateWidget(var0); // L: 8806
		}
	} // L: 8807

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1886471303"
	)
	static final void method288() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2593, Client.packetWriter.isaacCipher); // L: 11242
		Client.packetWriter.addNode(var0); // L: 11243

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11244
			if (var1.type == 0 || var1.type == 3) { // L: 11245
				InvDefinition.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11247
			Script.invalidateWidget(Client.meslayerContinueWidget); // L: 11248
			Client.meslayerContinueWidget = null; // L: 11249
		}

	} // L: 11251
}
