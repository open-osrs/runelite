import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ej")
public class class131 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -1512748666488385143L
	)
	long field1582;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 713864739
	)
	int field1584;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	IterableNodeDeque field1585;

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	public class131(Buffer var1) {
		this.field1584 = -1; // L: 9
		this.field1585 = new IterableNodeDeque();
		this.method2868(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "840156873"
	)
	void method2868(Buffer var1) {
		this.field1582 = var1.readLong(); // L: 32
		this.field1584 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class150(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class126(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class143(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class135(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this); // L: 42
			} else if (var2 == 2) { // L: 43
				var3 = new class132(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class125(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class129(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class146(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class133(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class137(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class147(this);
			}

			((class128)var3).vmethod3150(var1); // L: 53
			this.field1585.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1292823548"
	)
	public void method2869(ClanSettings var1) {
		if (var1.field1627 == this.field1582 && this.field1584 == var1.field1628) { // L: 60
			for (class128 var2 = (class128)this.field1585.last(); var2 != null; var2 = (class128)this.field1585.previous()) { // L: 61
				var2.vmethod3149(var1); // L: 62
			}

			++var1.field1628; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lnl;",
		garbageValue = "-16"
	)
	public static AbstractSocket method2878(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "906922492"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = class362.World_worlds[var6]; // L: 180
			class362.World_worlds[var6] = class362.World_worlds[var1]; // L: 181
			class362.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (MusicPatchPcmStream.method5445(class362.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = class362.World_worlds[var9]; // L: 185
					class362.World_worlds[var9] = class362.World_worlds[var7]; // L: 186
					class362.World_worlds[var7++] = var10; // L: 187
				}
			}

			class362.World_worlds[var1] = class362.World_worlds[var7]; // L: 191
			class362.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZB)I",
		garbageValue = "-70"
	)
	static int method2875(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2280
			class446.Interpreter_intStackSize -= 2; // L: 2281
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2282
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2283
			EnumComposition var10 = UserComparator7.getEnum(var3); // L: 2284
			if (var10.outputType != 's') { // L: 2285
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2286
				if (var9 == var10.keys[var6]) { // L: 2287
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2288
					var10 = null; // L: 2289
					break;
				}
			}

			if (var10 != null) { // L: 2293
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2294
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2296
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2322
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]; // L: 2323
				EnumComposition var4 = UserComparator7.getEnum(var3); // L: 2324
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.size(); // L: 2325
				return 1; // L: 2326
			} else {
				return 2; // L: 2328
			}
		} else {
			class446.Interpreter_intStackSize -= 4; // L: 2297
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]; // L: 2298
			var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]; // L: 2299
			int var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]; // L: 2300
			var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]; // L: 2301
			EnumComposition var7 = UserComparator7.getEnum(var5); // L: 2302
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2303
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2308
					if (var6 == var7.keys[var8]) { // L: 2309
						if (var9 == 115) { // L: 2310
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2311
						}

						var7 = null; // L: 2312
						break;
					}
				}

				if (var7 != null) { // L: 2316
					if (var9 == 115) { // L: 2317
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2318
					}
				}

				return 1; // L: 2320
			} else {
				if (var9 == 115) { // L: 2304
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0; // L: 2305
				}

				return 1; // L: 2306
			}
		}
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	static final void method2877() {
		if (Client.logoutTimer > 0) { // L: 3009
			MouseRecorder.logOut(); // L: 3010
		} else {
			Client.timer.method6510(); // L: 3013
			HealthBarUpdate.updateGameState(40); // L: 3014
			Message.field461 = Client.packetWriter.getSocket(); // L: 3015
			Client.packetWriter.removeSocket(); // L: 3016
		}
	} // L: 3011 3017
}
