import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 297838275
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static Bounds field1089;
	@ObfuscatedName("l")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("m")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 183452859
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("q")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("c")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 6; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.parameters = new LinkedHashMap();
		this.method1948(true); // L: 21
	} // L: 22

	@ObfuscatedSignature(
		descriptor = "(Lkb;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.parameters = new LinkedHashMap(); // L: 18
		if (var1 != null && var1.array != null) { // L: 25
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 30
				if (var1.readUnsignedByte() == 1) { // L: 34
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 35
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 36
				}

				if (var2 > 3) { // L: 38
					this.windowMode = var1.readUnsignedByte(); // L: 39
				}

				if (var2 > 2) { // L: 41
					int var3 = var1.readUnsignedByte(); // L: 42

					for (int var4 = 0; var4 < var3; ++var4) { // L: 43
						int var5 = var1.readInt(); // L: 44
						int var6 = var1.readInt(); // L: 45
						this.parameters.put(var5, var6); // L: 46
					}
				}

				if (var2 > 4) { // L: 49
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 50
				}

				if (var2 > 5) { // L: 52
					this.hideUsername = var1.readBoolean(); // L: 53
				}
			} else {
				this.method1948(true); // L: 31
			}
		} else {
			this.method1948(true); // L: 26
		}

	} // L: 57

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "120"
	)
	void method1948(boolean var1) {
	} // L: 59

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-948717510"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 62
		var1.writeByte(ClientPreferences_optionCount); // L: 63
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 64
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 65
		var1.writeByte(this.windowMode); // L: 66
		var1.writeByte(this.parameters.size()); // L: 67
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 68

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 69
			var1.writeInt((Integer)var3.getKey()); // L: 71
			var1.writeInt((Integer)var3.getValue()); // L: 72
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 75
		var1.writeBoolean(this.hideUsername); // L: 76
		return var1; // L: 77
	}
}
