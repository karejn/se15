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
                order.getItems().add(new Item(99l,totalPrice*0.05,"Porto und Versand"));
            } else if(totalPrice>50) {
                order.getItems().add(new Item(99l,7.5d,"Porto und Versand"));
            } else {
                order.getItems().add(new Item(99l,10.d,"Porto und Versand"));
            }

        }

        String msg = "Rechnung: \n";
        for (Item item : order.getItems()) {
            msg += item.getName()+": "+item.getPrice() + "\n";
        }
        msg += "Total: " + totalPrice;
        System.out.println(msg);
    }
}
