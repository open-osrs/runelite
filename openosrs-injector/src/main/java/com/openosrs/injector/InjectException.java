/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 */
package com.openosrs.injector;

public class InjectException extends RuntimeException
{
	public InjectException(String message)
	{
		super(message);
	}

	public InjectException(Throwable cause)
	{
		super(cause);
	}

	public InjectException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
