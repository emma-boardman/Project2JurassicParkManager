import static org.junit.Assert.*;
import org.junit.*;
import ticket_management.*;
import java.util.*;


public class TicketManagementTest {

  TicketManagement ticketManagement;
  Ticket ticket;


    @Test
    public void canCreateAdultTicket(){
      TicketFactory ticketFactory = new TicketFactory();
      Ticket ticket = ticketFactory.createTicket("Adult");
      assertEquals("Ticket for visitors aged between 13 and 60", ticket.getDescription());

    }


    @Test
    public void canCreateKidsTicket(){
      TicketFactory ticketFactory = new TicketFactory();
      Ticket ticket = ticketFactory.createTicket("Kids");
      assertEquals("For visitors 12 and under", ticket.getDescription());

    }


    @Test
    public void canCreateConcessionTicket(){
      TicketFactory ticketFactory = new TicketFactory();
      Ticket ticket = ticketFactory.createTicket("Conc.");
      assertEquals("Discounted price for NUS card holders and Senior Citizens (60 and over)", ticket.getDescription());

    }

    @Test
    public void canCreateOrderofMultipleTickets(){
      TicketFactory ticketFactory = new TicketFactory();
      assertEquals(4, ticketManagement.createMultipleTicketOrders("Adult", 4));
    }

    }
