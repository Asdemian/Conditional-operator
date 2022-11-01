public class Main {
    public static void main(String[] args) {
        //task 1
        int person = 25;
        if (person >= 18) {
            System.out.println("Поздравляем Вы совершеннолетний!");
        }
        if (person <= 18) {
            System.out.println("Ваш возраст для совершенолетия еще не наступил");
        }
            //task 2

        if (person >= 7 && person <18) {
                System.out.println("Ребенок ходит в школу");
        }
        if (person >= 18 && person <24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (person >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
        //task 3
            int carCapacity = 102;
            int seating = 60;
            int standingPlaces = carCapacity - seating;
            int numberOfOccupiedSeats = 65;
            int numberOfOccupiedStandingPlaces = 48;
            if (seating > numberOfOccupiedSeats) {
                System.out.println("В вагоне есть еще " +(seating - numberOfOccupiedSeats)+ " сидячих места.");
            }
            if (standingPlaces > numberOfOccupiedStandingPlaces) {
                System.out.println("В вагоне есть еще " +(standingPlaces - numberOfOccupiedStandingPlaces)+ " стоячих места.");
            }
            if (numberOfOccupiedSeats >= seating) {
                System.out.println( "В вагоне нет сидячих мест");
            }
            if (numberOfOccupiedStandingPlaces >= standingPlaces) {
                System.out.println("В вагоне нет стоячих мест");
            }
            if (numberOfOccupiedSeats >= seating && numberOfOccupiedStandingPlaces >= standingPlaces) {
                System.out.println("Вагон уже полностью забит.");
            }
        }
    }
}
