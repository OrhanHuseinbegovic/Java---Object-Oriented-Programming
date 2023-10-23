package PripremaZaQuiz;

import java.util.Scanner;

public class Calculator {
        public static float sum = 0;
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            while(true){
                pocetniekran();
                int opcija = reader.nextInt();
                if (opcija==1){
                    System.out.print("Unesite broj za sabiranje: ");
                    float brojSab = reader.nextFloat();
                    sabiranje(brojSab);
                }
                else if (opcija==2){
                    System.out.print("Unesite broj za oduzimanje: ");
                    float brojOduz = reader.nextFloat();
                    oduzimanje(brojOduz);
                }
                else if (opcija==3){
                    System.out.print("Unesite broj za mnozenje: ");
                    float brojMnoz = reader.nextFloat();
                    mnozenje(brojMnoz);
                }
                else if (opcija==4){
                    System.out.print("Unesite broj za dijeljenje: ");
                    float brojDijel = reader.nextFloat();
                    dijeljenje(brojDijel);
                }
                else if (opcija==5){
                    total();
                }
                else {
                    System.out.println("Gasenje kalkulatora");
                    break;
                }
            }
        }

        public static float sabiranje(float brSab){
            sum = sum + brSab;
            return sum;
        }

        public static float oduzimanje(float brOduz){
            sum = sum - brOduz;
            return sum;
        }

        public static float mnozenje (float brMnoz){
            sum = sum * brMnoz;
            return sum;
        }

        public static float dijeljenje (float brDijel){
            sum = sum / brDijel;
            return sum;
        }

        public static void total(){
            System.out.println("TRENUTNI TOTAL: "+sum);
        }

        public static void pocetniekran(){
            System.out.println("1. Sabiranje");
            System.out.println("2. Oduzimanje");
            System.out.println("3. Mnozenje");
            System.out.println("4. Dijeljenje");
            System.out.println("5. TRENUTNI TOTAL");
            System.out.println("UNESTE OPCIJU BROJEM: ");
            System.out.println("----------------");
        }
    }

