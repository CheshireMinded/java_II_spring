package java_II_spring_M04_Lauren_Hall.tacotruck.set;

import java.util.HashSet;
import java.util.Set;

import java_II_spring_M04_Lauren_Hall.tacotruck.Orders;
import java_II_spring_M04_Lauren_Hall.tacotruck.TacoImpl;

public class OrdersSetImpl implements Orders {
	private Set<TacoImpl> orders = new HashSet<>();
	
    @Override
    public void addOrder(TacoImpl tacoOrder) {
    	this.orders.add(tacoOrder);
    
    }

    @Override
    public boolean hasNext() {
    	return !this.orders.isEmpty();
       // return false;
    }
    
    @Override
    public TacoImpl closeNextOrder() {
    	// String[] a = s.toArray(new String[s.size()]);	
    	TacoImpl taco = (TacoImpl)(this.orders.toArray()[0]);
    	
		return taco;
    	
    	/*
    	 * Future reference notes for moi:
    	 * found @ https://stackoverflow.com/questions/16459590/need-for-new-string0-in-the-set-toarray-method
    	 * It is the array into which the elements of the Set are to be
    	 *  stored, if it is big enough; otherwise, a new array of the same runtime type is 
    	 *  allocated for this purpose.
			Object[] toArray(), 
			returns an Object[] which cannot be cast to String[] or any other 
			type
			
			 array.T[] toArray(T[] a) , 
			returns an array containing all of the elements in this set;
 			the runtime type of the returned array is that of the specified array.
  			If the set fits in the specified array, it is returned therein.
   			Otherwise, a new array is allocated with the runtime type of the
    			specified array and the size of this set.
    	 * 
    	 * 		
    	 * 
    	 */
    
    }
    @Override
    public int howManyOrders() {
    	return this.orders.size();
       // return 0;
    }

	public Set<TacoImpl> getOrders() {
		return orders;
	}

	public void setOrders(Set<TacoImpl> orders) {
		this.orders = orders;
	}
}
