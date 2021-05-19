import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class310 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -180112901
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-553080232"
	)
	public static final boolean method5484(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (class214.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class365.field4106; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class365.field4104; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) { // L: 41
					return true;
				}
			}

			return false; // L: 44
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1609458459"
	)
	static final void method5485(int var0, int var1) {
		if (Client.field847[var0] != null) { // L: 11566
			if (var1 >= 0 && var1 < Client.field847[var0].method39()) { // L: 11567
				class9 var2 = (class9)Client.field847[var0].field32.get(var1); // L: 11568
				if (var2.field76 == -1) { // L: 11569
					PacketWriter var3 = Client.packetWriter; // L: 11570
					PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2605, var3.isaacCipher); // L: 11571
					var4.packetBuffer.writeByte(3 + class4.stringCp1252NullTerminatedByteSize(var2.field73)); // L: 11572
					var4.packetBuffer.writeByte(var0); // L: 11573
					var4.packetBuffer.writeShort(var1); // L: 11574
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.field73); // L: 11575
					var3.addNode(var4); // L: 11576
				}
			}
		}
	} // L: 11577
}
