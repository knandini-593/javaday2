interface Alert {
    void sendAlert(String message);
}

class EmailAlert implements Alert {
    public void sendAlert(String message) { 
        System.out.println("Email Alert: " + message); 
    }
}

class MobileAlert implements Alert {
    public void sendAlert(String message) {
         System.out.println("Mobile Alert: " + message);
         }
}

class task6{
    public static void main(String[] args) {
        Alert a1 = new EmailAlert(); 
        a1.sendAlert("Exam Tomorrow");
        Alert a2 = new MobileAlert();
         a2.sendAlert("Class Cancelled");
    }
}