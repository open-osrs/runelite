import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("l")
	@Export("state")
	byte state;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1281987013
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -552663155
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1035394057
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 8664505
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1081967489
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-756750295"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2063429375"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1077740822"
	)
	void method5407(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method5405(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1182126654"
	)
	static boolean method5406(String var0) {
		if (var0 == null) {
			return false;
		} else {
			try {
				new URL(var0);
				return true;
			} catch (MalformedURLException var2) {
				return false;
			}
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-26148798"
	)
	static void method5422() {
		if (Client.field573 && class67.localPlayer != null) {
			int var0 = class67.localPlayer.pathX[0];
			int var1 = class67.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			class132.oculusOrbFocalPointX = class67.localPlayer.x;
			int var2 = MidiPcmStream.getTileHeight(class67.localPlayer.x, class67.localPlayer.y, VertexNormal.Client_plane) - Client.camFollowHeight;
			if (var2 < class194.field2186) {
				class194.field2186 = var2;
			}

			LoginScreenAnimation.oculusOrbFocalPointY = class67.localPlayer.y;
			Client.field573 = false;
		}

	}
}
