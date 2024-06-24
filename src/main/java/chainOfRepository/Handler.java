package chainOfRepository;

public abstract class Handler {

    private int priority;
    private Handler nextHandler;


    public Handler(int priority) {
        this.priority = priority;
    }


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handlerTranslator(String message, int level){

        if (level >= priority) {
                    write(message);
        }
        if (nextHandler !=null){
            nextHandler.handlerTranslator(message,level);
        }
    }

    public abstract void write(String message);

}
