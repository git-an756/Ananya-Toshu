
	public class PriorityQueue implements Comparable<PriorityQueue> {
	    private int orderId;
	    private double orderAmount;
	    private String customerName;

	    public PriorityQueue(int orderId, double orderAmount, String customerName) {
	        this.orderId = orderId;
	        this.orderAmount = orderAmount;
	        this.customerName = customerName;
	    }

	    @Override
	    public int compareTo(PriorityQueue o) {
	        return o.orderId > this.orderId ? 1 : -1;
	    }

	    @Override
	    public String toString() {
	        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
	    }

	    public double getOrderAmount() {
	        return orderAmount;
	    }
	    public static void main(String args[])
	    {
	    	PriorityQueue q=new PriorityQueue(11, 30000, "anu");
	    	q.getOrderAmount();
	    	q.compareTo(q);
	    	q.toString();
	    }
}

