package de.fhdw.bfwd423a.sohre.Demo05;

public class TestClass {
    public static void main(String[] args) {
        memberTest();
    }

    public static void memberTest(){
        TestMember testObject;

        testObject = new TestMember();

        testObject.setName("Simon");
        testObject.setAge(19);
        System.out.println(testObject.getName());
        System.out.println(testObject.getAge());

        System.out.println("---");

        testObject.mName = "Optimist3000";
        testObject.mAge = 3000;
        System.out.println(testObject.mName);
        System.out.println(testObject.mAge);
    }
}
