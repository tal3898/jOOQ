/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 763286654;

	/**
	 * The singleton instance of <code>dbo.x_test_case_71</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * The column <code>dbo.x_test_case_71.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.x_test_case_71.test_case_64_69_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> TEST_CASE_64_69_ID = createField("test_case_64_69_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.x_test_case_71</code> table reference
	 */
	public XTestCase_71() {
		super("x_test_case_71", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.x_test_case_71</code> table reference
	 */
	public XTestCase_71(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_X_TEST_CASE_71;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71 as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71(alias);
	}
}
