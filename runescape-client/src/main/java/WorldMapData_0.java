import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "29"
	)
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field291.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method5634(); // L: 19
			super.fileId = var1.method5634(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "728123848"
	)
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field198 = new byte[super.planes][64][64]; // L: 27
		super.field191 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class39.field279.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) { // L: 36
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	} // L: 44

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 50
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 51
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 55
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-379441451"
	)
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZS)V",
		garbageValue = "-25637"
	)
	static void method255(String var0, boolean var1, String var2, boolean var3) {
		if (var1) { // L: 31
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 32
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 34
					return; // L: 35
				} catch (Exception var5) { // L: 37
				}
			}

			if (class60.field451.startsWith("win") && !var3) { // L: 39 40
				FontName.method5444(var0, 0); // L: 41
				return; // L: 42
			}

			if (class60.field451.startsWith("mac")) { // L: 45
				WorldMapIcon_1.method380(var0, 1, var2); // L: 46
				return; // L: 47
			}

			FontName.method5444(var0, 2); // L: 49
		} else {
			FontName.method5444(var0, 3); // L: 52
		}

	} // L: 54

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2125303788"
	)
	static void method263(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
