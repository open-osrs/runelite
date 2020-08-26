import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Les;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-615268512"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("z")
	public static final int method3395(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (var12 - var14) * (0.6666666666666666D - var16) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = (0.6666666666666666D - var0) * (var12 - var14) * 6.0D + var14;
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = var14 + (var12 - var14) * 6.0D * var20;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-500804162"
	)
	@Export("getEntityIdUnderMouse")
	public static int getEntityIdUnderMouse(int var0) {
		return UserComparator9.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 72
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2077943773"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Entity.clanChat != null) { // L: 10687
			PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2257, Client.packetWriter.isaacCipher); // L: 10688
			var1.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0)); // L: 10689
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 10690
			Client.packetWriter.addNode(var1); // L: 10691
		}
	} // L: 10692

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "127790133"
	)
	static void method3393(int var0) {
		Client.oculusOrbState = var0; // L: 10876
	} // L: 10877
}
