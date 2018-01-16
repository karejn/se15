package at.aau.se15.bsp3;

public class SmellyClass {

    public void erstelleRechnung(Order order) {

        //calculate temporary price
        Double totalPrice=0.0d;
        for (Item item : order.getItems()) {
            totalPrice+=item.getPrice();
        }

        //check for shipping costs

        if(totalPrice<=100) {
            if(totalPrice>90) {
                order.addShippingCost(totalPrice*0.05);
            } else if(totalPrice>50) {
                order.addShippingCost(7.5d);
            } else {
                order.addShippingCost(10d);
            }

        }

        StringBuilder msg = new StringBuilder("Rechnung: \n");
        for (Item item : order.getItems()) {
            msg.append(item.getName()).append(": ").append(item.getPrice()).append("\n");
        }
        msg.append("Total: ").append(totalPrice);
        System.out.println(msg);
    }
}
