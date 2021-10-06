package net.runelite.rs.api;

import net.runelite.api.Buffer;
import net.runelite.mapping.Import;

public interface RSBuffer extends Buffer, RSNode
{
	@Import("array")
	byte[] getPayload();

	@Import("offset")
	int getOffset();

	@Import("offset")
	void setOffset(int offset);

	@Import("writeByte")
	@Override
	void writeByte(int var1);

	@Import("writeShort")
	@Override
	void writeShort(int var1);

	@Import("writeMedium")
	@Override
	void writeMedium(int var1);

	@Import("writeInt")
	@Override
	void writeInt(int var1);

	@Import("writeLong")
	@Override
	void writeLong(long var1);

	@Import("writeStringCp1252NullTerminated")
	@Override
	void writeStringCp1252NullTerminated(String string);

	@Import("readUnsignedByte")
	int readUnsignedByte();

	@Import("readByte")
	byte readByte();

	@Import("readUnsignedShort")
	int readUnsignedShort();

	@Import("readShort")
	int readShort();

	@Import("readInt")
	int readInt();

	@Import("readStringCp1252NullTerminated")
	String readStringCp1252NullTerminated();
}