package Interpretator;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }


    @Override
    public boolean interpret(String str) {
        return str.contains(data);
    }
}
