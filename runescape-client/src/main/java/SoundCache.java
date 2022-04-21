import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1121856975
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laj;",
		garbageValue = "1563241146"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = (long)var4;
		RawSound var7 = (RawSound)this.rawSounds.get(var5);
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laj;",
		garbageValue = "-1588726679"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laj;",
		garbageValue = "1"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laj;",
		garbageValue = "1380052230"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfc;",
		garbageValue = "13903"
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZB)I",
		garbageValue = "0"
	)
	static int method803(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]); // L: 1312
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1313
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.x; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1317
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.y; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1321
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.width; // L: 1322
			return 1; // L: 1323
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1325
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.height; // L: 1326
			return 1; // L: 1327
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1329
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1330
			return 1; // L: 1331
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1333
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3.parentId; // L: 1334
			return 1; // L: 1335
		} else {
			return 2; // L: 1337
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1183880843"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 8199
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 8200
			Client.mouseCrossX = var6; // L: 8250
			Client.mouseCrossY = var7; // L: 8251
			Client.mouseCrossColor = 2; // L: 8252
			Client.mouseCrossState = 0; // L: 8253
			Client.destinationX = var0; // L: 8254
			Client.destinationY = var1; // L: 8255
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2994, Client.packetWriter.isaacCipher); // L: 8257
			var8.packetBuffer.method7795(class19.selectedItemSlot); // L: 8258
			var8.packetBuffer.method7795(selectedItemId); // L: 8259
			var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8260
			var8.packetBuffer.writeShort(var0 + ApproximateRouteStrategy.baseX); // L: 8261
			var8.packetBuffer.writeShort(var3); // L: 8262
			var8.packetBuffer.method7746(PendingSpawn.selectedItemWidget); // L: 8263
			var8.packetBuffer.method7796(class250.baseY + var1); // L: 8264
			Client.packetWriter.addNode(var8); // L: 8265
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 8712
			Client.mouseCrossY = var7; // L: 8713
			Client.mouseCrossColor = 2; // L: 8714
			Client.mouseCrossState = 0; // L: 8715
			Client.destinationX = var0; // L: 8716
			Client.destinationY = var1; // L: 8717
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2894, Client.packetWriter.isaacCipher); // L: 8718
			var8.packetBuffer.method7796(Client.selectedSpellItemId); // L: 8719
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8720
			var8.packetBuffer.method7791(class250.baseY + var1); // L: 8721
			var8.packetBuffer.method7796(Client.selectedSpellChildIndex); // L: 8722
			var8.packetBuffer.method7796(var0 + ApproximateRouteStrategy.baseX); // L: 8723
			var8.packetBuffer.method7746(class92.selectedSpellWidget); // L: 8724
			var8.packetBuffer.method7795(var3); // L: 8725
			Client.packetWriter.addNode(var8); // L: 8726
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 8339
			Client.mouseCrossY = var7; // L: 8340
			Client.mouseCrossColor = 2; // L: 8341
			Client.mouseCrossState = 0; // L: 8342
			Client.destinationX = var0; // L: 8343
			Client.destinationY = var1; // L: 8344
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher); // L: 8346
			var8.packetBuffer.method7796(class250.baseY + var1); // L: 8347
			var8.packetBuffer.method7795(var0 + ApproximateRouteStrategy.baseX); // L: 8348
			var8.packetBuffer.writeShort(var3); // L: 8349
			var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8350
			Client.packetWriter.addNode(var8); // L: 8351
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 8884
			Client.mouseCrossY = var7; // L: 8885
			Client.mouseCrossColor = 2; // L: 8886
			Client.mouseCrossState = 0; // L: 8887
			Client.destinationX = var0; // L: 8888
			Client.destinationY = var1; // L: 8889
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher); // L: 8891
			var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8892
			var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8893
			var8.packetBuffer.method7791(var3); // L: 8894
			var8.packetBuffer.method7795(var0 + ApproximateRouteStrategy.baseX); // L: 8895
			Client.packetWriter.addNode(var8); // L: 8896
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 8279
			Client.mouseCrossY = var7; // L: 8280
			Client.mouseCrossColor = 2; // L: 8281
			Client.mouseCrossState = 0; // L: 8282
			Client.destinationX = var0; // L: 8283
			Client.destinationY = var1; // L: 8284
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2927, Client.packetWriter.isaacCipher); // L: 8286
			var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8287
			var8.packetBuffer.method7796(var0 + ApproximateRouteStrategy.baseX); // L: 8288
			var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8289
			var8.packetBuffer.method7796(var3); // L: 8290
			Client.packetWriter.addNode(var8); // L: 8291
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 8811
			Client.mouseCrossY = var7; // L: 8812
			Client.mouseCrossColor = 2; // L: 8813
			Client.mouseCrossState = 0; // L: 8814
			Client.destinationX = var0; // L: 8815
			Client.destinationY = var1; // L: 8816
			var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher); // L: 8818
			var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8819
			var8.packetBuffer.method7791(var0 + ApproximateRouteStrategy.baseX); // L: 8820
			var8.packetBuffer.method7796(var3); // L: 8821
			var8.packetBuffer.method7796(class250.baseY + var1); // L: 8822
			Client.packetWriter.addNode(var8); // L: 8823
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 8680
				if (var13 != null) { // L: 8681
					Client.mouseCrossX = var6; // L: 8682
					Client.mouseCrossY = var7; // L: 8683
					Client.mouseCrossColor = 2; // L: 8684
					Client.mouseCrossState = 0; // L: 8685
					Client.destinationX = var0; // L: 8686
					Client.destinationY = var1; // L: 8687
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 8689
					var9.packetBuffer.method7795(var3); // L: 8690
					var9.packetBuffer.writeIntME(PendingSpawn.selectedItemWidget); // L: 8691
					var9.packetBuffer.method7791(selectedItemId); // L: 8692
					var9.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8693
					var9.packetBuffer.method7796(class19.selectedItemSlot); // L: 8694
					Client.packetWriter.addNode(var9); // L: 8695
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 8662
				if (var13 != null) { // L: 8663
					Client.mouseCrossX = var6; // L: 8664
					Client.mouseCrossY = var7; // L: 8665
					Client.mouseCrossColor = 2; // L: 8666
					Client.mouseCrossState = 0; // L: 8667
					Client.destinationX = var0; // L: 8668
					Client.destinationY = var1; // L: 8669
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2985, Client.packetWriter.isaacCipher); // L: 8670
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8671
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8672
					var9.packetBuffer.method7795(var3); // L: 8673
					var9.packetBuffer.method7806(class92.selectedSpellWidget); // L: 8674
					var9.packetBuffer.method7796(Client.selectedSpellItemId); // L: 8675
					Client.packetWriter.addNode(var9); // L: 8676
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 8573
				if (var13 != null) { // L: 8574
					Client.mouseCrossX = var6; // L: 8575
					Client.mouseCrossY = var7; // L: 8576
					Client.mouseCrossColor = 2; // L: 8577
					Client.mouseCrossState = 0; // L: 8578
					Client.destinationX = var0; // L: 8579
					Client.destinationY = var1; // L: 8580
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2981, Client.packetWriter.isaacCipher); // L: 8582
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8583
					var9.packetBuffer.method7795(var3); // L: 8584
					Client.packetWriter.addNode(var9); // L: 8585
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 8216
				if (var13 != null) { // L: 8217
					Client.mouseCrossX = var6; // L: 8218
					Client.mouseCrossY = var7; // L: 8219
					Client.mouseCrossColor = 2; // L: 8220
					Client.mouseCrossState = 0; // L: 8221
					Client.destinationX = var0; // L: 8222
					Client.destinationY = var1; // L: 8223
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2925, Client.packetWriter.isaacCipher); // L: 8225
					var9.packetBuffer.writeShort(var3); // L: 8226
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8227
					Client.packetWriter.addNode(var9); // L: 8228
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 8524
				if (var13 != null) { // L: 8525
					Client.mouseCrossX = var6; // L: 8526
					Client.mouseCrossY = var7; // L: 8527
					Client.mouseCrossColor = 2; // L: 8528
					Client.mouseCrossState = 0; // L: 8529
					Client.destinationX = var0; // L: 8530
					Client.destinationY = var1; // L: 8531
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher); // L: 8533
					var9.packetBuffer.method7795(var3); // L: 8534
					var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8535
					Client.packetWriter.addNode(var9); // L: 8536
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 8323
				if (var13 != null) { // L: 8324
					Client.mouseCrossX = var6; // L: 8325
					Client.mouseCrossY = var7; // L: 8326
					Client.mouseCrossColor = 2; // L: 8327
					Client.mouseCrossState = 0; // L: 8328
					Client.destinationX = var0; // L: 8329
					Client.destinationY = var1; // L: 8330
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher); // L: 8332
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8333
					var9.packetBuffer.method7795(var3); // L: 8334
					Client.packetWriter.addNode(var9); // L: 8335
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 8760
				if (var13 != null) { // L: 8761
					Client.mouseCrossX = var6; // L: 8762
					Client.mouseCrossY = var7; // L: 8763
					Client.mouseCrossColor = 2; // L: 8764
					Client.mouseCrossState = 0; // L: 8765
					Client.destinationX = var0; // L: 8766
					Client.destinationY = var1; // L: 8767
					var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher); // L: 8769
					var9.packetBuffer.method7795(var3); // L: 8770
					var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8771
					Client.packetWriter.addNode(var9); // L: 8772
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 8462
					if (var15 != null) { // L: 8463
						Client.mouseCrossX = var6; // L: 8464
						Client.mouseCrossY = var7; // L: 8465
						Client.mouseCrossColor = 2; // L: 8466
						Client.mouseCrossState = 0; // L: 8467
						Client.destinationX = var0; // L: 8468
						Client.destinationY = var1; // L: 8469
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher); // L: 8471
						var9.packetBuffer.method7791(selectedItemId); // L: 8472
						var9.packetBuffer.writeShort(var3); // L: 8473
						var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8474
						var9.packetBuffer.method7796(class19.selectedItemSlot); // L: 8475
						var9.packetBuffer.writeIntME(PendingSpawn.selectedItemWidget); // L: 8476
						Client.packetWriter.addNode(var9); // L: 8477
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 8232
					if (var15 != null) { // L: 8233
						Client.mouseCrossX = var6; // L: 8234
						Client.mouseCrossY = var7; // L: 8235
						Client.mouseCrossColor = 2; // L: 8236
						Client.mouseCrossState = 0; // L: 8237
						Client.destinationX = var0; // L: 8238
						Client.destinationY = var1; // L: 8239
						var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2917, Client.packetWriter.isaacCipher); // L: 8240
						var9.packetBuffer.method7795(Client.selectedSpellChildIndex); // L: 8241
						var9.packetBuffer.method7796(var3); // L: 8242
						var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8243
						var9.packetBuffer.writeInt(class92.selectedSpellWidget); // L: 8244
						var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8245
						Client.packetWriter.addNode(var9); // L: 8246
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 8959
					Client.mouseCrossY = var7; // L: 8960
					Client.mouseCrossColor = 2; // L: 8961
					Client.mouseCrossState = 0; // L: 8962
					Client.destinationX = var0; // L: 8963
					Client.destinationY = var1; // L: 8964
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2900, Client.packetWriter.isaacCipher); // L: 8966
					var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8967
					var8.packetBuffer.method7796(class19.selectedItemSlot); // L: 8968
					var8.packetBuffer.method7796(var3); // L: 8969
					var8.packetBuffer.method7796(var0 + ApproximateRouteStrategy.baseX); // L: 8970
					var8.packetBuffer.method7791(class250.baseY + var1); // L: 8971
					var8.packetBuffer.writeIntME(PendingSpawn.selectedItemWidget); // L: 8972
					var8.packetBuffer.writeShort(selectedItemId); // L: 8973
					Client.packetWriter.addNode(var8); // L: 8974
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 8776
					Client.mouseCrossY = var7; // L: 8777
					Client.mouseCrossColor = 2; // L: 8778
					Client.mouseCrossState = 0; // L: 8779
					Client.destinationX = var0; // L: 8780
					Client.destinationY = var1; // L: 8781
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2942, Client.packetWriter.isaacCipher); // L: 8782
					var8.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8783
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8784
					var8.packetBuffer.method7795(var3); // L: 8785
					var8.packetBuffer.writeInt(class92.selectedSpellWidget); // L: 8786
					var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8787
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8788
					var8.packetBuffer.method7796(var0 + ApproximateRouteStrategy.baseX); // L: 8789
					Client.packetWriter.addNode(var8); // L: 8790
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 8305
					Client.mouseCrossY = var7; // L: 8306
					Client.mouseCrossColor = 2; // L: 8307
					Client.mouseCrossState = 0; // L: 8308
					Client.destinationX = var0; // L: 8309
					Client.destinationY = var1; // L: 8310
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher); // L: 8312
					var8.packetBuffer.method7788(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8313
					var8.packetBuffer.method7791(var3); // L: 8314
					var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8315
					var8.packetBuffer.method7795(var0 + ApproximateRouteStrategy.baseX); // L: 8316
					Client.packetWriter.addNode(var8); // L: 8317
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 8420
					Client.mouseCrossY = var7; // L: 8421
					Client.mouseCrossColor = 2; // L: 8422
					Client.mouseCrossState = 0; // L: 8423
					Client.destinationX = var0; // L: 8424
					Client.destinationY = var1; // L: 8425
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher); // L: 8427
					var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8428
					var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8429
					var8.packetBuffer.writeShort(var3); // L: 8430
					var8.packetBuffer.method7795(var0 + ApproximateRouteStrategy.baseX); // L: 8431
					Client.packetWriter.addNode(var8); // L: 8432
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 8201
					Client.mouseCrossY = var7; // L: 8202
					Client.mouseCrossColor = 2; // L: 8203
					Client.mouseCrossState = 0; // L: 8204
					Client.destinationX = var0; // L: 8205
					Client.destinationY = var1; // L: 8206
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2951, Client.packetWriter.isaacCipher); // L: 8208
					var8.packetBuffer.method7795(var0 + ApproximateRouteStrategy.baseX); // L: 8209
					var8.packetBuffer.writeShort(var3); // L: 8210
					var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8211
					var8.packetBuffer.method7796(class250.baseY + var1); // L: 8212
					Client.packetWriter.addNode(var8); // L: 8213
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 8911
					Client.mouseCrossY = var7; // L: 8912
					Client.mouseCrossColor = 2; // L: 8913
					Client.mouseCrossState = 0; // L: 8914
					Client.destinationX = var0; // L: 8915
					Client.destinationY = var1; // L: 8916
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 8918
					var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8919
					var8.packetBuffer.writeShort(var0 + ApproximateRouteStrategy.baseX); // L: 8920
					var8.packetBuffer.method7791(class250.baseY + var1); // L: 8921
					var8.packetBuffer.method7791(var3); // L: 8922
					Client.packetWriter.addNode(var8); // L: 8923
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 8926
					Client.mouseCrossY = var7; // L: 8927
					Client.mouseCrossColor = 2; // L: 8928
					Client.mouseCrossState = 0; // L: 8929
					Client.destinationX = var0; // L: 8930
					Client.destinationY = var1; // L: 8931
					var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2909, Client.packetWriter.isaacCipher); // L: 8933
					var8.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8934
					var8.packetBuffer.method7791(var0 + ApproximateRouteStrategy.baseX); // L: 8935
					var8.packetBuffer.method7795(class250.baseY + var1); // L: 8936
					var8.packetBuffer.writeShort(var3); // L: 8937
					Client.packetWriter.addNode(var8); // L: 8938
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 8627
						FriendSystem.scene.setViewportWalking(); // L: 8628
					} else {
						FriendSystem.scene.menuOpen(class160.Client_plane, var0, var1, true); // L: 8631
					}
				} else {
					PacketBufferNode var10;
					Widget var16;
					if (var2 == 24) {
						var16 = HorizontalAlignment.getWidget(var1); // L: 8268
						boolean var11 = true; // L: 8269
						if (var16.contentType > 0) { // L: 8270
							var11 = Frames.method4319(var16);
						}

						if (var11) { // L: 8271
							var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 8273
							var10.packetBuffer.writeInt(var1); // L: 8274
							Client.packetWriter.addNode(var10); // L: 8275
						}
					} else {
						if (var2 == 25) {
							var16 = class143.getWidgetChild(var1, var0); // L: 8354
							if (var16 != null) { // L: 8355
								class120.Widget_runOnTargetLeave(); // L: 8356
								ApproximateRouteStrategy.selectSpell(var1, var0, WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var16)), var16.itemId); // L: 8357
								Client.isItemSelected = 0; // L: 8358
								Client.selectedSpellActionName = InvDefinition.Widget_getSpellActionName(var16); // L: 8359
								if (Client.selectedSpellActionName == null) { // L: 8360
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 8361
									Client.selectedSpellName = var16.dataText + ChatChannel.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = ChatChannel.colorStartTag(65280) + var16.spellName + ChatChannel.colorStartTag(16777215); // L: 8362
								}
							}

							return; // L: 8364
						}

						if (var2 == 26) {
							class9.method85(); // L: 8320
						} else {
							int var12;
							Widget var14;
							if (var2 == 28) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 8942
								var8.packetBuffer.writeInt(var1); // L: 8943
								Client.packetWriter.addNode(var8); // L: 8944
								var14 = HorizontalAlignment.getWidget(var1); // L: 8945
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8946
									var12 = var14.cs1Instructions[0][1]; // L: 8947
									Varps.Varps_main[var12] = 1 - Varps.Varps_main[var12]; // L: 8948
									class78.changeGameOptions(var12); // L: 8949
								}
							} else if (var2 == 29) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2937, Client.packetWriter.isaacCipher); // L: 8379
								var8.packetBuffer.writeInt(var1); // L: 8380
								Client.packetWriter.addNode(var8); // L: 8381
								var14 = HorizontalAlignment.getWidget(var1); // L: 8382
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 8383
									var12 = var14.cs1Instructions[0][1]; // L: 8384
									if (Varps.Varps_main[var12] != var14.cs1ComparisonValues[0]) { // L: 8385
										Varps.Varps_main[var12] = var14.cs1ComparisonValues[0]; // L: 8386
										class78.changeGameOptions(var12); // L: 8387
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 8804
									Messages.resumePauseWidget(var1, var0); // L: 8805
									Client.meslayerContinueWidget = class143.getWidgetChild(var1, var0); // L: 8806
									class290.invalidateWidget(Client.meslayerContinueWidget); // L: 8807
								}
							} else if (var2 == 31) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher); // L: 8560
								var8.packetBuffer.writeIntME(PendingSpawn.selectedItemWidget); // L: 8561
								var8.packetBuffer.method7795(class19.selectedItemSlot); // L: 8562
								var8.packetBuffer.method7806(var1); // L: 8563
								var8.packetBuffer.writeShort(var3); // L: 8564
								var8.packetBuffer.writeShort(var0); // L: 8565
								var8.packetBuffer.method7795(selectedItemId); // L: 8566
								Client.packetWriter.addNode(var8); // L: 8567
								Client.field595 = 0; // L: 8568
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8569
								Client.field741 = var0; // L: 8570
							} else if (var2 == 32) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher); // L: 8636
								var8.packetBuffer.method7796(var3); // L: 8637
								var8.packetBuffer.writeIntME(class92.selectedSpellWidget); // L: 8638
								var8.packetBuffer.method7796(var0); // L: 8639
								var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 8640
								var8.packetBuffer.writeInt(var1); // L: 8641
								Client.packetWriter.addNode(var8); // L: 8642
								Client.field595 = 0; // L: 8643
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8644
								Client.field741 = var0; // L: 8645
							} else if (var2 == 33) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 8410
								var8.packetBuffer.writeShort(var3); // L: 8411
								var8.packetBuffer.writeShort(var0); // L: 8412
								var8.packetBuffer.method7806(var1); // L: 8413
								Client.packetWriter.addNode(var8); // L: 8414
								Client.field595 = 0; // L: 8415
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8416
								Client.field741 = var0; // L: 8417
							} else if (var2 == 34) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2969, Client.packetWriter.isaacCipher); // L: 8590
								var8.packetBuffer.method7806(var1); // L: 8591
								var8.packetBuffer.writeShort(var0); // L: 8592
								var8.packetBuffer.writeShort(var3); // L: 8593
								Client.packetWriter.addNode(var8); // L: 8594
								Client.field595 = 0; // L: 8595
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8596
								Client.field741 = var0; // L: 8597
							} else if (var2 == 35) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2918, Client.packetWriter.isaacCipher); // L: 8436
								var8.packetBuffer.writeShort(var3); // L: 8437
								var8.packetBuffer.writeShort(var0); // L: 8438
								var8.packetBuffer.method7806(var1); // L: 8439
								Client.packetWriter.addNode(var8); // L: 8440
								Client.field595 = 0; // L: 8441
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8442
								Client.field741 = var0; // L: 8443
							} else if (var2 == 36) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher); // L: 8514
								var8.packetBuffer.method7795(var3); // L: 8515
								var8.packetBuffer.method7806(var1); // L: 8516
								var8.packetBuffer.method7791(var0); // L: 8517
								Client.packetWriter.addNode(var8); // L: 8518
								Client.field595 = 0; // L: 8519
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8520
								Client.field741 = var0; // L: 8521
							} else if (var2 == 37) {
								var8 = ItemContainer.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher); // L: 8295
								var8.packetBuffer.writeIntME(var1); // L: 8296
								var8.packetBuffer.writeShort(var3); // L: 8297
								var8.packetBuffer.method7791(var0); // L: 8298
								Client.packetWriter.addNode(var8); // L: 8299
								Client.field595 = 0; // L: 8300
								class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8301
								Client.field741 = var0; // L: 8302
							} else {
								if (var2 == 38) {
									class120.Widget_runOnTargetLeave(); // L: 8899
									var16 = HorizontalAlignment.getWidget(var1); // L: 8900
									Client.isItemSelected = 1; // L: 8901
									class19.selectedItemSlot = var0; // L: 8902
									PendingSpawn.selectedItemWidget = var1; // L: 8903
									selectedItemId = var3; // L: 8904
									class290.invalidateWidget(var16); // L: 8905
									Client.selectedItemName = ChatChannel.colorStartTag(16748608) + class67.ItemDefinition_get(var3).name + ChatChannel.colorStartTag(16777215); // L: 8906
									if (Client.selectedItemName == null) { // L: 8907
										Client.selectedItemName = "null";
									}

									return; // L: 8908
								}

								if (var2 == 39) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2974, Client.packetWriter.isaacCipher); // L: 8837
									var8.packetBuffer.writeInt(var1); // L: 8838
									var8.packetBuffer.method7796(var0); // L: 8839
									var8.packetBuffer.method7795(var3); // L: 8840
									Client.packetWriter.addNode(var8); // L: 8841
									Client.field595 = 0; // L: 8842
									class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8843
									Client.field741 = var0; // L: 8844
								} else if (var2 == 40) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2931, Client.packetWriter.isaacCipher); // L: 8368
									var8.packetBuffer.writeIntME(var1); // L: 8369
									var8.packetBuffer.writeShort(var0); // L: 8370
									var8.packetBuffer.method7796(var3); // L: 8371
									Client.packetWriter.addNode(var8); // L: 8372
									Client.field595 = 0; // L: 8373
									class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8374
									Client.field741 = var0; // L: 8375
								} else if (var2 == 41) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2922, Client.packetWriter.isaacCipher); // L: 8864
									var8.packetBuffer.method7796(var3); // L: 8865
									var8.packetBuffer.method7806(var1); // L: 8866
									var8.packetBuffer.method7791(var0); // L: 8867
									Client.packetWriter.addNode(var8); // L: 8868
									Client.field595 = 0; // L: 8869
									class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8870
									Client.field741 = var0; // L: 8871
								} else if (var2 == 42) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher); // L: 8617
									var8.packetBuffer.method7791(var0); // L: 8618
									var8.packetBuffer.writeInt(var1); // L: 8619
									var8.packetBuffer.method7795(var3); // L: 8620
									Client.packetWriter.addNode(var8); // L: 8621
									Client.field595 = 0; // L: 8622
									class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8623
									Client.field741 = var0; // L: 8624
								} else if (var2 == 43) {
									var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2895, Client.packetWriter.isaacCipher); // L: 8794
									var8.packetBuffer.method7791(var0); // L: 8795
									var8.packetBuffer.method7791(var3); // L: 8796
									var8.packetBuffer.writeInt(var1); // L: 8797
									Client.packetWriter.addNode(var8); // L: 8798
									Client.field595 = 0; // L: 8799
									class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8800
									Client.field741 = var0; // L: 8801
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 8600
									if (var15 != null) { // L: 8601
										Client.mouseCrossX = var6; // L: 8602
										Client.mouseCrossY = var7; // L: 8603
										Client.mouseCrossColor = 2; // L: 8604
										Client.mouseCrossState = 0; // L: 8605
										Client.destinationX = var0; // L: 8606
										Client.destinationY = var1; // L: 8607
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2913, Client.packetWriter.isaacCipher); // L: 8609
										var9.packetBuffer.method7795(var3); // L: 8610
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8611
										Client.packetWriter.addNode(var9); // L: 8612
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 8744
									if (var15 != null) { // L: 8745
										Client.mouseCrossX = var6; // L: 8746
										Client.mouseCrossY = var7; // L: 8747
										Client.mouseCrossColor = 2; // L: 8748
										Client.mouseCrossState = 0; // L: 8749
										Client.destinationX = var0; // L: 8750
										Client.destinationY = var1; // L: 8751
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher); // L: 8753
										var9.packetBuffer.method7795(var3); // L: 8754
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8755
										Client.packetWriter.addNode(var9); // L: 8756
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 8497
									if (var15 != null) { // L: 8498
										Client.mouseCrossX = var6; // L: 8499
										Client.mouseCrossY = var7; // L: 8500
										Client.mouseCrossColor = 2; // L: 8501
										Client.mouseCrossState = 0; // L: 8502
										Client.destinationX = var0; // L: 8503
										Client.destinationY = var1; // L: 8504
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2964, Client.packetWriter.isaacCipher); // L: 8506
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8507
										var9.packetBuffer.method7796(var3); // L: 8508
										Client.packetWriter.addNode(var9); // L: 8509
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 8540
									if (var15 != null) { // L: 8541
										Client.mouseCrossX = var6; // L: 8542
										Client.mouseCrossY = var7; // L: 8543
										Client.mouseCrossColor = 2; // L: 8544
										Client.mouseCrossState = 0; // L: 8545
										Client.destinationX = var0; // L: 8546
										Client.destinationY = var1; // L: 8547
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2904, Client.packetWriter.isaacCipher); // L: 8549
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8550
										var9.packetBuffer.writeShort(var3); // L: 8551
										Client.packetWriter.addNode(var9); // L: 8552
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 8847
									if (var15 != null) { // L: 8848
										Client.mouseCrossX = var6; // L: 8849
										Client.mouseCrossY = var7; // L: 8850
										Client.mouseCrossColor = 2; // L: 8851
										Client.mouseCrossState = 0; // L: 8852
										Client.destinationX = var0; // L: 8853
										Client.destinationY = var1; // L: 8854
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher); // L: 8856
										var9.packetBuffer.writeShort(var3); // L: 8857
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8858
										Client.packetWriter.addNode(var9); // L: 8859
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 8481
									if (var15 != null) { // L: 8482
										Client.mouseCrossX = var6; // L: 8483
										Client.mouseCrossY = var7; // L: 8484
										Client.mouseCrossColor = 2; // L: 8485
										Client.mouseCrossState = 0; // L: 8486
										Client.destinationX = var0; // L: 8487
										Client.destinationY = var1; // L: 8488
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2903, Client.packetWriter.isaacCipher); // L: 8490
										var9.packetBuffer.method7791(var3); // L: 8491
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8492
										Client.packetWriter.addNode(var9); // L: 8493
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 8977
									if (var15 != null) { // L: 8978
										Client.mouseCrossX = var6; // L: 8979
										Client.mouseCrossY = var7; // L: 8980
										Client.mouseCrossColor = 2; // L: 8981
										Client.mouseCrossState = 0; // L: 8982
										Client.destinationX = var0; // L: 8983
										Client.destinationY = var1; // L: 8984
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher); // L: 8986
										var9.packetBuffer.writeShort(var3); // L: 8987
										var9.packetBuffer.method7786(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8988
										Client.packetWriter.addNode(var9); // L: 8989
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 8446
									if (var15 != null) { // L: 8447
										Client.mouseCrossX = var6; // L: 8448
										Client.mouseCrossY = var7; // L: 8449
										Client.mouseCrossColor = 2; // L: 8450
										Client.mouseCrossState = 0; // L: 8451
										Client.destinationX = var0; // L: 8452
										Client.destinationY = var1; // L: 8453
										var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2912, Client.packetWriter.isaacCipher); // L: 8455
										var9.packetBuffer.method7791(var3); // L: 8456
										var9.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8457
										Client.packetWriter.addNode(var9); // L: 8458
									}
								} else {
									label638: {
										if (var2 != 57) {
											if (var2 == 58) {
												var16 = class143.getWidgetChild(var1, var0); // L: 8648
												if (var16 != null) { // L: 8649
													var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2932, Client.packetWriter.isaacCipher); // L: 8651
													var9.packetBuffer.writeShort(Client.selectedSpellItemId); // L: 8652
													var9.packetBuffer.writeIntME(class92.selectedSpellWidget); // L: 8653
													var9.packetBuffer.method7796(var16.itemId); // L: 8654
													var9.packetBuffer.method7791(Client.selectedSpellChildIndex); // L: 8655
													var9.packetBuffer.writeInt(var1); // L: 8656
													var9.packetBuffer.method7796(var0); // L: 8657
													Client.packetWriter.addNode(var9); // L: 8658
												}
												break label638;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var6; // L: 8729
												Client.mouseCrossY = var7; // L: 8730
												Client.mouseCrossColor = 2; // L: 8731
												Client.mouseCrossState = 0; // L: 8732
												Client.destinationX = var0; // L: 8733
												Client.destinationY = var1; // L: 8734
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2976, Client.packetWriter.isaacCipher); // L: 8736
												var8.packetBuffer.method7795(var3); // L: 8737
												var8.packetBuffer.method7796(var0 + ApproximateRouteStrategy.baseX); // L: 8738
												var8.packetBuffer.method7787(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 8739
												var8.packetBuffer.writeShort(class250.baseY + var1); // L: 8740
												Client.packetWriter.addNode(var8); // L: 8741
												break label638;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var6; // L: 8874
												Client.mouseCrossY = var7; // L: 8875
												Client.mouseCrossColor = 2; // L: 8876
												Client.mouseCrossState = 0; // L: 8877
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2949, Client.packetWriter.isaacCipher); // L: 8879
												var8.packetBuffer.method7791(var3); // L: 8880
												Client.packetWriter.addNode(var8); // L: 8881
												break label638;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var6; // L: 8392
												Client.mouseCrossY = var7; // L: 8393
												Client.mouseCrossColor = 2; // L: 8394
												Client.mouseCrossState = 0; // L: 8395
												var13 = Client.npcs[var3]; // L: 8396
												if (var13 != null) { // L: 8397
													NPCComposition var17 = var13.definition; // L: 8398
													if (var17.transforms != null) { // L: 8399
														var17 = var17.transform();
													}

													if (var17 != null) { // L: 8400
														var10 = ItemContainer.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 8402
														var10.packetBuffer.method7795(var17.id); // L: 8403
														Client.packetWriter.addNode(var10); // L: 8404
													}
												}
												break label638;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var6; // L: 8826
												Client.mouseCrossY = var7; // L: 8827
												Client.mouseCrossColor = 2; // L: 8828
												Client.mouseCrossState = 0; // L: 8829
												var8 = ItemContainer.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 8831
												var8.packetBuffer.method7796(var3); // L: 8832
												Client.packetWriter.addNode(var8); // L: 8833
												break label638;
											}

											if (var2 == 1005) {
												var16 = HorizontalAlignment.getWidget(var1); // L: 8699
												if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 8700
													Login.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + class67.ItemDefinition_get(var3).name);
												} else {
													var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 8703
													var9.packetBuffer.method7796(var3); // L: 8704
													Client.packetWriter.addNode(var9); // L: 8705
												}

												Client.field595 = 0; // L: 8707
												class12.field64 = HorizontalAlignment.getWidget(var1); // L: 8708
												Client.field741 = var0; // L: 8709
												break label638;
											}

											if (var2 != 1007) {
												if (var2 == 1009 || var2 == 1008 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
													ClanChannel.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 8556
												}
												break label638;
											}
										}

										var16 = class143.getWidgetChild(var1, var0); // L: 8953
										if (var16 != null) { // L: 8954
											Message.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 8955
										}
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 8992
			Client.isItemSelected = 0; // L: 8993
			class290.invalidateWidget(HorizontalAlignment.getWidget(PendingSpawn.selectedItemWidget)); // L: 8994
		}

		if (Client.isSpellSelected) { // L: 8996
			class120.Widget_runOnTargetLeave();
		}

		if (class12.field64 != null && Client.field595 == 0) { // L: 8997
			class290.invalidateWidget(class12.field64);
		}

	} // L: 8998
}
