import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class25 extends class16 {
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("clanChat")
	static ClanChat clanChat;
	@ObfuscatedName("cq")
	public static char field207;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1205001631
	)
	int field213;
	@ObfuscatedName("c")
	byte field203;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 523989251
	)
	int field202;
	@ObfuscatedName("g")
	String field215;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field213 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		var1.readUnsignedByte();
		this.field213 = var1.readUnsignedShort();
		this.field203 = var1.readByte(); // L: 134
		this.field202 = var1.readUnsignedShort(); // L: 135
		var1.readLong(); // L: 136
		this.field215 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		class9 var2 = (class9)var1.field32.get(this.field213);
		var2.field76 = this.field203;
		var2.field80 = this.field202;
		var2.field73 = this.field215;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1703342087"
	)
	public static int method313(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lji;IIIBZS)V",
		garbageValue = "-16702"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 259
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 260
		if (var8 == null) { // L: 261
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 262
			if (var8 == null) { // L: 263
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 264
				if (var8 != null) { // L: 265
					if (var5) { // L: 266
						var8.removeDual(); // L: 267
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 268
						--NetCache.NetCache_pendingWritesCount; // L: 269
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 270
					}

				} else {
					if (!var5) { // L: 274
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 275
						if (var8 != null) { // L: 276
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 278
					var8.archive = var0; // L: 279
					var8.crc = var3; // L: 280
					var8.padding = var4; // L: 281
					if (var5) { // L: 282
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 283
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 284
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 287
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 288
						++NetCache.NetCache_pendingWritesCount; // L: 289
					}

				}
			}
		}
	} // L: 272 291

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)Lci;",
		garbageValue = "1537198206"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 112
		Buffer var2 = new Buffer(var0); // L: 113
		var2.offset = var2.array.length - 2; // L: 114
		int var3 = var2.readUnsignedShort(); // L: 115
		int var4 = var2.array.length - 2 - var3 - 12; // L: 116
		var2.offset = var4; // L: 117
		int var5 = var2.readInt(); // L: 118
		var1.localIntCount = var2.readUnsignedShort(); // L: 119
		var1.localStringCount = var2.readUnsignedShort(); // L: 120
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 121
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 122
		int var6 = var2.readUnsignedByte(); // L: 123
		int var7;
		int var8;
		if (var6 > 0) { // L: 124
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 125

			for (var7 = 0; var7 < var6; ++var7) { // L: 126
				var8 = var2.readUnsignedShort(); // L: 127
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? MouseRecorder.method2126(var8) : 1); // L: 128
				var1.switches[var7] = var9; // L: 129

				while (var8-- > 0) { // L: 130
					int var10 = var2.readInt(); // L: 131
					int var11 = var2.readInt(); // L: 132
					var9.put(new IntegerNode(var11), (long)var10); // L: 133
				}
			}
		}

		var2.offset = 0; // L: 137
		var1.field1054 = var2.readStringCp1252NullTerminatedOrNull(); // L: 138
		var1.opcodes = new int[var5]; // L: 139
		var1.intOperands = new int[var5]; // L: 140
		var1.stringOperands = new String[var5]; // L: 141

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 142 143 148
			var8 = var2.readUnsignedShort(); // L: 144
			if (var8 == 3) { // L: 145
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 146
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 147
			}
		}

		return var1; // L: 150
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "599751075"
	)
	static String method316() {
		return class12.clientPreferences.hideUsername ? SecureRandomCallable.method2081(Login.Login_username) : Login.Login_username; // L: 229
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "644141113"
	)
	static void method321() {
		Client.mouseLastLastPressedTimeMillis = -1L; // L: 2850
		class69.mouseRecorder.index = 0; // L: 2851
		class124.hasFocus = true; // L: 2852
		Client.hadFocus = true; // L: 2853
		Client.field799 = -1L; // L: 2854
		class12.method203(); // L: 2855
		Client.packetWriter.clearBuffer(); // L: 2856
		Client.packetWriter.packetBuffer.offset = 0; // L: 2857
		Client.packetWriter.serverPacket = null; // L: 2858
		Client.packetWriter.field1386 = null; // L: 2859
		Client.packetWriter.field1387 = null; // L: 2860
		Client.packetWriter.field1391 = null; // L: 2861
		Client.packetWriter.serverPacketLength = 0; // L: 2862
		Client.packetWriter.field1384 = 0; // L: 2863
		Client.rebootTimer = 0; // L: 2864
		Client.logoutTimer = 0; // L: 2865
		Client.hintArrowType = 0; // L: 2866
		Occluder.method4090(); // L: 2867
		MouseHandler.MouseHandler_idleCycles = 0; // L: 2869
		AttackOption.method2286(); // L: 2871
		Client.isItemSelected = 0; // L: 2872
		Client.isSpellSelected = false; // L: 2873
		Client.soundEffectCount = 0; // L: 2874
		Client.camAngleY = 0; // L: 2875
		Client.oculusOrbState = 0; // L: 2876
		class18.field154 = null; // L: 2877
		Client.minimapState = 0; // L: 2878
		Client.field848 = -1; // L: 2879
		Client.destinationX = 0; // L: 2880
		Client.destinationY = 0; // L: 2881
		Client.playerAttackOption = AttackOption.AttackOption_hidden; // L: 2882
		Client.npcAttackOption = AttackOption.AttackOption_hidden; // L: 2883
		Client.npcCount = 0; // L: 2884
		Projectile.method1996(); // L: 2885

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2886
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) { // L: 2887
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1; // L: 2888
		Client.projectiles.clear(); // L: 2889
		Client.graphicsObjects.clear(); // L: 2890

		for (var0 = 0; var0 < 4; ++var0) { // L: 2891
			for (int var4 = 0; var4 < 104; ++var4) { // L: 2892
				for (int var2 = 0; var2 < 104; ++var2) { // L: 2893
					Client.groundItems[var0][var4][var2] = null; // L: 2894
				}
			}
		}

		Client.pendingSpawns = new NodeDeque(); // L: 2898
		GrandExchangeOfferUnitPriceComparator.friendSystem.clear(); // L: 2899

		for (var0 = 0; var0 < class403.VarpDefinition_fileCount; ++var0) { // L: 2900
			VarpDefinition var1 = MusicPatchNode.VarpDefinition_get(var0); // L: 2901
			if (var1 != null) { // L: 2902
				Varps.Varps_temp[var0] = 0; // L: 2903
				Varps.Varps_main[var0] = 0; // L: 2904
			}
		}

		Client.varcs.clearTransient(); // L: 2907
		Client.followerIndex = -1; // L: 2908
		if (Client.rootInterface != -1) { // L: 2909
			WallDecoration.method4234(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) { // L: 2910
			class18.closeInterface(var3, true); // L: 2911
		}

		Client.rootInterface = -1; // L: 2913
		Client.interfaceParents = new NodeHashTable(8); // L: 2914
		Client.meslayerContinueWidget = null; // L: 2915
		Occluder.method4090(); // L: 2916
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1); // L: 2917

		for (var0 = 0; var0 < 8; ++var0) { // L: 2918
			Client.playerMenuActions[var0] = null; // L: 2919
			Client.playerOptionsPriorities[var0] = false; // L: 2920
		}

		class285.method5055(); // L: 2922
		Client.isLoading = true; // L: 2923

		for (var0 = 0; var0 < 100; ++var0) { // L: 2924
			Client.field825[var0] = true;
		}

		PacketBufferNode var5 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2655, Client.packetWriter.isaacCipher); // L: 2927
		var5.packetBuffer.writeByte(HitSplatDefinition.getWindowedMode()); // L: 2928
		var5.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 2929
		var5.packetBuffer.writeShort(HealthBarDefinition.canvasHeight); // L: 2930
		Client.packetWriter.addNode(var5); // L: 2931
		clanChat = null; // L: 2933
		class105.field1328 = null; // L: 2934
		Arrays.fill(Client.field678, (Object)null); // L: 2935
		Players.field1358 = null; // L: 2936
		Arrays.fill(Client.field847, (Object)null); // L: 2937

		for (var0 = 0; var0 < 8; ++var0) { // L: 2938
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class29.grandExchangeEvents = null; // L: 2939
	} // L: 2940

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1545590889"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		FileSystem.logOut(); // L: 3083
		switch(var0) { // L: 3084
		case 1:
			FontName.method6157(); // L: 3092
			break;
		case 2:
			class26.method334(); // L: 3087
		}

	} // L: 3096
}
