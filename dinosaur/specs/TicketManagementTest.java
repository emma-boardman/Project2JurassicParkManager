import static org.junit.Assert.*;
import org.junit.*;
import ticket_management.*;


public class TicketManagementTest {


    @Test
    public void canCreateNewTicket(){
      TicketFactory ticketFactory = new TicketFactory();
      Ticket ticket = ticketFactory.createTicket("Adult");
      assertEquals("Ticket for visitors aged between 13 and 60", ticket.getDescription());

    }

    }
