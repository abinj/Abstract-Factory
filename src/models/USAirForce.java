package models;

import interfaces.AirForce;

/**
 * Created by dxuser on 23/1/17.
 */
public class USAirForce implements AirForce {
    public static final String CHIEF = "US AirForce Chief";

    @Override
    public String commanderInChief() {
        return CHIEF;
    }
}
