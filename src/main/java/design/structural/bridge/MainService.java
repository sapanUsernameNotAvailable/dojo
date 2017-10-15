package design.structural.bridge;

/**
 * Because I use an interface and I can be extended, therefore I guess I am a bridge.
 * Although, I would actually want to be composed into something than extended sometimes.
 * In that case, my special power is that I use an interface.
 */
public class MainService {

    SupportService supportService;

    public MainService(SupportService supportService) {
        this.supportService = supportService;
    }

    public void doMainStuff() {
        supportService.doSupport();   // hey I can use interfaces ! Let's stamp this as a design pattern.
    }
}
