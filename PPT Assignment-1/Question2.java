class Userdetails{
    private String name;
    private String email;
    private String phone_no;

    public void putName(String name){
        this.name = name;
    }
    public void putEmail(String email){
        this.email = email;
    }
    public void putPhone(String phone){
        this.phone_no = phone;
    }

    public String showName(){
        return name;
    }
    public String showEmail(){
        return email;
    }
    public String showPhone(){
        return phone_no;
    }
}


public class Question2 {
    public static void main(String[] args) { 
        Userdetails obj = new Userdetails();
        obj.putName("Abc xyz");
        obj.putEmail("abc@gmail.com");
        obj.putPhone("1234567890");

        System.out.println("Name : "+obj.showName()+ "\nEmail : "+obj.showEmail()+ "\nPhone Number : "+obj.showPhone());
    }
}
