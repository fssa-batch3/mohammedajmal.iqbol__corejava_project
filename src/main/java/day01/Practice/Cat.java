package day01.Practice;

public class Cat {
    // Attributes
    private String color;
    private int age;
    private String speaks;


    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSpeaks() {
        return speaks;
    }

    public void setSpeaks(String speaks) {
        this.speaks = speaks;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat();
    	cat1.setColor("purple");
    	cat1.setAge(4);
    	cat1.setSpeaks("Meow!");
    	Cat cat2 = new Cat();
    	cat2.setColor("white");
    	cat2.setAge(3);
    	cat2.setSpeaks("Meow!");


        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.getSpeaks());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat2.getSpeaks());
    }
}