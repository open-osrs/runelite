import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class151 extends class144 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1270572839
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("c")
	String field1712;
	@ObfuscatedName("v")
	byte field1710;
	@ObfuscatedName("q")
	byte field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class151(class145 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "355261812"
	)
	void vmethod3137(Buffer var1) {
		this.field1712 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1712 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1710 = var1.readByte(); // L: 161
			this.field1711 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "1368590037"
	)
	void vmethod3138(ClanChannel var1) {
		var1.name = this.field1712; // L: 167
		if (this.field1712 != null) { // L: 168
			var1.field1695 = this.field1710; // L: 169
			var1.field1696 = this.field1711; // L: 170
		}

	} // L: 172

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1585435431"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return Interpreter.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lap;S)V",
		garbageValue = "-24407"
	)
	static void method3136(GameEngine var0) {
		while (class18.isKeyDown()) { // L: 1835
			if (class272.field3196 == 13) { // L: 1836
				Tiles.method2021(); // L: 1837
				return; // L: 1838
			}

			if (class272.field3196 == 96) { // L: 1840
				if (Login.worldSelectPage > 0 && class266.worldSelectLeftSprite != null) { // L: 1841
					--Login.worldSelectPage; // L: 1842
				}
			} else if (class272.field3196 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && SceneTilePaint.worldSelectRightSprite != null) { // L: 1845 1846
				++Login.worldSelectPage; // L: 1847
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !class122.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 1851
			int var1 = Login.xPadding + 280; // L: 1852
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1853
				ReflectionCheck.changeWorldSelectSorting(0, 0); // L: 1854
				return; // L: 1855
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1857
				ReflectionCheck.changeWorldSelectSorting(0, 1); // L: 1858
				return; // L: 1859
			}

			int var2 = Login.xPadding + 390; // L: 1861
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1862
				ReflectionCheck.changeWorldSelectSorting(1, 0); // L: 1863
				return; // L: 1864
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1866
				ReflectionCheck.changeWorldSelectSorting(1, 1); // L: 1867
				return; // L: 1868
			}

			int var3 = Login.xPadding + 500; // L: 1870
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1871
				ReflectionCheck.changeWorldSelectSorting(2, 0); // L: 1872
				return; // L: 1873
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1875
				ReflectionCheck.changeWorldSelectSorting(2, 1); // L: 1876
				return; // L: 1877
			}

			int var4 = Login.xPadding + 610; // L: 1879
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1880
				ReflectionCheck.changeWorldSelectSorting(3, 0); // L: 1881
				return; // L: 1882
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 1884
				ReflectionCheck.changeWorldSelectSorting(3, 1); // L: 1885
				return; // L: 1886
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 1888
				Tiles.method2021(); // L: 1889
				return; // L: 1890
			}

			if (Login.hoveredWorldIndex != -1) { // L: 1892
				World var5 = class362.World_worlds[Login.hoveredWorldIndex]; // L: 1893
				class295.changeWorld(var5); // L: 1894
				Tiles.method2021(); // L: 1895
				return; // L: 1896
			}

			if (Login.worldSelectPage > 0 && class266.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class266.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class78.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class78.canvasHeight / 2 + 50) { // L: 1898
				--Login.worldSelectPage; // L: 1899
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && SceneTilePaint.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Script.canvasWidth - SceneTilePaint.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Script.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class78.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class78.canvasHeight / 2 + 50) { // L: 1901
				++Login.worldSelectPage; // L: 1902
			}
		}

	} // L: 1905

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcg;I)V",
		garbageValue = "47717415"
	)
	static final void method3146(PendingSpawn var0) {
		long var1 = 0L; // L: 7795
		int var3 = -1; // L: 7796
		int var4 = 0; // L: 7797
		int var5 = 0; // L: 7798
		if (var0.type == 0) { // L: 7799
			var1 = class356.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7800
			var1 = class356.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7801
			var1 = class356.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7802
			var1 = class356.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 7803
			int var6 = class356.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7804
			var3 = Decimator.Entity_unpackID(var1); // L: 7805
			var4 = var6 & 31; // L: 7806
			var5 = var6 >> 6 & 3; // L: 7807
		}

		var0.objectId = var3; // L: 7809
		var0.field1122 = var4; // L: 7810
		var0.field1121 = var5; // L: 7811
	} // L: 7812
}
