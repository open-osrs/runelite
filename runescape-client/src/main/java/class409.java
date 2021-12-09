import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public class class409 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4445;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4442;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static final class409 field4449;
	@ObfuscatedName("x")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1710692843
	)
	final int field4444;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -399344135
	)
	public final int field4452;
	@ObfuscatedName("s")
	public final Class field4446;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	final class405 field4447;

	static {
		field4445 = new class409(1, 0, Integer.class, new class406()); // L: 10
		field4442 = new class409(0, 1, Long.class, new class408()); // L: 24
		field4449 = new class409(2, 2, String.class, new class410()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Loq;)V"
	)
	class409(int var1, int var2, Class var3, class405 var4) {
		this.field4444 = var1; // L: 58
		this.field4452 = var2; // L: 59
		this.field4446 = var3; // L: 60
		this.field4447 = var4; // L: 61
	} // L: 62

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4452; // L: 96
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Ljava/lang/Object;",
		garbageValue = "2103066470"
	)
	public Object method7250(Buffer var1) {
		return this.field4447.vmethod7271(var1); // L: 100
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lod;",
		garbageValue = "85005333"
	)
	public static class409 method7247(Class var0) {
		class409[] var1 = new class409[]{field4442, field4449, field4445}; // L: 68
		class409[] var2 = var1; // L: 70

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 71
			class409 var4 = var2[var3]; // L: 72
			if (var4.field4446 == var0) { // L: 74
				return var4;
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lpi;I)V",
		garbageValue = "-1411483047"
	)
	public static void method7255(Object var0, Buffer var1) {
		class405 var2 = method7248(var0.getClass()); // L: 83
		var2.vmethod7273(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Loq;",
		garbageValue = "-693782319"
	)
	static class405 method7248(Class var0) {
		class409 var1 = method7247(var0); // L: 89
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 90
		} else {
			return var1.field4447; // L: 91
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(Lgn;IIIB)V",
		garbageValue = "10"
	)
	static void method7269(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && SecureRandomFuture.clientPreferences.areaSoundEffectsVolume != 0) { // L: 4303
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 4304
				class315.method5816(var0.soundEffects[var1], var2, var3); // L: 4305
			}
		}
	} // L: 4306

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIILpl;Ljr;B)V",
		garbageValue = "88"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12416
		if (var6 > 4225 && var6 < 90000) { // L: 12417
			int var7 = Client.camAngleY & 2047; // L: 12418
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12419
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12420
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12421
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12422
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12423
			int var14 = var5.width / 2 - 25; // L: 12424
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12425
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12426
			byte var17 = 20; // L: 12427
			PcmPlayer.redHintArrowSprite.method7807(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12428
		} else {
			ArchiveDisk.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12430
		}

	} // L: 12431

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "968032727"
	)
	static final void method7267() {
		Client.field671 = Client.cycleCntr; // L: 12472
	} // L: 12473

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2119395151"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Players.friendsChat != null) { // L: 12486
			PacketBufferNode var1 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2828, Client.packetWriter.isaacCipher); // L: 12487
			var1.packetBuffer.writeByte(class116.stringCp1252NullTerminatedByteSize(var0)); // L: 12488
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12489
			Client.packetWriter.addNode(var1); // L: 12490
		}
	} // L: 12491
}
