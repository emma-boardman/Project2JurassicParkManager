package dinosaur_management;
import behaviours.*;



public class DinosaurManagement {
// // this is where new dinosaurs are ordered. manager would somehow have access to these methods, and be able to input which dinosaur they wanted to create.

// if i added an if statement in this file, this code would have to be modified everytime a new species of dinosaur was introduced. that would be bad.

DinosaurFactory dinosaurFactory;
ArrayList<Enclosure> enclosures;
ArrayList<Dinosaur> holdingPen;


public DinosaurManagement(DinosaurFactory dinosaurFactory){
    this.dinosaurFactory= dinosaurFactory;
    this.encloures = new ArrayList<Enclosure>;
    this.holdingPen = new ArrayList<Dinosaur>;
  }     



// a method to create a new dinosaur 
public Dinosaur addDinosaur(String species){
  Dinosaur dinosaur;
  dinosaur = dinosaurFactory.createDinosaur(species);
  return dinosaur;
}







// by replacing the new operator with the crate method, avoids concrete instatiations in this class. 




//   method to add a dinosaur to the zoo
// }

  // method to view all current dinosaurs 

  // method to view all current enclosures 

  // method to add the dinosaur to an enclosure

  // method to move the dinosaur between enclosures 

  // method to tranquilise dinosaur





}
