package zd2;

import zd2.ValidationRule;

// Дополните класс для проверки возраста пользователя
public class AgeValidationRule extends ValidationRule {

public AgeValidationRule(Byte age){
    super(age,"Возраст для подачи на ипотеку должен быть старше 18 лет");
}

@Override
public boolean isValid(){
    return (byte)value>=18;
}
}