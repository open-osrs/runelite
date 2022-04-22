import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class420 implements class419 {
	@ObfuscatedName("d")
	static int[][][] field4545;
	@ObfuscatedName("v")
	Map field4547;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class444 field4546;

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public class420(class444 var1) {
		this.field4546 = var1; // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public int vmethod7471(int var1) {
		if (this.field4547 != null) { // L: 19
			class445 var2 = (class445)this.field4547.get(var1); // L: 20
			if (var2 != null) {
				return (Integer)var2.field4681; // L: 21
			}
		}

		return (Integer)this.field4546.vmethod7950(var1); // L: 23
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "-12"
	)
	public void vmethod7464(int var1, Object var2) {
		if (this.field4547 == null) { // L: 27
			this.field4547 = new HashMap(); // L: 28
			this.field4547.put(var1, new class445(var1, var2)); // L: 29
		} else {
			class445 var3 = (class445)this.field4547.get(var1); // L: 32
			if (var3 == null) {
				this.field4547.put(var1, new class445(var1, var2)); // L: 33
			} else {
				var3.field4681 = var2; // L: 34
			}
		}

	} // L: 36

	public Iterator iterator() {
		return this.field4547 == null ? Collections.emptyList().iterator() : this.field4547.values().iterator(); // L: 39 40
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "126"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3681
			class131.clientPreferences.method2246(!class131.clientPreferences.method2263()); // L: 3682
			if (class131.clientPreferences.method2263()) { // L: 3683
				Actor.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3684
			} else {
				Actor.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3687
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3690
			class131.clientPreferences.method2302();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3691
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3692
		}

		if (Client.staffModLevel >= 2) { // L: 3693
			if (var0.equalsIgnoreCase("errortest")) { // L: 3694
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3695
				ScriptFrame.worldMap.showCoord = !ScriptFrame.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3696
				class131.clientPreferences.method2234(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3697
				class131.clientPreferences.method2234(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3698
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3699
				ClanChannelMember.method2868();
			}
		}

		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 3702
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3703
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3704
		Client.packetWriter.addNode(var1); // L: 3705
	} // L: 3706
}
