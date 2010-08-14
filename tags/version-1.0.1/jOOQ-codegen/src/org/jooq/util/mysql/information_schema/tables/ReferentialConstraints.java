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
public class ReferentialConstraints extends TableImpl {

	private static final long serialVersionUID = 6954693956045210597L;

	/**
	 * The singleton instance of REFERENTIAL_CONSTRAINTS
	 */
	public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_CATALOG = new TableFieldImpl<String>("CONSTRAINT_CATALOG", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_SCHEMA = new TableFieldImpl<String>("CONSTRAINT_SCHEMA", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CONSTRAINT_NAME = new TableFieldImpl<String>("CONSTRAINT_NAME", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> UNIQUE_CONSTRAINT_CATALOG = new TableFieldImpl<String>("UNIQUE_CONSTRAINT_CATALOG", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> UNIQUE_CONSTRAINT_SCHEMA = new TableFieldImpl<String>("UNIQUE_CONSTRAINT_SCHEMA", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> UNIQUE_CONSTRAINT_NAME = new TableFieldImpl<String>("UNIQUE_CONSTRAINT_NAME", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> MATCH_OPTION = new TableFieldImpl<String>("MATCH_OPTION", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> UPDATE_RULE = new TableFieldImpl<String>("UPDATE_RULE", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DELETE_RULE = new TableFieldImpl<String>("DELETE_RULE", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TABLE_NAME = new TableFieldImpl<String>("TABLE_NAME", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> REFERENCED_TABLE_NAME = new TableFieldImpl<String>("REFERENCED_TABLE_NAME", String.class, REFERENTIAL_CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private ReferentialConstraints() {
		super("REFERENTIAL_CONSTRAINTS", InformationSchema.INFORMATION_SCHEMA);
	}
}
