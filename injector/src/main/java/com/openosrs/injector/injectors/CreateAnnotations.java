/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.openosrs.injector.injectors;

import com.openosrs.injector.injection.InjectData;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.deob.DeobAnnotations;

/*
 * This handles creating "virtual" annotations to clean up rs-client in the main project
 */
public class CreateAnnotations extends AbstractInjector
{

	public CreateAnnotations(InjectData inject)
	{
		super(inject);
	}

	public void inject()
	{
		for (final ClassFile deobClass : inject.getDeobfuscated())
		{
			injectFields(deobClass);
			injectMethods(deobClass);

			if (deobClass.getName().startsWith("class"))
			{
				continue;
			}

			deobClass.addAnnotation(DeobAnnotations.IMPLEMENTS, deobClass.getName());
		}
	}

	private void injectFields(ClassFile deobClass)
	{
		for (Field deobField : deobClass.getFields())
		{
			deobField.addAnnotation(DeobAnnotations.EXPORT, deobField.getName());
		}
	}

	private void injectMethods(ClassFile deobClass)
	{
		for (Method deobMethod : deobClass.getMethods())
		{
			deobMethod.addAnnotation(DeobAnnotations.EXPORT, deobMethod.getName());
		}
	}
}
