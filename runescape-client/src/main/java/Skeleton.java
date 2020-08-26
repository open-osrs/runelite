import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("gf")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -891561701
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 178139825
	)
	@Export("count")
	int count;
	@ObfuscatedName("s")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("t")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 13
		Buffer var3 = new Buffer(var2); // L: 14
		this.count = var3.readUnsignedByte(); // L: 15
		this.transformTypes = new int[this.count]; // L: 16
		this.labels = new int[this.count][]; // L: 17

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 18
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 19
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 20
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 21
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	} // L: 23

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljx;",
		garbageValue = "29"
	)
	@Export("getNpcDefinition")
	public static NPCDefinition getNpcDefinition(int var0) {
		NPCDefinition var1 = (NPCDefinition)NPCDefinition.NpcDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1;
		} else {
			byte[] var2 = NPCDefinition.NpcDefinition_archive.takeFile(9, var0); // L: 59
			var1 = new NPCDefinition(); // L: 60
			var1.id = var0; // L: 61
			if (var2 != null) { // L: 62
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 63
			NPCDefinition.NpcDefinition_cached.put(var1, (long)var0); // L: 64
			return var1; // L: 65
		}
	}
}
