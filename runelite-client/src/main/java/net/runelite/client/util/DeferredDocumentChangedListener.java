/*
 * Copyright (c) 2019, Owain van Brakel <https://github.com/Owain94>
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
package net.runelite.client.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DeferredDocumentChangedListener implements DocumentListener
{
	private final Timer timer;
	private final List<ChangeListener> listeners;

	public DeferredDocumentChangedListener()
	{
		listeners = new ArrayList<>(25);
		timer = new Timer(200, e -> fireStateChanged());
		timer.setRepeats(false);
	}

	public void addChangeListener(ChangeListener listener)
	{
		listeners.add(listener);
	}

	private void fireStateChanged()
	{
		if (!listeners.isEmpty())
		{
			ChangeEvent evt = new ChangeEvent(this);
			for (ChangeListener listener : listeners)
			{
				listener.stateChanged(evt);
			}
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e)
	{
		timer.restart();
	}

	@Override
	public void removeUpdate(DocumentEvent e)
	{
		timer.restart();
	}

	@Override
	public void changedUpdate(DocumentEvent e)
	{
		timer.restart();
	}

}
