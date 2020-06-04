public class Main{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик","персидская",4,30);
        Cat cat2 = new Cat("Мурзик","персидская",4,30);
        cat1.printClassName();
        if (cat1.equals(cat2)) System.out.println("Два одинаковых кота");
        else System.out.println("Коты разные");
    }
}

interface AnimalInterface{
    public void speak();
    public void run();
}

abstract class Animal implements AnimalInterface{
    private String nickname;
    private String breed;
    private int age;
    private int velocity;

    public Animal(String nickname, String breed, int age, int velocity) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.velocity = velocity;
    }
    public String getNickname() { return nickname; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public int getVelocity() { return velocity; }
    public void setNickname(String n){
        this.nickname = n;
    }
}

class Cat extends Animal{
    public Cat(String nickname, String breed, int age, int velocity) {
        super(nickname, breed, age, velocity);
    }
    public void bawl(){
        System.out.println("MEOW!!! MEOW!!! MEOW!!!");
    }
    @Override
    public void speak(){
        System.out.println("MEOW");
    }

    @Override
    public void run() {

    }
    public void printClassName(){
        System.out.println("Это класс для создания кота (Cat)");
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        boolean bName = this.getNickname().equals(cat.getNickname());
        boolean bBreed= this.getBreed().equals(cat.getBreed());
        boolean bAge  = this.getAge() == cat.getAge();
        boolean bVelocity=this.getVelocity() == cat.getVelocity();
        return bName && bBreed && bAge && bVelocity;
    }
}
