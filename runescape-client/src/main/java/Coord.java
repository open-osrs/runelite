import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("Coord")
public class Coord {
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = 562826067
      )
      @Export("plane")
      public int plane;
      // $FF: renamed from: x int
      @ObfuscatedName("v")
      @ObfuscatedGetter(
            intValue = 2054727359
      )
      @Export("x")
      public int field_54;
      // $FF: renamed from: y int
      @ObfuscatedName("u")
      @ObfuscatedGetter(
            intValue = -1032758603
      )
      @Export("y")
      public int field_55;

      @ObfuscatedSignature(
            signature = "(Lhb;)V"
      )
      public Coord(Coord var1) {
            this.plane = var1.plane;
            this.field_54 = var1.field_54;
            this.field_55 = var1.field_55;
      }

      public Coord(int var1, int var2, int var3) {
            this.plane = var1;
            this.field_54 = var2;
            this.field_55 = var3;
      }

      public Coord(int var1) {
            if (var1 == -1) {
                  this.plane = -1;
            } else {
                  this.plane = var1 >> 28 & 3;
                  this.field_54 = var1 >> 14 & 16383;
                  this.field_55 = var1 & 16383;
            }

      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(I)I",
            garbageValue = "-444536660"
      )
      @Export("packed")
      public int packed() {
            return this.plane << 28 | this.field_54 << 14 | this.field_55;
      }

      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "(Lhb;I)Z",
            garbageValue = "-1914028694"
      )
      @Export("equalsCoord")
      boolean equalsCoord(Coord var1) {
            if (this.plane != var1.plane) {
                  return false;
            } else if (this.field_54 != var1.field_54) {
                  return false;
            } else {
                  return this.field_55 == var1.field_55;
            }
      }

      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "(Ljava/lang/String;I)Ljava/lang/String;",
            garbageValue = "-986705762"
      )
      @Export("toString")
      String toString(String var1) {
            return this.plane + var1 + (this.field_54 >> 6) + var1 + (this.field_55 >> 6) + var1 + (this.field_54 & 63) + var1 + (this.field_55 & 63);
      }

      public boolean equals(Object var1) {
            if (this == var1) {
                  return true;
            } else {
                  return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
            }
      }

      public int hashCode() {
            return this.packed();
      }

      public String toString() {
            return this.toString(",");
      }

      @ObfuscatedName("i")
      @ObfuscatedSignature(
            signature = "(I)V",
            garbageValue = "-2118719705"
      )
      static void method3964() {
            Login.worldSelectOpen = false;
            WorldMapID.leftTitleSprite.drawAt(Login.xPadding, 0);
            class51.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
            FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18);
      }

      @ObfuscatedName("jm")
      @ObfuscatedSignature(
            signature = "(S)V",
            garbageValue = "22280"
      )
      @Export("FriendSystem_invalidateFriends")
      static final void FriendSystem_invalidateFriends() {
            for(int var0 = 0; var0 < Players.Players_count; ++var0) {
                  Player var1 = Client.players[Players.Players_indices[var0]];
                  var1.clearIsFriend();
            }

            KeyHandler.method873();
            if (Varps.clanChat != null) {
                  Varps.clanChat.clearFriends();
            }

      }
}
