/*
 *  Copyright (c) 2019, ThatGamerBlue <thatgamerblue@gmail.com>
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package us.runelitepl.mixinprocessor.generators;

import javassist.CannotCompileException;
import javassist.CtClass;
import us.runelitepl.mixinprocessor.MixinProcessorMojo;
import us.runelitepl.mixinprocessor.parsers.FieldAnnotationParser;
import us.runelitepl.mixinprocessor.parsers.MethodAnnotationParser;
import us.runelitepl.mixinprocessor.util.JavassistUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class AnnotationProcessor
{
	
	private final String className;
	private final byte[] finalCode;
	
	public AnnotationProcessor(String className, byte[] finalCode)
	{
		this.className = className;
		this.finalCode = finalCode;
	}
	
	public byte[] run() throws IOException, CannotCompileException, ClassNotFoundException
	{
		byte[] newCode = finalCode;
		
		CtClass clazz = MixinProcessorMojo.classPool.makeClass(new ByteArrayInputStream(newCode));
		new FieldAnnotationParser(clazz).run();
		new MethodAnnotationParser(clazz).run();
		newCode = JavassistUtils.getClassBytecode(clazz);
		
		return newCode;
	}
	
}
