package net.runelite.rs.api;

import net.runelite.api.AbstractArchive;
import net.runelite.api.IndexDataBase;
import net.runelite.mapping.Import;

public interface RSAbstractArchive extends IndexDataBase, AbstractArchive
{
	@Import("takeFile")
	byte[] getConfigData(int archiveId, int fileId);

	@Import("getGroupFileIds")
	@Override
	int[] getFileIds(int group);

	@Import("groupCount")
	@Override
	int getGroupCount();

	@Import("fileIds")
	@Override
	int[][] getFileIds();

	@Import("getFile")
	@Override
	byte[] getFile(int var1, int var2);

	@Import("getGroupFileCount")
	@Override
	int getGroupFileCount(int var1);

	@Import("fileCounts")
	@Override
	int[] getFileCounts();
}
