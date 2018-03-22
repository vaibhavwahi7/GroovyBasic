public class Person{



    String name ="vaibhav";
    String gender ="male";
    String address ="Chandni Chowk";
    int age = 21;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


}

class main
{
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
        System.out.println(person.getGender());

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address);
        System.out.println(person.gender);


    }
}