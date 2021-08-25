import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -326084773
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -508038247
	)
	@Export("size")
	int size;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("y")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("v")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("f")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lle;",
		garbageValue = "27"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)[Lle;",
		garbageValue = "-1704587572"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2125130390"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1258551000"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Z",
		garbageValue = "34910387"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Lle;",
		garbageValue = "-1682671059"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Lle;",
		garbageValue = "-1111421165"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpp;S)Lle;",
		garbageValue = "128"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Z",
		garbageValue = "-353801645"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)V",
		garbageValue = "-1580486831"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpp;I)Lle;",
		garbageValue = "-1206456197"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpp;Lpp;I)Lle;",
		garbageValue = "-1348608690"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) {
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance();
			var3.set(var1, var2);
			this.arrayAddLast(var3);
			this.mapPut(var3);
			return var3;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lle;",
		garbageValue = "32"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33404231"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lpp;Lpp;I)V",
		garbageValue = "-106594496"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)I",
		garbageValue = "1807525824"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)V",
		garbageValue = "622330141"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lle;I)V",
		garbageValue = "-756176071"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lle;B)V",
		garbageValue = "-48"
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1775037763"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "367562238"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "0"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkx;IIIBZI)V",
		garbageValue = "2053874313"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}
}
