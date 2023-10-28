package DZ6;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setNumber("+7 999 000 000");
        phone.setModel("Motorola");
        phone.setWeight(135.9);

        phone.receiveCall("Иван");
        phone.info();
        System.out.println();

        Phone phone1 = new Phone();
        phone.setNumber("+7 999 111 111");
        phone.setModel("Nokia");
        phone.setWeight(150.8);

        phone.receiveCall("Николай");
        phone.info();
        System.out.println();

        Phone phone2 = new Phone();
        phone.setNumber("+7 999 222 222");
        phone.setModel("Sumsung");
        phone.setWeight(177.3);

        phone.receiveCall("Пётр");
        phone.info();

    }
}

