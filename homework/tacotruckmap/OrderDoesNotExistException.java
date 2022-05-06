package java_II_spring_M04_Lauren_Hall.homework.tacotruckmap;

public class OrderDoesNotExistException extends Exception {

    private static final long serialVersionUID = 1L;

	/**
     * Const.
     * @param orderid The order id that does not exist.
     */
    public OrderDoesNotExistException(String orderid) {
        super("Order Does Not Exist for Order id: " +  orderid);
    }
}
