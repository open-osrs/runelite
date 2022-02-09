import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1377352685
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1757184111
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 86481407
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ao")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 606159205
	)
	int field1113;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1301285489
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 930219719
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1164552409
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1283066873
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1966550873
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -178450401
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 206935327
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -988498907
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -248660997
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ae")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("an")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aw")
	boolean field1125;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1970261047
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -937479283
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1627200621
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("am")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("be")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bt")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bn")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bz")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bx")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1691855669
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bm")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1033132539
	)
	int field1138;
	@ObfuscatedName("bw")
	boolean field1139;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1663876733
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1595654321
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1011424269
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1298635805
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1540339873
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 2004238425
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 787094505
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1322705901
	)
	int field1129;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 396275835
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1643722141
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1349072047
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1845348051
	)
	int field1177;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -467239947
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -416942467
	)
	int field1153;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -543666705
	)
	int field1147;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -205198277
	)
	int field1144;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -201847185
	)
	int field1156;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 673923399
	)
	int field1157;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1026665477
	)
	int field1158;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 697476967
	)
	int field1159;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -689072625
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2136104267
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -289145949
	)
	int field1162;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1244014409
	)
	int field1163;
	@ObfuscatedName("cc")
	byte field1164;
	@ObfuscatedName("cs")
	byte field1155;
	@ObfuscatedName("cl")
	byte field1166;
	@ObfuscatedName("ck")
	byte field1167;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -95170499
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 158152849
	)
	int field1169;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 416354727
	)
	int field1170;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1741409561
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ci")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	@Export("pathTraversed")
	class185[] pathTraversed;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1133647813
	)
	int field1175;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1203587855
	)
	int field1176;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1607900017
	)
	int field1135;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1113 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field1125 = false; // L: 26
		this.overheadTextCyclesRemaining = 100; // L: 27
		this.overheadTextColor = 0; // L: 28
		this.overheadTextEffect = 0; // L: 29
		this.hitSplatCount = 0; // L: 31
		this.hitSplatTypes = new int[4]; // L: 32
		this.hitSplatValues = new int[4]; // L: 33
		this.hitSplatCycles = new int[4]; // L: 34
		this.hitSplatTypes2 = new int[4]; // L: 35
		this.hitSplatValues2 = new int[4]; // L: 36
		this.healthBars = new IterableNodeDeque(); // L: 37
		this.targetIndex = -1; // L: 38
		this.false0 = false; // L: 39
		this.field1138 = -1; // L: 40
		this.movementSequence = -1; // L: 42
		this.movementFrame = 0; // L: 43
		this.movementFrameCycle = 0; // L: 44
		this.sequence = -1; // L: 45
		this.sequenceFrame = 0; // L: 46
		this.sequenceFrameCycle = 0; // L: 47
		this.sequenceDelay = 0; // L: 48
		this.field1129 = 0; // L: 49
		this.spotAnimation = -1; // L: 50
		this.spotAnimationFrame = 0; // L: 51
		this.spotAnimationFrameCycle = 0; // L: 52
		this.npcCycle = 0; // L: 62
		this.defaultHeight = 200; // L: 63
		this.field1162 = -1; // L: 64
		this.field1163 = -1; // L: 65
		this.field1169 = 0; // L: 71
		this.field1170 = 32; // L: 72
		this.pathLength = 0; // L: 73
		this.pathX = new int[10]; // L: 74
		this.pathY = new int[10]; // L: 75
		this.pathTraversed = new class185[10]; // L: 76
		this.field1175 = 0; // L: 77
		this.field1176 = 0; // L: 78
		this.field1135 = -1; // L: 79
	} // L: 81

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1570210948"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 89
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	final void method2163() {
		this.pathLength = 0; // L: 84
		this.field1176 = 0; // L: 85
	} // L: 86

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "181453594"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 93
		boolean var8 = true; // L: 94

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 95
			if (this.hitSplatCycles[var9] > var5) { // L: 96
				var7 = false;
			} else {
				var8 = false; // L: 97
			}
		}

		var9 = -1; // L: 99
		int var10 = -1; // L: 100
		int var11 = 0; // L: 101
		if (var1 >= 0) { // L: 102
			HitSplatDefinition var12 = class293.method5480(var1); // L: 103
			var10 = var12.field1961; // L: 104
			var11 = var12.field1944; // L: 105
		}

		int var14;
		if (var8) { // L: 107
			if (var10 == -1) { // L: 108
				return;
			}

			var9 = 0; // L: 109
			var14 = 0; // L: 110
			if (var10 == 0) { // L: 111
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 112
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 113
				if (var10 == 0) { // L: 114
					if (this.hitSplatCycles[var13] < var14) { // L: 115
						var9 = var13; // L: 116
						var14 = this.hitSplatCycles[var13]; // L: 117
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 120 121
					var9 = var13; // L: 122
					var14 = this.hitSplatValues[var13]; // L: 123
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 127
				return;
			}
		} else {
			if (var7) { // L: 130
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 131
				byte var15 = this.hitSplatCount; // L: 132
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 133
				if (this.hitSplatCycles[var15] <= var5) { // L: 134
					var9 = var15; // L: 135
					break; // L: 136
				}
			}
		}

		if (var9 >= 0) { // L: 140
			this.hitSplatTypes[var9] = var1; // L: 141
			this.hitSplatValues[var9] = var2; // L: 142
			this.hitSplatTypes2[var9] = var3; // L: 143
			this.hitSplatValues2[var9] = var4; // L: 144
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 145
		}
	} // L: 146

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1401747345"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = NetSocket.method3073(var1); // L: 149
		HealthBar var8 = null; // L: 150
		HealthBar var9 = null; // L: 151
		int var10 = var7.int2; // L: 152
		int var11 = 0; // L: 153

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 154
			++var11; // L: 155
			if (var12.definition.field1809 == var7.field1809) { // L: 156
				var12.put(var2 + var4, var5, var6, var3); // L: 157
				return; // L: 158
			}

			if (var12.definition.int1 <= var7.int1) { // L: 160
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 161
				var9 = var12; // L: 162
				var10 = var12.definition.int2; // L: 163
			}
		}

		if (var9 != null || var11 < 4) { // L: 166
			var12 = new HealthBar(var7); // L: 167
			if (var8 == null) { // L: 168
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 169
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 170
			if (var11 >= 4) { // L: 171
				var9.remove();
			}

		}
	} // L: 172

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2080014177"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = NetSocket.method3073(var1); // L: 175

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 176
			if (var2 == var3.definition) { // L: 177
				var3.remove(); // L: 178
				return; // L: 179
			}
		}

	} // L: 182

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-1069281222"
	)
	static int method2176(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2137
			if (ClanSettings.friendSystem.field810 == 0) { // L: 2138
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (ClanSettings.friendSystem.field810 == 1) { // L: 2139
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.friendSystem.friendsList.getSize(); // L: 2140
			}

			return 1; // L: 2141
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2144
				if (ClanSettings.friendSystem.method1675() && var3 >= 0 && var3 < ClanSettings.friendSystem.friendsList.getSize()) { // L: 2145
					Friend var8 = (Friend)ClanSettings.friendSystem.friendsList.get(var3); // L: 2146
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2147
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2148
				} else {
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2151
					Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2152
				}

				return 1; // L: 2154
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2157
				if (ClanSettings.friendSystem.method1675() && var3 >= 0 && var3 < ClanSettings.friendSystem.friendsList.getSize()) { // L: 2158
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ClanSettings.friendSystem.friendsList.get(var3)).world; // L: 2159
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2161
				}

				return 1; // L: 2162
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2165
				if (ClanSettings.friendSystem.method1675() && var3 >= 0 && var3 < ClanSettings.friendSystem.friendsList.getSize()) { // L: 2166
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)ClanSettings.friendSystem.friendsList.get(var3)).rank; // L: 2167
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2169
				}

				return 1; // L: 2170
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2173
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2174
					class12.method158(var5, var6); // L: 2175
					return 1; // L: 2176
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2179
					ClanSettings.friendSystem.addFriend(var5); // L: 2180
					return 1; // L: 2181
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2184
					ClanSettings.friendSystem.removeFriend(var5); // L: 2185
					return 1; // L: 2186
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2189
					ClanSettings.friendSystem.addIgnore(var5); // L: 2190
					return 1; // L: 2191
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2194
					ClanSettings.friendSystem.removeIgnore(var5); // L: 2195
					return 1; // L: 2196
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2199
					var5 = PlayerComposition.method5380(var5); // L: 2200
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.friendSystem.isFriended(new Username(var5, VarcInt.loginType), false) ? 1 : 0; // L: 2201
					return 1; // L: 2202
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class67.friendsChat != null) { // L: 2205
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = class67.friendsChat.name; // L: 2206
					} else {
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2208
					}

					return 1; // L: 2209
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class67.friendsChat != null) { // L: 2212
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class67.friendsChat.getSize(); // L: 2213
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2215
					}

					return 1; // L: 2216
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2219
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize()) { // L: 2220
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = class67.friendsChat.get(var3).getUsername().getName(); // L: 2221
					} else {
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2223
					}

					return 1; // L: 2224
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2227
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize()) { // L: 2228
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class67.friendsChat.get(var3)).getWorld(); // L: 2229
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2231
					}

					return 1; // L: 2232
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2235
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize()) { // L: 2236
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class67.friendsChat.get(var3)).rank; // L: 2237
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2239
					}

					return 1; // L: 2240
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class67.friendsChat != null ? class67.friendsChat.minKick : 0; // L: 2243
					return 1; // L: 2244
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2247
					UserList.clanKickUser(var5); // L: 2248
					return 1; // L: 2249
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class67.friendsChat != null ? class67.friendsChat.rank * 149836569 * 362371369 : 0; // L: 2252
					return 1; // L: 2253
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2256
					Fonts.Clan_joinChat(var5); // L: 2257
					return 1; // L: 2258
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class333.Clan_leaveChat(); // L: 2261
					return 1; // L: 2262
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ClanSettings.friendSystem.method1675()) { // L: 2265
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.friendSystem.ignoreList.getSize(); // L: 2266
					}

					return 1; // L: 2267
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2270
					if (ClanSettings.friendSystem.method1675() && var3 >= 0 && var3 < ClanSettings.friendSystem.ignoreList.getSize()) { // L: 2271
						Ignored var4 = (Ignored)ClanSettings.friendSystem.ignoreList.get(var3); // L: 2272
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2273
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2274
					} else {
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2277
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2278
					}

					return 1; // L: 2280
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize]; // L: 2283
					var5 = PlayerComposition.method5380(var5); // L: 2284
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanSettings.friendSystem.isIgnored(new Username(var5, VarcInt.loginType)) ? 1 : 0; // L: 2285
					return 1; // L: 2286
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2289
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize() && class67.friendsChat.get(var3).getUsername().equals(WorldMapSprite.localPlayer.username)) { // L: 2290
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2291
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2293
					}

					return 1; // L: 2294
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class67.friendsChat != null && class67.friendsChat.owner != null) { // L: 2297
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = class67.friendsChat.owner; // L: 2298
					} else {
						Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 2300
					}

					return 1; // L: 2301
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2304
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize() && ((ClanMate)class67.friendsChat.get(var3)).isFriend()) { // L: 2305
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2306
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2308
					}

					return 1; // L: 2309
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ClanSettings.friendSystem.friendsList.removeComparator(); // L: 2320
						return 1; // L: 2321
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2324
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2325
							return 1; // L: 2326
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2329
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2330
							return 1; // L: 2331
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2334
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2335
							return 1; // L: 2336
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2339
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2340
							return 1; // L: 2341
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2344
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2345
							return 1; // L: 2346
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2349
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2350
							return 1; // L: 2351
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2354
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2355
							return 1; // L: 2356
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2359
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2360
							return 1; // L: 2361
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2364
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2365
							return 1; // L: 2366
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2369
							ClanSettings.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2370
							return 1; // L: 2371
						} else if (var0 == 3639) {
							ClanSettings.friendSystem.friendsList.sort(); // L: 2374
							return 1; // L: 2375
						} else if (var0 == 3640) {
							ClanSettings.friendSystem.ignoreList.removeComparator(); // L: 2378
							return 1; // L: 2379
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2382
							ClanSettings.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2383
							return 1; // L: 2384
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2387
							ClanSettings.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2388
							return 1; // L: 2389
						} else if (var0 == 3643) {
							ClanSettings.friendSystem.ignoreList.sort(); // L: 2392
							return 1; // L: 2393
						} else if (var0 == 3644) {
							if (class67.friendsChat != null) { // L: 2396
								class67.friendsChat.removeComparator(); // L: 2397
							}

							return 1; // L: 2399
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2402
							if (class67.friendsChat != null) { // L: 2403
								class67.friendsChat.addComparator(new UserComparator1(var7)); // L: 2404
							}

							return 1; // L: 2406
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2409
							if (class67.friendsChat != null) { // L: 2410
								class67.friendsChat.addComparator(new UserComparator2(var7)); // L: 2411
							}

							return 1; // L: 2413
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2416
							if (class67.friendsChat != null) { // L: 2417
								class67.friendsChat.addComparator(new UserComparator3(var7)); // L: 2418
							}

							return 1; // L: 2420
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2423
							if (class67.friendsChat != null) { // L: 2424
								class67.friendsChat.addComparator(new UserComparator4(var7)); // L: 2425
							}

							return 1; // L: 2427
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2430
							if (class67.friendsChat != null) { // L: 2431
								class67.friendsChat.addComparator(new UserComparator5(var7)); // L: 2432
							}

							return 1; // L: 2434
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2437
							if (class67.friendsChat != null) { // L: 2438
								class67.friendsChat.addComparator(new UserComparator6(var7)); // L: 2439
							}

							return 1; // L: 2441
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2444
							if (class67.friendsChat != null) { // L: 2445
								class67.friendsChat.addComparator(new UserComparator7(var7)); // L: 2446
							}

							return 1; // L: 2448
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2451
							if (class67.friendsChat != null) { // L: 2452
								class67.friendsChat.addComparator(new UserComparator8(var7)); // L: 2453
							}

							return 1; // L: 2455
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2458
							if (class67.friendsChat != null) { // L: 2459
								class67.friendsChat.addComparator(new UserComparator9(var7)); // L: 2460
							}

							return 1; // L: 2462
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2465
							if (class67.friendsChat != null) { // L: 2466
								class67.friendsChat.addComparator(new UserComparator10(var7)); // L: 2467
							}

							return 1; // L: 2469
						} else if (var0 == 3655) {
							if (class67.friendsChat != null) { // L: 2472
								class67.friendsChat.sort(); // L: 2473
							}

							return 1; // L: 2475
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2478
							ClanSettings.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2479
							return 1; // L: 2480
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2483
							if (class67.friendsChat != null) { // L: 2484
								class67.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2485
							}

							return 1; // L: 2487
						} else {
							return 2; // L: 2489
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2312
					if (class67.friendsChat != null && var3 < class67.friendsChat.getSize() && ((ClanMate)class67.friendsChat.get(var3)).isIgnored()) { // L: 2313
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2314
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2316
					}

					return 1; // L: 2317
				}
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1401199237"
	)
	static int method2178() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1463
			int var0 = 0; // L: 1464

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1465
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1466
			}

			return var0 * 10000 / Client.field698; // L: 1468
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-235298598"
	)
	static final void method2177() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11898
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11899
			var1.method2105(); // L: 11900
		}

	} // L: 11902
}
