import java.util.Scanner;

public class QUIZPRACTIC {
    public static void main(String[] args) {
        Scanner inpud = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("HOLA DE NUEVO :)");
        System.out.println("mi nombre es Jani y estaré guiandote en este recorrido");
        System.out.println("_________________________________________________________");
        System.out.println("deseas calcular las notas de tu curso? (ingresa 1 para si o 2 para no)");
        long responsive = inpud.nextLong();
        if (responsive==2){
            System.out.println("okey espero verte pronto :) au revoir");
        }

        else if (responsive==1) {
            System.out.println("indicame el numero de estudiantes que deseas revisar :)");
            System.out.println("-recuerda deben ser entero positivo sino me toteo, gracias");
            int numberStudents = inpud.nextInt();
            String [] name = new String[numberStudents];
            String [] subjects = {"ingles","programación","calculo"};
            long [] id = new long[numberStudents];
            double [] [] qualifications = new double[numberStudents][subjects.length];
            double [] average = new double[numberStudents];
            String [] status = new String[numberStudents];

            for(int j=0;j<numberStudents;j++){

                System.out.println("indicame el nombre de el estudiante "+(j+1));
                inpud.nextLine();
                name[j]=inpud.nextLine();

                System.out.println("dime el ID de "+name[j]);
                id[j]=inpud.nextLong();

                for (int i=0; i<subjects.length;i++){
                    System.out.println("ingresa la nota de la materia "+subjects[i]);
                    qualifications[j][i]=inpud.nextDouble();

                    if (qualifications[j][i]>5 || qualifications[j][i]<0){
                        System.out.println("ingrese una nota válida");
                        System.out.println("ingresa la nota de la materia "+subjects[j]);
                        qualifications[j][i]=inpud.nextDouble();       
                    }
                }

                average[j]  = (qualifications[j][0]+qualifications[j][1]+qualifications[j][2])/subjects.length;
                System.out.println(average[j]);

                if (average[j]>=3 && average[j]<=5){
                    status[j]="A1provado";
                }
                else{
                    status[j]="yucassssss bro :(";
                }
                
            }    
            System.out.println("a continuación te brindaré el resultado final de todo :)");

                for(int i =0; i<numberStudents;i++){
                    System.out.println(name[i]+" (ID: "+id[i]+") - Promedio: "+average[i]+" - "+status[i]);
                }
        }
        inpud.close();
    }
}