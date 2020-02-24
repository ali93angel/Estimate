package com.leon.estimate.Tables;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {CalculationInformation.class, Calculation.class, CalculationUserInput.class,
        TaxfifDictionary.class, ServiceDictionary.class, KarbariDictionary.class, ExaminerDuties.class,
        QotrSifoonDictionary.class, QotrEnsheabDictionary.class, NoeVagozariDictionary.class, RequestDictionary.class,
        Images.class, MapScreen.class}, version = 22, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public static final Migration MIGRATION_10_11 = new Migration(21, 22) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
//            database.execSQL("CREATE TABLE \"RequestDictionary\" (\n" +
//                    "\t\"id\"\tINTEGER,\n" +
//                    "\t\"title\"\tTEXT,\n" +
//                    "\t\"isSelected\"\tINTEGER,\n" +
//                    "\t\"isDisabled\"\tINTEGER,\n" +
//                    "\t\"hasSms\"\tINTEGER,\n" +
//                    "\tPRIMARY KEY(\"id\")\n" +
//                    ");");
//            database.execSQL("CREATE TABLE \"my_table_copy\" (\n" +
////                    "\t\"id\"\tINTEGER PRIMARY KEY AUTOINCREMENT," +
//                    "\t\"examinationId\"\tTEXT,\n" +
//                    "\t\"karbariId\"\tINTEGER,\n" +
//                    "\t\"radif\"\tTEXT,\n" +
//                    "\t\"trackNumber\"\tTEXT PRIMARY KEY UNIQUE,\n" +
//                    "\t\"billId\"\tINTEGER,\n" +
//                    "\t\"examinationDay\"\tTEXT,\n" +
//                    "\t\"nameAndFamily\"\tTEXT,\n" +
//                    "\t\"moshtarakMobile\"\tTEXT,\n" +
//                    "\t\"notificationMobile\"\tTEXT,\n" +
//                    "\t\"serviceGroup\"\tTEXT,\n" +
//                    "\t\"address\"\tTEXT,\n" +
//                    "\t\"neighbourBillId\"\tTEXT,\n" +
//                    "\t\"isPeymayesh\"\tINTEGER,\n" +
//                    "\t\"trackingId\"\tTEXT,\n" +
//                    "\t\"requestType\"\tTEXT,\n" +
//                    "\t\"parNumber\"\tTEXT,\n" +
//                    "\t\"zoneId\"\tTEXT,\n" +
//                    "\t\"callerId\"\tTEXT,\n" +
//                    "\t\"zoneTitle\"\tTEXT,\n" +
//                    "\t\"isNewEnsheab\"\tINTEGER,\n" +
//                    "\t\"phoneNumber\"\tTEXT,\n" +
//                    "\t\"mobile\"\tTEXT,\n" +
//                    "\t\"firstName\"\tTEXT,\n" +
//                    "\t\"sureName\"\tTEXT,\n" +
//                    "\t\"hasFazelab\"\tINTEGER,\n" +
//                    "\t\"fazelabInstallDate\"\tTEXT,\n" +
//                    "\t\"isFinished\"\tINTEGER,\n" +
//                    "\t\"eshterak\"\tTEXT,\n" +
//                    "\t\"arse\"\tINTEGER,\n" +
//                    "\t\"aianKol\"\tINTEGER,\n" +
//                    "\t\"aianMaskooni\"\tINTEGER,\n" +
//                    "\t\"aianNonMaskooni\"\tINTEGER,\n" +
//                    "\t\"qotrEnsheabId\"\tINTEGER,\n" +
//                    "\t\"sifoon100\"\tINTEGER,\n" +
//                    "\t\"sifoon125\"\tINTEGER,\n" +
//                    "\t\"sifoon150\"\tINTEGER,\n" +
//                    "\t\"sifoon200\"\tINTEGER,\n" +
//                    "\t\"zarfiatQarardadi\"\tINTEGER,\n" +
//                    "\t\"arzeshMelk\"\tINTEGER,\n" +
//                    "\t\"tedadMaskooni\"\tINTEGER,\n" +
//                    "\t\"tedadTejari\"\tINTEGER,\n" +
//                    "\t\"tedadSaier\"\tINTEGER,\n" +
//                    "\t\"taxfifId\"\tINTEGER,\n" +
//                    "\t\"tedadTaxfif\"\tINTEGER,\n" +
//                    "\t\"nationalId\"\tTEXT,\n" +
//                    "\t\"identityCode\"\tTEXT,\n" +
//                    "\t\"fatherName\"\tTEXT,\n" +
//                    "\t\"postalCode\"\tTEXT,\n" +
//                    "\t\"description\"\tTEXT,\n" +
//                    "\t\"adamTaxfifAb\"\tINTEGER,\n" +
//                    "\t\"adamTaxfifFazelab\"\tINTEGER,\n" +
//                    "\t\"isEnsheabQeirDaem\"\tINTEGER,\n" +
//                    "\t\"hasRadif\"\tINTEGER,\n" +
//                    "\t\"requestDictionaryString\"\tTEXT,\n" +
//                    "\tPRIMARY KEY(\"trackNumber\")\n" +
//                    ");");
            database.execSQL("CREATE TABLE \"my_table_copy\" (\n" +
                    "\t\"id\"\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "\t\"trackingId\"\tTEXT,\n" +
                    "\t\"trackNumber\"\tTEXT,\n" +
                    "\t\"requestType\"\tINTEGER,\n" +
                    "\t\"pariNumber\"\tTEXT,\n" +
                    "\t\"billId\"\tTEXT,\n" +
                    "\t\"radif\"\tTEXT,\n" +
                    "\t\"neighbourBillId\"\tTEXT,\n" +
                    "\t\"zoneId\"\tINTEGER,\n" +
                    "\t\"notificationMobile\"\tTEXT,\n" +
                    "\t\"karbariId\"\tINTEGER,\n" +
                    "\t\"qotrEnsheabId\"\tINTEGER,\n" +
                    "\t\"noeVagozariId\"\tINTEGER,\n" +
                    "\t\"taxfifId\"\tINTEGER,\n" +
                    "\t\"selectedServices\"\tTEXT,\n" +
                    "\t\"phoneNumber\"\tTEXT,\n" +
                    "\t\"mobile\"\tTEXT,\n" +
                    "\t\"firstName\"\tTEXT,\n" +
                    "\t\"sureName\"\tTEXT,\n" +
                    "\t\"arse\"\tINTEGER,\n" +
                    "\t\"aianKol\"\tINTEGER,\n" +
                    "\t\"aianMaskooni\"\tINTEGER,\n" +
                    "\t\"aianTejari\"\tINTEGER,\n" +
                    "\t\"sifoon100\"\tINTEGER,\n" +
                    "\t\"sifoon125\"\tINTEGER,\n" +
                    "\t\"sifoon150\"\tINTEGER,\n" +
                    "\t\"sifoon200\"\tINTEGER,\n" +
                    "\t\"zarfiatQarardadi\"\tINTEGER,\n" +
                    "\t\"arzeshMelk\"\tINTEGER,\n" +
                    "\t\"tedadMaskooni\"\tINTEGER,\n" +
                    "\t\"tedadTejari\"\tINTEGER,\n" +
                    "\t\"tedadSaier\"\tINTEGER,\n" +
                    "\t\"tedadTaxfif\"\tINTEGER,\n" +
                    "\t\"nationalId\"\tTEXT,\n" +
                    "\t\"identityCode\"\tTEXT,\n" +
                    "\t\"fatherName\"\tTEXT,\n" +
                    "\t\"postalCode\"\tTEXT,\n" +
                    "\t\"ensheabQeireDaem\"\tINTEGER,\n" +
                    "\t\"adamTaxfifAb\"\tINTEGER,\n" +
                    "\t\"adamTaxfifFazelab\"\tINTEGER,\n" +
                    "\t\"address\"\tTEXT,\n" +
                    "\t\"description\"\tINTEGER,\n" +
                    "\t\"sent\"\tINTEGER\n" +
                    ");");
            database.execSQL("DROP TABLE CalculationUserInput;\n");
            database.execSQL("ALTER TABLE my_table_copy RENAME TO CalculationUserInput;");
        }
    };

    public static final Migration MIGRATION_17_18 = new Migration(17, 18) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE my_table_copy( \n" +
                    "    id INTEGER, \n" +
                    "    lang INTEGER,\n" +
                    "    data TEXT,\n" +
                    "    PRIMARY KEY (id, lang)\n" +
                    ");\n");
//            database.execSQL("INSERT INTO my_table_copy (id, lang, data)\n" +
//                    "   SELECT id, lang, data FROM my_table;\n");
            database.execSQL("DROP TABLE my_table;\n");
            database.execSQL("ALTER TABLE my_table_copy RENAME TO my_table;");
        }
    };

    public abstract DaoCalculation daoCalculateCalculation();

    public abstract DaoCalculateInfo daoCalculateInfo();

    public abstract DaoCalculationUserInput daoCalculationUserInput();

    public static final Migration MIGRATION_5_6 = new Migration(5, 6) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("DROP TABLE Calculation");
        }
    };
    public static final Migration MIGRATION_13_14 = new Migration(13, 14) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE Images ADD COLUMN peygiri TEXT ");
        }
    };
    public static final Migration MIGRATION_9_10 = new Migration(9, 10) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE Calculation RENAME TO CalculationInformation");
        }
    };
    public static final Migration MIGRATION_14_15 = new Migration(16, 17) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE \"ExaminerDuties\" (\n" +
                    "\t\"id\"\tINTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "\t\"examinationId\"\tTEXT,\n" +
                    "\t\"karbariId\"\tTEXT,\n" +
                    "\t\"radif\"\tTEXT,\n" +
                    "\t\"trackNumber\"\tNUMERIC PRIMARY KEY ,\n" +
                    "\t\"billId\"\tTEXT,\n" +
                    "\t\"examinationDay\"\tTEXT,\n" +
                    "\t\"nameAndFamily\"\tTEXT,\n" +
                    "\t\"moshtarakMobile\"\tTEXT,\n" +
                    "\t\"notificationMobile\"\tTEXT,\n" +
                    "\t\"serviceGroup\"\tTEXT,\n" +
                    "\t\"address\"\tTEXT,\n" +
                    "\t\"neighbourBillId\"\tTEXT,\n" +
                    "\t\"isPeymayesh\"\tINTEGER,\n" +
                    "\t\"trackingId\"\tTEXT,\n" +
                    "\t\"requestType\"\tTEXT,\n" +
                    "\t\"parNumber\"\tTEXT,\n" +
                    "\t\"zoneId\"\tTEXT,\n" +
                    "\t\"callerId\"\tTEXT,\n" +
                    "\t\"zoneTitle\"\tTEXT,\n" +
                    "\t\"isNewEnsheab\"\tINTEGER,\n" +
                    "\t\"phoneNumber\"\tTEXT,\n" +
                    "\t\"mobile\"\tTEXT,\n" +
                    "\t\"firstName\"\tTEXT,\n" +
                    "\t\"sureName\"\tTEXT,\n" +
                    "\t\"hasFazelab\"\tINTEGER,\n" +
                    "\t\"fazelabInstallDate\"\tTEXT,\n" +
                    "\t\"isFinished\"\tINTEGER,\n" +
                    "\t\"eshterak\"\tTEXT,\n" +
                    "\t\"arse\"\tINTEGER,\n" +
                    "\t\"aianKol\"\tINTEGER,\n" +
                    "\t\"aianMaskooni\"\tINTEGER,\n" +
                    "\t\"aianNonMaskooni\"\tINTEGER,\n" +
                    "\t\"qotrEnsheabId\"\tINTEGER,\n" +
                    "\t\"sifoon100\"\tINTEGER,\n" +
                    "\t\"sifoon125\"\tINTEGER,\n" +
                    "\t\"sifoon150\"\tINTEGER,\n" +
                    "\t\"sifoon200\"\tINTEGER,\n" +
                    "\t\"zarfiatQarardadi\"\tINTEGER,\n" +
                    "\t\"arzeshMelk\"\tINTEGER,\n" +
                    "\t\"tedadMaskooni\"\tINTEGER,\n" +
                    "\t\"tedadTejari\"\tINTEGER,\n" +
                    "\t\"tedadSaier\"\tINTEGER,\n" +
                    "\t\"taxfifId\"\tINTEGER,\n" +
                    "\t\"tedadTaxfif\"\tINTEGER,\n" +
                    "\t\"nationalId\"\tTEXT,\n" +
                    "\t\"identityCode\"\tTEXT,\n" +
                    "\t\"fatherName\"\tTEXT,\n" +
                    "\t\"postalCode\"\tTEXT,\n" +
                    "\t\"description\"\tTEXT,\n" +
                    "\t\"adamTaxfifAb\"\tINTEGER,\n" +
                    "\t\"adamTaxfifFazelab\"\tINTEGER,\n" +
                    "\t\"isEnsheabQeirDaem\"\tINTEGER,\n" +
                    "\t\"hasRadif\"\tINTEGER,\n" +
                    "\t\"requestDictionaryString\"\tINTEGER\n" +
                    ");");


        }
    };

    public abstract DaoImages daoImages();

    public abstract DaoMapScreen daoMapScreen();

    public abstract DaoExaminerDuties daoExaminerDuties();

    public abstract DaoKarbariDictionary daoKarbariDictionary();

    public abstract DaoRequestDictionary daoRequestDictionary();

    public abstract DaoNoeVagozariDictionary daoNoeVagozariDictionary();

    public abstract DaoQotrEnsheabDictionary daoQotrEnsheabDictionary();

    public abstract DaoQotrSifoonDictionary daoQotrSifoonDictionary();

    public abstract DaoTaxfifDictionary daoTaxfifDictionary();

    public abstract DaoServiceDictionary daoServiceDictionary();

}
