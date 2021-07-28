import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class116 extends class119 {
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 413358465
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1705350263
	)
	int field1394;
	@ObfuscatedName("t")
	byte field1395;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 832856967
	)
	int field1391;
	@ObfuscatedName("j")
	String field1393;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	final class120 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	class116(class120 var1) {
		this.this$0 = var1;
		this.field1394 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "1209873443"
	)
	void vmethod2558(Buffer var1) {
		var1.readUnsignedByte();
		this.field1394 = var1.readUnsignedShort();
		this.field1395 = var1.readByte();
		this.field1391 = var1.readUnsignedShort();
		var1.readLong();
		this.field1393 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-7"
	)
	void vmethod2555(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1394);
		var2.rank = this.field1395;
		var2.world = this.field1391;
		var2.username = new Username(this.field1393);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lbd;",
		garbageValue = "-2105993700"
	)
	static Script method2440(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = ApproximateRouteStrategy.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = ApproximateRouteStrategy.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = ModelData0.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
