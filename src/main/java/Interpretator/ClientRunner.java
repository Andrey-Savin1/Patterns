package Interpretator;

public class ClientRunner {
    public static void main(String[] args) {
        Expression expression = getLanguage();
        Expression expression2 = getTwoLanguage();

        System.out.println(expression.interpret("Eng"));
        System.out.println(expression2.interpret("Rus"));
    }

    public static Expression getLanguage(){
        Expression eng = new TerminalExpression("Eng");
        Expression rus = new TerminalExpression("Rus");
        return new AndExpression(eng, rus);
    }

    public static Expression getTwoLanguage(){
        Expression eng = new TerminalExpression("Eng");
        Expression rus = new TerminalExpression("Rus");
        return new OrExpression(eng, rus);
    }

}
