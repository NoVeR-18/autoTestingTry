import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("+ добавление \n- отнимание \n* умножить \n/ деление \n^ возвести 1е в степень 2го \n");
        while(true){
            float operand1 = nextInt();
            float operand2 = nextInt();
            char operation = getOperation();
            float result = calc(operand1,operand2,operation);
            System.out.println("Результат операции: "+result);
        }
    }

    public static float nextInt(){
        System.out.println("Введите число:");
        float operand = 0;
        if(scanner.hasNextFloat()){
            operand = scanner.nextFloat();
            if (operand > 100000000) {
                System.out.println("Вы ввели слишком большое число. Попробуйте еще раз.");

                operand = nextInt();
            }else if (operand < -100000000) {
                System.out.println("Вы ввели слишком маленькое число. Попробуйте еще раз.");

                operand = nextInt();}
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static float calc(float operand1, float operand2, char operation){
        float result;
        switch (operation) {
            case '+' -> result = add(operand1, operand2);
            case '-' -> result = minus(operand1, operand2);
            case '*' -> result = mull(operand1, operand2);
            case '/' -> result = div(operand1, operand2);
            case '^' -> result = exponentiation(operand1, operand2);
            default -> {
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, getOperation());//рекурсия
            }
        }
        return result;
    }
    public static float add(float operand1, float operand2){
        return operand1 + operand2;
    }
    public static float minus(float operand1, float operand2){
        return operand1 - operand2;
    }
    public static float mull(float operand1, float operand2){
        return operand1 * operand2;
    }
    public static float div(float operand1, float operand2){
        if(operand2 == 0){
            System.out.println("Деление на 0, введите второе число заново");
            operand2 = nextInt();
            div(operand1, operand2);
        }
        return operand1 / operand2;
    }
    public static float exponentiation(float operand1, float operand2){
        float result = 1;
        if (operand2>0){
            for(int i = 0; i<operand2;i++){
                result *= operand1;
            }
            return result;

        }else if(operand2 < 0){
            for(int i = 0; i<-operand2;i++){
                result *= operand1;
            }return 1/result;
        }
        return 1;
    }
}
