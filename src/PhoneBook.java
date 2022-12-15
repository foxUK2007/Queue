import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Иван Петров", "85621478954");
        phoneBook.put("Петр Иванов", "89587428124");
        phoneBook.put("Сергей Семенов", "89224783278");
        phoneBook.put("Семен Сергеев", "8218742796");
        phoneBook.put("Андрей Кучин", "8924789214");
        phoneBook.put("Нильс Бор", "89635784122");
        phoneBook.put("Альберт Эйнштейн", "85621478954");
        phoneBook.put("Илон Маск", "85621478954");
        phoneBook.put("Си Дзынь Пинов", "85621478954");
        phoneBook.put("Ушат Помоев", "85658795498");
        phoneBook.put("Ильшат Кандыгов", "85623875447");
        phoneBook.put("Кумыс Лошадов", "85658748954");
        phoneBook.put("Виктор По", "85328478954");
        phoneBook.put("Кирилл Кулешов", "85621478014");
        phoneBook.put("Олег Дугин", "85621604954");
        phoneBook.put("Валерий Котин", "8562130474");
        phoneBook.put("Николай Костров", "85690478954");
        phoneBook.put("Виталий Озеров", "85621389954");
        phoneBook.put("Михаил Карасев", "85620008954");
        phoneBook.put("Роман Нестеров", "85685708954");

        System.out.println(phoneBook);
        System.out.println(phoneBook.keySet());
    }


}
