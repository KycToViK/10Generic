package zd3;

import java.util.ArrayList;
import java.util.List;

// Ограничьте класс zd3.ContactBook так, чтобы он могу хранить в себе только список контактов
public class ContactBook<T extends Contact>{
        // Объявите поле класса contacts - список контактов книги
        private List<T> contacts;

        ContactBook(){
            contacts = new ArrayList<>();
        }

public void addContact(T contact){
    contacts.add(contact);
}

public void printList(){
    // Выведите на экран весь список контактов книги
    for (T contact : contacts){
        System.out.println("Имя: " + contact.getName());
        contact.print();
    }
}

public void congratulate(String name){
    boolean contactPresented=false; //проверяем есть ли контакт в базе
    // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        for(T contact : contacts) {
            if (contact.getName().equals(name)){
                contactPresented = true;
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
            }
        }
    if (!contactPresented)
        System.out.println("Не найден контакт с указанным именем.");
}

        }