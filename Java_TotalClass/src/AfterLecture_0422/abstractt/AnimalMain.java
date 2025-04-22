package AfterLecture_0422.abstractt;

public class AnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = { new Dog(), new Cat(), new Duck() };

        for (AbstractAnimal animal : animals) {
            animalCall(animal);
        }
    }

    static void animalCall(AbstractAnimal animal) {
        animal.eat();
        animal.sound();

        if (animal instanceof Duck) {
            ((Duck) animal).fly();
        }
    }
}
