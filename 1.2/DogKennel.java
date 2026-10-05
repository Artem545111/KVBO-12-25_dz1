class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
    }

    public int getHumanAge() { return age * 7; }
    @Override public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", humanAge=" + getHumanAge() + "}";
    }
}

public class DogKennel {
    private final Dog[] dogs = new Dog[10];
    private int count;
    public void add(Dog dog) {
        if (count == dogs.length) throw new IllegalStateException("Питомник заполнен");
        dogs[count++] = dog;
    }
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();
        kennel.add(new Dog("Шарик", 3));
        kennel.add(new Dog("Бим", 5));
        for (int i = 0; i < kennel.count; i++) System.out.println(kennel.dogs[i]);
    }
}
