import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1178695315
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 584872955
	)
	@Export("size")
	int size;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("x")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("k")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("r")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Llm;",
		garbageValue = "-1768347101"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Llm;",
		garbageValue = "836907267"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1788"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 23
		Arrays.fill(this.array, (Object)null); // L: 24
		this.usernamesMap.clear(); // L: 25
		this.previousUsernamesMap.clear(); // L: 26
	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1551225838"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 30
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-402639237"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity; // L: 34
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Z",
		garbageValue = "1332419914"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 38
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 39 40
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-412605520"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 44
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 45 46
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Llm;",
		garbageValue = "4"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1); // L: 50 51
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-1984147584"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1); // L: 55 56
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Z",
		garbageValue = "1"
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
		descriptor = "(Llm;I)V",
		garbageValue = "-1344539203"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1); // L: 67
		if (var2 != -1) { // L: 68
			this.arrayRemove(var2); // L: 69
			this.mapRemove(var1); // L: 70
		}
	} // L: 71

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Llm;",
		garbageValue = "-1013627827"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 74
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;I)Llm;",
		garbageValue = "-88748057"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Llm;",
		garbageValue = "0"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 87
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 88
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-539238258"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 92
			Arrays.sort(this.array, 0, this.size); // L: 93
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 96
		}

	} // L: 98

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llm;Lla;Lla;B)V",
		garbageValue = "26"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 101
		var1.set(var2, var3); // L: 102
		this.mapPut(var1); // L: 103
	} // L: 104

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llm;S)I",
		garbageValue = "1103"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-189402228"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 114
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername); // L: 115
			}

		}
	} // L: 116

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-1209514498"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1; // L: 119
	} // L: 120

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)V",
		garbageValue = "1"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1); // L: 123
		if (var1.previousUsername != null) { // L: 124
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 125
			if (var2 != null && var2 != var1) { // L: 126
				var2.previousUsername = null; // L: 127
			}
		}

	} // L: 130

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size; // L: 133
		if (var1 < this.size) { // L: 134
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1); // L: 135
		}

	} // L: 137

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "180"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null; // L: 143
	} // L: 144

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1024776023"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) { // L: 147
			this.comparator = var1; // L: 148
		} else if (this.comparator instanceof AbstractUserComparator) { // L: 150
			((AbstractUserComparator)this.comparator).addComparator(var1); // L: 151
		}

	} // L: 153
}
