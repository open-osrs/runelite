import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -233955523
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2126526035
	)
	@Export("size")
	int size;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "[Ljf;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("n")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("u")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("a")
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Ljf;",
		garbageValue = "551595115"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)[Ljf;",
		garbageValue = "1959965595"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-830188441"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-729089769"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-38"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Z",
		garbageValue = "-1632091525"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Ljf;",
		garbageValue = "-1715419579"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Ljf;",
		garbageValue = "181197805"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Ljf;",
		garbageValue = "-1953560186"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Z",
		garbageValue = "-1728392725"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljf;I)V",
		garbageValue = "1431327027"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkq;I)Ljf;",
		garbageValue = "1944275129"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkq;Lkq;B)Ljf;",
		garbageValue = "-18"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(II)Ljf;",
		garbageValue = "421321691"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1382907285"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Ljf;Lkq;Lkq;B)V",
		garbageValue = "30"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(Ljf;I)I",
		garbageValue = "-473551805"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(Ljf;S)V",
		garbageValue = "28740"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(Ljf;B)V",
		garbageValue = "-110"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(Ljf;I)V",
		garbageValue = "-810709212"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1444172767"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "594179920"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(Ljava/util/Comparator;B)V",
		garbageValue = "-90"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1614220910"
	)
	static final void method5333() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer;
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field907[++Client.field687 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field719[++Client.field718 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2150(var7, (byte)1);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field719[++Client.field718 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2150(var7, (byte)2);
							var8 = var0.readBits(3);
							var4.method2150(var8, (byte)2);
							int var9 = var0.readBits(1);
							if (var9 == 1) {
								Client.field719[++Client.field718 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field907[++Client.field687 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
