package models;

import interfaces.Navy;

/**
 * Created by dxuser on 23/1/17.
 */
public class IndianNavy implements Navy {
    public static final String CHIEF = "Indian Navy Chief";

    @Override
    public String commanderInChief() {
        return CHIEF;
    }
}
