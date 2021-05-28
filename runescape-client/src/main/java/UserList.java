import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -446111369
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1892768295
	)
	@Export("size")
	int size;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Llx;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("l")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("o")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("c")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0; // L: 9
		this.comparator = null; // L: 13
		this.capacity = var1; // L: 16
		this.array = this.newTypedArray(var1); // L: 17
		this.usernamesMap = new HashMap(var1 / 8); // L: 18
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "126"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Llx;",
		garbageValue = "1924184817"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1427653202"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 23
		Arrays.fill(this.array, (Object)null); // L: 24
		this.usernamesMap.clear(); // L: 25
		this.previousUsernamesMap.clear(); // L: 26
	} // L: 27

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1340173530"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 30
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size; // L: 34
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Z",
		garbageValue = "-234571238"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 38
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 39 40
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Llx;",
		garbageValue = "-1108278291"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 44
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 45 46
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)Llx;",
		garbageValue = "7"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1); // L: 50 51
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)Llx;",
		garbageValue = "1"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1); // L: 55 56
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Z",
		garbageValue = "-787217096"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 60
		if (var2 == null) { // L: 61
			return false;
		} else {
			this.remove(var2); // L: 62
			return true; // L: 63
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "1934754885"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1); // L: 67
		if (var2 != -1) { // L: 68
			this.arrayRemove(var2); // L: 69
			this.mapRemove(var1); // L: 70
		}
	} // L: 71

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)Llx;",
		garbageValue = "1218204811"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 74
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)Llx;",
		garbageValue = "-656990705"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) { // L: 78
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance(); // L: 79
			var3.set(var1, var2); // L: 80
			this.arrayAddLast(var3); // L: 81
			this.mapPut(var3); // L: 82
			return var3; // L: 83
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Llx;",
		garbageValue = "-1"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 87
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 88
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1406178121"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 92
			Arrays.sort(this.array, 0, this.size); // L: 93
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 96
		}

	} // L: 98

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llx;Lly;Lly;B)V",
		garbageValue = "8"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 101
		var1.set(var2, var3); // L: 102
		this.mapPut(var1); // L: 103
	} // L: 104

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llx;S)I",
		garbageValue = "400"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 107
			if (this.array[var2] == var1) { // L: 108
				return var2;
			}
		}

		return -1; // L: 110
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "1618016496"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername); // L: 115
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "-1533955349"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)V",
		garbageValue = "16776960"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532221549"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1224360715"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	} // L: 153

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcf;",
		garbageValue = "1132367592"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 116
		Buffer var2 = new Buffer(var0); // L: 117
		var2.offset = var2.array.length - 2; // L: 118
		int var3 = var2.readUnsignedShort(); // L: 119
		int var4 = var2.array.length - 2 - var3 - 12; // L: 120
		var2.offset = var4; // L: 121
		int var5 = var2.readInt(); // L: 122
		var1.localIntCount = var2.readUnsignedShort(); // L: 123
		var1.localStringCount = var2.readUnsignedShort(); // L: 124
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 125
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 126
		int var6 = var2.readUnsignedByte(); // L: 127
		int var7;
		int var8;
		if (var6 > 0) { // L: 128
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 129

			for (var7 = 0; var7 < var6; ++var7) { // L: 130
				var8 = var2.readUnsignedShort(); // L: 131
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? Player.method2128(var8) : 1); // L: 132
				var1.switches[var7] = var9; // L: 133

				while (var8-- > 0) { // L: 134
					int var10 = var2.readInt(); // L: 135
					int var11 = var2.readInt(); // L: 136
					var9.put(new IntegerNode(var11), (long)var10); // L: 137
				}
			}
		}

		var2.offset = 0; // L: 141
		var1.field1084 = var2.readStringCp1252NullTerminatedOrNull(); // L: 142
		var1.opcodes = new int[var5]; // L: 143
		var1.intOperands = new int[var5]; // L: 144
		var1.stringOperands = new String[var5]; // L: 145

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 146 147 152
			var8 = var2.readUnsignedShort(); // L: 148
			if (var8 == 3) { // L: 149
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 150
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 151
			}
		}

		return var1; // L: 154
	}
}
