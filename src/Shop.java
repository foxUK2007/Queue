
import java.util.ArrayDeque;
import java.util.Queue;

public class Shop {
    Queue<String> queueOne = new ArrayDeque<>(5);
    Queue<String> queueTwo = new ArrayDeque<>(5);
    Queue<String> queueThree = new ArrayDeque<>(5);

    public void addHuman(String human) {
        try {
            if (queueOne.size() == 5 && queueTwo.size() == 5 && queueThree.size() == 5) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Вызывайте Галю!");
            return;
        }
        if (queueOne.size() < 5) {
            queueOne.add(human);
        } else if (queueTwo.size() < 5) {
            queueTwo.add(human);
        } else if (queueThree.size() < 5) {
            queueThree.add(human);
        }
    }

    public void size() {
        System.out.println(queueOne.size());
        System.out.println(queueTwo.size());
        System.out.println(queueThree.size());

    }

    public void deleteHuman(){
        int a = (int) (3* Math.random()+1);
        System.out.println("Удаляем человека из очереди: " +a);
        if(a == 1){
            queueOne.poll();
        }if(a == 2){
            queueTwo.poll();
        }if(a == 3){
            queueThree.poll();
        }
    }
}

