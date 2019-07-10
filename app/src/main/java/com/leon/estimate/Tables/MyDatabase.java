package com.leon.estimate.Tables;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {CalculationInfo.class, Calculation.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract DaoCalculateInfo daoCalcuateInfo();

    public abstract DaoCalculation daoCalculateCalculation();
}
