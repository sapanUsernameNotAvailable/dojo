package design.behavioural.template;

public abstract class Template {

    protected abstract void doOp1();
    protected abstract void doOp2();

    public final void doStuff() {
        doOp1();
        doOp2();
    }
}
