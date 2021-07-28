import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class376 implements Enumerated {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -35971817
	)
	static int field4165;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final class376 field4163;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final class376 field4159;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	public static final class376 field4164;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -76089707
	)
	final int field4161;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 39384277
	)
	public final int field4158;
	@ObfuscatedName("n")
	public final Class field4160;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public final class372 field4162;

	static {
		field4163 = new class376(0, 0, Integer.class, new class373());
		field4159 = new class376(2, 1, Long.class, new class375());
		field4164 = new class376(1, 2, String.class, new class377());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnd;)V"
	)
	class376(int var1, int var2, Class var3, class372 var4) {
		this.field4161 = var1;
		this.field4158 = var2;
		this.field4160 = var3;
		this.field4162 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4158;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)Ljava/lang/Object;",
		garbageValue = "39428313"
	)
	public Object method6561(Buffer var1) {
		return this.field4162.vmethod6565(var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static final void method6562(String var0) {
		PacketBufferNode var1 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2603, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lio;Lfh;IIZI)V",
		garbageValue = "1545496664"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			PcmPlayer.insertMenuItem(var7, ScriptFrame.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lio;B)Z",
		garbageValue = "0"
	)
	static final boolean method6560(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4724(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
