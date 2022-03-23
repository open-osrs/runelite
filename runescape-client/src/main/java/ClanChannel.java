import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ey")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 227189983
	)
	static int field1660;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("c")
	static boolean field1673;
	@ObfuscatedName("v")
	boolean field1665;
	@ObfuscatedName("o")
	boolean field1662;
	@ObfuscatedName("h")
	@Export("members")
	public List members;
	@ObfuscatedName("g")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -3432068679445221973L
	)
	long field1664;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	public byte field1666;
	@ObfuscatedName("f")
	public byte field1669;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1662 = true; // L: 13
		this.name = null; // L: 17
		this.method3058(var1); // L: 26
	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-400020002"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8362(); // L: 34
			}

			int[] var3 = this.sortedMembers; // L: 37
			WorldMapData_0.method4518(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Leu;I)V",
		garbageValue = "1497910385"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15392"
	)
	public int method3056() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-327623603"
	)
	public int method3057(String var1) {
		if (!this.field1662) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "1254848749"
	)
	void method3058(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1665 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1662 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1664 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1669 = var1.readByte(); // L: 77
		this.field1666 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1665) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1662) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058786387"
	)
	public static void method3068() {
		try {
			File var0 = new File(class230.userHomeDirectory, "random.dat"); // L: 193
			int var2;
			if (var0.exists()) { // L: 194
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 195
			} else {
				label37:
				for (int var1 = 0; var1 < WorldMapSection1.cacheSubPaths.length; ++var1) { // L: 198
					for (var2 = 0; var2 < PendingSpawn.cacheParentPaths.length; ++var2) { // L: 199
						File var3 = new File(PendingSpawn.cacheParentPaths[var2] + WorldMapSection1.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 200
						if (var3.exists()) { // L: 201
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 202
							break label37; // L: 203
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 208
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 209
				var2 = var4.read(); // L: 210
				var4.seek(0L); // L: 211
				var4.write(var2); // L: 212
				var4.seek(0L); // L: 213
				var4.close(); // L: 214
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 215
			}
		} catch (IOException var5) { // L: 218
		}

	} // L: 219

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-1846400390"
	)
	static int method3078(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3744
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = ReflectionCheck.getWindowedMode(); // L: 3745
			return 1; // L: 3746
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3748
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3749
				if (var3 == 1 || var3 == 2) { // L: 3750
					UserComparator6.setWindowedMode(var3);
				}

				return 1; // L: 3751
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3753
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Interpreter.clientPreferences.method2317(); // L: 3754
				return 1; // L: 3755
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3757
				if (var0 == 5310) { // L: 3764
					--class295.Interpreter_intStackSize; // L: 3765
					return 1; // L: 3766
				} else if (var0 == 5311) { // L: 3768
					class295.Interpreter_intStackSize -= 2; // L: 3769
					return 1; // L: 3770
				} else if (var0 == 5312) { // L: 3772
					--class295.Interpreter_intStackSize; // L: 3773
					return 1; // L: 3774
				} else if (var0 == 5350) { // L: 3776
					ChatChannel.Interpreter_stringStackSize -= 2; // L: 3777
					--class295.Interpreter_intStackSize; // L: 3778
					return 1; // L: 3779
				} else if (var0 == 5351) { // L: 3781
					--ChatChannel.Interpreter_stringStackSize; // L: 3782
					return 1; // L: 3783
				} else {
					return 2; // L: 3785
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3758
				if (var3 == 1 || var3 == 2) { // L: 3759
					Interpreter.clientPreferences.method2276(var3); // L: 3760
				}

				return 1; // L: 3762
			}
		}
	}
}
