import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2095812297
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 315027613
	)
	@Export("size")
	int size;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lnc;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("x")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("c")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("j")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0; // L: 10
		this.comparator = null; // L: 14
		this.capacity = var1; // L: 17
		this.array = this.newTypedArray(var1); // L: 18
		this.usernamesMap = new HashMap(var1 / 8); // L: 19
		this.previousUsernamesMap = new HashMap(var1 / 8); // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnc;",
		garbageValue = "-1289438305"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)[Lnc;",
		garbageValue = "-1075861644"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("clear")
	public void clear() {
		this.size = 0; // L: 24
		Arrays.fill(this.array, (Object)null); // L: 25
		this.usernamesMap.clear(); // L: 26
		this.previousUsernamesMap.clear(); // L: 27
	} // L: 28

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	@Export("getSize")
	public int getSize() {
		return this.size; // L: 31
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-33"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size; // L: 35
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)Z",
		garbageValue = "40"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) { // L: 39
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1); // L: 40 41
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "-1870974615"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 45
		return var2 != null ? var2 : this.getByPreviousUsername(var1); // L: 46 47
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "1018627440"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1); // L: 52
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "-927262844"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1); // L: 56 57
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)Z",
		garbageValue = "3"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1); // L: 61
		if (var2 == null) { // L: 62
			return false;
		} else {
			this.remove(var2); // L: 63
			return true; // L: 64
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "639467139"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1); // L: 68
		if (var2 != -1) { // L: 69
			this.arrayRemove(var2); // L: 70
			this.mapRemove(var1); // L: 71
		}
	} // L: 72

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)Lnc;",
		garbageValue = "455290371"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null); // L: 75
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqy;Lqy;I)Lnc;",
		garbageValue = "1062950692"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		User var3 = this.newInstance(); // L: 80
		var3.set(var1, var2); // L: 81
		this.arrayAddLast(var3); // L: 82
		this.mapPut(var3); // L: 83
		return var3; // L: 84
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lnc;",
		garbageValue = "-1217975743"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) { // L: 88
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1); // L: 89
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123073588"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) { // L: 93
			Arrays.sort(this.array, 0, this.size); // L: 94
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator); // L: 97
		}

	} // L: 99

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnc;Lqy;Lqy;B)V",
		garbageValue = "-36"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1); // L: 102
		var1.set(var2, var3); // L: 103
		this.mapPut(var1); // L: 104
	} // L: 105

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)I",
		garbageValue = "13"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) { // L: 108
			if (this.array[var2] == var1) { // L: 109
				return var2;
			}
		}

		return -1; // L: 111
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "2034975080"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) { // L: 115
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnc;B)V",
		garbageValue = "-30"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "1365835101"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1); // L: 124
		if (var1.previousUsername != null) { // L: 125
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1); // L: 126
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1802337929"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	} // L: 138

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2047830543"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;B)V",
		garbageValue = "6"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	} // L: 154

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;IIB)[Lql;",
		garbageValue = "10"
	)
	public static SpritePixels[] method6853(AbstractArchive var0, int var1, int var2) {
		return !GrandExchangeEvent.method6045(var0, var1, var2) ? null : class435.method7695(); // L: 50 51
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lna;FFFI)F",
		garbageValue = "-1623285058"
	)
	static float method6823(class389 var0, float var1, float var2, float var3) {
		float var4 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var1); // L: 116
		if (Math.abs(var4) < class114.field1396) { // L: 117
			return var1;
		} else {
			float var5 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var2); // L: 118
			if (Math.abs(var5) < class114.field1396) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class114.field1394 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = 0.5F * (var6 - var2); // L: 148
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var6 == var1) { // L: 157
								var9 = 2.0F * var17 * var12; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = ((var10 - var11) * var10 * var17 * 2.0F - (var11 - 1.0F) * (var2 - var1)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (var9 * 2.0F < var17 * 3.0F * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var12 * 0.5F * var10)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = MidiPcmStream.method5405(var0.field4363, var0.field4366, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}
}
