import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    Ticket ticket_1 = new Ticket("Москва", "Новосибирск", 8450, 10, 12);
    Ticket ticket_2 = new Ticket("Москва", "Казань", 4800, 10, 14);
    Ticket ticket_3 = new Ticket("Москва", "Санкт-Петербург", 4800, 10, 16);
    Ticket ticket_4 = new Ticket("Москва", "Томск", 14000, 10, 18);
    Ticket ticket_5 = new Ticket("Москва", "Грузия", 5500, 10, 20);
    Ticket ticket_6 = new Ticket("Москва", "Красноярск", 9800, 10, 22);
    @Test
    public void shouldAddTicket() {
        AviaSouls souls = new AviaSouls();
        souls.add (ticket_1);
        souls.add (ticket_2);
        souls.add (ticket_3);
        souls.add (ticket_4);
        souls.add (ticket_5);
        souls.add (ticket_6);
        Ticket[] expected = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Ticket[] actual = souls.findAll();
        Assertions.assertArrayEquals (expected, actual);
    }
    @Test
    public void shouldSearchTicket() {
        AviaSouls souls = new AviaSouls();
        souls.add (ticket_1);
        souls.add (ticket_2);
        souls.add (ticket_3);
        souls.add (ticket_4);
        souls.add (ticket_5);
        souls.add (ticket_6);
        Ticket[] tickets = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Arrays.sort (tickets);
        Ticket[] expected = {ticket_2, ticket_3, ticket_5, ticket_1, ticket_6, ticket_4};
        Assertions.assertArrayEquals (expected, tickets);
    }
    @Test
    public void shouldCompareToTicket() {
        AviaSouls souls = new AviaSouls();
        souls.add (ticket_1);
        souls.add (ticket_2);
        souls.add (ticket_3);
        souls.add (ticket_4);
        souls.add (ticket_5);
        souls.add (ticket_6);
        Ticket[] tickets = {ticket_1, ticket_2};
        Arrays.sort (tickets);
        Ticket[] expected = {ticket_2, ticket_1};
        Assertions.assertArrayEquals (expected, tickets);
    }
    @Test
    public void shouldTimeComparator() {
        AviaSouls souls = new AviaSouls();
        souls.add (ticket_1);
        souls.add (ticket_2);
        souls.add (ticket_3);
        souls.add (ticket_4);
        souls.add (ticket_5);
        souls.add (ticket_6);
        TicketTimeComparator timeComparator = new TicketTimeComparator();
        Ticket[] tickets = {ticket_1, ticket_2};
        Arrays.sort(tickets, timeComparator);
        Ticket[] expected = {ticket_1, ticket_2};
        Assertions.assertArrayEquals(expected,tickets);
    }
    @Test
    public void shouldSearchAndSortBy() {
        AviaSouls souls = new AviaSouls();
        souls.add (ticket_1);
        souls.add (ticket_2);
        souls.add (ticket_3);
        souls.add (ticket_4);
        souls.add (ticket_5);
        souls.add (ticket_6);
        TicketTimeComparator timeComparator = new TicketTimeComparator();
        Ticket[] tickets = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Arrays.sort(tickets, timeComparator);
        Ticket[] expected = {ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6};
        Assertions.assertArrayEquals(expected,tickets);
    }
}
