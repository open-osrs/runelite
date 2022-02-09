import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mi")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 759780713
	)
	int field4127;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.field4127 = 1; // L: 14
		this.friendLoginUpdates = new LinkDeque(); // L: 15
		this.loginType = var1;
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lmy;",
		garbageValue = "2000225121"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 24
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lmy;",
		garbageValue = "55"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 29
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpb;ZI)Z",
		garbageValue = "-770793649"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 33
		if (var3 == null) { // L: 34
			return false;
		} else {
			return !var2 || var3.world != 0; // L: 35
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "8"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 40
				boolean var3 = var1.readUnsignedByte() == 1; // L: 41
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 42
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 43
				int var6 = var1.readUnsignedShort(); // L: 44
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated(); // L: 50
					var1.readUnsignedByte(); // L: 51
					var1.readInt(); // L: 52
				}

				var1.readStringCp1252NullTerminated(); // L: 54
				if (var4 != null && var4.hasCleanName()) { // L: 55
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 56
					if (var3) { // L: 57
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 58
						if (var12 != null && var11 != var12) { // L: 59
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

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
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
						var11.int2 = ++this.field4127 - 1; // L: 92
						if (var11.world == -1 && var6 == 0) { // L: 93
							var11.int2 = -(var11.int2 * 650111289) * 2142778633;
						}

						var11.world = var6; // L: 94
					}

					var11.rank = var7; // L: 96
					var11.field4133 = var9; // L: 97
					var11.field4134 = var10; // L: 98
					continue; // L: 99
				}

				throw new IllegalStateException(); // L: 72
			}

			this.sort(); // L: 100
			return; // L: 101
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-428175274"
	)
	static void method6282(File var0) {
		SecureRandomCallable.FileSystem_cacheDir = var0; // L: 16
		if (!SecureRandomCallable.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-490218334"
	)
	static int method6283(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1362
			var5 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1363
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemId; // L: 1364
			return 1; // L: 1365
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1367
			var5 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1368
			if (var5.itemId != -1) { // L: 1369
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1370
			}

			return 1; // L: 1371
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1373
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1374
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1375
			if (var4 != null) { // L: 1376
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1377
			}

			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1380
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1381
			return 1; // L: 1382
		} else {
			return 2; // L: 1384
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "-56"
	)
	public static final void method6281(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			PcmPlayer.field305 = var0; // L: 46
			PcmPlayer.PcmPlayer_stereo = var1; // L: 47
			DevicePcmPlayerProvider.field156 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49
}
