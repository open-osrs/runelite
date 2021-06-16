import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 894086561
	)
	static int field68;
	@ObfuscatedName("f")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 532460543
	)
	@Export("world")
	public int world;
	@ObfuscatedName("v")
	@Export("name")
	public String name;

	ClanChannelMember() {
	} // L: 8

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "109"
	)
	public static boolean method108(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field264[var0] : false; // L: 234 235
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-82"
	)
	static int method106(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1115
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) { // L: 1116
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1117
			return 1; // L: 1118
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) { // L: 1120
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1121
			return 1; // L: 1122
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) { // L: 1124
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.text; // L: 1125
			return 1; // L: 1126
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) { // L: 1128
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1129
			return 1; // L: 1130
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) { // L: 1132
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1133
			return 1; // L: 1134
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) { // L: 1136
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1137
			return 1; // L: 1138
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) { // L: 1140
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1141
			return 1; // L: 1142
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) { // L: 1144
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1145
			return 1; // L: 1146
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) { // L: 1148
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1149
			return 1; // L: 1150
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) { // L: 1152
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1153
			return 1; // L: 1154
		} else if (var0 == 1610) { // L: 1156
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1157
			return 1; // L: 1158
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) { // L: 1160
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color; // L: 1161
			return 1; // L: 1162
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) { // L: 1164
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.color2; // L: 1165
			return 1; // L: 1166
		} else if (var0 == 1613) { // L: 1168
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1169
			return 1; // L: 1170
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) { // L: 1172
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1173
			return 1; // L: 1174
		} else if (var0 != 1615 && var0 != 1616) { // L: 1176
			return 2; // L: 1180
		} else {
			++ChatChannel.Interpreter_intStackSize; // L: 1177
			return 1; // L: 1178
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1449635210"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = InterfaceParent.getPacketBufferNode(ClientPacket.field2662, Client.packetWriter.isaacCipher); // L: 8811
		var2.packetBuffer.method6648(var1); // L: 8812
		var2.packetBuffer.writeIntME(var0); // L: 8813
		Client.packetWriter.addNode(var2); // L: 8814
	} // L: 8815
}
