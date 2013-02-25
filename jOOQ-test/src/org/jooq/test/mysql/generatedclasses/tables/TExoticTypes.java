/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TExoticTypes extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1250145665;

	/**
	 * The singleton instance of <code>test.t_exotic_types</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.mysql.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>test.t_exotic_types.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_EXOTIC_TYPES);

	/**
	 * The column <code>test.t_exotic_types.UU</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("t_exotic_types", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_EXOTIC_TYPES_PRIMARY);
	}
}