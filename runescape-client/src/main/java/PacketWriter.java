import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("av")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -432974383
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -83736147
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("d")
	boolean field1408;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1169449061
	)
	int field1409;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 239536285
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1411;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1412;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1400;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1408 = true; // L: 22
		this.field1409 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "238860483"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1875758370"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "-2081373116"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1060689503"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-329279812"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1467210924"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lcz;B)V",
		garbageValue = "1"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		World.runScript(var0, 500000, 475000); // L: 106
	} // L: 107

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "0"
	)
	public static void method2384(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1183744930"
	)
	static final void method2402(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 10896
		if (var0 != ObjectComposition.clientPreferences.musicVolume) { // L: 10897
			if (ObjectComposition.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 10898
				LoginScreenAnimation.method2219(UrlRequest.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 10899
				Client.field881 = false; // L: 10900
			} else if (var0 == 0) { // L: 10902
				class124.midiPcmStream.clear(); // L: 10904
				class232.musicPlayerStatus = 1; // L: 10905
				ModelData0.musicTrackArchive = null; // L: 10906
				Client.field881 = false; // L: 10908
			} else if (class232.musicPlayerStatus != 0) { // L: 10911
				class232.musicTrackVolume = var0;
			} else {
				class124.midiPcmStream.setPcmStreamVolume(var0); // L: 10912
			}

			ObjectComposition.clientPreferences.musicVolume = var0; // L: 10914
			TileItem.savePreferences(); // L: 10915
		}

	} // L: 10917
}
