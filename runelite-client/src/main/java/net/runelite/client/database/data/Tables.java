/*
 * This file is generated by jOOQ.
 */
package net.runelite.client.database.data;


import javax.annotation.Generated;
import net.runelite.client.database.data.tables.Loottrackerevents;
import net.runelite.client.database.data.tables.Loottrackerlink;
import net.runelite.client.database.data.tables.Loottrackerloot;
import net.runelite.client.database.data.tables.User;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.11.12"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables
{

	/**
	 * The table <code>PUBLIC.LOOTTRACKEREVENTS</code>.
	 */
	public static final Loottrackerevents LOOTTRACKEREVENTS = net.runelite.client.database.data.tables.Loottrackerevents.LOOTTRACKEREVENTS;

	/**
	 * The table <code>PUBLIC.LOOTTRACKERLINK</code>.
	 */
	public static final Loottrackerlink LOOTTRACKERLINK = net.runelite.client.database.data.tables.Loottrackerlink.LOOTTRACKERLINK;

	/**
	 * The table <code>PUBLIC.LOOTTRACKERLOOT</code>.
	 */
	public static final Loottrackerloot LOOTTRACKERLOOT = net.runelite.client.database.data.tables.Loottrackerloot.LOOTTRACKERLOOT;

	/**
	 * The table <code>PUBLIC.USER</code>.
	 */
	public static final User USER = net.runelite.client.database.data.tables.User.USER;
}
