package zd2;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule{

public MortgageAmountValidationRule(Integer value){
    super(value,"Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
}

    @Override
    public boolean isValid() {
    if ((int)value > 1000000 && (int)value < 10000000)
        return true;
    else
        return false;
    }

// Объявите и реализуйте метод для проверки суммы ипотеки ниже


}