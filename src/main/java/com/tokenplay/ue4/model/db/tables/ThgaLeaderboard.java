/*
 * This file is generated by jOOQ.
 */
package com.tokenplay.ue4.model.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import com.tokenplay.ue4.model.db.DefaultSchema;
import com.tokenplay.ue4.model.db.Indexes;
import com.tokenplay.ue4.model.db.Keys;
import com.tokenplay.ue4.model.db.tables.records.LeaderboardRecord;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {
    "http://www.jooq.org", "jOOQ version:3.10.6"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({
    "all", "unchecked", "rawtypes"})
public class Tue4Leaderboard extends TableImpl<LeaderboardRecord> {

    private static final long serialVersionUID = 1690965118;

    /**
     * The reference instance of <code>tue4_leaderboard</code>
     */
    public static final Tue4Leaderboard LEADERBOARD = new Tue4Leaderboard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LeaderboardRecord> getRecordType() {
        return LeaderboardRecord.class;
    }

    /**
     * The column <code>tue4_leaderboard.leb_id</code>.
     */
    public final TableField<LeaderboardRecord, String> LEB_ID = createField("leb_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_leaderboard.leb_name</code>.
     */
    public final TableField<LeaderboardRecord, String> LEB_NAME = createField("leb_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_leaderboard.leb_description</code>.
     */
    public final TableField<LeaderboardRecord, String> LEB_DESCRIPTION = createField("leb_description",
        org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tue4_leaderboard.leb_score_formula</code>.
     */
    public final TableField<LeaderboardRecord, String> LEB_SCORE_FORMULA = createField("leb_score_formula",
        org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>tue4_leaderboard</code> table reference
     */
    public Tue4Leaderboard() {
        this(DSL.name("tue4_leaderboard"), null);
    }

    /**
     * Create an aliased <code>tue4_leaderboard</code> table reference
     */
    public Tue4Leaderboard(String alias) {
        this(DSL.name(alias), LEADERBOARD);
    }

    /**
     * Create an aliased <code>tue4_leaderboard</code> table reference
     */
    public Tue4Leaderboard(Name alias) {
        this(alias, LEADERBOARD);
    }

    private Tue4Leaderboard(Name alias, Table<LeaderboardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tue4Leaderboard(Name alias, Table<LeaderboardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEADERBOARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LeaderboardRecord> getPrimaryKey() {
        return Keys.LEADERBOARD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LeaderboardRecord>> getKeys() {
        return Arrays.<UniqueKey<LeaderboardRecord>>asList(Keys.LEADERBOARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Leaderboard as(String alias) {
        return new Tue4Leaderboard(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tue4Leaderboard as(Name alias) {
        return new Tue4Leaderboard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Leaderboard rename(String name) {
        return new Tue4Leaderboard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tue4Leaderboard rename(Name name) {
        return new Tue4Leaderboard(name, null);
    }
}