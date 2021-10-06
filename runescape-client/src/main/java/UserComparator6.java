import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -863164529
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("l")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "-2006928381"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lky;II)V",
		garbageValue = "1624895888"
	)
	static void method2466(Archive var0, int var1) {
		if (TriBool.NetCache_reference != null) {
			TriBool.NetCache_reference.offset = var1 * 8 + 5;
			int var2 = TriBool.NetCache_reference.readInt();
			int var3 = TriBool.NetCache_reference.readInt();
			var0.loadIndex(var2, var3);
		} else {
			ClanSettings.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "112358019"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			WorldMapDecorationType.clientPreferences.roofsHidden = !WorldMapDecorationType.clientPreferences.roofsHidden;
			ScriptFrame.savePreferences();
			if (WorldMapDecorationType.clientPreferences.roofsHidden) {
				GraphicsDefaults.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				GraphicsDefaults.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				TileItem.worldMap.showCoord = !TileItem.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class20.method302();
			}
		}

		PacketBufferNode var1 = LoginScreenAnimation.getPacketBufferNode(ClientPacket.field2756, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
