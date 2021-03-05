package H_oop.p_defaultInterfaceMethods;

public interface Run extends Walk {

    default int getSpeed() {
        return 10;
    }
}
