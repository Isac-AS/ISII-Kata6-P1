package componentfactories;

import toyproduct.components.Engine;
import toyproduct.components.RotorBlade;
import toyproduct.components.Wheel;

public interface ComponentFactory {
    Wheel createWheel();
    Engine createEngine();
    RotorBlade createRotorBlade();
}
