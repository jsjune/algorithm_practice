package algorithmn;

import java.util.ArrayList;

class Car implements Cloneable{
    private String modelName; // modelName 선언
    private ArrayList<String> owners = new ArrayList<String>(); // Arraylist 'owners' 선언

    public String getModelName(){return this.modelName;} // modelName의 값을 반환함
    public void setModelName(String modelName){this.modelName=modelName;} // modelName의 값을 설정함

    public ArrayList getOwners(){return this.owners;} // owners의 값을 반환함
    public void setOwners(String ownerName){this.owners.add(ownerName);} // owners의 값을 추가함

    public Object clone(){
        try {
            Car clonedCar = (Car)super.clone();
//            clonedCar.owners=(ArrayList)owners.clone();
            return clonedCar;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModelName("아반떼");
        car1.setOwners("홍길동");
        System.out.println("Car1 : " + car1.getModelName() + ", " + car1.getOwners() + "\n");

        Car car2 = (Car)car1.clone();
        car2.setOwners("이순신");
        System.out.println("Car1 : " + car1.getModelName() + ", " + car1.getOwners());
        System.out.println("Car2 : " + car2.getModelName() + ", " + car2.getOwners());
    }
}
