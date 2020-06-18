import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1137606481
	)
	static int field604;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	static IndexedSprite field597;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2018552551
	)
	static int field606;
	@ObfuscatedName("m")
	@Export("args")
	Object[] args;
	@ObfuscatedName("o")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1176492869
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1543053859
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1384344567
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 710326963
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -649367947
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("z")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1551673037
	)
	int field600;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1226589713
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/Object;I)V",
		garbageValue = "-2050703759"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "20"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("m")
	public static final int method1235(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var2 + var4 - var2 * var4;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = (var12 - var14) * (0.6666666666666666D - var0) * 6.0D + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "303339948"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field886 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class58.getWindowedMode() == 1) {
			WorldMapSectionType.client.setMaxCanvasSize(765, 503);
		} else {
			WorldMapSectionType.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			PacketBufferNode var1 = UserComparator4.getPacketBufferNode(ClientPacket.field2279, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class58.getWindowedMode());
			var1.packetBuffer.writeShort(Varcs.canvasWidth);
			var1.packetBuffer.writeShort(class52.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
		garbageValue = "-1977726761"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		ApproximateRouteStrategy.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
