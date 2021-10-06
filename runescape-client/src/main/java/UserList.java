import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1803519821
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -790590989
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1994155047
	)
	@Export("size")
	int size;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("w")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("g")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("v")
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Llu;",
		garbageValue = "396333118"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)[Llu;",
		garbageValue = "1129798936"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-492796417"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1616091928"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1322642519"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Z",
		garbageValue = "70733462"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Llu;",
		garbageValue = "-355619052"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Llu;",
		garbageValue = "-1582886561"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpm;B)Llu;",
		garbageValue = "9"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Z",
		garbageValue = "-1508936158"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V",
		garbageValue = "85"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)Llu;",
		garbageValue = "-1795498440"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)Llu;",
		garbageValue = "-769828477"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Llu;",
		garbageValue = "-2045496453"
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
		garbageValue = "-2014826236"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llu;Lpm;Lpm;B)V",
		garbageValue = "95"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)I",
		garbageValue = "-453240274"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V",
		garbageValue = "-895000135"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)V",
		garbageValue = "8"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llu;I)V",
		garbageValue = "1014932852"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-27"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-166058218"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "586592050"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class21.client.method474();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				CollisionMap.method3418(0);
				Client.field516 = 0;
				Client.field680 = 0;
				Client.timer.method5905(var0);
				if (var0 != 20) {
					class7.method61(false);
				}
			}

			if (var0 != 20 && var0 != 40 && PendingSpawn.field1101 != null) {
				PendingSpawn.field1101.close();
				PendingSpawn.field1101 = null;
			}

			if (Client.gameState == 25) {
				Client.field534 = 0;
				Client.field764 = 0;
				Client.field544 = 1;
				Client.field545 = 0;
				Client.field546 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					TextureProvider.method4433(UserComparator8.archive10, class176.archive8, true, var1);
				} else if (var0 == 11) {
					TextureProvider.method4433(UserComparator8.archive10, class176.archive8, false, 4);
				} else {
					class7.method63();
				}
			} else {
				var1 = class12.method159() ? 0 : 12;
				TextureProvider.method4433(UserComparator8.archive10, class176.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
