/*
 * Copyright (c) 2020 Abex
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
package net.runelite.api;

/**
 * @see ParamHolder
 */
public class ParamID
{
	/**
	 * @see SettingID
	 */
	public static final int SETTING_ID = 1077;
	// defaults to 5
	// 1 is continuous
	public static final int SETTING_SLIDER_STEPS = 1101;
	public static final int SETTING_CUSTOM_TRANSMIT = 1085;
	// defaults to true
	// track is foreground
	public static final int SETTING_FOREGROUND_CLICKZONE = 1105;
	public static final int SETTING_SLIDER_CUSTOM_ONOP = 1106;
	public static final int SETTING_SLIDER_CUSTOM_SETPOS = 1107;
	public static final int SETTING_SLIDER_IS_DRAGGABLE = 1108;
	public static final int SETTING_SLIDER_DEADZONE = 1109;
	public static final int SETTING_SLIDER_DEADTIME = 1110;
}
