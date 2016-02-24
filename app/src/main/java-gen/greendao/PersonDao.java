package greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

/**
 * DAO for table BOX.
 */
public class PersonDao extends AbstractDao<Person, Long> {

    public static final String TABLENAME = "PERSON";

    /**
     * Properties of entity Person.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property vipLevel = new Property(1, Integer.class, "vipLevel", false, "VIPLEVEL");
        public final static Property equipmentId = new Property(2, String.class, "equipmentId", false, "EQUIPMENTID");
        public final static Property userName = new Property(3, String.class, "userName", false, "USERNAME");
        public final static Property sex = new Property(4, String.class, "sex", false, "SEX");
        public final static Property personID = new Property(5, String.class, "personID", false, "PERSONID");
        public final static Property email = new Property(6, String.class, "email", false, "EMAIL");
        public final static Property userIntegral = new Property(7, String.class, "userIntegral", false, "USERINTEGRAL");
        public final static Property role = new Property(8, String.class, "role", false, "ROLE");
        public final static Property deposit = new Property(9, String.class, "deposit", false, "DEPOSIT");
        public final static Property balance = new Property(10, String.class, "balance", false, "BALANCE");
        public final static Property remark = new Property(11, String.class, "remark", false, "REMARK");
        public final static Property psd = new Property(12, String.class, "psd", false, "PSD");
        public final static Property vitality = new Property(13, String.class, "vitality", false, "VITALITY");
        public final static Property isVIP = new Property(14, Integer.class, "isVIP", false, "ISVIP");
    }


    public PersonDao(DaoConfig config) {
        super(config);
    }

    public PersonDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'PERSON' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'VIPLEVEL' INTEGER," + // 1: vipLevel
                "'EQUIPMENTID' TEXT," + // 2: equipmentId
                "'USERNAME' TEXT," + // 3: userName
                "'SEX' TEXT," + // 4: slots
                "'PERSONID' TEXT," + // 5: slots
                "'EMAIL' TEXT," + // 6: slots
                "'USERINTEGRAL' TEXT," + // 7: slots
                "'ROLE' TEXT," + // 8: slots
                "'DEPOSIT' TEXT," + // 9: slots
                "'BALANCE' TEXT," + // 10: slots
                "'REMARK' TEXT," + // 11: slots
                "'PSD' TEXT," + // 12: slots
                "'VITALITY' TEXT," + // 13: slots
                "'ISVIP' Integer);"); // 3: description
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PERSON'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, Person entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer vipLevel = entity.getVipLevel();//vip等级
        if(vipLevel!=null){
            stmt.bindLong(2,vipLevel);
        }

        String equipmentId = entity.getEquipmentId();// 会员手机号码   "equipmentId": "18132165487",
        if (equipmentId != null) {
            stmt.bindString(3, equipmentId);
        }


        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }

        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(5, sex);
        }

        String personID = entity.getPersonID();
        if (personID != null) {
            stmt.bindString(6, personID);
        }

        String email = entity.getEmail();// 邮箱 "email": "",
        if (email != null) {
            stmt.bindString(7, email);
        }

        String userIntegral = entity.getUserIntegral();// 用户积分 "userIntegral": "30",
        if (userIntegral != null) {
            stmt.bindString(8, userIntegral);
        }

        String role = entity.getRole();// 登陆账户角色   "role": "general",
        if(role!=null){
            stmt.bindString(9,role);
        }
        String deposit = entity.getDeposit();// -- 押金
        if(deposit!=null){
            stmt.bindString(10,deposit);
        }
        String balance = entity.getBalance();// --余额
        if(balance!=null){
            stmt.bindString(11,balance);
        }
        String remark = entity.getRemark();//备注
        if(remark!=null){
            stmt.bindString(12,remark);
        }
        String psd = entity.getPsd();//密码
        if(psd!=null){
            stmt.bindString(13,psd);
        }
        String vitality = entity.getVitality();//活跃度
        if(vipLevel!=null){
            stmt.bindString(14,vitality);
        }
        Integer isVIP = entity.getIsVIP();//是否vip，是1，否0
        if(isVIP!=null){
            stmt.bindLong(15,isVIP);
        }

    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Person readEntity(Cursor cursor, int offset) {
        Person entity = new Person(
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // vipLevel
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // equipmentId
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userName
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), //
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), //
                cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), //
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) ,//
                cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) ,//
                cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), //
                cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), //
                cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), //
                cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), //
                cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), //
                cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14)
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, Person entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVipLevel(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setEquipmentId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSex(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPersonID(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEmail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUserIntegral(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRole(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setDeposit(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setBalance(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRemark(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPsd(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setVitality(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setIsVIP(cursor.isNull(offset + 14) ? null : cursor.getInt(offset + 14));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(Person entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(Person entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}