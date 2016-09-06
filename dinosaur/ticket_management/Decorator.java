package ticket_management;

public abstract class Decorator implements Ticket {

  protected Ticket tempTicket;
  // holds  a temporary reference

  public Decorator(Ticket newTicket){
    tempTicket = newTicket;

  }

public String getDescription(){
  return tempTicket.getDescription();
 }

 public double getCost(){
  return tempTicket.getCost();
 }
 
  
}
