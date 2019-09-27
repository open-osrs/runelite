package net.runelite.rs;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class Reflection {
      private static final boolean PRINT_DEBUG_MESSAGES = true;
      private static Map classes = new HashMap();

      public static Class findClass(String name) throws ClassNotFoundException {
            Class clazz = (Class)classes.get(name);
            if (clazz != null) {
                  return clazz;
            } else {
                  System.out.println("Server requested dummy class " + name);
                  return Class.forName(name);
            }
      }

      public static Field findField(Class clazz, String name) throws NoSuchFieldException {
            System.out.println("Looking for field " + name + " in " + clazz);
            Field[] var2 = clazz.getDeclaredFields();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                  Field f = var2[var4];
                  ObfuscatedName annotation = (ObfuscatedName)f.getAnnotation(ObfuscatedName.class);
                  if (annotation != null && annotation.value().equals(name)) {
                        return f;
                  }
            }

            System.out.println("Server requested dummy field " + name + " in " + clazz);
            return clazz.getDeclaredField(name);
      }

      public static String getMethodName(Method method) {
            ObfuscatedName annotation = (ObfuscatedName)method.getAnnotation(ObfuscatedName.class);
            return annotation != null ? annotation.value() : method.getName();
      }

      public static Class[] getParameterTypes(Method method) {
            ObfuscatedSignature sig = (ObfuscatedSignature)method.getAnnotation(ObfuscatedSignature.class);
            Class[] types = method.getParameterTypes();
            if (sig == null) {
                  return types;
            } else {
                  String s = sig.signature();
                  int i = s.lastIndexOf(41);
                  char c = s.charAt(i - 1);
                  Class last;
                  switch(c) {
                  case 'B':
                        last = Byte.TYPE;
                        break;
                  case 'I':
                        last = Integer.TYPE;
                        break;
                  case 'S':
                        last = Short.TYPE;
                        break;
                  default:
                        throw new IllegalStateException();
                  }

                  types = (Class[])Arrays.copyOf(types, types.length + 1);
                  types[types.length - 1] = last;
                  return types;
            }
      }

      public static int getInt(Field field, Object obj) throws IllegalArgumentException, IllegalAccessException {
            System.out.println("Getting field " + field);
            boolean unset = false;
            if ((field.getModifiers() & 2) == 0) {
                  field.setAccessible(true);
                  unset = true;
            }

            int i;
            try {
                  i = field.getInt(obj);
            } catch (Exception var9) {
                  var9.printStackTrace();
                  throw var9;
            } finally {
                  if (unset) {
                        field.setAccessible(false);
                  }

            }

            ObfuscatedGetter og = (ObfuscatedGetter)field.getAnnotation(ObfuscatedGetter.class);
            if (og != null) {
                  int getter = og.intValue();
                  int setter = modInverse(getter);
                  i *= setter;
            }

            return i;
      }

      public static void setInt(Field field, Object obj, int value) throws IllegalArgumentException, IllegalAccessException {
            System.out.println("Setting field " + field + " to " + value);
            ObfuscatedGetter og = (ObfuscatedGetter)field.getAnnotation(ObfuscatedGetter.class);
            if (og != null) {
                  int getter = og.intValue();
                  value *= getter;
            }

            boolean unset = false;
            if ((field.getModifiers() & 2) == 0) {
                  field.setAccessible(true);
                  unset = true;
            }

            try {
                  field.setInt(obj, value);
            } finally {
                  if (unset) {
                        field.setAccessible(false);
                  }

            }

      }

      public static BigInteger modInverse(BigInteger val, int bits) {
            BigInteger shift = BigInteger.ONE.shiftLeft(bits);
            return val.modInverse(shift);
      }

      public static int modInverse(int val) {
            return modInverse(BigInteger.valueOf((long)val), 32).intValue();
      }

      public static Object invoke(Method method, Object object, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            System.out.println("Invoking " + method);

            try {
                  return method.invoke(object, args);
            } catch (Throwable var4) {
                  var4.printStackTrace();
                  throw var4;
            }
      }

      static {
            Path path;
            try {
                  for(Enumeration systemResources = ClassLoader.getSystemResources(""); systemResources.hasMoreElements(); Files.walk(path).filter((x$0) -> {
                        return Files.isRegularFile(x$0, new LinkOption[0]);
                  }).forEach((f) -> {
                        String className = f.getName(f.getNameCount() - 1).toString().replace(".class", "");

                        try {
                              Class clazz = Class.forName(className);
                              ObfuscatedName obfuscatedName = (ObfuscatedName)clazz.getAnnotation(ObfuscatedName.class);
                              if (obfuscatedName != null) {
                                    classes.put(obfuscatedName.value(), clazz);
                              }
                        } catch (ClassNotFoundException var4) {
                              ;
                        }

                  })) {
                        URL url = (URL)systemResources.nextElement();

                        try {
                              path = (new File(url.toURI())).toPath();
                        } catch (URISyntaxException var4) {
                              path = (new File(url.getPath())).toPath();
                        }
                  }
            } catch (IOException var5) {
                  var5.printStackTrace();
            }

      }
}
