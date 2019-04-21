package net.runelite.client.rs.bytecode.transformers;

import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.bytecode.StackMapTable;
import net.runelite.client.rs.bytecode.ByteCodePatcher;

public class BlackjackTransform implements Transform {

	public CtClass ct = null;

	@Override
	public void modify(Class clazz) {
		try {
			ct = ByteCodePatcher.classPool.get(clazz.getName());
			transformProtectedGetMenuOptions();
			transformProtectedGetMenuTargets();
			transformProtectedGetMenuIdentifiers();
			transformProtectedGetMenuTypes();
			transformProtectedGetMenuActionParams0();
			transformProtectedGetMenuActionParams1();

			//transformGetMenuEntries();
			transformSetMenuEntries();
			//transformOnMenuOptionsChanged();

			ByteCodePatcher.modifiedClasses.add(ct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuOptions() {
		CtMethod protectedGetMenuOptions;
		try {
			protectedGetMenuOptions = ct.getDeclaredMethod("1protect$getMenuOptions");
			ct.removeMethod(protectedGetMenuOptions);
			protectedGetMenuOptions.setName("getMenuOptions");
			ct.addMethod(protectedGetMenuOptions);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuTargets() {
		CtMethod protectedGetMenuTargets;
		try {
			protectedGetMenuTargets = ct.getDeclaredMethod("1protect$getMenuTargets");
			ct.removeMethod(protectedGetMenuTargets);
			protectedGetMenuTargets.setName("getMenuTargets");
			ct.addMethod(protectedGetMenuTargets);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuIdentifiers() {
		CtMethod protectedGetMenuIdentifiers;
		try {
			protectedGetMenuIdentifiers = ct.getDeclaredMethod("1protect$getMenuIdentifiers");
			ct.removeMethod(protectedGetMenuIdentifiers);
			protectedGetMenuIdentifiers.setName("getMenuIdentifiers");
			ct.addMethod(protectedGetMenuIdentifiers);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuTypes() {
		CtMethod protectedGetMenuTypes;
		try {
			protectedGetMenuTypes = ct.getDeclaredMethod("1protect$getMenuTypes");
			ct.removeMethod(protectedGetMenuTypes);
			protectedGetMenuTypes.setName("getMenuTypes");
			ct.addMethod(protectedGetMenuTypes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuActionParams0() {
		CtMethod protectedGetMenuActionParams0;
		try {
			protectedGetMenuActionParams0 = ct.getDeclaredMethod("1protect$getMenuActionParams0");
			ct.removeMethod(protectedGetMenuActionParams0);
			protectedGetMenuActionParams0.setName("getMenuActionParams0");
			ct.addMethod(protectedGetMenuActionParams0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformProtectedGetMenuActionParams1() {
		CtMethod protectedGetMenuActionParams1;
		try {
			protectedGetMenuActionParams1 = ct.getDeclaredMethod("1protect$getMenuActionParams1");
			ct.removeMethod(protectedGetMenuActionParams1);
			protectedGetMenuActionParams1.setName("getMenuActionParams1");
			ct.addMethod(protectedGetMenuActionParams1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void transform() {}

	public void transformGetMenuEntries() {}

	public void transformSetMenuEntries() {
		CtMethod setMenuEntries;
		try {
			setMenuEntries = ct.getDeclaredMethods("setMenuEntries"/*, insert net.runelite.api.MenuEntry array here*/)[0];
			ct.removeMethod(setMenuEntries);
			String src;
			setMenuEntries = CtNewMethod.make(
					"public void setMenuEntries(net.runelite.api.MenuEntry[] paramArrayOfMenuEntry) {" +
							"int i = 0;" +
							"String[] arrayOfString1 = this.getMenuOptions();" +
							"String[] arrayOfString2 = this.getMenuTargets();" +
							"int[] arrayOfInt1 = this.getMenuIdentifiers();" +
							"int[] arrayOfInt2 = this.getMenuTypes();" +
							"int[] arrayOfInt3 = this.getMenuActionParams0();" +
							"int[] arrayOfInt4 = this.getMenuActionParams1();" +
							"boolean[] arrayOfBoolean = getMenuForceLeftClick();" +

							"int testingInt[] = {1,2,3,4,5,6};" +

							//net.runelite.api.MenuEntry

							//for all menu entries provided in args
							"for (int m = 0 ; m < paramArrayOfMenuEntry.length ; m++) {" +
								"net.runelite.api.MenuEntry menuEntry = paramArrayOfMenuEntry[m];" +

							//everything here on out should be easy. foreach loops break CtNewMethod

							"}" +
						"}"
					, ct);
			ct.addMethod(setMenuEntries);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transformOnMenuOptionsChanged() {}

}
