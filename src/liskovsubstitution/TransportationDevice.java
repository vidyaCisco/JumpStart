package liskovsubstitution;

class TransportationDevice
{
    String name;
    String getName() { ... }
    void setName(String n) { ... }

    double speed;
    double getSpeed() { ... }
    void setSpeed(double d) { ... }

    Engine engine;
    Engine getEngine() { ... }
    void setEngine(Engine e) { ... }

    void startEngine() { ... }
}
