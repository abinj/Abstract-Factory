package factories;

import interfaces.AirForce;
import interfaces.Army;
import interfaces.Navy;

/**
 * Created by dxuser on 23/1/17.
 */
public interface ForceFactory {

    public Navy createNavy();

    public AirForce createAirForce();

    public Army createArmy();
}
