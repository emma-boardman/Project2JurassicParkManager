public class ConcessionTicket implements Ticket {


  public String getDescription() {
    return "Discounted price for NUS card holders and Senior Citizens (60 and over)";
  }

    public double getCost(){
      return 15.99;
    }
}