package H_oop.o_creatingInterface;

/**
 * Interface variable are constants as by default they PUBLIC ABSTRACT FINAL
 * Interface methods ALWAYS are PUBLIC ABSTRACT
 * Only DEFAULT methods can have a body
 * Interface methods MUST be implemented at least in a superclass that implements interface
 */

public interface HasTail {

    int DEFAULT_TAIL_LENGTH = 2;

    int getDefaultTailLength();

}
