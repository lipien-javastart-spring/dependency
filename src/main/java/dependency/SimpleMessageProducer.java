package dependency;

public class SimpleMessageProducer implements MessageProducer {

    public String getMessage() {
        return "Example message " + System.currentTimeMillis();
    }
}
