/*******************************************************************************
 * Copyright (c) 2019 RuneLitePlus
 * Redistributions and modifications of this software are permitted as long as this notice remains in its original unmodified state at the top of this file.
 * If there are any questions comments, or feedback about this software, please direct all inquiries directly to the file authors:
 * ST0NEWALL#9112
 * RuneLitePlus Discord: https://discord.gg/Q7wFtCe
 * RuneLitePlus website: https://runelitepl.us
 ******************************************************************************/

package net.runelite.client.config;


import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnumList<eEnum>
{



	@Getter
	private transient Class<? extends eEnum> eEnum;
	private transient List<? extends eEnum> values;
	@SerializedName("selected_values")
	private List<? extends eEnum> selectedValues;

	public EnumList(Class<? extends eEnum> clz)
	{
		values = Arrays.asList(clz.getEnumConstants());
		eEnum = clz;
	}


	public void setEnum(Class<? extends eEnum> eEnum)
	{
		if (!eEnum.isEnum())
		{
			throw new AssertionError();
		}

		this.eEnum = eEnum;
		this.values = Arrays.asList(eEnum.getEnumConstants());
	}

	public List<? extends eEnum> getValues()
	{
		return values;
	}

	public eEnum[] getSelectedValues()
	{
		if (this.selectedValues == null)
		{
			return null;
		}
		return (eEnum[]) this.selectedValues.toArray();
	}

	public void setSelectedValues(List selectedValues)
	{
		log.info(String.valueOf(selectedValues));
		this.selectedValues = selectedValues;
		//Arrays.stream(selectedValues.split(",")).forEach(s -> Enum.valueOf(eEnum, s)).;
		//this.selectedValues = selectedValues;
	}
}
