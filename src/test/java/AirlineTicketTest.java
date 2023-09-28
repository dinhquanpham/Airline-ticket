import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AirlineTicketTest {

    List<Pair<String, Integer>> testCases = List.of(
            Pair.of("", 123),
            Pair.of("D",34),
            Pair.of("321", 156),
            Pair.of("test", 254),
            Pair.of("A", 0),
            Pair.of("A", 1),
            Pair.of("A", 167),
            Pair.of("A", 322),
            Pair.of("B", -200),
            Pair.of("B", 29),
            Pair.of("B", 137),
            Pair.of("B", 323),
            Pair.of("C", -1),
            Pair.of("C", 11),
            Pair.of("C", 199),
            Pair.of("C", 10000)
    );

    @Test
    public void testCase1() {
        Pair<String, Integer> testCase = testCases.get(0);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Ticket Type", result);
    }

    @Test
    public void testCase2() {
        Pair<String, Integer> testCase = testCases.get(1);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Ticket Type", result);
    }

    @Test
    public void testCase3() {
        Pair<String, Integer> testCase = testCases.get(2);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Ticket Type", result);
    }

    @Test
    public void testCase4() {
        Pair<String, Integer> testCase = testCases.get(3);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Ticket Type", result);
    }

    @Test
    public void testCase5() {
        Pair<String, Integer> testCase = testCases.get(4);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Distance", result);
    }

    @Test
    public void testCase6() {
        Pair<String, Integer> testCase = testCases.get(5);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("14000", result);
    }

    @Test
    public void testCase7() {
        Pair<String, Integer> testCase = testCases.get(6);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("1869000", result);
    }

    @Test
    public void testCase8() {
        Pair<String, Integer> testCase = testCases.get(7);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("2527000", result);
    }

    @Test
    public void testCase9() {
        Pair<String, Integer> testCase = testCases.get(8);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Distance", result);
    }

    @Test
    public void testCase10() {
        Pair<String, Integer> testCase = testCases.get(9);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("232000", result);
    }

    @Test
    public void testCase11() {
        Pair<String, Integer> testCase = testCases.get(10);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("948000", result);
    }

    @Test
    public void testCase12() {
        Pair<String, Integer> testCase = testCases.get(11);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("1446000", result);
    }

    @Test
    public void testCase13() {
        Pair<String, Integer> testCase = testCases.get(12);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("Invalid Distance", result);
    }

    @Test
    public void testCase14() {
        Pair<String, Integer> testCase = testCases.get(13);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("55000", result);
    }

    @Test
    public void testCase15() {
        Pair<String, Integer> testCase = testCases.get(14);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("747500", result);
    }

    @Test
    public void testCase16() {
        Pair<String, Integer> testCase = testCases.get(15);
        String result = AirlineTicket.getResult(testCase.getLeft(), testCase.getRight());
        Assertions.assertEquals("13000000", result);
    }
}