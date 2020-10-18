/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ConfigItem
{
	/**
	 * If there is a section set, it will display in order
	 * starting from lowest value and ending at highest value
	 * in that specific section. Else, it will display in order
	 * for the config panel in a whole.
	 *
	 * @return The index of the config item.
	 */
	int position() default -1;

	/**
	 * This is not visible to users
	 *
	 * @return name used for finding the config item
	 * from the properties map. Hence, KEY name.
	 */
	String keyName();

	/**
	 * This is the name that is shown to users when looking
	 * at the config panel.
	 * <p>
	 * Choose a name carefully, as there is a maximum width
	 * that depends on the users DPI scaling. Short is best.
	 *
	 * @return display name for the config item.
	 */
	String name();

	/**
	 * This will be shown to the user if they are hovering
	 * the config item in the config panel.
	 *
	 * @return the description of the config item.
	 */
	String description();

	/**
	 * If this is set to true, the config field will be
	 * hidden. You are able to change this value at runtime
	 * by having another config field unhide it {@link #unhide()}
	 */
	boolean hidden() default false;

	/**
	 * This is only used for {@link Boolean} config fields.
	 * <p>
	 * If this is set, then a warning(y/n) will be displayed
	 * when the user enables said config field. If they accept
	 * then the value will be set updated.
	 *
	 * @return a warning for enabling the config field.
	 */
	String warning() default "";

	/**
	 * This is only used for {@link String} config fields.
	 * <p>
	 * If this is set to true, any input from the user
	 * will be hidden, and not displayed. This should
	 * be used for any sensitive information that may
	 * be accidentally leaked.
	 * <p>
	 * For example; api keys.
	 */
	boolean secret() default false;

	/**
	 * If this is set, it will look for a section
	 * by that {@link ConfigSection#name()}, if it exists,
	 * it will insert the config item under that
	 * section in order.
	 *
	 * @return title of the section.
	 */
	String section() default "";

	/**
	 * If this is set, it will look for a title section
	 * by that {@link ConfigTitleSection#name()}, if it exists,
	 * it will insert the config item under that
	 * section in order.
	 *
	 * @return title of the section.
	 */
	String titleSection() default "";

	/**
	 * If this is set, it will look for a config item
	 * by that name. If it is hidden, it will unhide the item.
	 *
	 * @return {@link #name()} to unhide.
	 */
	String unhide() default "";

	String unhideValue() default "";

	/**
	 * If this is set, it will look for a config item
	 * by that name. If it is not hidden, it will hide the item.
	 *
	 * @return {@link #name()} to hide.
	 */
	String hide() default "";

	String hideValue() default "";

	/**
	 * If this is set, it will look for a config item
	 * by the name provided, if that config item is enabled
	 * then this item will also be enabled.
	 */
	String enabledBy() default "";

	String enabledByValue() default "";

	/**
	 * If this is set, it will look for a config item
	 * by the name provided, if that config item is disabled
	 * then this item will also be disabled.
	 */
	String disabledBy() default "";

	String disabledByValue() default "";

	boolean parse() default false;

	Class<?> clazz() default void.class;

	String method() default "";

	/**
	 * Use this to indicate the enum class that is going to be used in the multiple select config.
	 * This implementation made debugging problems with multiple selects a lot easier
	 *
	 * @return The Enum that will be used for the multiple select
	 */
	Class<? extends Enum> enumClass() default Enum.class;

}
