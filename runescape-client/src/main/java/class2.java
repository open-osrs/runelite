import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class2 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1819318139
	)
	static int field20;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -5109163209193777569L
	)
	long field18;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1849981899
	)
	int field13;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	IterableNodeDeque field14;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	public class2(Buffer var1) {
		this.field13 = -1; // L: 9
		this.field14 = new IterableNodeDeque(); // L: 10
		this.method23(var1); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "834353065"
	)
	void method23(Buffer var1) {
		this.field18 = var1.readLong(); // L: 32
		this.field13 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class13(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class8(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class26(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class22(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class23(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class21(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class18(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class6(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class0(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class4(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class1(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class15(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod363(var1); // L: 53
			this.field14.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;B)V",
		garbageValue = "-59"
	)
	public void method24(ClanSettings var1) {
		if (var1.field82 == this.field18 && this.field13 == var1.field83) { // L: 60
			for (class14 var2 = (class14)this.field14.last(); var2 != null; var2 = (class14)this.field14.previous()) { // L: 61
				var2.vmethod354(var1); // L: 62
			}

			++var1.field83; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		PcmPlayer.logOut(); // L: 3151
		switch(var0) { // L: 3152
		case 1:
			Login.loginIndex = 24; // L: 3156
			CollisionMap.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 3157
			break;
		case 2:
			GameObject.method4432(); // L: 3163
		}

	} // L: 3167
}
