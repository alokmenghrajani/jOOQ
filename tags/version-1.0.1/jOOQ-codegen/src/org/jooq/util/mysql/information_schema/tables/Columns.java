/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
public class Columns extends TableImpl {

	private static final long serialVersionUID = -5908883320521357861L;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final Columns COLUMNS = new Columns();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_CATALOG = new TableFieldImpl<String>("TABLE_CATALOG", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_SCHEMA = new TableFieldImpl<String>("TABLE_SCHEMA", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_NAME = new TableFieldImpl<String>("COLUMN_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> ORDINAL_POSITION = new TableFieldImpl<Integer>("ORDINAL_POSITION", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_DEFAULT = new TableFieldImpl<String>("COLUMN_DEFAULT", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> IS_NULLABLE = new TableFieldImpl<String>("IS_NULLABLE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DATA_TYPE = new TableFieldImpl<String>("DATA_TYPE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> CHARACTER_MAXIMUM_LENGTH = new TableFieldImpl<Integer>("CHARACTER_MAXIMUM_LENGTH", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> CHARACTER_OCTET_LENGTH = new TableFieldImpl<Integer>("CHARACTER_OCTET_LENGTH", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> NUMERIC_PRECISION = new TableFieldImpl<Integer>("NUMERIC_PRECISION", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> NUMERIC_SCALE = new TableFieldImpl<Integer>("NUMERIC_SCALE", Integer.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CHARACTER_SET_NAME = new TableFieldImpl<String>("CHARACTER_SET_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLLATION_NAME = new TableFieldImpl<String>("COLLATION_NAME", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_TYPE = new TableFieldImpl<String>("COLUMN_TYPE", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_KEY = new TableFieldImpl<String>("COLUMN_KEY", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> EXTRA = new TableFieldImpl<String>("EXTRA", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PRIVILEGES = new TableFieldImpl<String>("PRIVILEGES", String.class, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLUMN_COMMENT = new TableFieldImpl<String>("COLUMN_COMMENT", String.class, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super("COLUMNS", InformationSchema.INFORMATION_SCHEMA);
	}
}
