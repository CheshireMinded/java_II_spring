package java_II_spring_M04_Lauren_Hall.tacotruck;

import java_II_spring_M04_Lauren_Hall.tacotruck.set.OrdersSetImpl;

public class OrdersTest {

    public static void main(String[] args) {
        OrdersTest ordersTest = new OrdersTest();
        ordersTest.testHasNextFalse(new OrdersSetImpl());
        ordersTest.testCloseNextOrder(new OrdersSetImpl());
    }

    public void testHasNextFalse(final Orders orders) {
        TacoImpl firstTaco = new TacoImpl(TacoImpl.Protein.BEAN, true);

        orders.addOrder(firstTaco);
        if (!orders.hasNext()) {
            throw new RuntimeException(":( testHasNextFalse fail: Orders should have one order in them.");
        }
        TacoImpl closedTaco = orders.closeNextOrder();
        if (closedTaco == null) {
            throw new RuntimeException(":( testHasNextFalse fail: closed taco should not be null.");
        }
        if (!closedTaco.equals(firstTaco)) {
            throw new RuntimeException(":( testHasNextFalse fail: This should truely never happen.");
        }
        if (orders.hasNext()) {
            throw new RuntimeException(":( testHasNextFalse fail: Orders should be empty.");
        }
        System.out.println(":) testHasNextFalse passed");
    }

    public void testCloseNextOrder(final Orders orders) {
        TacoImpl firstTaco = new TacoImpl(TacoImpl.Protein.BEAN, true);
        TacoImpl secondTaco = new TacoImpl(TacoImpl.Protein.BEEF, true);

        orders.addOrder(firstTaco);
        orders.addOrder(secondTaco);
        TacoImpl shouldBeFirstTaco = orders.closeNextOrder();
        if (orders.howManyOrders() != 1) {
            throw new RuntimeException(":( testCloseNextOrder Failed: orders should only have one order left");
        }
        if (firstTaco.equals(shouldBeFirstTaco)){
            System.out.println(":) testCloseNextOrder passed");
        } else {
            throw new RuntimeException(":( testCloseNextOrder Failed: should be the first taco was first out.");
        }
    }
}
