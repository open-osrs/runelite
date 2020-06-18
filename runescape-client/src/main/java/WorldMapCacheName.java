import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 1378764689
	)
	static int field329;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	public static final WorldMapCacheName field322;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	public static final WorldMapCacheName field325;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	public static final WorldMapCacheName field324;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	static final WorldMapCacheName field323;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lat;"
	)
	public static final WorldMapCacheName field326;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1520300025
	)
	static int field328;
	@ObfuscatedName("g")
	@Export("name")
	public final String name;

	static {
		field322 = new WorldMapCacheName("details");
		field325 = new WorldMapCacheName("compositemap");
		field324 = new WorldMapCacheName("compositetexture");
		field323 = new WorldMapCacheName("area");
		field326 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(ILlp;Lig;I)V",
		garbageValue = "-1710341553"
	)
	static void method688(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}
}
