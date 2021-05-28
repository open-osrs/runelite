import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("o")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("f")
	@Export("type")
	char type;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1035114241
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("p")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("j")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2035039136"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;S)V",
		garbageValue = "-22209"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 35
			if (var2 == 0) { // L: 36
				return; // L: 39
			}

			this.decodeNext(var1, var2); // L: 37
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "36"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 42
			byte var4 = var1.readByte(); // L: 44
			int var5 = var4 & 255; // L: 46
			if (var5 == 0) { // L: 47
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 48
				char var6 = class301.cp1252AsciiExtension[var5 - 128]; // L: 49
				if (var6 == 0) { // L: 50
					var6 = '?';
				}

				var5 = var6; // L: 51
			}

			char var3 = (char)var5; // L: 53
			this.type = var3; // L: 55
		} else if (var2 == 2) { // L: 57
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 58
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 59
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 61

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "25333"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 64
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)Loh;",
		garbageValue = "116"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var2 * var3]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;I)I",
		garbageValue = "-44618968"
	)
	public static int method2878(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = DynamicObject.method2004(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class249.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnb;II)Z",
		garbageValue = "422196307"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 571
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 572
			if (var0.readBits(1) != 0) { // L: 573
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 574
			var4 = var0.readBits(13); // L: 575
			boolean var12 = var0.readBits(1) == 1; // L: 576
			if (var12) { // L: 577
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 578
				throw new RuntimeException(); // L: 579
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 581
				var11.index = var1; // L: 582
				if (Players.field1374[var1] != null) { // L: 583
					var11.read(Players.field1374[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 584
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 585
				var7 = Players.Players_regions[var1]; // L: 586
				var8 = var7 >> 28; // L: 587
				var9 = var7 >> 14 & 255; // L: 588
				var10 = var7 & 255; // L: 589
				var11.pathTraversed[0] = Players.field1373[var1]; // L: 590
				var11.plane = (byte)var8; // L: 591
				var11.resetPath((var9 << 13) + var3 - VertexNormal.baseX, (var10 << 13) + var4 - SoundSystem.baseY); // L: 592
				var11.field1218 = false; // L: 593
				return true; // L: 594
			}
		} else if (var2 == 1) { // L: 596
			var3 = var0.readBits(2); // L: 597
			var4 = Players.Players_regions[var1]; // L: 598
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 599
			return false; // L: 600
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 602
				var3 = var0.readBits(5); // L: 603
				var4 = var3 >> 3; // L: 604
				var5 = var3 & 7; // L: 605
				var6 = Players.Players_regions[var1]; // L: 606
				var7 = (var6 >> 28) + var4 & 3; // L: 607
				var8 = var6 >> 14 & 255; // L: 608
				var9 = var6 & 255; // L: 609
				if (var5 == 0) { // L: 610
					--var8; // L: 611
					--var9; // L: 612
				}

				if (var5 == 1) { // L: 614
					--var9;
				}

				if (var5 == 2) { // L: 615
					++var8; // L: 616
					--var9; // L: 617
				}

				if (var5 == 3) { // L: 619
					--var8;
				}

				if (var5 == 4) { // L: 620
					++var8;
				}

				if (var5 == 5) { // L: 621
					--var8; // L: 622
					++var9; // L: 623
				}

				if (var5 == 6) { // L: 625
					++var9;
				}

				if (var5 == 7) { // L: 626
					++var8; // L: 627
					++var9; // L: 628
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 630
				return false; // L: 631
			} else {
				var3 = var0.readBits(18); // L: 633
				var4 = var3 >> 16; // L: 634
				var5 = var3 >> 8 & 255; // L: 635
				var6 = var3 & 255; // L: 636
				var7 = Players.Players_regions[var1]; // L: 637
				var8 = (var7 >> 28) + var4 & 3; // L: 638
				var9 = var5 + (var7 >> 14) & 255; // L: 639
				var10 = var6 + var7 & 255; // L: 640
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 641
				return false; // L: 642
			}
		}
	}
}
