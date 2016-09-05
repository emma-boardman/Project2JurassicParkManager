package dinosaur_management;
import behaviours.*;

public class SpeciesOfDinosaurLab extends SimpleDinosaurLab {

protected Dinosaur createDinosaur(String species){Dinosaur dinosaur = null;

  if(species.equals("Trex")){
    SimpleDinosaurLab createdDinosaur = new Trex();
  }
   else if(species.equals("Stegosaurus")){
      SimpleDinosaurLab createdDinosaur = new Stegosaurus();
  }
  return createdDinosaur;

}

}

//creates the actual instance of each new dinosaur. to add a new dinosaur, someone has to edit this file. 
