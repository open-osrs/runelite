import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ct")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1049633095
	)
	@Export("group")
	int group;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -170109933
	)
	@Export("type")
	int type;
	@ObfuscatedName("f")
	boolean field1031;

	InterfaceParent() {
		this.field1031 = false;
	}

	@ObfuscatedName("e")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
