package dinosaur_management;

public class DinosaurManagement {
// this is where new dinosaurs are ordered. manager would somehow have access to these methods, and be able to input which dinosaur they wanted to create.

SimpleDinosaurLab createDinosaur = new SpeciesOfDinosaurLab();
// instantiates the simple lab 


Dinosaur tRex = createDinosaur.orderDinosaur("Trex");
System.out.println(tRex + "\n");

// calls the orderDinosaur method on the lab, and specifies the species 

Dinosaur stegosaurus = createDinosaur.orderDinosaur("Stegosaurus");
System.out.println(stegosaurus + "\n");

}

