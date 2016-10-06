package com.tes.vi.sampleoop;

import com.tes.vi.sampleoop.stockbreeding.Duck;
import com.tes.vi.sampleoop.stockbreeding.DuckData;

/**
 * Created by taufiqotulfaidah on 10/6/16.
 */

public class HisDuck extends Duck {

    public HisDuck(String hoby){
        this.hoby = hoby;
    }

    @Override
    public String color() {
        return "grey";
    }

    @Override
    protected String favFood() {
        return super.favFood();
    }

    public DuckData dataHisDuck(){
        DuckData duckData = new DuckData();
        duckData.setColor(color());
        duckData.setHoby(this.hoby);
        duckData.setSound(speak());

        return duckData;
    }
}
