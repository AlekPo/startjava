public class WolfTest {
    public static void main(String[] args) {
        //TODO  создайте объект типа Wolf
        //      присвойте в нем полям экземпляра класса Wolf какие-то значения
        //      считайте эти значения из полей и отобразите в консоли
        //      вызовите методы объекта

        Wolf wolfOne = new Wolf();
        wolfOne.gender = "female";
        wolfOne.wolfName = "Reks";
        wolfOne.weight = 11.7F;
        wolfOne.age = 4;

        System.out.println("gender = " + wolfOne.gender);
        System.out.println("wolf name = " + wolfOne.wolfName);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("color = " + wolfOne.color);

        System.out.println(wolfOne.go());
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.run());
        System.out.println(wolfOne.howl());
        wolfOne.hunting();
    }
}