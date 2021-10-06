import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class392 implements MouseWheel {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class392 field4266;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class392 field4273;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class392 field4264;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static StudioGame field4267;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 2078867917
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1376860317
	)
	final int field4263;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -490684947
	)
	public final int field4260;
	@ObfuscatedName("k")
	public final Class field4265;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	final class388 field4261;

	static {
		field4266 = new class392(1, 0, Integer.class, new class389());
		field4273 = new class392(2, 1, Long.class, new class391());
		field4264 = new class392(0, 2, String.class, new class393());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnb;)V"
	)
	class392(int var1, int var2, Class var3, class388 var4) {
		this.field4263 = var1;
		this.field4260 = var2;
		this.field4265 = var3;
		this.field4261 = var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661199397"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4260;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)Ljava/lang/Object;",
		garbageValue = "15"
	)
	public Object method6800(Buffer var1) {
		return this.field4261.vmethod6822(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lot;I)V",
		garbageValue = "-20110377"
	)
	public static void method6797(Object var0, Buffer var1) {
		class388 var2 = method6798(var0.getClass());
		var2.vmethod6815(var0, var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lnb;",
		garbageValue = "1660700582"
	)
	static class388 method6798(Class var0) {
		class392[] var2 = new class392[]{field4266, field4264, field4273};
		class392[] var3 = var2;
		int var4 = 0;

		class392 var1;
		while (true) {
			if (var4 >= var3.length) {
				var1 = null;
				break;
			}

			class392 var5 = var3[var4];
			if (var5.field4265 == var0) {
				var1 = var5;
				break;
			}

			++var4;
		}

		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4261;
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "11165"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field708 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class12.getWindowedMode() == 1) {
			class21.client.setMaxCanvasSize(765, 503);
		} else {
			class21.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2718, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class12.getWindowedMode());
			var1.packetBuffer.writeShort(Huffman.canvasWidth);
			var1.packetBuffer.writeShort(MouseRecorder.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
