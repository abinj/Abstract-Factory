package factories;

import interfaces.AirForce;
import interfaces.Army;
import interfaces.Navy;
import models.USAirForce;
import models.USArmy;
import models.USNavy;

/**
 * Created by dxuser on 23/1/17.
 */
public class USForceFactory implements ForceFactory {

    @Override
    public Navy createNavy() {
        return new USNavy();
    }

    @Override
    public AirForce createAirForce() {
        return new USAirForce();
    }

    @Override
    public Army createArmy() {
        return new USArmy();
    }
}
