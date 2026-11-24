abstract class Delivery {
    void acceptOrder() { 
        System.out.println("Delivery order accepted");
     }
    abstract void deliverProduct();
}

class FoodDelivery extends Delivery {
    void deliverProduct() { 
        System.out.println("Food order delivered to customer");
     }
}

class ParcelDelivery extends Delivery {
    void deliverProduct() { 
        System.out.println("Parcel delivered successfully"); 
    }
}

class task4 {
    public static void main(String[] args) {
        FoodDelivery f = new FoodDelivery();
         f.acceptOrder(); 
         f.deliverProduct(); 
         System.out.println();
        ParcelDelivery p = new ParcelDelivery();
         p.acceptOrder(); 
         p.deliverProduct();
    }
}