import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 1760304111
	)
	static int field552;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1649848391
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("l")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("m")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "181624025"
	)
	public static void method1224(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("l")
	public static int method1228(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 52
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1190180925"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 212
			return true;
		} else if (!Decimator.Widget_archive.tryLoadGroup(var0)) { // L: 213
			return false;
		} else {
			int var1 = Decimator.Widget_archive.getGroupFileCount(var0); // L: 214
			if (var1 == 0) { // L: 215
				Widget.Widget_loadedInterfaces[var0] = true; // L: 216
				return true; // L: 217
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 219
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 220
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 221
						byte[] var3 = Decimator.Widget_archive.takeFile(var0, var2); // L: 222
						if (var3 != null) { // L: 223
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 224
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 225
							if (var3[0] == -1) { // L: 226
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 227
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 231
				return true; // L: 232
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-398927315"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 3836
			if (loadInterface(var0)) { // L: 3837
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 3838

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 3839
					Widget var3 = var1[var2]; // L: 3840
					if (var3.onLoad != null) { // L: 3841
						ScriptEvent var4 = new ScriptEvent(); // L: 3842
						var4.widget = var3; // L: 3843
						var4.args = var3.onLoad; // L: 3844
						class58.runScript(var4, 5000000); // L: 3845
					}
				}

			}
		}
	} // L: 3848

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-3110189"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (DevicePcmPlayerProvider.clanChat != null) { // L: 11494
			PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher); // L: 11495
			var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0)); // L: 11496
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11497
			Client.packetWriter.addNode(var1); // L: 11498
		}
	} // L: 11499
}
