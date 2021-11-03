import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ei")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1330627969
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	InvDefinition() {
		this.size = 0; // L: 12
	} // L: 14

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "2084245360"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "712504177"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) { // L: 35
			this.size = var1.readUnsignedShort();
		}

	} // L: 37

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "26"
	)
	public static FloorOverlayDefinition method2987(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 31
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbp;",
		garbageValue = "92"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class14.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class87.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968764473"
	)
	static void method2983() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 50
	} // L: 51

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1702498175"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3881) { // L: 116
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 117
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field3882) { // L: 120
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 121
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3883) { // L: 124
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 125
		} else if (var0.length == 30000 && ByteArrayPool.field3891 < ByteArrayPool.field3884) { // L: 128
			ByteArrayPool.field3888[++ByteArrayPool.field3891 - 1] = var0; // L: 129
		} else {
			if (class260.ByteArrayPool_arrays != null) { // L: 132
				for (int var1 = 0; var1 < class176.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 133
					if (var0.length == class176.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < class260.ByteArrayPool_arrays[var1].length) { // L: 134
						class260.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 135
						return; // L: 136
					}
				}
			}

		}
	} // L: 118 122 126 130 140

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1900021864"
	)
	static int method2982(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 3582
			class14.Interpreter_intStackSize -= 2; // L: 3583
			var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3584
			int var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3585
			if (!Client.isCameraLocked) { // L: 3586
				Client.camAngleX = var3; // L: 3587
				Client.camAngleY = var4; // L: 3588
			}

			return 1; // L: 3590
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 3592
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 3593
			return 1; // L: 3594
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 3596
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 3597
			return 1; // L: 3598
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 3600
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3601
			if (var3 < 0) { // L: 3602
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 3603
			return 1; // L: 3604
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 3606
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 3607
			return 1; // L: 3608
		} else {
			return 2; // L: 3610
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-2065208815"
	)
	public static void method2986(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2736, Client.packetWriter.isaacCipher); // L: 12003
		var4.packetBuffer.method6962(var0); // L: 12004
		var4.packetBuffer.method6962(var1); // L: 12005
		var4.packetBuffer.method6993(var2); // L: 12006
		var4.packetBuffer.writeIntME(var3 ? Client.field552 * -2052313535 * -1777671743 : 0); // L: 12007
		Client.packetWriter.addNode(var4); // L: 12008
	} // L: 12009
}
