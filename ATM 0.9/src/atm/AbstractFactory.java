package atm;

public abstract class AbstractFactory <T extends Resource> {
abstract T createResource(String type);
}
