import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("na")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1971678933
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1205835661
	)
	int field4299;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lpj;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 18
		this.field4299 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "-1695844600"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnb;",
		garbageValue = "1788836658"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lqv;ZB)Z",
		garbageValue = "-17"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) {
			return false; // L: 34
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "78"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte(); // L: 45
				int var8 = var1.readUnsignedByte(); // L: 46
				boolean var9 = (var8 & 2) != 0; // L: 47
				boolean var10 = (var8 & 1) != 0; // L: 48
				if (var6 > 0) { // L: 49
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var12 != var11) { // L: 59
							if (var11 != null) { // L: 60
								this.remove(var12); // L: 61
							} else {
								var11 = var12; // L: 64
							}
						}
					}

					if (var11 != null) { // L: 68
						this.changeName(var11, var4, var5); // L: 69
						if (var6 != var11.world) { // L: 70
							boolean var14 = true; // L: 71

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 72
								if (var13.username.equals(var4)) { // L: 73
									if (var6 != 0 && var13.world == 0) { // L: 74
										var13.remove(); // L: 75
										var14 = false; // L: 76
									} else if (var6 == 0 && var13.world != 0) { // L: 78
										var13.remove(); // L: 79
										var14 = false; // L: 80
									}
								}
							}

							if (var14) { // L: 84
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 87
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 88
					}

					if (var6 != var11.world) { // L: 91
						var11.int2 = ++this.field4299 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * -1393296031) * 960063137;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4311 = var9; // L: 97
					var11.field4312 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbb;ZB)I",
		garbageValue = "8"
	)
	static int method6454(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : KeyHandler.scriptActiveWidget; // L: 1101
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1102
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.x; // L: 1103
			return 1; // L: 1104
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1106
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.y; // L: 1107
			return 1; // L: 1108
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1110
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.width; // L: 1111
			return 1; // L: 1112
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1114
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.height; // L: 1115
			return 1; // L: 1116
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1118
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1119
			return 1; // L: 1120
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1122
			Interpreter.Interpreter_intStack[++class12.Interpreter_intStackSize - 1] = var3.parentId; // L: 1123
			return 1; // L: 1124
		} else {
			return 2; // L: 1126
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILkd;ZB)V",
		garbageValue = "20"
	)
	static void method6449(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = MilliClock.getWorldMap().getMapArea(var0); // L: 4737
		int var4 = ModelData0.localPlayer.plane; // L: 4738
		int var5 = (ModelData0.localPlayer.x >> 7) + SecureRandomCallable.baseX; // L: 4739
		int var6 = (ModelData0.localPlayer.y >> 7) + GrandExchangeOfferOwnWorldComparator.baseY; // L: 4740
		Coord var7 = new Coord(var4, var5, var6); // L: 4741
		MilliClock.getWorldMap().method7039(var3, var7, var1, var2); // L: 4742
	} // L: 4743
}
