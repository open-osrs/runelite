import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public class class107 extends class103 {
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -117380993
	)
	static int field1323;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1858672991
	)
	int field1321;
	@ObfuscatedName("t")
	byte field1320;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	final class106 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	class107(class106 var1) {
		this.this$0 = var1;
		this.field1321 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)V",
		garbageValue = "0"
	)
	void vmethod2562(Buffer var1) {
		this.field1321 = var1.readUnsignedShort();
		this.field1320 = var1.readByte();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1598392944"
	)
	void vmethod2567(ClanSettings var1) {
		var1.method2367(this.field1321, this.field1320);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "255"
	)
	static String method2292() {
		return Decimator.clientPreferences.hideUsername ? class16.method176(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2007790816"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Login.loginIndex = 2;
		if (var0) {
			Login.Login_password = "";
		}

		AttackOption.method2005();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	static final void method2290() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1530848539"
	)
	static void method2291() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (Huffman.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = Widget.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = UrlRequester.getWidget(var4);
					if (var5 != null) {
						AttackOption.invalidateWidget(var5);
					}
				}
			}
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static final void method2293() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		MouseHandler.method349();
		if (MouseRecorder.friendsChat != null) {
			MouseRecorder.friendsChat.clearFriends();
		}

	}
}
