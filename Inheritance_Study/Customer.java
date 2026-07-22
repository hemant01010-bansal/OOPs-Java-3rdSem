public class Customer extends User {
    int email;
    int password;

    void getInfo(){
        System.out.println("I am a Customer.");
        System.out.println(email);
    }
}
