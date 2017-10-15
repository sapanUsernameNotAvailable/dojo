package design.structural.facade;

public class FacadeImpl implements Facade {

    SystemA a = new SystemA();
    SystemB b = new SystemB();

    public void doStuff() {
        a.doSystemAStuff();
        b.doSystemBStuff();
    }
}
