package dinosaur_management;
import behaviours.*;

public class TRex extends Dinosaur {

public TRex() {
  super();
  noiseBehaviour = new Roar();
  eatingBehaviour = new SwallowWhole();
}
 

}

//can change the attributes of the Trex here