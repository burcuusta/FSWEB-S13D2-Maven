package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(1010));
    }
        public static boolean isPalindrome(int sayi) {
            int tersSayi = 0;
            int orijinalSayi = Math.abs(sayi);
            int geciciSayi = orijinalSayi;

            while (geciciSayi > 0) {
                int sonRakam = geciciSayi % 10;
                tersSayi = tersSayi * 10 + sonRakam;
                geciciSayi /= 10;
            }

            return orijinalSayi == tersSayi;

    }
    public static boolean isPerfectNumber(int sayi) {
        if (sayi <= 0) {
            return false;
        }

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }

        if (sayi == 0) {
            return "Zero";
        }

        String sayiStr = String.valueOf(sayi);
        StringBuilder sonuc = new StringBuilder();

        for (int i = 0; i < sayiStr.length(); i++) {
            char rakam = sayiStr.charAt(i);
            switch (rakam) {
                case '0':
                    sonuc.append("Zero ");
                    break;
                case '1':
                    sonuc.append("One ");
                    break;
                case '2':
                    sonuc.append("Two ");
                    break;
                case '3':
                    sonuc.append("Three ");
                    break;
                case '4':
                    sonuc.append("Four ");
                    break;
                case '5':
                    sonuc.append("Five ");
                    break;
                case '6':
                    sonuc.append("Six ");
                    break;
                case '7':
                    sonuc.append("Seven ");
                    break;
                case '8':
                    sonuc.append("Eight ");
                    break;
                case '9':
                    sonuc.append("Nine ");
                    break;
            }
        }

        return sonuc.toString().trim();
    }

}
