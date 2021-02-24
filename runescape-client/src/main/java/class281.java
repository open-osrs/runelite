import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class281 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Ljj;",
      garbageValue = "-723955175"
   )
   @Export("ItemDefinition_get")
   public static ItemComposition ItemDefinition_get(int var0) {
      ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class299.ItemDefinition_archive.takeFile(10, var0);
         var1 = new ItemComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         if (var1.noteTemplate != -1) {
            var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
         }

         if (var1.notedId != -1) {
            var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
         }

         if (var1.placeholderTemplate != -1) {
            var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
         }

         if (!Bounds.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
            var1.name = "Members object";
            var1.isTradable = false;
            var1.groundActions = null;
            var1.inventoryActions = null;
            var1.shiftClickIndex = -1;
            var1.team = 0;
            if (var1.params != null) {
               boolean var3 = false;

               for(Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                  ParamComposition var5 = AbstractArchive.getParamDefinition((int)var4.key);
                  if (var5.autoDisable) {
                     var4.remove();
                  } else {
                     var3 = true;
                  }
               }

               if (!var3) {
                  var1.params = null;
               }
            }
         }

         ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-610394630"
   )
   public static final boolean method5194(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }
}
