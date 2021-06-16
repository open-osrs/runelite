import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1204437349
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -525287981
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1; // L: 13
		this.coord2 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "370652147"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) { // L: 18
			return true; // L: 19
		} else {
			return this.labelFitsScreen(var1, var2); // L: 21
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-88"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) { // L: 37
			return false;
		} else {
			WorldMapElement var3 = Archive.WorldMapElement_get(this.getElement()); // L: 38
			int var4 = this.getSubWidth(); // L: 39
			int var5 = this.getSubHeight(); // L: 40
			switch(var3.horizontalAlignment.value) { // L: 41
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) { // L: 44
					return false;
				}
				break;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) { // L: 54
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) { // L: 49
					return false;
				}
			}

			switch(var3.verticalAlignment.value) { // L: 58
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) { // L: 66
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) { // L: 71
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) { // L: 61
					return false;
				}
			}

			return true; // L: 75
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-663056522"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel(); // L: 79
		if (var3 == null) { // L: 80
			return false; // L: 81
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) { // L: 83
			return var2 >= this.screenY && var2 <= this.screenY + var3.height; // L: 84
		} else {
			return false; // L: 85
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-860022326"
	)
	public static int method3787(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 25
			int var6 = var3; // L: 26
			var3 = var4; // L: 27
			var4 = var6; // L: 28
		}

		var2 &= 3; // L: 30
		if (var2 == 0) { // L: 31
			return var0;
		} else if (var2 == 1) { // L: 32
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 33 34
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1784757970"
	)
	public static int method3785(int var0, int var1, int var2) {
		int var3 = UserComparator2.method6890(var2 - var1 + 1); // L: 51
		var3 <<= var1; // L: 52
		return var0 & ~var3; // L: 53
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "605397793"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3812
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3813
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3814
				if (var3 == null) { // L: 3815
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3816
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3817
				if (var3.contains(var4, var5)) { // L: 3818
					var4 -= var3.width / 2; // L: 3819
					var5 -= var3.height / 2; // L: 3820
					int var6 = Client.camAngleY & 2047; // L: 3821
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3822
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3823
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 3824
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 3825
					int var11 = var9 + class262.localPlayer.x >> 7; // L: 3826
					int var12 = class262.localPlayer.y - var10 >> 7; // L: 3827
					PacketBufferNode var13 = InterfaceParent.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher); // L: 3829
					var13.packetBuffer.writeByte(18); // L: 3830
					var13.packetBuffer.writeShort(var12 + WorldMapSprite.baseY); // L: 3831
					var13.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3832
					var13.packetBuffer.method6649(var11 + class15.baseX); // L: 3833
					var13.packetBuffer.writeByte(var4); // L: 3834
					var13.packetBuffer.writeByte(var5); // L: 3835
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3836
					var13.packetBuffer.writeByte(57); // L: 3837
					var13.packetBuffer.writeByte(0); // L: 3838
					var13.packetBuffer.writeByte(0); // L: 3839
					var13.packetBuffer.writeByte(89); // L: 3840
					var13.packetBuffer.writeShort(class262.localPlayer.x); // L: 3841
					var13.packetBuffer.writeShort(class262.localPlayer.y); // L: 3842
					var13.packetBuffer.writeByte(63); // L: 3843
					Client.packetWriter.addNode(var13); // L: 3844
					Client.destinationX = var11; // L: 3845
					Client.destinationY = var12; // L: 3846
				}
			}

		}
	} // L: 3849
}
