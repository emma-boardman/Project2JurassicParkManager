package ticket_management;

public class AdultTicket implements Ticket {

  public String getDescription() {
     return "Ticket for visitors aged between 13 and 60";
   }

    public double getCost(){
      return 19.99;
    }
  }