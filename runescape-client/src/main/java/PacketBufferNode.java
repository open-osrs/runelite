import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Ljt;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 24720885
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1221486625
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -668428043
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -515140623
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1959147234"
	)
	public static void method5202() {
		class33.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1179746293"
	)
	public static void method5200(int var0, int var1) {
		VarbitComposition var2 = WorldMapCacheName.method5054(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-936573581"
	)
	static char method5203(char var0) {
		switch(var0) { // L: 93
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_'; // L: 145
		case '#':
		case '[':
		case ']':
			return var0; // L: 157
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a'; // L: 104
		case 'Ç':
		case 'ç':
			return 'c'; // L: 153
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e'; // L: 129
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i'; // L: 120
		case 'Ñ':
		case 'ñ':
			return 'n'; // L: 160
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o'; // L: 140
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u'; // L: 113
		case 'ß':
			return 'b'; // L: 147
		case 'ÿ':
		case 'Ÿ':
			return 'y'; // L: 150
		default:
			return Character.toLowerCase(var0); // L: 162
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-21851942"
	)
	public static void method5194() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 291
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 292
	} // L: 293

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1529183895"
	)
	static final void method5196(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11840
		if (var0 != class19.clientPreferences.method2258()) { // L: 11841
			if (class19.clientPreferences.method2258() == 0 && Client.currentTrackGroupId != -1) { // L: 11842
				AttackOption.method2410(class121.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11843
				Client.playingJingle = false; // L: 11844
			} else if (var0 == 0) { // L: 11846
				ReflectionCheck.method579(); // L: 11847
				Client.playingJingle = false; // L: 11848
			} else {
				Decimator.method1005(var0); // L: 11850
			}

			class19.clientPreferences.method2297(var0); // L: 11851
		}

	} // L: 11853
}
