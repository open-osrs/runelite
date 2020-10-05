import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cg")
public abstract class Actor extends Entity {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2072659501
	)
	int x;
	@ObfuscatedName("an")
	boolean isWalking;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1621996049
	)
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -572229331
	)
	int rotation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1380153545
	)
	int field1014;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1649860163
	)
	int playerCycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1340931717
	)
	int idleSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1622912625
	)
	int turnLeftSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1928797643
	)
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 214300391
	)
	int walkSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1491970759
	)
	int walkBackSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -433468795
	)
	int walkLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1020521095
	)
	int walkRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1963413453
	)
	int runSequence;
	@ObfuscatedName("az")
	String overheadText;
	@ObfuscatedName("ad")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field986;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 885225201
	)
	int overheadTextCyclesRemaining;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 592862521
	)
	int overheadTextColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 231964227
	)
	int overheadTextEffect;
	@ObfuscatedName("ak")
	byte hitSplatCount;
	@ObfuscatedName("ac")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	int[] hitSplatValues;
	@ObfuscatedName("bc")
	int[] hitSplatCycles;
	@ObfuscatedName("bz")
	int[] hitSplatTypes2;
	@ObfuscatedName("bj")
	int[] hitSplatValues2;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1685554577
	)
	int targetIndex;
	@ObfuscatedName("bg")
	boolean false0;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 171916113
	)
	int field1000;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 450756931
	)
	int movementSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1637238895
	)
	int movementFrame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 784527629
	)
	int movementFrameCycle;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -218661123
	)
	int sequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1658984867
	)
	int sequenceFrame;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1886437137
	)
	int sequenceFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1364114839
	)
	int sequenceDelay;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1619964879
	)
	int field1009;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1569897565
	)
	int spotAnimation;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -475440643
	)
	int spotAnimationFrame;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -822724081
	)
	int spotAnimationFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1684193507
	)
	int field1013;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1581183769
	)
	int field1003;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1750260439
	)
	int field997;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 681617707
	)
	int field1015;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 653700287
	)
	int field1016;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1078271285
	)
	int field1017;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1924227991
	)
	int field1026;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1759966281
	)
	int field1019;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -480648449
	)
	int field1027;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1077536781
	)
	int npcCycle;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -446174757
	)
	int defaultHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1431847965
	)
	int orientation;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -813760125
	)
	int field1024;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -2006946605
	)
	int field1025;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -775156313
	)
	int pathLength;
	@ObfuscatedName("cm")
	int[] pathX;
	@ObfuscatedName("cu")
	int[] pathY;
	@ObfuscatedName("cw")
	byte[] pathTraversed;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 829057405
	)
	int field1032;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1400209301
	)
	int field973;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1014 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.overheadText = null; // L: 24
		this.field986 = false; // L: 26
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
		this.field1000 = -1; // L: 40
		this.movementSequence = -1; // L: 41
		this.movementFrame = 0; // L: 42
		this.movementFrameCycle = 0; // L: 43
		this.sequence = -1; // L: 44
		this.sequenceFrame = 0; // L: 45
		this.sequenceFrameCycle = 0; // L: 46
		this.sequenceDelay = 0; // L: 47
		this.field1009 = 0; // L: 48
		this.spotAnimation = -1; // L: 49
		this.spotAnimationFrame = 0; // L: 50
		this.spotAnimationFrameCycle = 0; // L: 51
		this.npcCycle = 0; // L: 61
		this.defaultHeight = 200; // L: 62
		this.field1024 = 0; // L: 64
		this.field1025 = 32; // L: 65
		this.pathLength = 0; // L: 66
		this.pathX = new int[10]; // L: 67
		this.pathY = new int[10]; // L: 68
		this.pathTraversed = new byte[10]; // L: 69
		this.field1032 = 0; // L: 70
		this.field973 = 0; // L: 71
	} // L: 73

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "68470795"
	)
	boolean isVisible() {
		return false; // L: 81
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	final void method1797() {
		this.pathLength = 0; // L: 76
		this.field973 = 0; // L: 77
	} // L: 78

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "733671711"
	)
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 85
		boolean var8 = true; // L: 86

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 87
			if (this.hitSplatCycles[var9] > var5) { // L: 88
				var7 = false;
			} else {
				var8 = false; // L: 89
			}
		}

		var9 = -1; // L: 91
		int var10 = -1; // L: 92
		int var11 = 0; // L: 93
		if (var1 >= 0) { // L: 94
			HitSplatDefinition var12 = MusicPatchNode.method3929(var1); // L: 95
			var10 = var12.field3365; // L: 96
			var11 = var12.field3356; // L: 97
		}

		int var14;
		if (var8) { // L: 99
			if (var10 == -1) { // L: 100
				return;
			}

			var9 = 0; // L: 101
			var14 = 0; // L: 102
			if (var10 == 0) { // L: 103
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 104
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 105
				if (var10 == 0) { // L: 106
					if (this.hitSplatCycles[var13] < var14) { // L: 107
						var9 = var13; // L: 108
						var14 = this.hitSplatCycles[var13]; // L: 109
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 112 113
					var9 = var13; // L: 114
					var14 = this.hitSplatValues[var13]; // L: 115
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 119
				return;
			}
		} else {
			if (var7) { // L: 122
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 123
				byte var15 = this.hitSplatCount; // L: 124
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 125
				if (this.hitSplatCycles[var15] <= var5) { // L: 126
					var9 = var15; // L: 127
					break; // L: 128
				}
			}
		}

		if (var9 >= 0) { // L: 132
			this.hitSplatTypes[var9] = var1; // L: 133
			this.hitSplatValues[var9] = var2; // L: 134
			this.hitSplatTypes2[var9] = var3; // L: 135
			this.hitSplatValues2[var9] = var4; // L: 136
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 137
		}
	} // L: 138

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-47"
	)
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class204.method3780(var1); // L: 141
		HealthBar var8 = null; // L: 142
		HealthBar var9 = null; // L: 143
		int var10 = var7.int2; // L: 144
		int var11 = 0; // L: 145

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 146
			++var11; // L: 147
			if (var12.definition.field3314 == var7.field3314) { // L: 148
				var12.put(var2 + var4, var5, var6, var3); // L: 149
				return; // L: 150
			}

			if (var12.definition.int1 <= var7.int1) { // L: 152
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 153
				var9 = var12; // L: 154
				var10 = var12.definition.int2; // L: 155
			}
		}

		if (var9 != null || var11 < 4) { // L: 158
			var12 = new HealthBar(var7); // L: 159
			if (var8 == null) { // L: 160
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 161
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 162
			if (var11 >= 4) { // L: 163
				var9.remove();
			}

		}
	} // L: 164

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class204.method3780(var1); // L: 167

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 168
			if (var2 == var3.definition) { // L: 169
				var3.remove(); // L: 170
				return; // L: 171
			}
		}

	} // L: 174

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1035211538"
	)
	public static void method1810() {
		ObjectDefinition.ObjectDefinition_cached.clear(); // L: 416
		ObjectDefinition.ObjectDefinition_cachedModelData.clear(); // L: 417
		ObjectDefinition.ObjectDefinition_cachedEntities.clear(); // L: 418
		ObjectDefinition.ObjectDefinition_cachedModels.clear(); // L: 419
	} // L: 420

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "736101233"
	)
	static int method1798(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 1913
			if (class60.friendSystem.field1099 == 0) { // L: 1914
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (class60.friendSystem.field1099 == 1) { // L: 1915
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.friendsList.getSize(); // L: 1916
			}

			return 1; // L: 1917
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1920
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) { // L: 1921
					Friend var8 = (Friend)class60.friendSystem.friendsList.get(var3); // L: 1922
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var8.getName(); // L: 1923
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 1924
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1927
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1928
				}

				return 1; // L: 1930
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1933
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) { // L: 1934
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class60.friendSystem.friendsList.get(var3)).world; // L: 1935
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1937
				}

				return 1; // L: 1938
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1941
				if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.friendsList.getSize()) { // L: 1942
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class60.friendSystem.friendsList.get(var3)).rank; // L: 1943
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1945
				}

				return 1; // L: 1946
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1949
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1950
					class279.method5092(var5, var6); // L: 1951
					return 1; // L: 1952
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1955
					class60.friendSystem.addFriend(var5); // L: 1956
					return 1; // L: 1957
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1960
					class60.friendSystem.removeFriend(var5); // L: 1961
					return 1; // L: 1962
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1965
					class60.friendSystem.addIgnore(var5); // L: 1966
					return 1; // L: 1967
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1970
					class60.friendSystem.removeIgnore(var5); // L: 1971
					return 1; // L: 1972
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 1975
					var5 = SecureRandomCallable.method1202(var5); // L: 1976
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.isFriended(new Username(var5, WorldMapAreaData.loginType), false) ? 1 : 0; // L: 1977
					return 1; // L: 1978
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (Entity.clanChat != null) { // L: 1981
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Entity.clanChat.name; // L: 1982
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1984
					}

					return 1; // L: 1985
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (Entity.clanChat != null) { // L: 1988
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Entity.clanChat.getSize(); // L: 1989
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1991
					}

					return 1; // L: 1992
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1995
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize()) { // L: 1996
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Entity.clanChat.get(var3).getUsername().getName(); // L: 1997
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 1999
					}

					return 1; // L: 2000
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2003
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize()) { // L: 2004
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Entity.clanChat.get(var3)).getWorld(); // L: 2005
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2007
					}

					return 1; // L: 2008
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2011
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize()) { // L: 2012
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Entity.clanChat.get(var3)).rank; // L: 2013
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2015
					}

					return 1; // L: 2016
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Entity.clanChat != null ? Entity.clanChat.minKick : 0; // L: 2019
					return 1; // L: 2020
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2023
					Frames.clanKickUser(var5); // L: 2024
					return 1; // L: 2025
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Entity.clanChat != null ? Entity.clanChat.rank * 996591213 * 253506405 : 0; // L: 2028
					return 1; // L: 2029
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2032
					MusicPatchNode.Clan_joinChat(var5); // L: 2033
					return 1; // L: 2034
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					AbstractByteArrayCopier.Clan_leaveChat(); // L: 2037
					return 1; // L: 2038
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class60.friendSystem.method1972()) { // L: 2041
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.ignoreList.getSize(); // L: 2042
					}

					return 1; // L: 2043
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2046
					if (class60.friendSystem.method1972() && var3 >= 0 && var3 < class60.friendSystem.ignoreList.getSize()) { // L: 2047
						Ignored var4 = (Ignored)class60.friendSystem.ignoreList.get(var3); // L: 2048
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2049
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2050
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2053
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2054
					}

					return 1; // L: 2056
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Varps.Interpreter_stringStackSize]; // L: 2059
					var5 = SecureRandomCallable.method1202(var5); // L: 2060
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.friendSystem.isIgnored(new Username(var5, WorldMapAreaData.loginType)) ? 1 : 0; // L: 2061
					return 1; // L: 2062
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2065
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize() && Entity.clanChat.get(var3).getUsername().equals(WorldMapLabelSize.localPlayer.username)) { // L: 2066
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2067
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2069
					}

					return 1; // L: 2070
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (Entity.clanChat != null && Entity.clanChat.owner != null) { // L: 2073
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = Entity.clanChat.owner; // L: 2074
					} else {
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = ""; // L: 2076
					}

					return 1; // L: 2077
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2080
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize() && ((ClanMate)Entity.clanChat.get(var3)).isFriend()) { // L: 2081
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2082
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2084
					}

					return 1; // L: 2085
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class60.friendSystem.friendsList.removeComparator(); // L: 2096
						return 1; // L: 2097
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2100
							class60.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2101
							return 1; // L: 2102
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2105
							class60.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2106
							return 1; // L: 2107
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2110
							class60.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2115
							class60.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2116
							return 1; // L: 2117
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2120
							class60.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2121
							return 1; // L: 2122
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2125
							class60.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2126
							return 1; // L: 2127
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2130
							class60.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2131
							return 1; // L: 2132
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2135
							class60.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2140
							class60.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2141
							return 1; // L: 2142
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2145
							class60.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2146
							return 1; // L: 2147
						} else if (var0 == 3639) {
							class60.friendSystem.friendsList.sort(); // L: 2150
							return 1; // L: 2151
						} else if (var0 == 3640) {
							class60.friendSystem.ignoreList.removeComparator(); // L: 2154
							return 1; // L: 2155
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2158
							class60.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2163
							class60.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3643) {
							class60.friendSystem.ignoreList.sort(); // L: 2168
							return 1; // L: 2169
						} else if (var0 == 3644) {
							if (Entity.clanChat != null) { // L: 2172
								Entity.clanChat.removeComparator(); // L: 2173
							}

							return 1; // L: 2175
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2178
							if (Entity.clanChat != null) { // L: 2179
								Entity.clanChat.addComparator(new UserComparator1(var7)); // L: 2180
							}

							return 1; // L: 2182
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2185
							if (Entity.clanChat != null) { // L: 2186
								Entity.clanChat.addComparator(new UserComparator2(var7)); // L: 2187
							}

							return 1; // L: 2189
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2192
							if (Entity.clanChat != null) { // L: 2193
								Entity.clanChat.addComparator(new UserComparator3(var7)); // L: 2194
							}

							return 1; // L: 2196
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2199
							if (Entity.clanChat != null) { // L: 2200
								Entity.clanChat.addComparator(new UserComparator4(var7)); // L: 2201
							}

							return 1; // L: 2203
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2206
							if (Entity.clanChat != null) { // L: 2207
								Entity.clanChat.addComparator(new UserComparator5(var7)); // L: 2208
							}

							return 1; // L: 2210
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2213
							if (Entity.clanChat != null) { // L: 2214
								Entity.clanChat.addComparator(new UserComparator6(var7)); // L: 2215
							}

							return 1; // L: 2217
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2220
							if (Entity.clanChat != null) { // L: 2221
								Entity.clanChat.addComparator(new UserComparator7(var7)); // L: 2222
							}

							return 1; // L: 2224
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2227
							if (Entity.clanChat != null) { // L: 2228
								Entity.clanChat.addComparator(new UserComparator8(var7)); // L: 2229
							}

							return 1; // L: 2231
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2234
							if (Entity.clanChat != null) { // L: 2235
								Entity.clanChat.addComparator(new UserComparator9(var7)); // L: 2236
							}

							return 1; // L: 2238
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2241
							if (Entity.clanChat != null) { // L: 2242
								Entity.clanChat.addComparator(new UserComparator10(var7)); // L: 2243
							}

							return 1; // L: 2245
						} else if (var0 == 3655) {
							if (Entity.clanChat != null) { // L: 2248
								Entity.clanChat.sort(); // L: 2249
							}

							return 1; // L: 2251
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2254
							class60.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2255
							return 1; // L: 2256
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2259
							if (Entity.clanChat != null) { // L: 2260
								Entity.clanChat.addComparator(new BuddyRankComparator(var7)); // L: 2261
							}

							return 1; // L: 2263
						} else {
							return 2; // L: 2265
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2088
					if (Entity.clanChat != null && var3 < Entity.clanChat.getSize() && ((ClanMate)Entity.clanChat.get(var3)).isIgnored()) { // L: 2089
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2090
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2092
					}

					return 1; // L: 2093
				}
			}
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	static final void method1805() {
		class2.method41(); // L: 2529
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2531
		KitDefinition.KitDefinition_cached.clear(); // L: 2534
		method1810(); // L: 2536
		NPCDefinition.NpcDefinition_cached.clear(); // L: 2538
		NPCDefinition.NpcDefinition_cachedModels.clear(); // L: 2539
		GameObject.method3412(); // L: 2541
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2543
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2544
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2547
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2548
		NetSocket.method3626(); // L: 2550
		GrandExchangeEvents.method143(); // L: 2551
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 2553
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 2554
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 2555
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 2558
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 2559
		ArchiveDiskAction.method4233(); // L: 2561
		CollisionMap.method3653(); // L: 2562
		Varps.method4066(); // L: 2563
		PlayerAppearance.PlayerAppearance_cachedModels.clear(); // L: 2565
		SecureRandomCallable.method1203(); // L: 2567
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2568
		Script.Script_cached.clear(); // L: 2569
		class182.archive0.clearFiles(); // L: 2570
		Client.archive1.clearFiles(); // L: 2571
		WorldMapID.archive3.clearFiles(); // L: 2572
		GrandExchangeOfferUnitPriceComparator.archive4.clearFiles(); // L: 2573
		WorldMapLabel.archive5.clearFiles(); // L: 2574
		CollisionMap.archive6.clearFiles(); // L: 2575
		WorldMapSection1.archive7.clearFiles(); // L: 2576
		Huffman.archive8.clearFiles(); // L: 2577
		UrlRequester.archive9.clearFiles(); // L: 2578
		Occluder.archive10.clearFiles(); // L: 2579
		GrandExchangeEvent.archive11.clearFiles(); // L: 2580
		ApproximateRouteStrategy.archive12.clearFiles(); // L: 2581
	} // L: 2582

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1341362245"
	)
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 3963
			byte var2 = 4; // L: 3964
			int var3 = var2 + 6; // L: 3965
			int var4 = var2 + 6; // L: 3966
			int var5 = ItemDefinition.fontPlain12.lineWidth(var0, 250); // L: 3967
			int var6 = ItemDefinition.fontPlain12.lineCount(var0, 250) * 13; // L: 3968
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 3969
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var2 + var6, 16777215); // L: 3970
			ItemDefinition.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 3971
			int var7 = var3 - var2; // L: 3972
			int var8 = var4 - var2; // L: 3973
			int var9 = var5 + var2 + var2; // L: 3974
			int var10 = var2 + var6 + var2; // L: 3975

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 3977
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 3978
					Client.field882[var11] = true;
				}
			}

			if (var1) { // L: 3981
				WorldMapSprite.rasterProvider.drawFull(0, 0); // L: 3982
			} else {
				HealthBarUpdate.method1817(var3, var4, var5, var6); // L: 3985
			}

		}
	} // L: 3987
}
