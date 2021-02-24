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
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1596118633
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 201704809
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Ljn;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("z")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("e")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("q")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-315842787"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)[Ljn;",
      garbageValue = "1723641195"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-16027"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "687"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.size == this.capacity;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Z",
      garbageValue = "-1403863390"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Ljn;",
      garbageValue = "2091513607"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Ljn;",
      garbageValue = "1389255330"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lkk;B)Ljn;",
      garbageValue = "106"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Z",
      garbageValue = "925545602"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljn;I)V",
      garbageValue = "1008503929"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lkk;I)Ljn;",
      garbageValue = "1681859445"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lkk;Lkk;I)Ljn;",
      garbageValue = "1304686486"
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

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljn;",
      garbageValue = "12"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1849487850"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljn;Lkk;Lkk;I)V",
      garbageValue = "1325828813"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ljn;B)I",
      garbageValue = "113"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljn;I)V",
      garbageValue = "-1644008169"
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
      descriptor = "(Ljn;B)V",
      garbageValue = "-53"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljn;I)V",
      garbageValue = "-669871077"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "53"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1607977980"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;B)V",
      garbageValue = "-22"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }
}
