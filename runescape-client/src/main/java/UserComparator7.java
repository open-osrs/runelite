import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ez")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
   @ObfuscatedName("m")
   final boolean field939;

   public UserComparator7(boolean var1) {
      this.field939 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lke;Lke;I)I",
      garbageValue = "-9252550"
   )
   int method349(Buddy var1, Buddy var2) {
      return var1.world0 != 0 && var2.world0 != 0 ? (this.field939 ? var1.int2 - var2.int2 : var2.int2 - var1.int2) : this.method12(var1, var2);
   }

   @Export("compare")
   @ObfuscatedName("compare")
   public int compare(Object var1, Object var2) {
      return this.method349((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgr;II)V",
      garbageValue = "-88211227"
   )
   public static void method3360(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.size = var0.readUnsignedByte();
      var2.id = var0.readInt();
      var2.operations = new int[var2.size];
      var2.creationErrors = new int[var2.size];
      var2.fields = new Field[var2.size];
      var2.intReplaceValues = new int[var2.size];
      var2.methods = new Method[var2.size];
      var2.arguments = new byte[var2.size][][];

      for (int var3 = 0; var3 < var2.size; ++var3) {
         try {
            int var4 = var0.readUnsignedByte();
            String var5;
            String var6;
            int var7;
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.readStringCp1252NullTerminated();
                  var6 = var0.readStringCp1252NullTerminated();
                  var7 = var0.readUnsignedByte();
                  String[] var8 = new String[var7];

                  for (int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.readStringCp1252NullTerminated();
                  }

                  String var26 = var0.readStringCp1252NullTerminated();
                  byte[][] var10 = new byte[var7][];
                  int var11;
                  if (var4 == 3) {
                     for (int var12 = 0; var12 < var7; ++var12) {
                        var11 = var0.readInt();
                        var10[var12] = new byte[var11];
                        var0.method46(var10[var12], 0, var11);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var27 = new Class[var7];

                  for (var11 = 0; var11 < var7; ++var11) {
                     var27[var11] = VarcInt.loadClassFromDescriptor(var8[var11]);
                  }

                  Class var13 = VarcInt.loadClassFromDescriptor(var26);
                  if (VarcInt.loadClassFromDescriptor(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var14 = VarcInt.loadClassFromDescriptor(var5).getDeclaredMethods();
                  Method[] var15 = var14;

                  for (int var16 = 0; var16 < var15.length; ++var16) {
                     Method var17 = var15[var16];
                     if (Reflection.getMethodName(var17).equals(var6)) {
                        Class[] var18 = Reflection.getParameterTypes(var17);
                        if (var27.length == var18.length) {
                           boolean var19 = true;

                           for (int var20 = 0; var20 < var27.length; ++var20) {
                              if (var27[var20] != var18[var20]) {
                                 var19 = false;
                                 break;
                              }
                           }

                           if (var19 && var13 == var17.getReturnType()) {
                              var2.methods[var3] = var17;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               var5 = var0.readStringCp1252NullTerminated();
               var6 = var0.readStringCp1252NullTerminated();
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.readInt();
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (VarcInt.loadClassFromDescriptor(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = Reflection.findField(VarcInt.loadClassFromDescriptor(var5), var6);
            }
         } catch (ClassNotFoundException var21) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var22) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var23) {
            var2.creationErrors[var3] = -3;
         } catch (Exception var24) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var25) {
            var2.creationErrors[var3] = -5;
         }
      }

      class322.reflectionChecks.addFirst(var2);
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2084569794"
   )
   static final boolean method3364(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var1 = Client.menuOpcodes[var0];
         if (var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }
}
