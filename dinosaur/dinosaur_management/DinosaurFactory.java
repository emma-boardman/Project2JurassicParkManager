package dinosaur_management;
import behaviours.*;

public class DinosaurFactory {

//this class encapsulates the object creation for all dinosaurs 
Dinosaur dinosaur;

public Dinosaur createDinosaur(String species){
  this.dinosaur = dinosaur;

  if(species.equals("Trex")){
    dinosaur = new TRex();
  }
   else if(species.equals("Stegosaurus")){
     dinosaur = new Stegosaurus();
  }

  return dinosaur;
  }

}

//creates the actual instance of each new dinosaur. to add a new dinosaur, someone has to edit this file. 
