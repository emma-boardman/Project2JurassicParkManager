package dinosaur_management;
import behaviours.*;
import enclosure_management.*;

public class TRex extends Dinosaur {

public TRex(){
  super();
  noiseBehaviour = new Roar();
  eatingBehaviour = new SwallowWhole();
  // requiredSpaceInMetres = 60;
}
 

}

//can change the attributes of the Trex here