package net.runelite.client.plugins.config;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;
import java.util.List;

class DeferredDocumentChangedListener implements DocumentListener {
	private final Timer timer;
	private final List<ChangeListener> listeners;

	DeferredDocumentChangedListener() {
		listeners = new ArrayList<>(25);
		timer = new Timer(350, e -> fireStateChanged());
		timer.setRepeats(false);
	}

	void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}

	private void fireStateChanged() {
		if (!listeners.isEmpty()) {
			ChangeEvent evt = new ChangeEvent(this);
			for (ChangeListener listener : listeners) {
				listener.stateChanged(evt);
			}
		}
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		timer.restart();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		timer.restart();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		timer.restart();
	}

}
