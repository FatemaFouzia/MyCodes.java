class person{
    public String name;
    public int age;

}



public class ClassAndObject {
    public static void main(String[] args) {

        person person1 = new person();
        person person2 = new person();
        person1.name = "fatema";
        person1.age = 20;

        person2.name = "ria";
        person2.age = 30;

        System.out.println(person1.name);
        System.out.println(person2.age);
    }
}
