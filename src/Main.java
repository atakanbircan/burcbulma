import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc=" ";
        boolean isError=false;
        Scanner input=new Scanner(System.in);

        System.out.println("doğduğunuz ay:");
        month=input.nextInt();

        System.out.println("doğum günü:");
        day=input.nextInt();


        switch (month) {
            case 1:
                if (day < 32 && day > 0) {
                    if (day < 22) {
                        burc="oğlak";
                    } else {
                        burc="kova";
                    }
                }
                else {
                    isError=true;

                }
                break;


            case 2:
                if (day>0 && day<29){
                    if (day<20){
                        burc="Kova";
                    }
                    else {
                        burc="Balık";
                    }
                }
                else {
                    isError = true;
                }
                break;
            case 3:
                if(day>0 && day<32){
                    if (day<21){
                        burc="balık";
                    }
                    else {
                        System.out.println("koç");
                    }
                }
                else {
                    isError=true;
                }

            break;

            case 4:
                if(day>0 && day<31){
                    if (day<22){
                        burc="koç";
                    }
                    else {
                        System.out.println("boğa");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 5:
                if(day>0 && day<32){
                    if (day<22){
                        burc="boğa";
                    }
                    else {
                        System.out.println("ikizler");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 6:
                if(day>0 && day<31){
                    if (day<23){
                        burc="ikizler";
                    }
                    else {
                        System.out.println("yengeç");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 7:
                if(day>0 && day<32){
                    if (day<23){
                        burc="yengeç";
                    }
                    else {
                        System.out.println("aslan");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 8:
                if(day>0 && day<32){
                    if (day<23){
                        burc="aslan";
                    }
                    else {
                        System.out.println("başak");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 9:
                if(day>0 && day<31){
                    if (day<23){
                        burc="başak";
                    }
                    else {
                        System.out.println("terazi");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 10:
                if(day>0 && day<32){
                    if (day<23){
                        burc="terazi";
                    }
                    else {
                        System.out.println("akrep");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 11:
                if(day>0 && day<31){
                    if (day<23){
                        burc="akrep";
                    }
                    else {
                        System.out.println("yay");
                    }
                }
                else {
                    isError=true;
                }
                break;

            case 12:
                if(day>0 && day<32){
                    if (day<23){
                        burc="yay";
                    }
                    else {
                        System.out.println("oğlak");
                    }
                }
                else {
                    isError=true;
                }
                break;
            default:
                isError=true;

        }
        if (isError){
            System.out.println("hatalı giriş yaptınız");
        }
        else{
            System.out.println("Burcunuz : "+burc);
        }
        }
    }
