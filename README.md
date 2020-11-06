# Molinos_COMOLSA

# Importamos las clases 
<p>Con estas clases importadas podremos relizar la aplicación ya que solo se ara en texto plano</p>
<pre>
import java.util.Scanner;
</pre>

# Desclaramos Variables
<p>Decalaramos las variables para almacenar los nombres, apellidos, estado civil, una variable C donde almacenaremos la cantidad de personales a reguistrar, una variavle EC donde se almacenará la opcion de soltero o casado ya sea (1) Casado (2) Soltero, creamos la variable para almacenar el precio por hora trabajada, para almacenar el sueldo bruto, del descuento por el descuento por aporte del SNP, la bonificasion familiar, el total de la bonificasion familiar, y para almacenar el sueldo neto ya para terminar una almoadilla para evitar el salto de linea que ya vendremos explicando. </p>
<pre>
String Apellidos="",Nombre="",EsctadoCivil="";
int C=0;
int EC=0;
double ValorHora=0,SueldoBruto=0,DSNP=0,BNF=0,BNFT=0,STT=0;
String almuadilla="";
</pre>

# Desclaramos variables para el almacenaminto de los colores con los cuales trabajaremos
<p>Los colores que usaremos serán los siguientes: verde, azul, un receteador de colores, celeste, rojo, y morado</p>
<pre>
String GREEN = "\u001B[32m",BLUE = "\u001B[34m";
String RESET = "\u001B[0m",CYAN = "\u001B[36m";
String RED = "\u001B[31m",PURPLE = "\u001B[35m",YELLOW = "\u001B[33m";
</pre>

# Creacion del titulo 
<p>Cremos un titulo asiendo uso de secuencias de escape y colores</p>
<pre>
System.out.println(RED+"\n\n\t\t================================================="+RESET);
System.out.println(RED+"\t\t================================================="+RESET);
System.out.println("\t\t\t\t"+BLUE+"𝙈𝙊𝙇𝙄𝙉𝙊𝙎 𝘾𝙊𝙈𝙊𝙇𝙎𝘼"+RESET+"");
System.out.println(RED+"\t\t================================================="+RESET);
System.out.println(RED+"\t\t=================================================\n\n"+RESET);
</pre>

# Pedida de datos para saber la cantidad de personales a reguistrar y el sueldo por hora
<p>Con la pedida de estos datos ya podremos crar un bucle de repeticion para pedir los datos de cada uno de los personales</p>
<pre>
System.out.print(CYAN+"Ingrese la cantidad de personales que desea registrar"+RESET+RED+"\n> "+ RESET);
C=sc.nextInt();
System.out.print(CYAN+"\n\nIngrese  el precio por hora en S/."+RESET+RED+"\n>"+RESET);
ValorHora=sc.nextDouble();
</pre>

# Crecion de las matrizes
<p>Con las matrizes donde almacenaremos los nombres, apellidos, horas trabajadas, sueldo bruto, descuento SNP,bonificación familiar y sueldo bruto de cada uno de los personales </p>
<pre>
 // Creamos la matriz de nombres
String [] Mnombres=new String[C];
// Cremos la matriz de apellidos
String[] Mapellidos=new String[C];
// Creamos la matriz de horas trabajadas
double []HT=new double[C];
// Creamos la matriz de Sueldo Bruto
double [] SB=new double[C];
// Creamos la matriz de descunto de SNP
double[] dSNP=new double[C];
// Creamos la matriz de Bonificación Familiar
double[] bNF=new double[C];
// Cremos la matriz de Sueldo neto
double[] SNP=new double[C];     
</pre>

# Creacion del bucle de repeticion para la pedida de datos de cada uno de los personales
<p>Hacemos el pedido de datos de cada uno de los personales y los almacenamos en sus respectivas matrizes que ya fueron creadas, seguido de eso asemos los procesos para el calculo del descuento por aporte SNP, la binificación familiar si tiene familia de lo contrario su bonificación sera igual a 0, y por ultimo calculamos el sueldo neto </p>

<pre>
for (int i = 0; i < C; i++) {
            
            almuadilla=sc.nextLine();
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

             // Calculamos el sueldo bruto

               SueldoBruto=HT[i]*ValorHora;
                    // Agregamos el sueldo bruto a la matris
               SB[i]=SueldoBruto;

              // Aplicasion del descuento SNP
              DSNP= SueldoBruto*0.13;
                    //Almacenamos el desuento del SNP
             dSNP[i]=DSNP;
                
                //Bonificasion familiar

                 BNF = SueldoBruto*0.07;

                    //Almacenamos la bonificación familiar 
                    if (EC==1){
                        bNF[i]=BNF;
                        BNFT=BNF;
                    }else if(EC==2){
                        bNF[i]=0;
                        BNFT=0;
                    }     
                //Calculamos el sueldo neto
                   STT=(SueldoBruto - DSNP)+BNFT;
                   SNP[i]=STT;    
        }
</pre>