import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("v")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public static void method391() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 20
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var0 == null) {
				return; // L: 23
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 24
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqv;",
		garbageValue = "929937877"
	)
	static PrivateChatMode[] method389() {
		return new PrivateChatMode[]{PrivateChatMode.field4738, PrivateChatMode.field4739, PrivateChatMode.field4740}; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llq;B)V",
		garbageValue = "8"
	)
	public static void method390(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BIILgs;[Lgf;I)V",
		garbageValue = "-1948278943"
	)
	static final void method388(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 289
		int var6 = -1; // L: 290

		while (true) {
			int var7 = var5.method7775(); // L: 292
			if (var7 == 0) { // L: 293
				return; // L: 317
			}

			var6 += var7; // L: 294
			int var8 = 0; // L: 295

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 297
				if (var9 == 0) { // L: 298
					break;
				}

				var8 += var9 - 1; // L: 299
				int var10 = var8 & 63; // L: 300
				int var11 = var8 >> 6 & 63; // L: 301
				int var12 = var8 >> 12; // L: 302
				int var13 = var5.readUnsignedByte(); // L: 303
				int var14 = var13 >> 2; // L: 304
				int var15 = var13 & 3; // L: 305
				int var16 = var11 + var1; // L: 306
				int var17 = var10 + var2; // L: 307
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 308
					int var18 = var12; // L: 309
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 310
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 311
					if (var18 >= 0) { // L: 312
						var19 = var4[var18];
					}

					WorldMapIcon_1.method4556(var12, var16, var17, var6, var15, var14, var3, var19); // L: 313
				}
			}
		}
	}
}
