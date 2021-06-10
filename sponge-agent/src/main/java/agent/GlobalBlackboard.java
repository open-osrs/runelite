/*
 * This file is part of Mixin, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package agent;

import org.spongepowered.asm.service.IGlobalPropertyService;

import java.util.HashMap;
import java.util.Map;

public class GlobalBlackboard implements IGlobalPropertyService {
    private final Map<String, Object> properties = new HashMap<>();

    @Override
    @SuppressWarnings("unchecked")
    public final <T> T getProperty(String key) {
        return (T) this.properties.get(key);
    }

    @Override
    public final void setProperty(String key, Object value) {
        this.properties.put(key, value);
    }

    @Override
    public final <T> T getProperty(String key, T defaultValue) {
        T value = this.getProperty(key);
        return value != null ? value : defaultValue;
    }

    @Override
    public final String getPropertyString(String key, String defaultValue) {
        Object value = this.properties.get(key);
        return value != null ? value.toString() : defaultValue;
    }
}
