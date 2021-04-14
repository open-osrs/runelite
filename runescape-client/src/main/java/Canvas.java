import java.awt.Component;
import java.awt.Graphics;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("a")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("eo")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("f")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lig;IIIBZI)V",
		garbageValue = "-501107063"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 223
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 224
		if (var8 == null) { // L: 225
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 226
			if (var8 == null) { // L: 227
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 228
				if (var8 != null) { // L: 229
					if (var5) { // L: 230
						var8.removeDual(); // L: 231
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 232
						--NetCache.NetCache_pendingWritesCount; // L: 233
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 234
					}

				} else {
					if (!var5) { // L: 238
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 239
						if (var8 != null) { // L: 240
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 242
					var8.archive = var0; // L: 243
					var8.crc = var3; // L: 244
					var8.padding = var4; // L: 245
					if (var5) { // L: 246
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 247
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 248
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 251
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 252
						++NetCache.NetCache_pendingWritesCount; // L: 253
					}

				}
			}
		}
	} // L: 236 255

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1588134058"
	)
	static void method481() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 208
			Login.currentLoginField = 1; // L: 209
		} else {
			Login.currentLoginField = 0; // L: 212
		}

	} // L: 214

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	@Export("updateSoundEffectVolume")
	static final void updateSoundEffectVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11175
		Login.clientPreferences.soundEffectsVolume = var0; // L: 11176
		Message.savePreferences(); // L: 11177
	} // L: 11178
}
