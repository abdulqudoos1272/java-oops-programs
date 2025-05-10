class Vehicle{
    private String com_name,car_name;
    private long model,cc;
    public Vehicle(){}
    public Vehicle(String car_name, long cc, String com_name, long model) {
        this.car_name = car_name;
        this.cc = cc;
        this.com_name = com_name;
        this.model = model;
    }
    public void show(){
        System.out.println("Company Name of car is : "+this.com_name);
        System.out.println("Name of car is : "+this.car_name);
        System.out.println("Model of car is : "+this.model);
        System.out.println("Engine cc of car is : "+this.cc);
    }
};
public class program1_class_object {
    public static void main(String []arg){
        Vehicle v1=new Vehicle("Mehran",800,"Suzuki",2009);
        Vehicle v2=new Vehicle("Corolla",1000,"Toyota",2004);
        Vehicle v3=new Vehicle("Yaris",1300,"Toyota",2021);
        v1.show();
        v2.show();
        v3.show();
    }
}