import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ne")
public class class375 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4134;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4127;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4128;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1544272871
	)
	final int field4129;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 928638061
	)
	public final int field4137;
	@ObfuscatedName("o")
	public final Class field4132;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	final class371 field4133;

	static {
		field4134 = new class375(1, 0, Integer.class, new class372()); // L: 10
		field4127 = new class375(0, 1, Long.class, new class374()); // L: 23
		field4128 = new class375(2, 2, String.class, new class376()); // L: 36
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnq;)V"
	)
	class375(int var1, int var2, Class var3, class371 var4) {
		this.field4129 = var1; // L: 55
		this.field4137 = var2; // L: 56
		this.field4132 = var3; // L: 57
		this.field4133 = var4; // L: 58
	} // L: 59

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4137; // L: 91
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Ljava/lang/Object;",
		garbageValue = "728831584"
	)
	public Object method6510(Buffer var1) {
		return this.field4133.vmethod6533(var1); // L: 95
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "268757704"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = Varcs.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = NetSocket.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lne;",
		garbageValue = "1422033008"
	)
	public static class375 method6511(Class var0) {
		class375[] var1 = new class375[]{field4128, field4134, field4127}; // L: 65
		class375[] var2 = var1; // L: 67

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 68
			class375 var4 = var2[var3]; // L: 69
			if (var4.field4132 == var0) { // L: 71
				return var4;
			}
		}

		return null; // L: 75
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnt;I)V",
		garbageValue = "-1820805265"
	)
	public static void method6512(Object var0, Buffer var1) {
		Class var3 = var0.getClass(); // L: 80
		class375 var4 = method6511(var3); // L: 82
		if (var4 == null) {
			throw new IllegalArgumentException(); // L: 83
		} else {
			class371 var2 = var4.field4133; // L: 84
			var2.vmethod6536(var0, var1); // L: 87
		}
	} // L: 88

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1726872314"
	)
	static final void method6530(String var0) {
		PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher); // L: 136
		var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0)); // L: 137
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 138
		Client.packetWriter.addNode(var1); // L: 139
	} // L: 140

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "784066620"
	)
	static int method6531(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3153
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3154
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class250.ItemDefinition_get(var3).name; // L: 3155
			return 1; // L: 3156
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3158
				ChatChannel.Interpreter_intStackSize -= 2; // L: 3159
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3160
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3161
				var5 = class250.ItemDefinition_get(var3); // L: 3162
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3163
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3164
				}

				return 1; // L: 3165
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3167
				ChatChannel.Interpreter_intStackSize -= 2; // L: 3168
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3169
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3170
				var5 = class250.ItemDefinition_get(var3); // L: 3171
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3172
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3173
				}

				return 1; // L: 3174
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3176
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3177
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).price; // L: 3178
				return 1; // L: 3179
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3181
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3182
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3183
				return 1; // L: 3184
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3186
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3187
					var7 = class250.ItemDefinition_get(var3); // L: 3188
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3189
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 3190
					}

					return 1; // L: 3191
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3193
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3194
					var7 = class250.ItemDefinition_get(var3); // L: 3195
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3196
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 3197
					}

					return 1; // L: 3198
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3200
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3201
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3202
					return 1; // L: 3203
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3205
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3206
					var7 = class250.ItemDefinition_get(var3); // L: 3207
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3208
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 3209
					}

					return 1; // L: 3210
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3212
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3213
					var7 = class250.ItemDefinition_get(var3); // L: 3214
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3215
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3; // L: 3216
					}

					return 1; // L: 3217
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3219
					String var6 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3220
					var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3221
					DevicePcmPlayerProvider.findItemDefinitions(var6, var4 == 1); // L: 3222
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.foundItemIdCount; // L: 3223
					return 1; // L: 3224
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3226
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3231
						PcmPlayer.foundItemIndex = 0; // L: 3232
						return 1; // L: 3233
					} else if (var0 == 4213) { // L: 3235
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3236
						var4 = class250.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3237
						if (var4 == -1) { // L: 3238
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4; // L: 3239
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4 + 1; // L: 3242
						}

						return 1; // L: 3244
					} else {
						return 2; // L: 3246
					}
				} else {
					if (ClanChannel.foundItemIds != null && PcmPlayer.foundItemIndex < ApproximateRouteStrategy.foundItemIdCount) { // L: 3227
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannel.foundItemIds[++PcmPlayer.foundItemIndex - 1] & '\uffff'; // L: 3228
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3229
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-25477474"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7293

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7294 7295 7300
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7296
				var9 = var10; // L: 7297
				break;
			}
		}

		if (var9 == null) { // L: 7302
			var9 = new PendingSpawn(); // L: 7303
			var9.plane = var0; // L: 7304
			var9.type = var3; // L: 7305
			var9.x = var1; // L: 7306
			var9.y = var2; // L: 7307
			FriendSystem.method1875(var9); // L: 7308
			Client.pendingSpawns.addFirst(var9); // L: 7309
		}

		var9.id = var4; // L: 7311
		var9.field1213 = var5; // L: 7312
		var9.orientation = var6; // L: 7313
		var9.delay = var7; // L: 7314
		var9.hitpoints = var8; // L: 7315
	} // L: 7316
}
