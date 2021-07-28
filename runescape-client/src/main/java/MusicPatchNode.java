import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1874854043
	)
	int field2902;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lz;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	MusicPatchNode2 field2885;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -48173435
	)
	int field2887;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 75053875
	)
	int field2893;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1488956187
	)
	int field2888;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2005146559
	)
	int field2889;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 471656565
	)
	int field2882;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 509100341
	)
	int field2891;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 278878597
	)
	int field2892;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1333282019
	)
	int field2883;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 458384481
	)
	int field2899;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1998786171
	)
	int field2895;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2084962731
	)
	int field2896;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1291835317
	)
	int field2897;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1301679329
	)
	int field2886;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -154309947
	)
	int field2894;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1589222961
	)
	int field2901;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1653433433
	)
	int field2898;

	MusicPatchNode() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2112668994"
	)
	void method4686() {
		this.patch = null;
		this.rawSound = null;
		this.field2885 = null;
		this.stream = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-2130267956"
	)
	public static byte[] method4683(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? TextureProvider.method4203(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "277375642"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lbx;II)V",
		garbageValue = "456956891"
	)
	static final void method4684(Actor var0, int var1) {
		FriendLoginUpdate.worldToScreen(var0.x, var0.y, var1);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-6"
	)
	static final void method4685(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : FriendLoginUpdate.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2520()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = VerticalAlignment.getPacketBufferNode(ClientPacket.field2671, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + GrandExchangeOfferNameComparator.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lio;B)I",
		garbageValue = "100"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
