package chainOfRepository;

public class TelephoneCall {
    public static void main(String[] args) {

        Handler robot = new SupportRobot(Priority.EASY_PROBLEM);
        Handler support = new SupportSpecialist(Priority.NORMAL_PROBLEM);
        Handler technicalSpecialist = new DeveloperSpecialist(Priority.HARD_PROBLEM);

        robot.setNextHandler(support);
        support.setNextHandler(technicalSpecialist);

        robot.handlerTranslator("Перезагрузите роутер", Priority.EASY_PROBLEM);
        System.out.println();
        robot.handlerTranslator("Проверяем линию", Priority.NORMAL_PROBLEM);
        System.out.println();
        robot.handlerTranslator("К вам выехал мастер", Priority.HARD_PROBLEM);


    }
}
