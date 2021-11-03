import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("l")
public class class14 {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1849354153
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -255968433
	)
	final int field65;
	@ObfuscatedName("w")
	final String field62;
	@ObfuscatedName("s")
	final ThreadFactory field68;
	@ObfuscatedName("a")
	final ThreadPoolExecutor field64;

	public class14(String var1, int var2, int var3) {
		this.field62 = var1; // L: 15
		this.field65 = var2; // L: 16
		this.field68 = new class16(this); // L: 17
		this.field64 = this.method179(var3); // L: 18
	} // L: 19

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "2016209231"
	)
	final ThreadPoolExecutor method179(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field65), this.field68); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lx;B)Ld;",
		garbageValue = "-121"
	)
	public class19 method187(class10 var1) {
		if (this.field64.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field64.getCorePoolSize() + " Queue capacity " + this.field65); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field64.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	public final void method181() {
		try {
			this.field64.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "27"
	)
	static int method190(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2831
			Interpreter_intStackSize -= 2; // L: 2832
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2833
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2834
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + var4; // L: 2835
			return 1; // L: 2836
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2838
			Interpreter_intStackSize -= 2; // L: 2839
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2840
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2841
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 - var4; // L: 2842
			return 1; // L: 2843
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2845
			Interpreter_intStackSize -= 2; // L: 2846
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2847
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2848
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 * var4; // L: 2849
			return 1; // L: 2850
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2852
			Interpreter_intStackSize -= 2; // L: 2853
			var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2854
			var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2855
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 / var4; // L: 2856
			return 1; // L: 2857
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2859
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 2860
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2861
			return 1; // L: 2862
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2864
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 2865
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2866
			return 1; // L: 2867
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2869
				Interpreter_intStackSize -= 5; // L: 2870
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2871
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2872
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 2873
				var6 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 3]; // L: 2874
				var7 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 4]; // L: 2875
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 2876
				return 1; // L: 2877
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2879
				Interpreter_intStackSize -= 2; // L: 2880
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2881
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2882
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 2883
				return 1; // L: 2884
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2886
				Interpreter_intStackSize -= 2; // L: 2887
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2888
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2889
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2890
				return 1; // L: 2891
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2893
				Interpreter_intStackSize -= 2; // L: 2894
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2895
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2896
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2897
				return 1; // L: 2898
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2900
				Interpreter_intStackSize -= 2; // L: 2901
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2902
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2903
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2904
				return 1; // L: 2905
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2907
				Interpreter_intStackSize -= 2; // L: 2908
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2909
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2910
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 % var4; // L: 2911
				return 1; // L: 2912
			} else if (var0 == ScriptOpcodes.POW) { // L: 2914
				Interpreter_intStackSize -= 2; // L: 2915
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2916
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2917
				if (var3 == 0) { // L: 2918
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2919
				}

				return 1; // L: 2920
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2922
				Interpreter_intStackSize -= 2; // L: 2923
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2924
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2925
				if (var3 == 0) { // L: 2926
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0; // L: 2927
					return 1; // L: 2928
				} else {
					switch(var4) { // L: 2930
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2943
						break; // L: 2944
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3; // L: 2958
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2933
						break;
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2953
						break; // L: 2954
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2948
						break; // L: 2949
					default:
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2938
					}

					return 1; // L: 2962
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2964
				Interpreter_intStackSize -= 2; // L: 2965
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2966
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2967
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 & var4; // L: 2968
				return 1; // L: 2969
			} else if (var0 == ScriptOpcodes.OR) { // L: 2971
				Interpreter_intStackSize -= 2; // L: 2972
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2973
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2974
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | var4; // L: 2975
				return 1; // L: 2976
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2978
				Interpreter_intStackSize -= 3; // L: 2979
				long var9 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2980
				long var11 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2981
				long var13 = (long)Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 2982
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 2983
				return 1; // L: 2984
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 2986
				var3 = Tile.method4199(Interpreter.Interpreter_intStack[--Interpreter_intStackSize]); // L: 2987
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3; // L: 2988
				return 1; // L: 2989
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 2991
				Interpreter_intStackSize -= 2; // L: 2992
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 2993
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 2994
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2995
				return 1; // L: 2996
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 2998
				Interpreter_intStackSize -= 3; // L: 2999
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 3000
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 3001
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 3002
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.method1162(var3, var4, var5); // L: 3003
				return 1; // L: 3004
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3006
				Interpreter_intStackSize -= 3; // L: 3007
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 3008
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 3009
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 3010
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = MusicPatch.method4949(var3, var4, var5); // L: 3011
				return 1; // L: 3012
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3014
				Interpreter_intStackSize -= 3; // L: 3015
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 3016
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 3017
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 3018
				var6 = 31 - var5; // L: 3019
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 3020
				return 1; // L: 3021
			} else if (var0 == 4030) { // L: 3023
				Interpreter_intStackSize -= 4; // L: 3024
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 3025
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 3026
				var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 3027
				var6 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 3]; // L: 3028
				var3 = MusicPatch.method4949(var3, var5, var6); // L: 3029
				var7 = class123.method2619(var6 - var5 + 1); // L: 3030
				if (var4 > var7) { // L: 3031
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3032
				return 1; // L: 3033
			} else if (var0 == 4032) { // L: 3035
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = class269.method5190(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]); // L: 3036
				return 1; // L: 3037
			} else if (var0 == 4033) { // L: 3039
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = UserComparator6.method2512(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]); // L: 3040
				return 1; // L: 3041
			} else if (var0 == 4034) { // L: 3043
				Interpreter_intStackSize -= 2; // L: 3044
				var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 3045
				var4 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 3046
				var5 = Language.method5533(var3, var4); // L: 3047
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5; // L: 3048
				return 1; // L: 3049
			} else if (var0 == 4035) { // L: 3051
				Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter_intStackSize - 1]); // L: 3052
				return 1; // L: 3053
			} else {
				return 2; // L: 3055
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-376967441"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (ScriptEvent.pcmPlayer1 != null) { // L: 4044
			ScriptEvent.pcmPlayer1.run();
		}

		if (HealthBar.pcmPlayer0 != null) { // L: 4045
			HealthBar.pcmPlayer0.run();
		}

	} // L: 4046

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V",
		garbageValue = "394697143"
	)
	static final void method180(PendingSpawn var0) {
		long var1 = 0L; // L: 7499
		int var3 = -1; // L: 7500
		int var4 = 0; // L: 7501
		int var5 = 0; // L: 7502
		if (var0.type == 0) { // L: 7503
			var1 = GameBuild.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7504
			var1 = GameBuild.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7505
			var1 = GameBuild.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7506
			var1 = GameBuild.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 7507
			int var6 = GameBuild.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7508
			var3 = class21.Entity_unpackID(var1); // L: 7509
			var4 = var6 & 31; // L: 7510
			var5 = var6 >> 6 & 3; // L: 7511
		}

		var0.objectId = var3; // L: 7513
		var0.field1076 = var4; // L: 7514
		var0.field1075 = var5; // L: 7515
	} // L: 7516

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1644375573"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8273
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8274
			Client.mouseCrossX = var6; // L: 8717
			Client.mouseCrossY = var7; // L: 8718
			Client.mouseCrossColor = 2; // L: 8719
			Client.mouseCrossState = 0; // L: 8720
			Client.destinationX = var0; // L: 8721
			Client.destinationY = var1; // L: 8722
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2729, Client.packetWriter.isaacCipher); // L: 8724
			var8.packetBuffer.method7001(ReflectionCheck.selectedItemSlot); // L: 8725
			var8.packetBuffer.method7001(DefaultsGroup.baseY + var1); // L: 8726
			var8.packetBuffer.method7010(MouseHandler.selectedItemWidget); // L: 8727
			var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8728
			var8.packetBuffer.method7001(var3); // L: 8729
			var8.packetBuffer.method7003(SoundSystem.selectedItemId); // L: 8730
			var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8731
			Client.packetWriter.addNode(var8); // L: 8732
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8457
			Client.mouseCrossY = var7; // L: 8458
			Client.mouseCrossColor = 2; // L: 8459
			Client.mouseCrossState = 0; // L: 8460
			Client.destinationX = var0; // L: 8461
			Client.destinationY = var1; // L: 8462
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2738, Client.packetWriter.isaacCipher); // L: 8463
			var8.packetBuffer.method7126(FontName.selectedSpellWidget); // L: 8464
			var8.packetBuffer.method6962(Client.selectedSpellChildIndex); // L: 8465
			var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8466
			var8.packetBuffer.method7001(Client.field627); // L: 8467
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8468
			var8.packetBuffer.method6962(var3); // L: 8469
			var8.packetBuffer.method7003(DefaultsGroup.baseY + var1); // L: 8470
			Client.packetWriter.addNode(var8); // L: 8471
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8894
			Client.mouseCrossY = var7; // L: 8895
			Client.mouseCrossColor = 2; // L: 8896
			Client.mouseCrossState = 0; // L: 8897
			Client.destinationX = var0; // L: 8898
			Client.destinationY = var1; // L: 8899
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2744, Client.packetWriter.isaacCipher); // L: 8901
			var8.packetBuffer.method7001(var0 + class19.baseX); // L: 8902
			var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8903
			var8.packetBuffer.method6962(var3); // L: 8904
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8905
			Client.packetWriter.addNode(var8); // L: 8906
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8955
			Client.mouseCrossY = var7; // L: 8956
			Client.mouseCrossColor = 2; // L: 8957
			Client.mouseCrossState = 0; // L: 8958
			Client.destinationX = var0; // L: 8959
			Client.destinationY = var1; // L: 8960
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher); // L: 8962
			var8.packetBuffer.method7001(var0 + class19.baseX); // L: 8963
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8964
			var8.packetBuffer.writeShort(var3); // L: 8965
			var8.packetBuffer.method7003(DefaultsGroup.baseY + var1); // L: 8966
			Client.packetWriter.addNode(var8); // L: 8967
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8619
			Client.mouseCrossY = var7; // L: 8620
			Client.mouseCrossColor = 2; // L: 8621
			Client.mouseCrossState = 0; // L: 8622
			Client.destinationX = var0; // L: 8623
			Client.destinationY = var1; // L: 8624
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2690, Client.packetWriter.isaacCipher); // L: 8626
			var8.packetBuffer.writeShort(var0 + class19.baseX); // L: 8627
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8628
			var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8629
			var8.packetBuffer.method6962(var3); // L: 8630
			Client.packetWriter.addNode(var8); // L: 8631
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8317
			Client.mouseCrossY = var7; // L: 8318
			Client.mouseCrossColor = 2; // L: 8319
			Client.mouseCrossState = 0; // L: 8320
			Client.destinationX = var0; // L: 8321
			Client.destinationY = var1; // L: 8322
			var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2705, Client.packetWriter.isaacCipher); // L: 8324
			var8.packetBuffer.method7003(var3); // L: 8325
			var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8326
			var8.packetBuffer.method7003(var0 + class19.baseX); // L: 8327
			var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8328
			Client.packetWriter.addNode(var8); // L: 8329
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8383
				if (var13 != null) { // L: 8384
					Client.mouseCrossX = var6; // L: 8385
					Client.mouseCrossY = var7; // L: 8386
					Client.mouseCrossColor = 2; // L: 8387
					Client.mouseCrossState = 0; // L: 8388
					Client.destinationX = var0; // L: 8389
					Client.destinationY = var1; // L: 8390
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2722, Client.packetWriter.isaacCipher); // L: 8392
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8393
					var9.packetBuffer.method6962(SoundSystem.selectedItemId); // L: 8394
					var9.packetBuffer.method7001(ReflectionCheck.selectedItemSlot); // L: 8395
					var9.packetBuffer.method7126(MouseHandler.selectedItemWidget); // L: 8396
					var9.packetBuffer.method7003(var3); // L: 8397
					Client.packetWriter.addNode(var9); // L: 8398
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8876
				if (var13 != null) { // L: 8877
					Client.mouseCrossX = var6; // L: 8878
					Client.mouseCrossY = var7; // L: 8879
					Client.mouseCrossColor = 2; // L: 8880
					Client.mouseCrossState = 0; // L: 8881
					Client.destinationX = var0; // L: 8882
					Client.destinationY = var1; // L: 8883
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2741, Client.packetWriter.isaacCipher); // L: 8884
					var9.packetBuffer.writeIntME(FontName.selectedSpellWidget); // L: 8885
					var9.packetBuffer.method6962(Client.selectedSpellChildIndex); // L: 8886
					var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8887
					var9.packetBuffer.method6962(var3); // L: 8888
					var9.packetBuffer.writeShort(Client.field627); // L: 8889
					Client.packetWriter.addNode(var9); // L: 8890
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8603
				if (var13 != null) { // L: 8604
					Client.mouseCrossX = var6; // L: 8605
					Client.mouseCrossY = var7; // L: 8606
					Client.mouseCrossColor = 2; // L: 8607
					Client.mouseCrossState = 0; // L: 8608
					Client.destinationX = var0; // L: 8609
					Client.destinationY = var1; // L: 8610
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2717, Client.packetWriter.isaacCipher); // L: 8612
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8613
					var9.packetBuffer.method7001(var3); // L: 8614
					Client.packetWriter.addNode(var9); // L: 8615
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 9022
				if (var13 != null) { // L: 9023
					Client.mouseCrossX = var6; // L: 9024
					Client.mouseCrossY = var7; // L: 9025
					Client.mouseCrossColor = 2; // L: 9026
					Client.mouseCrossState = 0; // L: 9027
					Client.destinationX = var0; // L: 9028
					Client.destinationY = var1; // L: 9029
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2748, Client.packetWriter.isaacCipher); // L: 9031
					var9.packetBuffer.method7001(var3); // L: 9032
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9033
					Client.packetWriter.addNode(var9); // L: 9034
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8833
				if (var13 != null) { // L: 8834
					Client.mouseCrossX = var6; // L: 8835
					Client.mouseCrossY = var7; // L: 8836
					Client.mouseCrossColor = 2; // L: 8837
					Client.mouseCrossState = 0; // L: 8838
					Client.destinationX = var0; // L: 8839
					Client.destinationY = var1; // L: 8840
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2723, Client.packetWriter.isaacCipher); // L: 8842
					var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8843
					var9.packetBuffer.method6962(var3); // L: 8844
					Client.packetWriter.addNode(var9); // L: 8845
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8518
				if (var13 != null) { // L: 8519
					Client.mouseCrossX = var6; // L: 8520
					Client.mouseCrossY = var7; // L: 8521
					Client.mouseCrossColor = 2; // L: 8522
					Client.mouseCrossState = 0; // L: 8523
					Client.destinationX = var0; // L: 8524
					Client.destinationY = var1; // L: 8525
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2730, Client.packetWriter.isaacCipher); // L: 8527
					var9.packetBuffer.method7001(var3); // L: 8528
					var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8529
					Client.packetWriter.addNode(var9); // L: 8530
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8634
				if (var13 != null) { // L: 8635
					Client.mouseCrossX = var6; // L: 8636
					Client.mouseCrossY = var7; // L: 8637
					Client.mouseCrossColor = 2; // L: 8638
					Client.mouseCrossState = 0; // L: 8639
					Client.destinationX = var0; // L: 8640
					Client.destinationY = var1; // L: 8641
					var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2672, Client.packetWriter.isaacCipher); // L: 8643
					var9.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8644
					var9.packetBuffer.writeShort(var3); // L: 8645
					Client.packetWriter.addNode(var9); // L: 8646
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8792
					if (var15 != null) { // L: 8793
						Client.mouseCrossX = var6; // L: 8794
						Client.mouseCrossY = var7; // L: 8795
						Client.mouseCrossColor = 2; // L: 8796
						Client.mouseCrossState = 0; // L: 8797
						Client.destinationX = var0; // L: 8798
						Client.destinationY = var1; // L: 8799
						var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2678, Client.packetWriter.isaacCipher); // L: 8801
						var9.packetBuffer.method6962(var3); // L: 8802
						var9.packetBuffer.method6962(SoundSystem.selectedItemId); // L: 8803
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8804
						var9.packetBuffer.method6962(ReflectionCheck.selectedItemSlot); // L: 8805
						var9.packetBuffer.writeIntME(MouseHandler.selectedItemWidget); // L: 8806
						Client.packetWriter.addNode(var9); // L: 8807
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8751
					if (var15 != null) { // L: 8752
						Client.mouseCrossX = var6; // L: 8753
						Client.mouseCrossY = var7; // L: 8754
						Client.mouseCrossColor = 2; // L: 8755
						Client.mouseCrossState = 0; // L: 8756
						Client.destinationX = var0; // L: 8757
						Client.destinationY = var1; // L: 8758
						var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2760, Client.packetWriter.isaacCipher); // L: 8759
						var9.packetBuffer.method6962(Client.field627); // L: 8760
						var9.packetBuffer.method7003(var3); // L: 8761
						var9.packetBuffer.method7003(Client.selectedSpellChildIndex); // L: 8762
						var9.packetBuffer.writeInt(FontName.selectedSpellWidget); // L: 8763
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8764
						Client.packetWriter.addNode(var9); // L: 8765
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8699
					Client.mouseCrossY = var7; // L: 8700
					Client.mouseCrossColor = 2; // L: 8701
					Client.mouseCrossState = 0; // L: 8702
					Client.destinationX = var0; // L: 8703
					Client.destinationY = var1; // L: 8704
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2756, Client.packetWriter.isaacCipher); // L: 8706
					var8.packetBuffer.method7003(var3); // L: 8707
					var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8708
					var8.packetBuffer.writeShort(SoundSystem.selectedItemId); // L: 8709
					var8.packetBuffer.writeShort(var0 + class19.baseX); // L: 8710
					var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8711
					var8.packetBuffer.method7003(ReflectionCheck.selectedItemSlot); // L: 8712
					var8.packetBuffer.method7010(MouseHandler.selectedItemWidget); // L: 8713
					Client.packetWriter.addNode(var8); // L: 8714
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8650
					Client.mouseCrossY = var7; // L: 8651
					Client.mouseCrossColor = 2; // L: 8652
					Client.mouseCrossState = 0; // L: 8653
					Client.destinationX = var0; // L: 8654
					Client.destinationY = var1; // L: 8655
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2735, Client.packetWriter.isaacCipher); // L: 8656
					var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8657
					var8.packetBuffer.method7003(Client.field627); // L: 8658
					var8.packetBuffer.method6962(var3); // L: 8659
					var8.packetBuffer.method7001(DefaultsGroup.baseY + var1); // L: 8660
					var8.packetBuffer.writeInt(FontName.selectedSpellWidget); // L: 8661
					var8.packetBuffer.method7001(Client.selectedSpellChildIndex); // L: 8662
					var8.packetBuffer.method7003(var0 + class19.baseX); // L: 8663
					Client.packetWriter.addNode(var8); // L: 8664
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8487
					Client.mouseCrossY = var7; // L: 8488
					Client.mouseCrossColor = 2; // L: 8489
					Client.mouseCrossState = 0; // L: 8490
					Client.destinationX = var0; // L: 8491
					Client.destinationY = var1; // L: 8492
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2701, Client.packetWriter.isaacCipher); // L: 8494
					var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8495
					var8.packetBuffer.writeShort(var3); // L: 8496
					var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8497
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8498
					Client.packetWriter.addNode(var8); // L: 8499
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8909
					Client.mouseCrossY = var7; // L: 8910
					Client.mouseCrossColor = 2; // L: 8911
					Client.mouseCrossState = 0; // L: 8912
					Client.destinationX = var0; // L: 8913
					Client.destinationY = var1; // L: 8914
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2768, Client.packetWriter.isaacCipher); // L: 8916
					var8.packetBuffer.method7003(DefaultsGroup.baseY + var1); // L: 8917
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8918
					var8.packetBuffer.method7001(var3); // L: 8919
					var8.packetBuffer.writeShort(var0 + class19.baseX); // L: 8920
					Client.packetWriter.addNode(var8); // L: 8921
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8431
					Client.mouseCrossY = var7; // L: 8432
					Client.mouseCrossColor = 2; // L: 8433
					Client.mouseCrossState = 0; // L: 8434
					Client.destinationX = var0; // L: 8435
					Client.destinationY = var1; // L: 8436
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2709, Client.packetWriter.isaacCipher); // L: 8438
					var8.packetBuffer.method6962(DefaultsGroup.baseY + var1); // L: 8439
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8440
					var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8441
					var8.packetBuffer.method6962(var3); // L: 8442
					Client.packetWriter.addNode(var8); // L: 8443
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8402
					Client.mouseCrossY = var7; // L: 8403
					Client.mouseCrossColor = 2; // L: 8404
					Client.mouseCrossState = 0; // L: 8405
					Client.destinationX = var0; // L: 8406
					Client.destinationY = var1; // L: 8407
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2763, Client.packetWriter.isaacCipher); // L: 8409
					var8.packetBuffer.method6962(DefaultsGroup.baseY + var1); // L: 8410
					var8.packetBuffer.writeShort(var3); // L: 8411
					var8.packetBuffer.method7003(var0 + class19.baseX); // L: 8412
					var8.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8413
					Client.packetWriter.addNode(var8); // L: 8414
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8302
					Client.mouseCrossY = var7; // L: 8303
					Client.mouseCrossColor = 2; // L: 8304
					Client.mouseCrossState = 0; // L: 8305
					Client.destinationX = var0; // L: 8306
					Client.destinationY = var1; // L: 8307
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2767, Client.packetWriter.isaacCipher); // L: 8309
					var8.packetBuffer.method6947(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8310
					var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8311
					var8.packetBuffer.method7003(var3); // L: 8312
					var8.packetBuffer.writeShort(DefaultsGroup.baseY + var1); // L: 8313
					Client.packetWriter.addNode(var8); // L: 8314
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8362
						GameBuild.scene.setViewportWalking(); // L: 8363
					} else {
						GameBuild.scene.menuOpen(GrandExchangeOfferTotalQuantityComparator.Client_plane, var0, var1, true); // L: 8366
					}
				} else {
					PacketBufferNode var11;
					Widget var16;
					if (var2 == 24) {
						var16 = UserComparator9.getWidget(var1); // L: 8937
						boolean var12 = true; // L: 8938
						if (var16.contentType > 0) { // L: 8939
							var12 = GrandExchangeOfferAgeComparator.method5423(var16);
						}

						if (var12) { // L: 8940
							var11 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher); // L: 8942
							var11.packetBuffer.writeInt(var1); // L: 8943
							Client.packetWriter.addNode(var11); // L: 8944
						}
					} else {
						if (var2 == 25) {
							var16 = ItemContainer.getWidgetChild(var1, var0); // L: 8924
							if (var16 != null) { // L: 8925
								class262.Widget_runOnTargetLeave(); // L: 8926
								Decimator.selectSpell(var1, var0, SecureRandomCallable.Widget_unpackTargetMask(PendingSpawn.getWidgetFlags(var16)), var16.itemId); // L: 8927
								Client.isItemSelected = 0; // L: 8928
								Client.selectedSpellActionName = class20.Widget_getSpellActionName(var16); // L: 8929
								if (Client.selectedSpellActionName == null) { // L: 8930
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8931
									Client.selectedSpellName = var16.dataText + MouseHandler.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = MouseHandler.colorStartTag(65280) + var16.spellName + MouseHandler.colorStartTag(16777215); // L: 8932
								}
							}

							return; // L: 8934
						}

						if (var2 == 26) {
							method191(); // L: 8359
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher); // L: 8781
								var8.packetBuffer.writeInt(var1); // L: 8782
								Client.packetWriter.addNode(var8); // L: 8783
								var14 = UserComparator9.getWidget(var1); // L: 8784
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8785
									var10 = var14.cs1Instructions[0][1]; // L: 8786
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 8787
									WorldMapLabelSize.changeGameOptions(var10); // L: 8788
								}
							} else if (var2 == 29) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2739, Client.packetWriter.isaacCipher); // L: 8418
								var8.packetBuffer.writeInt(var1); // L: 8419
								Client.packetWriter.addNode(var8); // L: 8420
								var14 = UserComparator9.getWidget(var1); // L: 8421
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8422
									var10 = var14.cs1Instructions[0][1]; // L: 8423
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 8424
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 8425
										WorldMapLabelSize.changeGameOptions(var10); // L: 8426
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8948
									class92.resumePauseWidget(var1, var0); // L: 8949
									Client.meslayerContinueWidget = ItemContainer.getWidgetChild(var1, var0); // L: 8950
									class184.invalidateWidget(Client.meslayerContinueWidget); // L: 8951
								}
							} else if (var2 == 31) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2702, Client.packetWriter.isaacCipher); // L: 8971
								var8.packetBuffer.method6962(var3); // L: 8972
								var8.packetBuffer.method7010(var1); // L: 8973
								var8.packetBuffer.writeShort(var0); // L: 8974
								var8.packetBuffer.method7010(MouseHandler.selectedItemWidget); // L: 8975
								var8.packetBuffer.method7003(SoundSystem.selectedItemId); // L: 8976
								var8.packetBuffer.method6962(ReflectionCheck.selectedItemSlot); // L: 8977
								Client.packetWriter.addNode(var8); // L: 8978
								Client.field576 = 0; // L: 8979
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8980
								Client.field577 = var0; // L: 8981
							} else if (var2 == 32) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2695, Client.packetWriter.isaacCipher); // L: 9039
								var8.packetBuffer.method7003(var0); // L: 9040
								var8.packetBuffer.writeInt(FontName.selectedSpellWidget); // L: 9041
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9042
								var8.packetBuffer.method7010(var1); // L: 9043
								var8.packetBuffer.method6962(var3); // L: 9044
								Client.packetWriter.addNode(var8); // L: 9045
								Client.field576 = 0; // L: 9046
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 9047
								Client.field577 = var0; // L: 9048
							} else if (var2 == 33) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2706, Client.packetWriter.isaacCipher); // L: 8546
								var8.packetBuffer.method7003(var3); // L: 8547
								var8.packetBuffer.method7001(var0); // L: 8548
								var8.packetBuffer.writeIntME(var1); // L: 8549
								Client.packetWriter.addNode(var8); // L: 8550
								Client.field576 = 0; // L: 8551
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8552
								Client.field577 = var0; // L: 8553
							} else if (var2 == 34) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2740, Client.packetWriter.isaacCipher); // L: 8276
								var8.packetBuffer.method6962(var3); // L: 8277
								var8.packetBuffer.method6962(var0); // L: 8278
								var8.packetBuffer.writeIntME(var1); // L: 8279
								Client.packetWriter.addNode(var8); // L: 8280
								Client.field576 = 0; // L: 8281
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8282
								Client.field577 = var0; // L: 8283
							} else if (var2 == 35) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2677, Client.packetWriter.isaacCipher); // L: 9001
								var8.packetBuffer.method7003(var3); // L: 9002
								var8.packetBuffer.method6962(var0); // L: 9003
								var8.packetBuffer.writeIntME(var1); // L: 9004
								Client.packetWriter.addNode(var8); // L: 9005
								Client.field576 = 0; // L: 9006
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 9007
								Client.field577 = var0; // L: 9008
							} else if (var2 == 36) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2671, Client.packetWriter.isaacCipher); // L: 8689
								var8.packetBuffer.method7003(var3); // L: 8690
								var8.packetBuffer.method7001(var0); // L: 8691
								var8.packetBuffer.method7126(var1); // L: 8692
								Client.packetWriter.addNode(var8); // L: 8693
								Client.field576 = 0; // L: 8694
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8695
								Client.field577 = var0; // L: 8696
							} else if (var2 == 37) {
								var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2731, Client.packetWriter.isaacCipher); // L: 8535
								var8.packetBuffer.method6962(var0); // L: 8536
								var8.packetBuffer.writeShort(var3); // L: 8537
								var8.packetBuffer.method7010(var1); // L: 8538
								Client.packetWriter.addNode(var8); // L: 8539
								Client.field576 = 0; // L: 8540
								WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8541
								Client.field577 = var0; // L: 8542
							} else {
								if (var2 == 38) {
									class262.Widget_runOnTargetLeave(); // L: 8849
									var16 = UserComparator9.getWidget(var1); // L: 8850
									Client.isItemSelected = 1; // L: 8851
									ReflectionCheck.selectedItemSlot = var0; // L: 8852
									MouseHandler.selectedItemWidget = var1; // L: 8853
									SoundSystem.selectedItemId = var3; // L: 8854
									class184.invalidateWidget(var16); // L: 8855
									Client.selectedItemName = MouseHandler.colorStartTag(16748608) + TaskHandler.ItemDefinition_get(var3).name + MouseHandler.colorStartTag(16777215); // L: 8856
									if (Client.selectedItemName == null) { // L: 8857
										Client.selectedItemName = "null";
									}

									return; // L: 8858
								}

								if (var2 == 39) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2691, Client.packetWriter.isaacCipher); // L: 8770
									var8.packetBuffer.method7001(var3); // L: 8771
									var8.packetBuffer.writeShort(var0); // L: 8772
									var8.packetBuffer.writeInt(var1); // L: 8773
									Client.packetWriter.addNode(var8); // L: 8774
									Client.field576 = 0; // L: 8775
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8776
									Client.field577 = var0; // L: 8777
								} else if (var2 == 40) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher); // L: 9012
									var8.packetBuffer.writeInt(var1); // L: 9013
									var8.packetBuffer.writeShort(var3); // L: 9014
									var8.packetBuffer.method7001(var0); // L: 9015
									Client.packetWriter.addNode(var8); // L: 9016
									Client.field576 = 0; // L: 9017
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 9018
									Client.field577 = var0; // L: 9019
								} else if (var2 == 41) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2718, Client.packetWriter.isaacCipher); // L: 8447
									var8.packetBuffer.writeIntME(var1); // L: 8448
									var8.packetBuffer.method7003(var0); // L: 8449
									var8.packetBuffer.writeShort(var3); // L: 8450
									Client.packetWriter.addNode(var8); // L: 8451
									Client.field576 = 0; // L: 8452
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8453
									Client.field577 = var0; // L: 8454
								} else if (var2 == 42) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher); // L: 8668
									var8.packetBuffer.writeShort(var3); // L: 8669
									var8.packetBuffer.writeIntME(var1); // L: 8670
									var8.packetBuffer.writeShort(var0); // L: 8671
									Client.packetWriter.addNode(var8); // L: 8672
									Client.field576 = 0; // L: 8673
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8674
									Client.field577 = var0; // L: 8675
								} else if (var2 == 43) {
									var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2694, Client.packetWriter.isaacCipher); // L: 8349
									var8.packetBuffer.writeInt(var1); // L: 8350
									var8.packetBuffer.writeShort(var0); // L: 8351
									var8.packetBuffer.method7003(var3); // L: 8352
									Client.packetWriter.addNode(var8); // L: 8353
									Client.field576 = 0; // L: 8354
									WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8355
									Client.field577 = var0; // L: 8356
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8502
									if (var15 != null) { // L: 8503
										Client.mouseCrossX = var6; // L: 8504
										Client.mouseCrossY = var7; // L: 8505
										Client.mouseCrossColor = 2; // L: 8506
										Client.mouseCrossState = 0; // L: 8507
										Client.destinationX = var0; // L: 8508
										Client.destinationY = var1; // L: 8509
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher); // L: 8511
										var9.packetBuffer.writeShort(var3); // L: 8512
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8513
										Client.packetWriter.addNode(var9); // L: 8514
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8332
									if (var15 != null) { // L: 8333
										Client.mouseCrossX = var6; // L: 8334
										Client.mouseCrossY = var7; // L: 8335
										Client.mouseCrossColor = 2; // L: 8336
										Client.mouseCrossState = 0; // L: 8337
										Client.destinationX = var0; // L: 8338
										Client.destinationY = var1; // L: 8339
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2687, Client.packetWriter.isaacCipher); // L: 8341
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8342
										var9.packetBuffer.method6962(var3); // L: 8343
										Client.packetWriter.addNode(var9); // L: 8344
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 9051
									if (var15 != null) { // L: 9052
										Client.mouseCrossX = var6; // L: 9053
										Client.mouseCrossY = var7; // L: 9054
										Client.mouseCrossColor = 2; // L: 9055
										Client.mouseCrossState = 0; // L: 9056
										Client.destinationX = var0; // L: 9057
										Client.destinationY = var1; // L: 9058
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2710, Client.packetWriter.isaacCipher); // L: 9060
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9061
										var9.packetBuffer.writeShort(var3); // L: 9062
										Client.packetWriter.addNode(var9); // L: 9063
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8984
									if (var15 != null) { // L: 8985
										Client.mouseCrossX = var6; // L: 8986
										Client.mouseCrossY = var7; // L: 8987
										Client.mouseCrossColor = 2; // L: 8988
										Client.mouseCrossState = 0; // L: 8989
										Client.destinationX = var0; // L: 8990
										Client.destinationY = var1; // L: 8991
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2769, Client.packetWriter.isaacCipher); // L: 8993
										var9.packetBuffer.method6962(var3); // L: 8994
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8995
										Client.packetWriter.addNode(var9); // L: 8996
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8556
									if (var15 != null) { // L: 8557
										Client.mouseCrossX = var6; // L: 8558
										Client.mouseCrossY = var7; // L: 8559
										Client.mouseCrossColor = 2; // L: 8560
										Client.mouseCrossState = 0; // L: 8561
										Client.destinationX = var0; // L: 8562
										Client.destinationY = var1; // L: 8563
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2692, Client.packetWriter.isaacCipher); // L: 8565
										var9.packetBuffer.method7003(var3); // L: 8566
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8567
										Client.packetWriter.addNode(var9); // L: 8568
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8286
									if (var15 != null) { // L: 8287
										Client.mouseCrossX = var6; // L: 8288
										Client.mouseCrossY = var7; // L: 8289
										Client.mouseCrossColor = 2; // L: 8290
										Client.mouseCrossState = 0; // L: 8291
										Client.destinationX = var0; // L: 8292
										Client.destinationY = var1; // L: 8293
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2714, Client.packetWriter.isaacCipher); // L: 8295
										var9.packetBuffer.method7001(var3); // L: 8296
										var9.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8297
										Client.packetWriter.addNode(var9); // L: 8298
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8817
									if (var15 != null) { // L: 8818
										Client.mouseCrossX = var6; // L: 8819
										Client.mouseCrossY = var7; // L: 8820
										Client.mouseCrossColor = 2; // L: 8821
										Client.mouseCrossState = 0; // L: 8822
										Client.destinationX = var0; // L: 8823
										Client.destinationY = var1; // L: 8824
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher); // L: 8826
										var9.packetBuffer.writeShort(var3); // L: 8827
										var9.packetBuffer.method7171(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8828
										Client.packetWriter.addNode(var9); // L: 8829
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8735
									if (var15 != null) { // L: 8736
										Client.mouseCrossX = var6; // L: 8737
										Client.mouseCrossY = var7; // L: 8738
										Client.mouseCrossColor = 2; // L: 8739
										Client.mouseCrossState = 0; // L: 8740
										Client.destinationX = var0; // L: 8741
										Client.destinationY = var1; // L: 8742
										var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2728, Client.packetWriter.isaacCipher); // L: 8744
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8745
										var9.packetBuffer.method7003(var3); // L: 8746
										Client.packetWriter.addNode(var9); // L: 8747
									}
								} else {
									label646: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = ItemContainer.getWidgetChild(var1, var0); // L: 8572
												if (var16 != null) { // L: 8573
													var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2753, Client.packetWriter.isaacCipher); // L: 8575
													var9.packetBuffer.method6962(var16.itemId); // L: 8576
													var9.packetBuffer.writeInt(FontName.selectedSpellWidget); // L: 8577
													var9.packetBuffer.method6962(var0); // L: 8578
													var9.packetBuffer.writeInt(var1); // L: 8579
													var9.packetBuffer.method6962(Client.field627); // L: 8580
													var9.packetBuffer.method6962(Client.selectedSpellChildIndex); // L: 8581
													Client.packetWriter.addNode(var9); // L: 8582
												}
												break label646;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8861
												Client.mouseCrossY = var7; // L: 8862
												Client.mouseCrossColor = 2; // L: 8863
												Client.mouseCrossState = 0; // L: 8864
												Client.destinationX = var0; // L: 8865
												Client.destinationY = var1; // L: 8866
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2693, Client.packetWriter.isaacCipher); // L: 8868
												var8.packetBuffer.method6962(var0 + class19.baseX); // L: 8869
												var8.packetBuffer.method7003(var3); // L: 8870
												var8.packetBuffer.method7003(DefaultsGroup.baseY + var1); // L: 8871
												var8.packetBuffer.method6993(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8872
												Client.packetWriter.addNode(var8); // L: 8873
												break label646;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8678
												Client.mouseCrossY = var7; // L: 8679
												Client.mouseCrossColor = 2; // L: 8680
												Client.mouseCrossState = 0; // L: 8681
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2697, Client.packetWriter.isaacCipher); // L: 8683
												var8.packetBuffer.method7001(var3); // L: 8684
												Client.packetWriter.addNode(var8); // L: 8685
												break label646;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8586
												Client.mouseCrossY = var7; // L: 8587
												Client.mouseCrossColor = 2; // L: 8588
												Client.mouseCrossState = 0; // L: 8589
												var13 = Client.npcs[var3]; // L: 8590
												if (var13 != null) { // L: 8591
													NPCComposition var17 = var13.definition; // L: 8592
													if (var17.transforms != null) { // L: 8593
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8594
														var11 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2757, Client.packetWriter.isaacCipher); // L: 8596
														var11.packetBuffer.writeShort(var17.id); // L: 8597
														Client.packetWriter.addNode(var11); // L: 8598
													}
												}
												break label646;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8373
												Client.mouseCrossY = var7; // L: 8374
												Client.mouseCrossColor = 2; // L: 8375
												Client.mouseCrossState = 0; // L: 8376
												var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2755, Client.packetWriter.isaacCipher); // L: 8378
												var8.packetBuffer.method7003(var3); // L: 8379
												Client.packetWriter.addNode(var8); // L: 8380
												break label646;
											}

											if (var2 == 1005) {
												var16 = UserComparator9.getWidget(var1); // L: 8474
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8475
													class397.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + TaskHandler.ItemDefinition_get(var3).name);
												} else {
													var9 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2755, Client.packetWriter.isaacCipher); // L: 8478
													var9.packetBuffer.method7003(var3); // L: 8479
													Client.packetWriter.addNode(var9); // L: 8480
												}

												Client.field576 = 0; // L: 8482
												WorldMapSection2.field2037 = UserComparator9.getWidget(var1); // L: 8483
												Client.field577 = var0; // L: 8484
												break label646;
											}

											if (var2 != 1007) {
												if (var2 == 1011 || var2 == 1010 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
													class133.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8370
												}
												break label646;
											}
										}

										var16 = ItemContainer.getWidgetChild(var1, var0); // L: 8811
										if (var16 != null) { // L: 8812
											GrandExchangeEvents.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8813
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9066
			Client.isItemSelected = 0; // L: 9067
			class184.invalidateWidget(UserComparator9.getWidget(MouseHandler.selectedItemWidget)); // L: 9068
		}

		if (Client.isSpellSelected) { // L: 9070
			class262.Widget_runOnTargetLeave();
		}

		if (WorldMapSection2.field2037 != null && Client.field576 == 0) { // L: 9071
			class184.invalidateWidget(WorldMapSection2.field2037);
		}

	} // L: 9072

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2112486118"
	)
	static final void method178(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11376
		if (var0 != class408.clientPreferences.musicVolume) { // L: 11377
			if (class408.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11378
				Archive var1 = Messages.archive6; // L: 11379
				int var2 = Client.currentTrackGroupId; // L: 11380
				class247.musicPlayerStatus = 1; // L: 11382
				class128.musicTrackArchive = var1; // L: 11383
				FillMode.musicTrackGroupId = var2; // L: 11384
				ArchiveDiskActionHandler.musicTrackFileId = 0; // L: 11385
				class247.musicTrackVolume = var0; // L: 11386
				SecureRandomCallable.musicTrackBoolean = false; // L: 11387
				class247.pcmSampleLength = 10000; // L: 11388
				Client.field710 = false; // L: 11390
			} else if (var0 == 0) { // L: 11392
				WorldMapCacheName.method4027(); // L: 11393
				Client.field710 = false; // L: 11394
			} else {
				WorldMapSection0.method3917(var0); // L: 11396
			}

			class408.clientPreferences.musicVolume = var0; // L: 11397
			Login.savePreferences(); // L: 11398
		}

	} // L: 11400

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1351549041"
	)
	static final void method191() {
		PacketBufferNode var0 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2712, Client.packetWriter.isaacCipher); // L: 11505
		Client.packetWriter.addNode(var0); // L: 11506

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11507
			if (var1.type == 0 || var1.type == 3) { // L: 11508
				Players.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11510
			class184.invalidateWidget(Client.meslayerContinueWidget); // L: 11511
			Client.meslayerContinueWidget = null; // L: 11512
		}

	} // L: 11514
}
