public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        String one = "Просто человек в очереди 1";
        String two = "Просто человек в очереди 2";
        String three = "Просто человек в очереди 3";
        String four = "Просто человек в очереди 4";
        String five = "Просто человек в очереди 5";
        String six = "Просто человек в очереди 6";
        String seven = "Просто человек в очереди 7";
        String eight = "Просто человек в очереди 8";
        String nine = "Просто человек в очереди 9";
        String ten = "Просто человек в очереди 10";
        String eleven = "Просто человек в очереди 11";
        String twelve = "Просто человек в очереди 12";

        shop.addHuman(one);
        shop.addHuman(two);
        shop.addHuman(three);
        shop.addHuman(four);
        shop.addHuman(five);
        shop.addHuman(six);
        shop.addHuman(seven);
        shop.addHuman(eight);
        shop.addHuman(nine);
        shop.addHuman(ten);
        shop.addHuman(eleven);
        shop.addHuman(twelve);

        shop.size();
        shop.deleteHuman();
        shop.size();
    }


}
