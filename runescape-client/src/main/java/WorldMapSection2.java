import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1261462593
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 673564695
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1568075511
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1256357453
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1568273265
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1493611659
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1992152745
	)
	int field227;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 360944973
	)
	int field228;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1394856673
	)
	int field222;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1765677155
	)
	int field230;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "112"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field227) { // L: 21
			var1.regionLowX = this.field227;
		}

		if (var1.regionHighX < this.field222) {
			var1.regionHighX = this.field222; // L: 22
		}

		if (var1.regionLowY > this.field228) { // L: 23
			var1.regionLowY = this.field228;
		}

		if (var1.regionHighY < this.field230) { // L: 24
			var1.regionHighY = this.field230;
		}

	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-90"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 28
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 31
		} else {
			return false; // L: 29
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-5"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field227 && var1 >> 6 <= this.field222 && var2 >> 6 >= this.field228 && var2 >> 6 <= this.field230; // L: 35
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-76"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{var2 + (this.field227 * 64 - this.regionStartX * 64), var3 + (this.field228 * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lhd;",
		garbageValue = "-1841969392"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 49
			return null; // L: 50
		} else {
			int var3 = this.regionStartX * 64 - this.field227 * 64 + var1; // L: 52
			int var4 = var2 + (this.regionStartY * 64 - this.field228 * 64); // L: 53
			return new Coord(this.minPlane, var3, var4); // L: 54
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-489268143"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 58
		this.planes = var1.readUnsignedByte(); // L: 59
		this.regionStartX = var1.readUnsignedShort(); // L: 60
		this.regionStartY = var1.readUnsignedShort(); // L: 61
		this.regionEndX = var1.readUnsignedShort(); // L: 62
		this.regionEndY = var1.readUnsignedShort(); // L: 63
		this.field227 = var1.readUnsignedShort(); // L: 64
		this.field228 = var1.readUnsignedShort(); // L: 65
		this.field222 = var1.readUnsignedShort(); // L: 66
		this.field230 = var1.readUnsignedShort(); // L: 67
		this.postRead(); // L: 68
	} // L: 69

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16256"
	)
	@Export("postRead")
	void postRead() {
	} // L: 71

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1722479891"
	)
	public static void method387() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 297

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 298
				WorldMapEvent.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 299
			JagexCache.JagexCache_randomDat.close(); // L: 300
		} catch (Exception var2) { // L: 302
		}

	} // L: 303

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "815934971"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		SecureRandomCallable.logOut(); // L: 2617
		switch(var0) { // L: 2618
		case 1:
			Login.loginIndex = 24; // L: 2630
			InvDefinition.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2631
			break;
		case 2:
			Login.loginIndex = 24; // L: 2622
			InvDefinition.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2623
		}

	} // L: 2636

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8447233"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 8877
			Widget var0 = ArchiveLoader.getWidgetChild(MidiPcmStream.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 8878
			if (var0 != null && var0.onTargetLeave != null) { // L: 8879
				ScriptEvent var1 = new ScriptEvent(); // L: 8880
				var1.widget = var0; // L: 8881
				var1.args = var0.onTargetLeave; // L: 8882
				PacketWriter.runScriptEvent(var1); // L: 8883
			}

			Client.isSpellSelected = false; // L: 8885
			IsaacCipher.invalidateWidget(var0); // L: 8886
		}
	} // L: 8887

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lhz;B)V",
		garbageValue = "59"
	)
	static final void method401(Widget var0) {
		int var1 = var0.contentType; // L: 11181
		if (var1 == 324) { // L: 11182
			if (Client.field850 == -1) { // L: 11183
				Client.field850 = var0.spriteId2; // L: 11184
				Client.field927 = var0.spriteId; // L: 11185
			}

			if (Client.playerAppearance.isFemale) { // L: 11187
				var0.spriteId2 = Client.field850;
			} else {
				var0.spriteId2 = Client.field927; // L: 11188
			}

		} else if (var1 == 325) { // L: 11191
			if (Client.field850 == -1) { // L: 11192
				Client.field850 = var0.spriteId2; // L: 11193
				Client.field927 = var0.spriteId; // L: 11194
			}

			if (Client.playerAppearance.isFemale) { // L: 11196
				var0.spriteId2 = Client.field927;
			} else {
				var0.spriteId2 = Client.field850; // L: 11197
			}

		} else if (var1 == 327) { // L: 11200
			var0.modelAngleX = 150; // L: 11201
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11202
			var0.modelType = 5; // L: 11203
			var0.modelId = 0; // L: 11204
		} else if (var1 == 328) { // L: 11207
			var0.modelAngleX = 150; // L: 11208
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11209
			var0.modelType = 5; // L: 11210
			var0.modelId = 1; // L: 11211
		}
	} // L: 11189 11198 11205 11212 11214
}
