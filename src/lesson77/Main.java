package lesson77;

public class Main {
    public static void main(String[] args) {

        int[] reqemler = {10, 20, 30, 40, 50};

        System.out.println(reqemler[0]);
        System.out.println(reqemler[3]);

        reqemler[1] = 25;
        System.out.println(reqemler[1]);

        System.out.println(reqemler.length);

        char[] herfler = {'A', 'B', 'C', 'D'};

        System.out.println(herfler[2]);

        String[] sozler = new String[3];
        sozler[0] = "Java";
        sozler[1] = "Aviation";
        sozler[2] = "Roblox";

        System.out.println(sozler[0] + " və " + sozler[2]);

        for (int i = 0; i < reqemler.length; i++) {
            System.out.println(reqemler[i]);
        }
    }
}