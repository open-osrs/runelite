import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public final class class52 {
   @ObfuscatedName("su")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1687421711
   )
   @Export("ItemDefinition_fileCount")
   public static int ItemDefinition_fileCount;
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive0")
   static Archive archive0;

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1618970834"
   )
   @Export("getLoginError")
   static void getLoginError(int var0) {
      if (var0 == -3) {
         InvDefinition.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         InvDefinition.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
      } else if (var0 == -1) {
         InvDefinition.setLoginResponseString("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         Login.loginIndex = 3;
         Login.field1207 = 1;
      } else if (var0 == 4) {
         WorldMapDecoration.method406(0);
      } else if (var0 == 5) {
         Login.field1207 = 2;
         InvDefinition.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
         if (var0 == 7) {
            InvDefinition.setLoginResponseString("This world is full.", "Please use a different world.", "");
         } else if (var0 == 8) {
            InvDefinition.setLoginResponseString("Unable to connect.", "Login server offline.", "");
         } else if (var0 == 9) {
            InvDefinition.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
         } else if (var0 == 10) {
            InvDefinition.setLoginResponseString("Unable to connect.", "Bad session id.", "");
         } else if (var0 == 11) {
            InvDefinition.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
         } else if (var0 == 12) {
            InvDefinition.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
         } else if (var0 == 13) {
            InvDefinition.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
         } else if (var0 == 14) {
            InvDefinition.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 16) {
            InvDefinition.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
         } else if (var0 == 17) {
            InvDefinition.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
         } else if (var0 == 18) {
            WorldMapDecoration.method406(1);
         } else if (var0 == 19) {
            InvDefinition.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
         } else if (var0 == 20) {
            InvDefinition.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
         } else if (var0 == 22) {
            InvDefinition.setLoginResponseString("Malformed login packet.", "Please try again.", "");
         } else if (var0 == 23) {
            InvDefinition.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
         } else if (var0 == 24) {
            InvDefinition.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
         } else if (var0 == 25) {
            InvDefinition.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
         } else if (var0 == 26) {
            InvDefinition.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
         } else if (var0 == 27) {
            InvDefinition.setLoginResponseString("", "Service unavailable.", "");
         } else if (var0 == 31) {
            InvDefinition.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
         } else if (var0 == 32) {
            InvDefinition.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
         } else if (var0 == 37) {
            InvDefinition.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
         } else if (var0 == 38) {
            InvDefinition.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
         } else if (var0 == 55) {
            Login.loginIndex = 8;
         } else {
            if (var0 == 56) {
               InvDefinition.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
               ItemContainer.updateGameState(11);
               return;
            }

            if (var0 == 57) {
               InvDefinition.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
               ItemContainer.updateGameState(11);
               return;
            }

            if (var0 == 61) {
               Login.loginIndex = 7;
            } else {
               InvDefinition.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
            }
         }
      } else {
         InvDefinition.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
      }

      ItemContainer.updateGameState(10);
   }
}
