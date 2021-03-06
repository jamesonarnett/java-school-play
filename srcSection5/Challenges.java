public class Challenges {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for(int i=1; i<1000; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                count++;
                sum += i;
                System.out.println("Found number " + i);
            }
            if(count == 5) {
                System.out.println(sum);
                break;
            }
        }
        System.out.println(isOdd(24));

    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        }
        if(year < 1 || year > 9999) {
            return -1;
        }

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if(month == 2) {
            if(isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        if(number % 2 == 0) {
            return false;
        }
        return  true;
    }

    public static int sumOdd(int start, int end){
        if(end < start || end < 0 || start < 0) {
            return -1;
        }

        int sum = 0;

        for(int i = start; i <= end; i++ ) {
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }


}
