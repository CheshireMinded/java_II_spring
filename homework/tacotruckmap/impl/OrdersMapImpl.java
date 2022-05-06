package java_II_spring_M04_Lauren_Hall.homework.tacotruckmap.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java_II_spring_M04_Lauren_Hall.homework.tacotruckmap.OrderDoesNotExistException;
import java_II_spring_M04_Lauren_Hall.homework.tacotruckmap.Orders;
import java_II_spring_M04_Lauren_Hall.homework.tacotruckmap.TacoImpl;



public class OrdersMapImpl implements Orders {
	/* Instead of using: create a hashMap to simplify
	  Map<String, List<String>> collect = list.stream()
	            .map(string -> string.split(" "))
	            .collect(Collectors.groupingBy(o -> o[0],
	                    Collectors.mapping(o -> o[1],
	                    Collectors.toList())));
	                    create a hashMap to simplify
	                    Map<String, Product> productsByName = new HashMap<>();
	              */     
	private Map<String, List<TacoImpl>> orders = new HashMap<>();

    
 
    public void createOrder(final String orderid) {
    	this.orders.put(orderid, new ArrayList<TacoImpl>());
    }

    // check if order exists - need to create
    
    private void checkOrderExists(final String orderid) throws OrderDoesNotExistException {
        if (this.orders.get(orderid) == null) {
            throw new OrderDoesNotExistException(orderid);
        }
    }

// create an addTacoTo Order
    @Override
    public void addTacoToOrder(final String orderid, final TacoImpl taco) throws OrderDoesNotExistException {
        this.checkOrderExists(orderid);
        this.orders.get(orderid).add(taco);
    }


    @Override
    public boolean hasNext() {
    	return !this.orders.isEmpty();
        //return false;
    }

    @Override
    public List<TacoImpl> closeOrder(final String orderid) throws OrderDoesNotExistException {
        this.checkOrderExists(orderid);
        return this.orders.remove(orderid);
    	//return null;
    }

    @Override
    public int howManyOrders() {
    	return this.orders.size();
        //return 0;
    }

    @Override
    public List<TacoImpl> getListOfOrders(final String orderid) throws OrderDoesNotExistException {
        this.checkOrderExists(orderid);
        return this.orders.get(orderid);
        
    	//return null;
    }

	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeNextOrder() {
		// TODO Auto-generated method stub
		
	}

	
/*
	public List<TacoImpl> setOrders(final String orderid) throws OrderDoesNotExistException {
		this.checkOrderExists(orderid);
        return this.orders.get(orderid);
		//return orders;
	}

	

	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeNextOrder() {
		// TODO Auto-generated method stub
		
	}
*/

	}

