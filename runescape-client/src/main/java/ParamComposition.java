import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1127122845
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("o")
	@Export("type")
	char type;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 648695719
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("l")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("z")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-46"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "24"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class301.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CLkr;I)C",
		garbageValue = "-528030927"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgi;",
		garbageValue = "297744519"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 181
		if (var1 != null) { // L: 182
			return var1;
		} else {
			var1 = IsaacCipher.loadFrames(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 183
			if (var1 != null) { // L: 184
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 185
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1534971761"
	)
	static final void method2825(String var0, int var1) {
		PacketBufferNode var2 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2614, Client.packetWriter.isaacCipher); // L: 246
		var2.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 247
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 248
		var2.packetBuffer.method6610(var1); // L: 249
		Client.packetWriter.addNode(var2); // L: 250
	} // L: 251
}
