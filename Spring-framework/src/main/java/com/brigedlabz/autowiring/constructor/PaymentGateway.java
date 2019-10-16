package com.brigedlabz.autowiring.constructor;

public class PaymentGateway {
	 
	 private Order order;
     private int price;
     
	    public PaymentGateway(Order ord){
	        this.order = ord;
	    }
	    
	    
	     
	    public PaymentGateway(Order order, int price) {
			super();
			this.order = order;
			this.price = price;
		}



		public void setOrder(Order ord){
	        this.order = ord;
	    }
	      
	    public Order getOrder() {
	        return order;
	    }
	 
	    @Override
	    public String toString(){
	        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
	    }
}
