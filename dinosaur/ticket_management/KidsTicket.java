package ticket_management;

public class KidsTicket implements Ticket {

  public String getDescription(){
    return "For visitors 12 and under";
  } 

    public double getCost(){
      return 10.99;
    }
  
}