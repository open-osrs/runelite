import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("mapDotSprites")
   static Sprite[] mapDotSprites;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[Lbd;"
   )
   @Export("messages")
   Message[] messages = new Message[100];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1722504417
   )
   @Export("count")
   int count;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;",
      garbageValue = "1561043824"
   )
   @Export("addMessage")
   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for(int var6 = this.count; var6 > 0; --var6) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3);
      }

      this.messages[0] = var5;
      if (this.count < 100) {
         ++this.count;
      }

      return var5;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lbd;",
      garbageValue = "-55839716"
   )
   @Export("getMessage")
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2110362731"
   )
   @Export("size")
   int size() {
      return this.count;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "488468248"
   )
   public static byte[] method2405(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var3 = (byte[])((byte[])var0);
         return var1 ? UrlRequester.method3460(var3) : var3;
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;I)Lly;",
      garbageValue = "591050656"
   )
   @Export("SpriteBuffer_getIndexedSpriteByName")
   public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
      int var3 = var0.getGroupId(var1);
      int var4 = var0.getFileId(var3, var2);
      byte[] var7 = var0.takeFile(var3, var4);
      boolean var6;
      if (var7 == null) {
         var6 = false;
      } else {
         GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7);
         var6 = true;
      }

      IndexedSprite var5;
      if (!var6) {
         var5 = null;
      } else {
         var5 = ApproximateRouteStrategy.method1304();
      }

      return var5;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lcq;I)V",
      garbageValue = "291320616"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if (var0.isMembersOnly() != Client.isMembersWorld) {
         Client.isMembersWorld = var0.isMembersOnly();
         boolean var1 = var0.isMembersOnly();
         if (var1 != Bounds.ItemDefinition_inMembersWorld) {
            ItemDefinition.ItemDefinition_cached.clear();
            ItemDefinition.ItemDefinition_cachedModels.clear();
            ItemDefinition.ItemDefinition_cachedSprites.clear();
            Bounds.ItemDefinition_inMembersWorld = var1;
         }
      }

      if (var0.properties != Client.worldProperties) {
         Archive var3 = ModeWhere.archive8;
         int var2 = var0.properties;
         if ((var2 & 536870912) != 0) {
            Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
         } else if ((var2 & 1073741824) != 0) {
            Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
         } else {
            Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
         }
      }

      MusicPatchNode.worldHost = var0.host;
      Client.worldId = var0.id;
      Client.worldProperties = var0.properties;
      MouseRecorder.port1 = Client.gameBuild == 0 ? 'ꩊ' : var0.id + '鱀';
      class171.port2 = Client.gameBuild == 0 ? 443 : var0.id + '썐';
      DynamicObject.port3 = MouseRecorder.port1;
   }
}
