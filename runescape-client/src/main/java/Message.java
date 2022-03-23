import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2074233213
	)
	static int field458;
	@ObfuscatedName("hz")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("hb")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 592721891
	)
	@Export("count")
	int count;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1202817007
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1449287579
	)
	@Export("type")
	int type;
	@ObfuscatedName("g")
	@Export("sender")
	String sender;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("f")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("u")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4);
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1604775209"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		int var5 = ++Messages.Messages_count - 1;
		this.count = var5; // L: 27
		this.cycle = Client.cycle; // L: 28
		this.type = var1; // L: 29
		this.sender = var2; // L: 30
		this.fillSenderUsername(); // L: 31
		this.prefix = var3; // L: 32
		this.text = var4; // L: 33
		this.clearIsFromFriend(); // L: 34
		this.clearIsFromIgnored(); // L: 35
	} // L: 36

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1449740168"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 39
	} // L: 40

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-58"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 43
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1170229720"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class155.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 50
	} // L: 51

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-387175416"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 54
	} // L: 55

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2027287720"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 58
			this.fillIsFromIgnored(); // L: 59
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 61
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1661700203"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class155.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 65
	} // L: 66

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(ObjectSound.method1734(this.sender), class83.loginType); // L: 69
		} else {
			this.senderUsername = null; // L: 70
		}

	} // L: 71

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(DDIB)[D",
		garbageValue = "1"
	)
	public static double[] method1112(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 9
		double[] var6 = new double[var5]; // L: 10
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2; // L: 17
			double var13 = Math.exp(var15 * -var15 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 19
			double var11 = var13 / var2; // L: 21
			var6[var8] = var11; // L: 23
			++var7; // L: 11
		}

		return var6; // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)Lbo;",
		garbageValue = "958317851"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 108
		Buffer var2 = new Buffer(var0); // L: 109
		var2.offset = var2.array.length - 2; // L: 110
		int var3 = var2.readUnsignedShort(); // L: 111
		int var4 = var2.array.length - 2 - var3 - 12; // L: 112
		var2.offset = var4; // L: 113
		int var5 = var2.readInt(); // L: 114
		var1.localIntCount = var2.readUnsignedShort(); // L: 115
		var1.localStringCount = var2.readUnsignedShort(); // L: 116
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 117
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 118
		int var6 = var2.readUnsignedByte(); // L: 119
		int var7;
		int var8;
		if (var6 > 0) { // L: 120
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 121

			for (var7 = 0; var7 < var6; ++var7) { // L: 122
				var8 = var2.readUnsignedShort(); // L: 123
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? Login.method1894(var8) : 1); // L: 124
				var1.switches[var7] = var9; // L: 125

				while (var8-- > 0) { // L: 126
					int var10 = var2.readInt(); // L: 127
					int var11 = var2.readInt(); // L: 128
					var9.put(new IntegerNode(var11), (long)var10); // L: 129
				}
			}
		}

		var2.offset = 0; // L: 133
		var1.field959 = var2.readStringCp1252NullTerminatedOrNull(); // L: 134
		var1.opcodes = new int[var5]; // L: 135
		var1.intOperands = new int[var5]; // L: 136
		var1.stringOperands = new String[var5]; // L: 137

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 138 139 144
			var8 = var2.readUnsignedShort(); // L: 140
			if (var8 == 3) { // L: 141
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 142
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 143
			}
		}

		return var1; // L: 146
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "7"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;S)V",
		garbageValue = "1440"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class143.getWidgetChild(var1, var2); // L: 9082
		if (var5 != null) { // L: 9083
			if (var5.onOp != null) { // L: 9084
				ScriptEvent var6 = new ScriptEvent(); // L: 9085
				var6.widget = var5; // L: 9086
				var6.opIndex = var0; // L: 9087
				var6.targetName = var4; // L: 9088
				var6.args = var5.onOp; // L: 9089
				class1.runScriptEvent(var6); // L: 9090
			}

			boolean var8 = true; // L: 9092
			if (var5.contentType > 0) { // L: 9093
				var8 = Frames.method4319(var5);
			}

			if (var8) { // L: 9094
				if (class142.method3004(WorldMapSection2.getWidgetFlags(var5), var0 - 1)) { // L: 9095
					PacketBufferNode var7;
					if (var0 == 1) { // L: 9098
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2908, Client.packetWriter.isaacCipher); // L: 9100
						var7.packetBuffer.writeInt(var1); // L: 9101
						var7.packetBuffer.writeShort(var2); // L: 9102
						var7.packetBuffer.writeShort(var3); // L: 9103
						Client.packetWriter.addNode(var7); // L: 9104
					}

					if (var0 == 2) { // L: 9106
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2945, Client.packetWriter.isaacCipher); // L: 9108
						var7.packetBuffer.writeInt(var1); // L: 9109
						var7.packetBuffer.writeShort(var2); // L: 9110
						var7.packetBuffer.writeShort(var3); // L: 9111
						Client.packetWriter.addNode(var7); // L: 9112
					}

					if (var0 == 3) { // L: 9114
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2941, Client.packetWriter.isaacCipher); // L: 9116
						var7.packetBuffer.writeInt(var1); // L: 9117
						var7.packetBuffer.writeShort(var2); // L: 9118
						var7.packetBuffer.writeShort(var3); // L: 9119
						Client.packetWriter.addNode(var7); // L: 9120
					}

					if (var0 == 4) { // L: 9122
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2980, Client.packetWriter.isaacCipher); // L: 9124
						var7.packetBuffer.writeInt(var1); // L: 9125
						var7.packetBuffer.writeShort(var2); // L: 9126
						var7.packetBuffer.writeShort(var3); // L: 9127
						Client.packetWriter.addNode(var7); // L: 9128
					}

					if (var0 == 5) { // L: 9130
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher); // L: 9132
						var7.packetBuffer.writeInt(var1); // L: 9133
						var7.packetBuffer.writeShort(var2); // L: 9134
						var7.packetBuffer.writeShort(var3); // L: 9135
						Client.packetWriter.addNode(var7); // L: 9136
					}

					if (var0 == 6) { // L: 9138
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2944, Client.packetWriter.isaacCipher); // L: 9140
						var7.packetBuffer.writeInt(var1); // L: 9141
						var7.packetBuffer.writeShort(var2); // L: 9142
						var7.packetBuffer.writeShort(var3); // L: 9143
						Client.packetWriter.addNode(var7); // L: 9144
					}

					if (var0 == 7) { // L: 9146
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2982, Client.packetWriter.isaacCipher); // L: 9148
						var7.packetBuffer.writeInt(var1); // L: 9149
						var7.packetBuffer.writeShort(var2); // L: 9150
						var7.packetBuffer.writeShort(var3); // L: 9151
						Client.packetWriter.addNode(var7); // L: 9152
					}

					if (var0 == 8) { // L: 9154
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher); // L: 9156
						var7.packetBuffer.writeInt(var1); // L: 9157
						var7.packetBuffer.writeShort(var2); // L: 9158
						var7.packetBuffer.writeShort(var3); // L: 9159
						Client.packetWriter.addNode(var7); // L: 9160
					}

					if (var0 == 9) { // L: 9162
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 9164
						var7.packetBuffer.writeInt(var1); // L: 9165
						var7.packetBuffer.writeShort(var2); // L: 9166
						var7.packetBuffer.writeShort(var3); // L: 9167
						Client.packetWriter.addNode(var7); // L: 9168
					}

					if (var0 == 10) { // L: 9170
						var7 = ItemContainer.getPacketBufferNode(ClientPacket.field2929, Client.packetWriter.isaacCipher); // L: 9172
						var7.packetBuffer.writeInt(var1); // L: 9173
						var7.packetBuffer.writeShort(var2); // L: 9174
						var7.packetBuffer.writeShort(var3); // L: 9175
						Client.packetWriter.addNode(var7); // L: 9176
					}

				}
			}
		}
	} // L: 9096 9178

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-291847238"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher); // L: 11733
		var0.packetBuffer.writeByte(0); // L: 11734
		Client.packetWriter.addNode(var0); // L: 11735
	} // L: 11736
}
