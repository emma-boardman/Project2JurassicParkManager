import static org.junit.Assert.*;
import org.junit.*;
import enclosure_management.*;
import dinosaur_management.*;
import behaviours.*;

public class DinosaurManagementTest {

// DinosaurFactory dinosaurFactory;
// Dinosaur dinosaur;

@Test
public void canCreateNewDinosaur(){
  DinosaurFactory dinosaurFactory = new DinosaurFactory();
  Dinosaur dinosaur = dinosaurFactory.createDinosaur("Trex");

  // TRex original = (TRex) dinosaur;
  // assertEquals("RAWR.", original.makeNoise());

  assertEquals("RAWR.", dinosaur.makeNoise());
  // assertEquals("RAWR.", dinosaur.noise());
  
}

// if the compile thinks that the variable is a Dinosaur, it can only do what the dinosaur can do.
// casting gives us access to all the methods on the type
}

