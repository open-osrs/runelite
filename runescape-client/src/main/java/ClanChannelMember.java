import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("o")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -594954787
	)
	@Export("world")
	public int world;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "98"
	)
	public static int method2819(int var0) {
		return ScriptEvent.method2085(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-113"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4341
	}
}
