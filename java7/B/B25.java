abstract class Message {
    String msg;
    static int id;

    Message() {
        id++;
        msg = "MESSAGE:" + id + " ";
    }

    public abstract String doMessage();
}

class SMS extends Message {
    
    String msg;

    public String doMessage() {
        return super.msg.concat(this.msg);
    }

    SMS(String msg) {
        this.msg = msg;
    }
}

class Viber extends Message {

    String msg;

    public String doMessage() {
        return super.msg.concat(this.msg);
    }

    Viber(String msg) {
        this.msg = msg;
    }

}

public class B25 {

    public static void main(String[] args) {
        Message msg1 = new SMS("God Bless");
        Message msg2 = new Viber("Good Luck");
        System.out.println(msg1.doMessage());
        System.out.println(msg2.doMessage());
    }
}