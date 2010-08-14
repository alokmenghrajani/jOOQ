/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import java.sql.Timestamp;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * General log
 */
public class GeneralLog extends TableImpl {

	private static final long serialVersionUID = 3488179440194763607L;

	/**
	 * The singleton instance of general_log
	 */
	public static final GeneralLog GENERAL_LOG = new GeneralLog();

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> EVENT_TIME = new TableFieldImpl<Timestamp>("event_time", Timestamp.class, GENERAL_LOG);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER_HOST = new TableFieldImpl<String>("user_host", String.class, GENERAL_LOG);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> THREAD_ID = new TableFieldImpl<Integer>("thread_id", Integer.class, GENERAL_LOG);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> SERVER_ID = new TableFieldImpl<Integer>("server_id", Integer.class, GENERAL_LOG);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COMMAND_TYPE = new TableFieldImpl<String>("command_type", String.class, GENERAL_LOG);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ARGUMENT = new TableFieldImpl<String>("argument", String.class, GENERAL_LOG);

	/**
	 * No further instances allowed
	 */
	private GeneralLog() {
		super("general_log", Mysql.MYSQL);
	}
}
