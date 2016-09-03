import static org.junit.Assert.*;
import org.junit.*;
import dinosaur_management.*;
import behaviours.*;

public class StegosaurusTest {

  Stegosaurus stegosaurus;

  @Before
  public void before(){
    stegosaurus = new Stegosaurus();
  }

  @Test
  public void canMakeNoise(){
    assertEquals(stegosaurus.makeNoise(),"GRUNT.");
  }

  @Test
  public void canEat(){
    assertEquals(stegosaurus.eatFood(),"*swallow*");
  }

}