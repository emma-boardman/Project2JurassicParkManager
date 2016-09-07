package dinosaur_management;
import behaviours.*;
import enclosure_management.*;

public class TRex extends Dinosaur {

public TRex(){
  super();
  noiseBehaviour = new Roar();
  eatingBehaviour = new SwallowWhole();
  dietaryRequirements = new Carnivore(); 
  // requiredSpaceInMetres = 60;
}
 

}

//can change the attributes of the Trex here