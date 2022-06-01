import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doðum ayýnýzý giriniz:");
        month = input.nextInt();
        System.out.print("Doðum gününüzü giriniz:");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Oðlak";
                } else if (day >= 22) {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }

        }
        if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    burc = "Kova";
                } else if (day >= 20) {
                    burc = "Balýk";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    burc = "Balýk";
                } else if (day >= 21) {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Koç";
                } else if (day >= 21) {
                    burc = "Boða";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Boða";
                } else if (day >= 22) {
                    burc = "Ýkizler";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Ýkizler";
                } else if (day >= 23) {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
            if (isError) {
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:" + burc);
            }
        }
        if (month == 7){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Yengeç";
                } else if (day >= 23){
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 8){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Aslan";
                } else if (day >= 23) {
                    burc = "Baþak";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 9){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "Baþak";
                } else if (day >= 23){
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
            if (isError){
                System.out.print("Hatalý bir giriþ yaptýnýz");
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
                System.out.print("Hatalý bir giriþ yaptýnýz");
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
                System.out.print("Hatalý bir giriþ yaptýnýz");
            } else {
                System.out.print("Burcunuz:"+ burc);
            }
        }
        if (month == 12){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Yay";
                } else if (day >= 22) {
                    burc = "Oðlak";
                }
            } else {
                isError = true;
            }
        }if (isError){
            System.out.print("Hatalý bir giriþ yaptýnýz");
        }else {
            System.out.print("Burcunuz:"+burc);
        }


    }


}

