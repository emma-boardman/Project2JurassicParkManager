import static org.junit.Assert.*;
import org.junit.*;
import dinosaur_management.*;
import behaviours.*;

public class TRexTest {

  TRex trex;

  @Before
  public void before(){
    trex = new TRex();
  }

  @Test
  public void canMakeNoise(){
    assertEquals(trex.makeNoise(),"RAWR.");
  }

  @Test
  public void canEat(){
    assertEquals(trex.eatFood(),"*gulp*");
  }


  @Test
  public void isCarnivore(){
    assertEquals(trex.confirmDiet(),"Carnivore");
  }

}