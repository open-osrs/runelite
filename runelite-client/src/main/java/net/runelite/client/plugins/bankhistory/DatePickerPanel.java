/*
 * Copyright (c) 2020, Adrian Lee Elder <https://github.com/AdrianLeeElder>
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
package net.runelite.client.plugins.bankhistory;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import static net.runelite.client.plugins.bankhistory.BankHistoryPanel.getComboBoxModel;
import net.runelite.client.ui.ColorScheme;
import org.apache.commons.lang3.StringUtils;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class DatePickerPanel extends JPanel
{
	private final String labelText;
	private final LocalDateTime localDateTime;
	private final Consumer<Void> callback;
	private UtilDateModel model;
	private JComboBox<String> hour;
	private JComboBox<String> minute;
	private JComboBox<String> amPm;

	public DatePickerPanel(LocalDateTime localDateTime, String labelText, Consumer<Void> callback)
	{
		super();
		this.localDateTime = localDateTime;
		this.labelText = labelText;
		this.callback = callback;
	}

	protected static List<String> getArrayOfIntegers(int start, int end, boolean pad)
	{
		return Stream.iterate(start, n -> n + 1)
			.limit(end)
			.map(v -> getFormattedTimeString(String.valueOf(v), pad))
			.collect(Collectors.toCollection(ArrayList::new));
	}

	protected static List<String> getArrayOfIntegers(int start, int end)
	{
		return getArrayOfIntegers(start, end, true);
	}

	protected static String getFormattedTimeString(String s, boolean pad)
	{
		return pad ? StringUtils.leftPad(s, 2, '0') : s;
	}

	public void init()
	{
		setLayout(new BorderLayout());
		model = new UtilDateModel(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl picker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

		picker.setTextEditable(true);

		hour = new JComboBox<>();
		hour.setModel(getComboBoxModel(getArrayOfIntegers(1, 12)));
		hour.setSelectedItem("12");
		minute = new JComboBox<>();
		minute.setModel(getComboBoxModel(getArrayOfIntegers(0, 60)));
		minute.setSelectedItem("00");
		amPm = new JComboBox<>(new Vector<>(Arrays.asList("AM", "PM")));
		amPm.setSelectedItem("AM");

		addListeners();

		JPanel timePanel = new JPanel();
		timePanel.setLayout(new BoxLayout(timePanel, BoxLayout.LINE_AXIS));
		timePanel.add(hour);
		timePanel.add(Box.createHorizontalGlue());
		timePanel.add(minute);
		timePanel.add(Box.createHorizontalGlue());
		timePanel.add(amPm);

		JPanel containerPanel = new JPanel();
		containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.PAGE_AXIS));
		containerPanel.add(picker);
		containerPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		containerPanel.add(timePanel);

		add(containerPanel);
		setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5),
			BorderFactory.createTitledBorder(labelText)));
		setBackground(ColorScheme.DARKER_GRAY_COLOR);
	}

	private void addListeners()
	{
		model.addChangeListener((event) -> callback.accept(null));
		hour.addItemListener((event) -> callback.accept(null));
		minute.addItemListener((event) -> callback.accept(null));
		amPm.addItemListener((event) -> callback.accept(null));
	}

	public LocalDateTime getLocalDateTime()
	{
		if (hour == null || amPm == null || model == null || minute == null || minute.getSelectedItem() == null)
		{
			return null;
		}

		int h = Integer.parseInt(String.valueOf(hour.getSelectedItem()).replaceAll("^0+", "")) - 1;

		if (amPm.getSelectedItem() == "PM")
		{
			h += 12;
		}
		return LocalDateTime.of(model.getYear(),
			model.getMonth() + 1,
			model.getDay(),
			h,
			Integer.parseInt((String) minute.getSelectedItem()),
			0,
			0);
	}
}
