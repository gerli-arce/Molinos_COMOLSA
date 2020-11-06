
package trabajofinalconsoladecomados;
// Elementos importados
import java.util.Scanner;
public class TrabajoFinalConsolaDeComados {
    public static void main(String[] args) {
        // declaramos el scanner
        Scanner sc=new Scanner(System.in);
        
        
        // declaramos las variables 
        String Apellidos="",Nombre="",EsctadoCivil="";
        int C=0;
        int EC=0;// creacion de la variable de estado civil
        double ValorHora=0,SueldoBruto=0,DSNP=0,BNF=0,BNFT=0,STT=0;
        // Creamos la almuadilla para ebital el salto de linea
        String almohadilla="";
        
        ///decramos colores 
        String GREEN = "\u001B[32m",BLUE = "\u001B[34m",RESET = "\u001B[0m",CYAN = "\u001B[36m",RED = "\u001B[31m",PURPLE = "\u001B[35m",YELLOW = "\u001B[33m";
        
        // declaramos el titulo
       System.out.println(RED+"\n\n\t\t================================================="+RESET);
        System.out.println(RED+"\t\t================================================="+RESET);
        System.out.println("\t\t\t\t"+BLUE+"𝙈𝙊𝙇𝙄𝙉𝙊𝙎 𝘾𝙊𝙈𝙊𝙇𝙎𝘼"+RESET+"");
        System.out.println(RED+"\t\t================================================="+RESET);
        System.out.println(RED+"\t\t=================================================\n\n"+RESET);
        
        
        System.out.print(CYAN+"Ingrese la cantidad de personales que desea registrar\n> "+ RESET);
        C=sc.nextInt();
        
        System.out.print(CYAN+"\n\nIngrese  el precio por hora en S/."+RESET+RED+"\n>"+RESET);
         ValorHora=sc.nextDouble();
        
        // Creamos la matris de nombres
        String [] Mnombres=new String[C];
        // Cremos la matris de apellidos
        String[] Mapellidos=new String[C];
        // Creamos la matris de horas trabajadas
        double []HT=new double[C];
        //Creamos la matris de Sueldo Bruto
        double [] SB=new double[C];
        // Creamos la matris de descunto de SNP
        double[] dSNP=new double[C];
        //Creamos la matris de Bonificasion Familiar
        double[] bNF=new double[C];
        //Cremos la matris de Sueldo neto
        double[] SNP=new double[C];
        
        // ingreso de datos
        for (int i = 0; i < C; i++) {
            
            almohadilla=sc.nextLine();
            System.out.print(CYAN+"\n\nIngrese el nombre del personal "+RESET+GREEN+"N°"+(i+1)+RESET+RED+"\n>"+RESET);
            Mnombres[i]=sc.nextLine();
            System.out.print(CYAN+"\nIngrese los apellidos del personal "+RESET+RED+"\""+RESET+GREEN+Mnombres[i]+RESET+RED+"\""+RESET+RED+"\n>"+RESET);
            Mapellidos[i]=sc.nextLine();
           
            System.out.print(CYAN+"\nIngrese el estado civil del personal "+RESET+RED+"\""+RESET+GREEN+Mnombres[i]+" "+Mapellidos[i]+RESET+RED+"\""+RESET+PURPLE+"\n(1)"+RESET+CYAN+" Casado\n"+RESET+PURPLE+"(2) "+RESET+CYAN+"Soltero"+RESET+RED+"\n>"+RESET);
            EC=sc.nextInt();
            System.out.print(CYAN+"Ingrese la cantidad de horas trabajadas del personal "+RESET+RED+"\""+RESET+GREEN+Mnombres[i]+" "+Mapellidos[i]+RESET+RED+"\""+RESET+RED+"\n>"+RESET);
            HT[i]=sc.nextDouble();
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
            
            //new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            

             //       PROSESOS ****************************************************

             // Calculamos el sueldo bruto

               SueldoBruto=HT[i]*ValorHora;
                    // Agregamos el sueldo bruto a la matris
               SB[i]=SueldoBruto;

              // Aplicasion del descunto SNP
              DSNP= SueldoBruto*0.13;
                    //Almacenamos el desuento del SNP
             dSNP[i]=DSNP;
                
                //Bonificasion familiar

                 BNF = SueldoBruto*0.07;

                
                    //Almacenamos la bonificasion familiar 
                    if (EC==1){
                        bNF[i]=BNF;
                        BNFT=BNF;
                    }else if(EC==2){
                        bNF[i]=0;
                        BNFT=0;
                    }     
                //Calculamos el sueldo total
                   STT=(SueldoBruto - DSNP)+BNFT;
                   SNP[i]=STT;    
        }
        System.out.println(RED+"\n\n\t\t================================================="+RESET);
        System.out.println(RED+"\t\t================================================="+RESET);
        System.out.println("\t\t\t\t"+BLUE+"𝙈𝙊𝙇𝙄𝙉𝙊𝙎 𝘾𝙊𝙈𝙊𝙇𝙎𝘼"+RESET+"");
        System.out.println(RED+"\t\t================================================="+RESET);
        System.out.println(RED+"\t\t=================================================\n\n"+RESET);
        System.out.println(GREEN+"\n\n\n\t\tNOMBRE DE LOS EMPLEADOS CON SUS RESPECTIVOS APELLIDOS"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        System.out.println("");
        for (int i = 0; i < C; i++) {
            System.out.print("\t"+PURPLE+"("+(i+1)+")"+RESET+YELLOW+Mnombres[i]+" "+Mapellidos[i]+RESET);
            System.out.println(" ");
        }
        
        System.out.println(GREEN+"\n\n\n\t\t\tHORAS TRABAJDAS DE LOS EMPLEADOS"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        System.out.println("");
        for (int j = 0; j < C; j++) {
            System.out.print("\t"+PURPLE+"("+(j+1)+")"+RESET+YELLOW+Mnombres[j]+"\t\t\tHoras Trabajadas     =  "+HT[j]+RESET);
            System.out.println(" ");
        }
        System.out.println(GREEN+"\n\n\n\t\t\t\tPRECIO POR HORA"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        System.out.println("");
        for (int x = 0; x < C; x++) {
            System.out.println("");
            System.out.printf("\t"+PURPLE+"("+(x+1)+")"+RESET+YELLOW+Mnombres[x]+"\t\t\tValor por Hora     =  S/"+ValorHora+RESET);
            
        }
        System.out.println(GREEN+"\n\n\n\t\t\tSUELDO BRUTO DE LOS EMPLEADOS"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        for (int p = 0; p < C; p++) {
            System.out.print("\t"+PURPLE+"("+(p+1)+")"+RESET+YELLOW+Mnombres[p]+"\t\t\tSueldo Bruto     =  S/"+SB[p]+RESET);
            System.out.println("");
        }
        System.out.println(GREEN+"\n\n\n\t\t\tDESCUENTO SNP DE LOS EMPLEADOS"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        for (int m = 0; m < C; m++) {
            System.out.printf("\t"+PURPLE+"("+(m+1)+")"+RESET+YELLOW+Mnombres[m]+"\t\t\tDescuento SNP     =  S/"+dSNP[m]+RESET);
            System.out.println("");
        }
        System.out.println(GREEN+"\n\n\n\t\t\tBONIFICACION FAMILIAR"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        for (int i = 0; i < C; i++) {
            System.out.printf("\t"+PURPLE+"("+(i+1)+")"+RESET+YELLOW+Mnombres[i]+"\t\t\tBonificacion     =  S/"+bNF[i]+RESET);
            System.out.println("");
        }
        System.out.println(GREEN+"\n\n\n\t\t\tSUELDO NETO"+RESET);
        System.out.println(RED+"\t======================================================================"+RESET);
        for (int a = 0; a < C; a++) {
            System.out.printf("\t"+PURPLE+"("+(a+1)+")"+RESET+YELLOW+Mnombres[a]+"\t\t\tBonificacion     =  S/"+SNP[a]+RESET);
            System.out.println("");
        }
        System.out.println("\n\n\n");
        
        
    }
    
}
