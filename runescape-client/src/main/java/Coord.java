import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1361865131
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1864154747
	)
	@Export("x")
	public int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 807727247
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-688819696"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)Z",
		garbageValue = "-1923777206"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 40
			return false;
		} else if (this.x != var1.x) { // L: 41
			return false;
		} else {
			return this.y == var1.y; // L: 42
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-23"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 55
	}

	public int hashCode() {
		return this.packed(); // L: 47
	}

	public String toString() {
		return this.toString(","); // L: 51
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 34
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 35 36
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693981343"
	)
	static final void method4790() {
		int var0 = SoundCache.field448 * 128 + 64; // L: 3896
		int var1 = AttackOption.field1351 * 128 + 64; // L: 3897
		int var2 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - Client.field659; // L: 3898
		if (ObjectSound.cameraX < var0) { // L: 3899
			ObjectSound.cameraX = (var0 - ObjectSound.cameraX) * FloorUnderlayDefinition.field1707 / 1000 + ObjectSound.cameraX + Message.field602; // L: 3900
			if (ObjectSound.cameraX > var0) { // L: 3901
				ObjectSound.cameraX = var0;
			}
		}

		if (ObjectSound.cameraX > var0) { // L: 3903
			ObjectSound.cameraX -= FloorUnderlayDefinition.field1707 * (ObjectSound.cameraX - var0) / 1000 + Message.field602; // L: 3904
			if (ObjectSound.cameraX < var0) { // L: 3905
				ObjectSound.cameraX = var0;
			}
		}

		if (class160.cameraY < var2) { // L: 3907
			class160.cameraY = (var2 - class160.cameraY) * FloorUnderlayDefinition.field1707 / 1000 + class160.cameraY + Message.field602; // L: 3908
			if (class160.cameraY > var2) { // L: 3909
				class160.cameraY = var2;
			}
		}

		if (class160.cameraY > var2) { // L: 3911
			class160.cameraY -= FloorUnderlayDefinition.field1707 * (class160.cameraY - var2) / 1000 + Message.field602; // L: 3912
			if (class160.cameraY < var2) { // L: 3913
				class160.cameraY = var2;
			}
		}

		if (Canvas.cameraZ < var1) { // L: 3915
			Canvas.cameraZ = (var1 - Canvas.cameraZ) * FloorUnderlayDefinition.field1707 / 1000 + Canvas.cameraZ + Message.field602; // L: 3916
			if (Canvas.cameraZ > var1) { // L: 3917
				Canvas.cameraZ = var1;
			}
		}

		if (Canvas.cameraZ > var1) { // L: 3919
			Canvas.cameraZ -= FloorUnderlayDefinition.field1707 * (Canvas.cameraZ - var1) / 1000 + Message.field602; // L: 3920
			if (Canvas.cameraZ < var1) { // L: 3921
				Canvas.cameraZ = var1;
			}
		}

		var0 = WorldMapIcon_0.field2029 * 128 + 64; // L: 3923
		var1 = class44.field315 * 128 + 64; // L: 3924
		var2 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - FriendsChat.field3815; // L: 3925
		int var3 = var0 - ObjectSound.cameraX; // L: 3926
		int var4 = var2 - class160.cameraY; // L: 3927
		int var5 = var1 - Canvas.cameraZ; // L: 3928
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 3929
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047; // L: 3930
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047; // L: 3931
		if (var7 < 128) { // L: 3932
			var7 = 128;
		}

		if (var7 > 383) { // L: 3933
			var7 = 383;
		}

		if (class69.cameraPitch < var7) { // L: 3934
			class69.cameraPitch = (var7 - class69.cameraPitch) * class20.field166 / 1000 + class69.cameraPitch + GrandExchangeOfferOwnWorldComparator.field607; // L: 3935
			if (class69.cameraPitch > var7) { // L: 3936
				class69.cameraPitch = var7;
			}
		}

		if (class69.cameraPitch > var7) { // L: 3938
			class69.cameraPitch -= class20.field166 * (class69.cameraPitch - var7) / 1000 + GrandExchangeOfferOwnWorldComparator.field607; // L: 3939
			if (class69.cameraPitch < var7) { // L: 3940
				class69.cameraPitch = var7;
			}
		}

		int var9 = var8 - class32.cameraYaw; // L: 3942
		if (var9 > 1024) { // L: 3943
			var9 -= 2048;
		}

		if (var9 < -1024) { // L: 3944
			var9 += 2048;
		}

		if (var9 > 0) { // L: 3945
			class32.cameraYaw = class32.cameraYaw + GrandExchangeOfferOwnWorldComparator.field607 + var9 * class20.field166 / 1000; // L: 3946
			class32.cameraYaw &= 2047; // L: 3947
		}

		if (var9 < 0) { // L: 3949
			class32.cameraYaw -= -var9 * class20.field166 / 1000 + GrandExchangeOfferOwnWorldComparator.field607; // L: 3950
			class32.cameraYaw &= 2047; // L: 3951
		}

		int var10 = var8 - class32.cameraYaw; // L: 3953
		if (var10 > 1024) { // L: 3954
			var10 -= 2048;
		}

		if (var10 < -1024) { // L: 3955
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) { // L: 3956
			class32.cameraYaw = var8;
		}

	} // L: 3957

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "57209027"
	)
	static final void method4801() {
		Client.field817 = Client.cycleCntr; // L: 11457
	} // L: 11458

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1607735940"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11479
			PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher); // L: 11481
			var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0)); // L: 11482
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11483
			Client.packetWriter.addNode(var1); // L: 11484
		}
	} // L: 11485
}
