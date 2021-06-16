import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class19 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2755229533790487225L
	)
	long field155;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -2197636962351973129L
	)
	long field152;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field153;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public class19(Buffer var1) {
		this.field152 = -1L; // L: 9
		this.field153 = new IterableNodeDeque(); // L: 10
		this.method277(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1965655263"
	)
	void method277(Buffer var1) {
		this.field155 = var1.readLong();
		this.field152 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 24 35
			Object var3;
			if (var2 == 1) {
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this); // L: 28
			} else if (var2 == 3) {
				var3 = new class5(this);
			} else if (var2 == 2) { // L: 30
				var3 = new class20(this);
			} else {
				if (var2 != 5) { // L: 31
					throw new RuntimeException(""); // L: 32
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod331(var1); // L: 33
			this.field153.addFirst((Node)var3); // L: 34
		}

	} // L: 37

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-11264917"
	)
	public void method278(ClanChannel var1) {
		if (var1.key == this.field155 && var1.field25 == this.field152) { // L: 40
			for (class16 var2 = (class16)this.field153.last(); var2 != null; var2 = (class16)this.field153.previous()) { // L: 41
				var2.vmethod332(var1); // L: 42
			}

			++var1.field25; // L: 44
		} else {
			throw new RuntimeException("");
		}
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lmo;I)Lmo;",
		garbageValue = "1921289241"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = UrlRequester.method2504(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated()); // L: 25
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "6"
	)
	static int method276(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3571
			ChatChannel.Interpreter_intStackSize -= 2; // L: 3572
			Client.field876 = (short)ScriptFrame.method1233(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]); // L: 3573
			if (Client.field876 <= 0) { // L: 3574
				Client.field876 = 256;
			}

			Client.field877 = (short)ScriptFrame.method1233(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]); // L: 3575
			if (Client.field877 <= 0) { // L: 3576
				Client.field877 = 256;
			}

			return 1; // L: 3577
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3579
			ChatChannel.Interpreter_intStackSize -= 2; // L: 3580
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3581
			if (Client.zoomHeight <= 0) { // L: 3582
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3583
			if (Client.zoomWidth <= 0) { // L: 3584
				Client.zoomWidth = 320;
			}

			return 1; // L: 3585
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3587
			ChatChannel.Interpreter_intStackSize -= 4; // L: 3588
			Client.field880 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3589
			if (Client.field880 <= 0) { // L: 3590
				Client.field880 = 1;
			}

			Client.field864 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3591
			if (Client.field864 <= 0) { // L: 3592
				Client.field864 = 32767;
			} else if (Client.field864 < Client.field880) { // L: 3593
				Client.field864 = Client.field880;
			}

			Client.field881 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 3594
			if (Client.field881 <= 0) { // L: 3595
				Client.field881 = 1;
			}

			Client.field690 = (short)Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 3596
			if (Client.field690 <= 0) { // L: 3597
				Client.field690 = 32767;
			} else if (Client.field690 < Client.field881) { // L: 3598
				Client.field690 = Client.field881;
			}

			return 1; // L: 3599
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3601
			if (Client.viewportWidget != null) { // L: 3602
				Interpreter.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3603
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3604
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3605
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3608
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3609
			}

			return 1; // L: 3611
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3613
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3614
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3615
			return 1; // L: 3616
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3618
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class17.method258(Client.field876); // L: 3619
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class17.method258(Client.field877); // L: 3620
			return 1; // L: 3621
		} else if (var0 == 6220) { // L: 3623
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3624
			return 1; // L: 3625
		} else if (var0 == 6221) { // L: 3627
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3628
			return 1; // L: 3629
		} else if (var0 == 6222) { // L: 3631
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AttackOption.canvasWidth; // L: 3632
			return 1; // L: 3633
		} else if (var0 == 6223) { // L: 3635
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class0.canvasHeight; // L: 3636
			return 1; // L: 3637
		} else {
			return 2; // L: 3639
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1156700824"
	)
	static final void method281(boolean var0) {
		if (var0) { // L: 3181
			Client.field656 = Login.field1022 ? class126.field1472 : class126.field1471; // L: 3182
		} else {
			Client.field656 = class4.clientPreferences.parameters.containsKey(class125.method2586(Login.Login_username)) ? class126.field1478 : class126.field1475; // L: 3185
		}

	} // L: 3187

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2012334489"
	)
	static void method282() {
		if (class80.worldMap != null) { // L: 4364
			class80.worldMap.method6287(SoundSystem.Client_plane, (class262.localPlayer.x >> 7) + class15.baseX, (class262.localPlayer.y >> 7) + WorldMapSprite.baseY, false); // L: 4365
			class80.worldMap.loadCache(); // L: 4366
		}

	} // L: 4368

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1620053364"
	)
	static String method283(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11574
		if (Client.gameBuild == 1) { // L: 11575
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11576
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11577
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11578
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11579
			var0 = "local";
		}

		String var3 = ""; // L: 11580
		if (Messages.field1397 != null) { // L: 11581
			var3 = "/p=" + Messages.field1397;
		}

		String var4 = "runescape.com"; // L: 11582
		return var2 + var0 + "." + var4 + "/l=" + AbstractArchive.clientLanguage + "/a=" + class82.field999 + var3 + "/"; // L: 11583
	}
}
