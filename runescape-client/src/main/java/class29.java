import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class29 implements Callable {
	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Buffer field224;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class31 field220;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final class35 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laq;Lnt;Laz;)V"
	)
	class29(class35 var1, Buffer var2, class31 var3) {
		this.this$0 = var1; // L: 47
		this.field224 = var2; // L: 48
		this.field220 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field220.vmethod381(this.field224); // L: 53
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "10193583"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 147
		var1.offset = var0.length - 2; // L: 148
		class397.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 149
		class397.SpriteBuffer_xOffsets = new int[class397.SpriteBuffer_spriteCount]; // L: 150
		class26.SpriteBuffer_yOffsets = new int[class397.SpriteBuffer_spriteCount]; // L: 151
		Canvas.SpriteBuffer_spriteWidths = new int[class397.SpriteBuffer_spriteCount]; // L: 152
		Clock.SpriteBuffer_spriteHeights = new int[class397.SpriteBuffer_spriteCount]; // L: 153
		class126.SpriteBuffer_pixels = new byte[class397.SpriteBuffer_spriteCount][]; // L: 154
		var1.offset = var0.length - 7 - class397.SpriteBuffer_spriteCount * 8; // L: 155
		class397.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 156
		class244.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 157
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 158

		int var3;
		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) { // L: 159
			class397.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) { // L: 160
			class26.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) { // L: 161
			Canvas.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) { // L: 162
			Clock.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class397.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 163
		class397.SpriteBuffer_spritePalette = new int[var2]; // L: 164

		for (var3 = 1; var3 < var2; ++var3) { // L: 165
			class397.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 166
			if (class397.SpriteBuffer_spritePalette[var3] == 0) { // L: 167
				class397.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 169

		for (var3 = 0; var3 < class397.SpriteBuffer_spriteCount; ++var3) { // L: 170
			int var4 = Canvas.SpriteBuffer_spriteWidths[var3]; // L: 171
			int var5 = Clock.SpriteBuffer_spriteHeights[var3]; // L: 172
			int var6 = var4 * var5; // L: 173
			byte[] var7 = new byte[var6]; // L: 174
			class126.SpriteBuffer_pixels[var3] = var7; // L: 175
			int var8 = var1.readUnsignedByte(); // L: 176
			int var9;
			if (var8 == 0) { // L: 177
				for (var9 = 0; var9 < var6; ++var9) { // L: 178
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 180
				for (var9 = 0; var9 < var4; ++var9) { // L: 181
					for (int var10 = 0; var10 < var5; ++var10) { // L: 182
						var7[var9 + var10 * var4] = var1.readByte(); // L: 183
					}
				}
			}
		}

	} // L: 188

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077147833"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 551
		if (class14.garbageCollector == null || !class14.garbageCollector.isValid()) { // L: 552
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 554

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 555
					if (var2.isValid()) { // L: 557
						class14.garbageCollector = var2; // L: 558
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 559
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 560
					}
				}
			} catch (Throwable var11) { // L: 565
			}
		}

		if (class14.garbageCollector != null) { // L: 567
			long var9 = ClientPacket.currentTimeMillis(); // L: 568
			long var3 = class14.garbageCollector.getCollectionTime(); // L: 569
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 570
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 571
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 572
				if (var7 != 0L) { // L: 573
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 575
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 576
		}

		return var0; // L: 578
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2119346046"
	)
	static final void method378(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : AttackOption.guestClanChannel; // L: 11495
		if (var2 != null && var1 >= 0 && var1 < var2.method49()) { // L: 11496
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11497
			if (var3.rank == -1) { // L: 11498
				String var4 = var3.name; // L: 11499
				PacketWriter var5 = Client.packetWriter; // L: 11500
				PacketBufferNode var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2583, var5.isaacCipher); // L: 11501
				var6.packetBuffer.writeByte(3 + class44.stringCp1252NullTerminatedByteSize(var4)); // L: 11502
				var6.packetBuffer.writeByte(var0); // L: 11503
				var6.packetBuffer.writeShort(var1); // L: 11504
				var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11505
				var5.addNode(var6); // L: 11506
			}
		}
	} // L: 11507
}
