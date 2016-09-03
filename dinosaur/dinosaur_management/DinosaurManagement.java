package dinosaur_management;

public class DinosaurManagement {

SimpleDinosaurLab createDinosaur = new SpeciesOfDinosaurLab();

Dinosaur tRex = createDinosaur.orderDinosaur("Trex");
System.out.println(tRex + "\n");

Dinosaur stegosaurus = createDinosaur.orderDinosaur("Stegosaurus");
System.out.println(stegosaurus + "\n");

}



//   public DinosaurManagement(SimpleDinosaurLab lab) {
//     this.lab = lab;
//   }

//   public Dinosaur addDinosaurToPark(String species) {
//     Dinosaur dinosaur;
//     dinosaur = lab.createDinosaur(species);
//   }
// }
