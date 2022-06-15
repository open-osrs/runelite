import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static ClanChannel field1386;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field1385;
	@ObfuscatedName("gx")
	static String field1387;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1731263595
	)
	static int field1389;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;B)I",
		garbageValue = "-4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) {
				return this.reversed ? -1 : 1; // L: 15
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lpe;I)Ljava/lang/String;",
		garbageValue = "-1070606136"
	)
	public static String method2580(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 20
			return null;
		} else {
			int var2 = 0; // L: 21

			int var3;
			for (var3 = var0.length(); var2 < var3 && class154.method3163(var0.charAt(var2)); ++var2) { // L: 22 23
			}

			while (var3 > var2 && class154.method3163(var0.charAt(var3 - 1))) { // L: 24
				--var3;
			}

			int var4 = var3 - var2; // L: 25
			if (var4 >= 1) { // L: 27
				byte var6;
				if (var1 == null) { // L: 31
					var6 = 12; // L: 32
				} else {
					switch(var1.field4618) { // L: 35
					case 4:
						var6 = 20; // L: 37
						break; // L: 38
					default:
						var6 = 12; // L: 40
					}
				}

				if (var4 <= var6) { // L: 44
					StringBuilder var12 = new StringBuilder(var4); // L: 48

					for (int var14 = var2; var14 < var3; ++var14) { // L: 49
						char var7 = var0.charAt(var14); // L: 50
						boolean var8;
						if (Character.isISOControl(var7)) { // L: 53
							var8 = false; // L: 54
						} else if (FloorOverlayDefinition.isAlphaNumeric(var7)) { // L: 57
							var8 = true; // L: 58
						} else {
							char[] var9 = class423.field4622; // L: 62
							int var10 = 0;

							label84:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class423.field4625; // L: 72

									for (var10 = 0; var10 < var9.length; ++var10) { // L: 73
										var11 = var9[var10]; // L: 74
										if (var11 == var7) { // L: 75
											var8 = true; // L: 76
											break label84; // L: 77
										}
									}

									var8 = false; // L: 81
									break;
								}

								var11 = var9[var10]; // L: 64
								if (var7 == var11) { // L: 65
									var8 = true; // L: 66
									break; // L: 67
								}

								++var10; // L: 63
							}
						}

						if (var8) { // L: 83
							char var13 = PacketBufferNode.method5203(var7); // L: 84
							if (var13 != 0) { // L: 85
								var12.append(var13); // L: 86
							}
						}
					}

					if (var12.length() == 0) { // L: 88
						return null;
					}

					return var12.toString(); // L: 89
				}
			}

			return null; // L: 46
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "24"
	)
	static final void method2586() {
		Client.field525 = Client.cycleCntr; // L: 12220
		class326.field4082 = true; // L: 12221
	} // L: 12222

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7108"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = EnumComposition.getPacketBufferNode(ClientPacket.field2942, Client.packetWriter.isaacCipher); // L: 12243
		var0.packetBuffer.writeByte(0); // L: 12244
		Client.packetWriter.addNode(var0); // L: 12245
	} // L: 12246
}
