/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava01;
import java.util.Scanner ;
/**
 *
 * @author ADMIN
 */
public class LatihanJava01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        String Nama ;
        int Nilai ; 
        boolean condition ;
        double ip ;
        
        
        Nama = "Kevin Suwandi" ;
        Nilai = 10;
        condition = true;
        ip = 3.4;
        
        System.out.println("Nama");
        System.out.println("Nilai");
        System.out.println("condition");
        System.out.println("ip");
        
        int myInt = 9;
        double myDouble = myInt; //langsung auto double / float
        System.out.println(myInt);
        System.out.println(myDouble);
      
        int x = 5; //Matematika dalam java
        x*=10;
        System.out.println(x);
      
        int y = 10;
        y+=5;
        System.out.println(y);
     
        System.out.println(Math.min(10,9));
        System.out.println(Math.max(44,82));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-1));
        System.out.println(Math.random());

        boolean ApakahDiaCinta = true; //Boolean
        boolean ApakahDiaTidakCinta = false;
    
        System.out.println(ApakahDiaCinta);
        System.out.println(ApakahDiaTidakCinta);
     
        int a = 10;
        int b = 12;
        System.out.println(a > b);
     
        int c = 1000;
        System.out.println(c == 1000);
        
        System.out.println("Berapa hasil dari 20*5");

Scanner scanner1 = new Scanner (System.in);
String inputjawaban = scanner1.nextLine();
System.out.println(inputjawaban);

int A = 100;
int B = 60;
int C = 40;
int D = 90;

if (A==100){
        System.out.println("Jawaban kamu benar");}
if (B==60){
        System.out.println("Jawaban kamu salah");}
if (C==40){
        System.out.println("Jawaban kamu salah");}
if (D==90){
        System.out.println("Jawaban kamu salah");}


int time = 20;
if (time  <18){
        System.out.println("Good day");
    }
else{
        System.out.println("Good Evening");    
    }

Scanner scanner = new Scanner (System.in);
String inputwarna = scanner.nextLine();
System.out.println(inputwarna);

String warna = "Merah";
String warna2 = "Kuning";
String warna3 = "Hijau";

if (warna.equals ("Merah")){
    System.out.println("Berhenti");
}
    else if (warna2.equals ("Kuning")){
        System.out.println("Hati - hati");
    }
    else if(warna3.equals ("Hijau")){
        System.out.println("Jalan");
    }
// Short hand if...else
//int time1 = 10;
//String result = (time1 < 20) ? "Good day." : "Good Evening."; // Good day = TRUE , Good Evening = FALSE
//System.out.println(result); 
// 
//
//int day = 4;
//    switch (day) {
//      case 1:
//        System.out.println("Monday");
//        break;
//      case 2:
//        System.out.println("Tuesday");
//        break;
//      case 3:
//        System.out.println("Wednesday");
//        break;
//      case 4:
//        System.out.println("Thursday");
//        break;
//      case 5:
//        System.out.println("Friday");
//        break;
//      case 6:
//        System.out.println("Saturday");
//        break;
//      case 7:
//        System.out.println("Sunday");
//        break;
//    }
    int i = 0; //While Do (Print nya di bawah)
while (i < 5) {
  System.out.println(i);
  i++;
}

int d = 0; //While Do (Print di atas)
do {
  System.out.println(i);
 i++;
}
while (i < 5);

for (int ia = 0; ia < 5; ia++) { //  For Loop
  System.out.println(ia);
}   

for (int ib = 0; ib <= 10; ib = ib + 2) { 
  System.out.println(ib);
}

int arr[] ={3,1,2,5,4};
for (int g = 0; g< arr.length;g++){
    System.out.println(arr[g]);
}

String words[]={"Aku","Sedang","Makan","Nasi","Uduk"};
for (String word : words){
    System.out.println(word);
}

String[] cars = {"Porsche", "BMW", "Lamborghini", "Mazda"}; //Array 
   //Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
    for (String ic : cars) {
      System.out.println(ic);
    }    
  String[] cars2 = {"Porsche", "BMW", "Lamborghini", "Mazda"}; //Changing Array Elements
cars[0] = "Opel";
System.out.println(cars[0]);

String[] cars3 = {"Porsche", "BMW", "Lamborghini", "Mazda"}; //Mengetahui banyak nya N di dalam array
    System.out.println(cars.length);

    String[] cars4 = {"Porsche", "BMW", "Lamborghini", "Mazda"}; //Loop dalam array
for (int g = 0; g < cars.length; g++) {
  System.out.println(cars4[g]);
    
Scanner scanner01 = new Scanner (System.in);
String Inputhasil = scanner1.nextLine();
System.out.println(Inputhasil);

int f = 0;//1
if(f < 10)
{
System.out.println("Under 10!");   
}
else if(f <= 31){
    System.out.println("Above 10 and Under 30");
}    
else{ System.out.println("Above 31");
    }
int ia = 0; //Continue (Melanjutkan loop sampai selesai)
    while (ia < 10) {
      if (ia == 4) {
        ia++;
        continue;
      }
      System.out.println(i);
      ia++;
 }
int ib = 0; //Break (Mengehentikan loop jika sudah mencapai tujuannya)
    while (ib < 10) {
      System.out.println(ib);
      ib++;
      if (ib == 4) {
        break; }
    
}}}}

    
    
    
