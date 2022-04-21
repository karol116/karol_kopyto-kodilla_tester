public class User {
    public static void main(String[] args) {

        UserType andrzej = new UserType(17, "Andrzej");
        UserType agata = new UserType(20, "Agata");
        UserType dominika = new UserType(23, "Dominika");
        UserType aleksandra = new UserType(19, "Aleksandra");

        UserType[] users = {andrzej, agata, dominika, aleksandra};

        int numberOfPeople = users.length;
        int sumOfAges = 0;
        int averageAge;

        for (int j = 0; j < numberOfPeople; j++) {
            sumOfAges = sumOfAges + users[j].age;
        }

        averageAge = sumOfAges / numberOfPeople;

        for (int i = 0; i < numberOfPeople; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}