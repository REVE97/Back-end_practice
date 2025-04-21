package AfterLecture_0421.poly;

public class AnimalMain {
    public static void main(String[] args) {
        // 하드 코딩 버전
//        Donkey donkey = new Donkey();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Chicken chicken = new Chicken();

//        donkey.sound();
//        dog.sound();
//        cat.sound();
//        chicken.sound();

//        soundAnimal(donkey);
//        soundAnimal(dog);
//        soundAnimal(cat);
//        soundAnimal(chicken);

        // 다형성 적용 버전
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 다형성 적용
    static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
