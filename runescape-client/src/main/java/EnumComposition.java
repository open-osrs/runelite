import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 422415445
	)
	static int field1629;
	@ObfuscatedName("v")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("y")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("j")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -883966701
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 691082953
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("r")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("h")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("d")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1541381103"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1108617782"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1940899899"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1376417697"
	)
	static boolean method2831(String var0) {
		if (var0 == null) { // L: 65
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 72
			} catch (MalformedURLException var2) { // L: 69
				return false; // L: 70
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static void method2827() {
		if (LoginPacket.field2800 != null) { // L: 11702
			Client.field798 = Client.cycle; // L: 11703
			LoginPacket.field2800.method5246(); // L: 11704

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 11705
				if (Client.players[var0] != null) { // L: 11706
					LoginPacket.field2800.method5245((Client.players[var0].x >> 7) + class15.baseX, (Client.players[var0].y >> 7) + WorldMapSprite.baseY); // L: 11707
				}
			}
		}

	} // L: 11711
}
