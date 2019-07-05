import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("IsaacCipher")
public final class IsaacCipher {
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1514845493
   )
   int field428;
   @ObfuscatedName("o")
   int[] field429;
   @ObfuscatedName("u")
   int[] field430;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1670027699
   )
   int field431;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -325762649
   )
   int field432;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1951204929
   )
   int field433;

   public IsaacCipher(int[] var1) {
      this.field430 = new int[256];
      this.field429 = new int[256];

      for (int var2 = 0; var2 < var1.length; ++var2) {
         this.field429[var2] = var1[var2];
      }

      this.method139();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-7509790"
   )
   final int method136() {
      if (0 == --this.field428 + 1) {
         this.method138();
         this.field428 = 255;
      }

      return this.field429[this.field428];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-506873526"
   )
   final int method137() {
      if (this.field428 == 0) {
         this.method138();
         this.field428 = 256;
      }

      return this.field429[this.field428 - 1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "124"
   )
   final void method138() {
      this.field432 += ++this.field433;

      for (int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field430[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field431 ^= this.field431 << 13;
            } else {
               this.field431 ^= this.field431 >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.field431 ^= this.field431 << 2;
         } else {
            this.field431 ^= this.field431 >>> 16;
         }

         this.field431 += this.field430[128 + var1 & 255];
         int var3;
         this.field430[var1] = var3 = this.field430[(var2 & 1020) >> 2] + this.field432 + this.field431;
         this.field429[var1] = this.field432 = this.field430[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "579890110"
   )
   final void method139() {
      int var1 = -1640531527;
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;

      int var9;
      for (var9 = 0; var9 < 4; ++var9) {
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
      }

      for (var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.field429[var9];
         var7 += this.field429[var9 + 1];
         var6 += this.field429[var9 + 2];
         var5 += this.field429[var9 + 3];
         var4 += this.field429[var9 + 4];
         var3 += this.field429[var9 + 5];
         var2 += this.field429[var9 + 6];
         var1 += this.field429[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.field430[var9] = var8;
         this.field430[var9 + 1] = var7;
         this.field430[var9 + 2] = var6;
         this.field430[var9 + 3] = var5;
         this.field430[var9 + 4] = var4;
         this.field430[var9 + 5] = var3;
         this.field430[var9 + 6] = var2;
         this.field430[var9 + 7] = var1;
      }

      for (var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.field430[var9];
         var7 += this.field430[var9 + 1];
         var6 += this.field430[var9 + 2];
         var5 += this.field430[var9 + 3];
         var4 += this.field430[var9 + 4];
         var3 += this.field430[var9 + 5];
         var2 += this.field430[var9 + 6];
         var1 += this.field430[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.field430[var9] = var8;
         this.field430[var9 + 1] = var7;
         this.field430[var9 + 2] = var6;
         this.field430[var9 + 3] = var5;
         this.field430[var9 + 4] = var4;
         this.field430[var9 + 5] = var3;
         this.field430[var9 + 6] = var2;
         this.field430[var9 + 7] = var1;
      }

      this.method138();
      this.field428 = 256;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lir;Lir;I)V",
      garbageValue = "75867683"
   )
   public static void method4082(AbstractIndexCache var0, AbstractIndexCache var1) {
      NPCDefinition.NpcDefinition_indexCache = var0;
      NPCDefinition.NpcDefinition_modelIndexCache = var1;
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1676957578"
   )
   static void method4093(int var0) {
      if (var0 == -3) {
         class54.method1089("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         class54.method1089("", "Error connecting to server.", "");
      } else if (var0 == -1) {
         class54.method1089("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         Login.loginIndex = 3;
         Login.field467 = 1;
      } else if (var0 == 4) {
         class32.method578(0);
      } else if (var0 == 5) {
         Login.field467 = 2;
         class54.method1089("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if (var0 != 68 && (Client.field162 || var0 != 6)) {
         if (var0 == 7) {
            class54.method1089("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            class54.method1089("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            class54.method1089("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            class54.method1089("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            class54.method1089("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            class54.method1089("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            class54.method1089("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            class54.method1089("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            class54.method1089("Too many login attempts.", "Please wait a few minutes before trying again.", "");
         } else if (var0 == 17) {
            class54.method1089("You are standing in a members-only area.", "To play on this world move to a free area first", "");
         } else if (var0 == 18) {
            class32.method578(1);
         } else if (var0 == 19) {
            class54.method1089("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            class54.method1089("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            class54.method1089("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            class54.method1089("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            class54.method1089("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            class54.method1089("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            class54.method1089("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            class54.method1089("", "Service unavailable.", "");
         } else if (var0 == 31) {
            class54.method1089("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            class54.method1089("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
         } else if (var0 == 37) {
            class54.method1089("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            class54.method1089("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            Login.loginIndex = 8;
         } else {
            if (var0 == 56) {
               class54.method1089("Enter the 6-digit code generated by your", "authenticator app.", "");
               GameShell.updateGameState(11);
               return;
            }

            if (var0 == 57) {
               class54.method1089("The code you entered was incorrect.", "Please try again.", "");
               GameShell.updateGameState(11);
               return;
            }

            if (var0 == 61) {
               Login.loginIndex = 7;
            } else {
               class54.method1089("Unexpected server response", "Please try using a different world.", "");
            }
         }
      } else {
         class54.method1089("RuneScape has been updated!", "Please reload this page.", "");
      }

      GameShell.updateGameState(10);
   }
}
