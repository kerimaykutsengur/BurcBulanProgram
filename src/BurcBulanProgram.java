import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Do�um ay�n�z� giriniz:");
        month = input.nextInt();
        System.out.print("Do�um g�n�n�z� giriniz:");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "O�lak";
                } else if (day >= 22) {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }

        }
        if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    burc = "Kova";
                } else if (day >= 20) {
                    burc = "Bal�k";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    burc = "Bal�k";
                } else if (day >= 21) {
                    burc = "Ko�";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Ko�";
                } else if (day >= 21) {
                    burc = "Bo�a";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Bo�a";
                } else if (day >= 22) {
                    burc = "�kizler";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "�kizler";
                } else if (day >= 23) {
                    burc = "Yenge�";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 7){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Yenge�";
                } else if (day >= 23){
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 8){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Aslan";
                } else if (day >= 23) {
                    burc = "Ba�ak";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 9){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "Ba�ak";
                } else if (day >= 23){
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 10){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Terazi";
                } else if (day >= 23){
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 11){
            if (day >= 1 && day <= 30){
                if (day <= 21) {
                    burc = "Akrep";
                } else if (day >= 22){
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatal� bir giri� yapt�n�z");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 12){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Yay";
                } else if (day >= 22) {
                    burc = "O�lak";
                }
            } else {
                isError = true;
            }
        }if (isError){
            System.out.print("Hatal� bir giri� yapt�n�z");
        }else {
            System.out.print("Burcunuz:"+burc);
        }


    }


}

