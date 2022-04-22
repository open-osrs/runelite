import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -1797802819
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("v")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("c")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1428747809"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "-92"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) { // L: 30
			SecureRandom var3 = new SecureRandom(); // L: 33
			var3.nextInt(); // L: 34
			return var3; // L: 37
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "2104431553"
	)
	static int method1985(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2270
			Interpreter.Interpreter_intStackSize -= 2; // L: 2271
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2272
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2273
			EnumComposition var10 = class78.getEnum(var3); // L: 2274
			if (var10.outputType != 's') { // L: 2275
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2276
				if (var9 == var10.keys[var6]) { // L: 2277
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2278
					var10 = null; // L: 2279
					break;
				}
			}

			if (var10 != null) { // L: 2283
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2284
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2286
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2312
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2313
				EnumComposition var4 = class78.getEnum(var3); // L: 2314
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2315
				return 1; // L: 2316
			} else {
				return 2; // L: 2318
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2287
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2288
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2289
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2290
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2291
			EnumComposition var7 = class78.getEnum(var5); // L: 2292
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2293
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2298
					if (var6 == var7.keys[var8]) { // L: 2299
						if (var9 == 115) { // L: 2300
							Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2301
						}

						var7 = null; // L: 2302
						break;
					}
				}

				if (var7 != null) { // L: 2306
					if (var9 == 115) { // L: 2307
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2308
					}
				}

				return 1; // L: 2310
			} else {
				if (var9 == 115) { // L: 2294
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2295
				}

				return 1; // L: 2296
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "970773332"
	)
	static int method1984(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3845
			Interpreter.Interpreter_intStackSize -= 2; // L: 3846
			Client.field760 = (short)GrandExchangeOffer.method6032(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 3847
			if (Client.field760 <= 0) { // L: 3848
				Client.field760 = 256;
			}

			Client.field761 = (short)GrandExchangeOffer.method6032(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3849
			if (Client.field761 <= 0) { // L: 3850
				Client.field761 = 256;
			}

			return 1; // L: 3851
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3853
			Interpreter.Interpreter_intStackSize -= 2; // L: 3854
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3855
			if (Client.zoomHeight <= 0) { // L: 3856
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3857
			if (Client.zoomWidth <= 0) { // L: 3858
				Client.zoomWidth = 320;
			}

			return 1; // L: 3859
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3861
			Interpreter.Interpreter_intStackSize -= 4; // L: 3862
			Client.field764 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3863
			if (Client.field764 <= 0) { // L: 3864
				Client.field764 = 1;
			}

			Client.field765 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3865
			if (Client.field765 <= 0) { // L: 3866
				Client.field765 = 32767;
			} else if (Client.field765 < Client.field764) { // L: 3867
				Client.field765 = Client.field764;
			}

			Client.field766 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3868
			if (Client.field766 <= 0) { // L: 3869
				Client.field766 = 1;
			}

			Client.field666 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3870
			if (Client.field666 <= 0) { // L: 3871
				Client.field666 = 32767;
			} else if (Client.field666 < Client.field766) { // L: 3872
				Client.field666 = Client.field766;
			}

			return 1; // L: 3873
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3875
			if (Client.viewportWidget != null) { // L: 3876
				class17.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3877
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3878
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3879
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3882
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3883
			}

			return 1; // L: 3885
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3887
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3888
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3889
			return 1; // L: 3890
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3892
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.method5175(Client.field760); // L: 3893
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClientPacket.method5175(Client.field761); // L: 3894
			return 1; // L: 3895
		} else if (var0 == 6220) { // L: 3897
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3898
			return 1; // L: 3899
		} else if (var0 == 6221) { // L: 3901
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3902
			return 1; // L: 3903
		} else if (var0 == 6222) { // L: 3905
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.canvasWidth; // L: 3906
			return 1; // L: 3907
		} else if (var0 == 6223) { // L: 3909
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class321.canvasHeight; // L: 3910
			return 1; // L: 3911
		} else {
			return 2; // L: 3913
		}
	}
}
