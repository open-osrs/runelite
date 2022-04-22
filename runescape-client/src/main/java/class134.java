import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("em")
public class class134 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -890090541
	)
	int field1558;
	@ObfuscatedName("c")
	byte field1557;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1576822887
	)
	int field1559;
	@ObfuscatedName("f")
	String field1560;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1558 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "23"
	)
	void vmethod3152(Buffer var1) {
		this.field1558 = var1.readUnsignedShort(); // L: 109
		this.field1557 = var1.readByte(); // L: 110
		this.field1559 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1560 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1764669808"
	)
	void vmethod3153(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1558); // L: 117
		var2.rank = this.field1557; // L: 118
		var2.world = this.field1559; // L: 119
		var2.username = new Username(this.field1560); // L: 120
	} // L: 121

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfb;",
		garbageValue = "6"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-939584832"
	)
	public static boolean method2905(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) { // L: 45
			if (var0 != 0) { // L: 46
				char[] var1 = class345.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) {
						return true; // L: 52
					}
				}
			}

			return false; // L: 57
		} else {
			return true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZS)I",
		garbageValue = "300"
	)
	static int method2906(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 818
			var0 -= 1000; // L: 819
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 820
		} else {
			var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 822
		}

		class346.invalidateWidget(var3); // L: 823
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 824
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 844
				var3.modelType = 2; // L: 845
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 846
				return 1; // L: 847
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 849
				var3.modelType = 3; // L: 850
				var3.modelId = GrandExchangeEvents.localPlayer.appearance.getChatHeadId(); // L: 851
				return 1; // L: 852
			} else {
				return 2; // L: 854
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 825
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 826
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 827
			var3.itemId = var4; // L: 828
			var3.itemQuantity = var5; // L: 829
			ItemComposition var6 = class19.ItemDefinition_get(var4); // L: 830
			var3.modelAngleX = var6.xan2d; // L: 831
			var3.modelAngleY = var6.yan2d; // L: 832
			var3.modelAngleZ = var6.zan2d; // L: 833
			var3.modelOffsetX = var6.offsetX2d; // L: 834
			var3.modelOffsetY = var6.offsetY2d; // L: 835
			var3.modelZoom = var6.zoom2d; // L: 836
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 837
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 838
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 839
			}

			if (var3.field3467 > 0) { // L: 840
				var3.modelZoom = var3.modelZoom * 32 / var3.field3467;
			} else if (var3.rawWidth > 0) { // L: 841
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 842
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	static void method2908() {
		Client.packetWriter.addNode(WorldMapSprite.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher)); // L: 12607
		Client.oculusOrbState = 0; // L: 12608
	} // L: 12609
}
