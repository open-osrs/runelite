import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class69 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("options_buttons_0Sprite")
   static IndexedSprite options_buttons_0Sprite;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)[Liv;",
      garbageValue = "-52"
   )
   @Export("PlayerType_values")
   public static PlayerType[] PlayerType_values() {
      return new PlayerType[]{PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3132, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman};
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;Lig;Lgg;I)Z",
      garbageValue = "1829730902"
   )
   public static boolean method1256(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
      class206.musicPatchesArchive = var0;
      class206.musicSamplesArchive = var1;
      class206.soundEffectsArchive = var2;
      VertexNormal.midiPcmStream = var3;
      return true;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Llg;ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1852545433"
   )
   static String method1258(IterableNodeHashTable var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lig;Lig;ZII)V",
      garbageValue = "463524240"
   )
   static void method1255(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (Login.clearLoginScreen) {
         if (var3 == 4) {
            Login.loginIndex = 4;
         }

      } else {
         Login.loginIndex = var3;
         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         Login.leftTitleSprite = WorldMapRectangle.convertJpgToSprite(var4);
         Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
         int var5 = Client.worldProperties;
         if ((var5 & 536870912) != 0) {
            Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var5 & 1073741824) != 0) {
            Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else {
            Login.logoSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }

         GrandExchangeOfferNameComparator.titleboxSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         InterfaceParent.titlebuttonSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         Login.runesSprite = MilliClock.method3664(var1, "runes", "");
         Login.title_muteSprite = MilliClock.method3664(var1, "title_mute", "");
         options_buttons_0Sprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         UrlRequester.field1956 = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         Login.options_buttons_2Sprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         WorldMapDecoration.field237 = ChatChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         WorldMapDecoration.field235 = options_buttons_0Sprite.subWidth;
         MouseHandler.field512 = options_buttons_0Sprite.subHeight;
         class9.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
         }

         Canvas.field439 = 0;
         class1.otp = "";
         Login.field1217 = true;
         Login.worldSelectOpen = false;
         if (!WorldMapSectionType.clientPreferences.titleMusicDisabled) {
            Archive var6 = UrlRequester.archive6;
            int var7 = var6.getGroupId("scape main");
            int var8 = var6.getFileId(var7, "");
            GrandExchangeOfferOwnWorldComparator.method1376(2, var6, var7, var8, 255, false);
         } else {
            class206.musicPlayerStatus = 1;
            class206.musicTrackArchive = null;
            class206.musicTrackGroupId = -1;
            SoundSystem.musicTrackFileId = -1;
            DevicePcmPlayerProvider.musicTrackVolume = 0;
            class206.musicTrackBoolean = false;
            class7.pcmSampleLength = 2;
         }

         Actor.method1867(false);
         Login.clearLoginScreen = true;
         Login.xPadding = (GrandExchangeOfferTotalQuantityComparator.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         GraphicsObject.loginBoxCenter = Login.loginBoxX + 180;
         Login.leftTitleSprite.drawAt(Login.xPadding, 0);
         Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-912600065"
   )
   @Export("isCharAlphabetic")
   public static boolean isCharAlphabetic(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "57"
   )
   static final int method1259(int var0, int var1) {
      int var2 = WorldMapSectionType.method320(var0 - 1, var1 - 1) + WorldMapSectionType.method320(var0 + 1, var1 - 1) + WorldMapSectionType.method320(var0 - 1, 1 + var1) + WorldMapSectionType.method320(var0 + 1, 1 + var1);
      int var3 = WorldMapSectionType.method320(var0 - 1, var1) + WorldMapSectionType.method320(1 + var0, var1) + WorldMapSectionType.method320(var0, var1 - 1) + WorldMapSectionType.method320(var0, var1 + 1);
      int var4 = WorldMapSectionType.method320(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }
}
