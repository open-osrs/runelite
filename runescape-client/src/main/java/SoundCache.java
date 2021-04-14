import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lah;",
		garbageValue = "1896632187"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null; // L: 23
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lah;",
		garbageValue = "-1"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lah;",
		garbageValue = "-1575700242"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lah;",
		garbageValue = "1575999128"
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "5"
	)
	static int method883(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1171
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1172
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemId; // L: 1173
			return 1; // L: 1174
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1176
			if (var3.itemId != -1) { // L: 1177
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1178
			}

			return 1; // L: 1179
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1181
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1182
			return 1; // L: 1183
		} else {
			return 2; // L: 1185
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-7"
	)
	static void method889(int var0, String var1) {
		int var2 = Players.Players_count; // L: 8781
		int[] var3 = Players.Players_indices; // L: 8782
		boolean var4 = false; // L: 8783
		Username var5 = new Username(var1, AbstractUserComparator.loginType); // L: 8784

		for (int var6 = 0; var6 < var2; ++var6) { // L: 8785
			Player var7 = Client.players[var3[var6]]; // L: 8786
			if (var7 != null && var7 != Varcs.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 8787
				PacketBufferNode var8;
				if (var0 == 1) { // L: 8788
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher); // L: 8790
					var8.packetBuffer.method6639(0); // L: 8791
					var8.packetBuffer.method6614(var3[var6]); // L: 8792
					Client.packetWriter.addNode(var8); // L: 8793
				} else if (var0 == 4) { // L: 8795
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher); // L: 8797
					var8.packetBuffer.writeShortLE(0); // L: 8798
					var8.packetBuffer.method6771(var3[var6]); // L: 8799
					Client.packetWriter.addNode(var8); // L: 8800
				} else if (var0 == 6) { // L: 8802
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2276, Client.packetWriter.isaacCipher); // L: 8804
					var8.packetBuffer.method6614(var3[var6]); // L: 8805
					var8.packetBuffer.method6606(0); // L: 8806
					Client.packetWriter.addNode(var8); // L: 8807
				} else if (var0 == 7) { // L: 8809
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field2244, Client.packetWriter.isaacCipher); // L: 8811
					var8.packetBuffer.writeShortLE(0); // L: 8812
					var8.packetBuffer.method6614(var3[var6]); // L: 8813
					Client.packetWriter.addNode(var8); // L: 8814
				}

				var4 = true; // L: 8816
				break;
			}
		}

		if (!var4) { // L: 8820
			class69.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 8821
}
