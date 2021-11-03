import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class7 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Loe;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("i")
	ExecutorService field17;
	@ObfuscatedName("w")
	Future field20;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	final Buffer field18;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "La;"
	)
	final class3 field19;

	@ObfuscatedSignature(
		descriptor = "(Lop;La;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field17 = Executors.newSingleThreadExecutor(); // L: 10
		this.field18 = var1; // L: 16
		this.field19 = var2; // L: 17
		this.method49(); // L: 18
	} // L: 19

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "830393061"
	)
	public boolean method46() {
		return this.field20.isDone(); // L: 22
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036380916"
	)
	public void method47() {
		this.field17.shutdown(); // L: 26
		this.field17 = null; // L: 27
	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "945217619"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field20.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187826160"
	)
	void method49() {
		this.field20 = this.field17.submit(new class1(this, this.field18, this.field19)); // L: 40
	} // L: 41

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1545852128"
	)
	public static int[] method57() {
		int[] var0 = new int[KeyHandler.field110]; // L: 234

		for (int var1 = 0; var1 < KeyHandler.field110; ++var1) { // L: 235
			var0[var1] = KeyHandler.field125[var1]; // L: 236
		}

		return var0; // L: 238
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "77"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4155
			class408.clientPreferences.roofsHidden = !class408.clientPreferences.roofsHidden; // L: 4156
			Login.savePreferences(); // L: 4157
			if (class408.clientPreferences.roofsHidden) { // L: 4158
				class397.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class397.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4159
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4161
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4162
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4163
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 4164
			if (var0.equalsIgnoreCase("errortest")) { // L: 4165
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 4166
				class133.worldMap.showCoord = !class133.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4167
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4168
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc(); // L: 4169
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4170
				Clock.method2960();
			}
		}

		PacketBufferNode var1 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2721, Client.packetWriter.isaacCipher); // L: 4173
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 4174
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4175
		Client.packetWriter.addNode(var1); // L: 4176
	} // L: 4177
}
