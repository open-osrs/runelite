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
	int getGroupCount();

	@Import("fileIds")
	int[][] getFileIds();

	@Import("getFile")
	byte[] getFile(int var1, int var2);

	@Import("getGroupFileCount")

	int getGroupFileCount(int var1);

	@Import("fileCounts")
	int[] getFileCounts();
}
