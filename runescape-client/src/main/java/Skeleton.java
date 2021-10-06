import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("cw")
	public static char field2376;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 140669593
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -818379809
	)
	@Export("count")
	int count;
	@ObfuscatedName("f")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("j")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpa;",
		garbageValue = "-1301198284"
	)
	static PrivateChatMode[] method4196() {
		return new PrivateChatMode[]{PrivateChatMode.field4412, PrivateChatMode.field4413, PrivateChatMode.field4411};
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1116074863"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
