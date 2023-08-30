package controle;

public class Controle {
    public static int subtractAndCount(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
        int counter = 0;
        if(firstNumber > secondNumber) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            for (int i = 0; i < (secondNumber- firstNumber); i++) {
                counter += 1;
            }

            return counter;
        }
    }

}