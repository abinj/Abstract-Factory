package models;

import interfaces.AirForce;

/**
 * Created by dxuser on 23/1/17.
 */
public class IndianAirForce implements AirForce {
    public static final String CHIEF = "Indian Air Force Chief";

    @Override
    public String commanderInChief() {
        return CHIEF;
    }
}
