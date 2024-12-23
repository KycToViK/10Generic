package zd3;

// Дополните объявление класса zd3.Contact
public abstract class Contact{
    // Класс должен содержать одно полe - имя пользователя name
        private String name;

        public Contact(String name){
            this.name = name;
        }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
        public void sendMessage(){
            System.out.println(name);
        }

        public void print(){}

    public String getName() {
            return name;
    }
}