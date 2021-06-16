import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public abstract class class343 implements class214 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	class375 field3924;

	class343(int var1) {
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-1006321266"
	)
	abstract void vmethod6077(Buffer var1, int var2);

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-2064643819"
	)
	public void method6070(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 60
			}

			class339[] var3 = new class339[]{class339.field3916, class339.field3914, class339.field3913, class339.field3915}; // L: 21
			class339 var4 = (class339)Clock.findEnumerated(var3, var2); // L: 23
			if (var4 != null) { // L: 24
				switch(var4.field3912) { // L: 25
				case 0:
					int var5 = var1.readUnsignedByte(); // L: 27
					int var7 = class373.field4126[var5]; // L: 30
					class375 var6;
					if (var7 == 1) { // L: 31
						var6 = class375.field4134; // L: 32
					} else if (var7 == 2) { // L: 35
						var6 = class375.field4128; // L: 36
					} else if (var7 == 3) { // L: 39
						var6 = class375.field4127; // L: 40
					} else {
						var6 = null; // L: 43
					}

					this.field3924 = var6; // L: 45
					if (this.field3924 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5); // L: 46
				case 1:
					var1.readStringCp1252NullCircumfixed(); // L: 54
					break;
				case 2:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4); // L: 49
				case 3:
					Clock.findEnumerated(LoginPacket.method4510(), var1.readUnsignedByte()); // L: 51
				}
			} else {
				this.vmethod6077(var1, var2); // L: 58
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "826495123"
	)
	boolean method6072() {
		return this.field3924 != null; // L: 65
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "1136165556"
	)
	Object method6073() {
		if (this.field3924 == class375.field4134) { // L: 69
			return 0; // L: 70
		} else if (this.field3924 == class375.field4127) { // L: 72
			return -1L; // L: 73
		} else {
			return this.field3924 == class375.field4128 ? "" : null; // L: 75 76 78
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "900256799"
	)
	static final boolean method6080(Widget var0) {
		int var1 = var0.contentType; // L: 11285
		if (var1 == 205) { // L: 11286
			Client.logoutTimer = 250; // L: 11287
			return true; // L: 11288
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11290
				var2 = (var1 - 300) / 2; // L: 11291
				var3 = var1 & 1; // L: 11292
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11293
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11295
				var2 = (var1 - 314) / 2; // L: 11296
				var3 = var1 & 1; // L: 11297
				Client.playerAppearance.method4820(var2, var3 == 1); // L: 11298
			}

			if (var1 == 324) { // L: 11300
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 11301
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11302
				PacketBufferNode var4 = InterfaceParent.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher); // L: 11304
				Client.playerAppearance.write(var4.packetBuffer); // L: 11305
				Client.packetWriter.addNode(var4); // L: 11306
				return true; // L: 11307
			} else {
				return false; // L: 11309
			}
		}
	}
}
