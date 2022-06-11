import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
    }
    /////////////////////////////////////////////////////////////////////////////////
    // 1 ex
    public static int check(int Year) {
        if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + " -high-grade year");
        } else {
            System.out.println(Year + " -not a high-grade year");
        }
        return Year;
    }

    public static void taskOne() {
        System.out.println("--==ex.1==--");
        int year = 2004;
        int highYear = check(year);
    }

    /////////////////////////////////////////////////////////////////////////////////
    // 2 ex
    public static void taskTwo() {
        System.out.println("--==ex.2==--");
        int DeviceYear = 2022;
        int ClientOS = 1;
        printVersion(ClientOS, DeviceYear);
    }

    public static void printVersion(int ClientOS, int DeviceYear) {
        String nameOS = getNameOS(ClientOS);
        boolean deviceYear = getDeviceYear(DeviceYear);
        if (deviceYear) {
            System.out.println("load regular version for " + nameOS);
        } else {
            System.out.println("loud lite-version for " + nameOS);
        }
    }

    public static String getNameOS(int ClientOS) {
        if (ClientOS != 0) {
            return "IOS";
        } else {
            return "Android";
        }
    }

    public static boolean getDeviceYear(int DeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (DeviceYear < currentYear) {
            return true;
        } else {
            return false;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////
    // 3 ex
    public static void taskThree() {
        System.out.println("--==ex.3==--");
        int deliveryDistance = 17;
        deliveryDay(deliveryDistance);
    }

    public static int deliveryDay(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Days: 1");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Days: 2");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Days: 3");
        }
        return deliveryDistance;
    }
}