package H_oop.p_defaultInterfaceMethods;

public interface Walk {

    default int getSpeed() {
        return 5;
    }
}
