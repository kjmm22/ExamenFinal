
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.IOException;
 import java.io.PrintWriter;
 
 
 public class ExamenFinal_201314655 {


     static File archivo, archivoDecodificado;
     static String nuevoArchivo;
 
//-----------------------------------------------------------------------------------------------------------------------
// MAIN DE LA CLASE EXAMENFINAL_201314655    
     public static void main(String[] args) {

         archivo = new File(args[0].toString());
         String[] vector;
         vector= args[0].split(".txt");
         nuevoArchivo = vector[0];
         archivoDecodificado = new File("HablandoEnLenguas_201314655.txt");
            ExamenFinal_201314655.Leer();
            System.out.println();
            System.out.println(archivoDecodificado.getPath());
            
    }

//-----------------------------------------------------------------------------------------------------------------------  

    public static void Leer(){
        

        try{


             FileReader lector = new FileReader(archivo);
             BufferedReader buffer = new BufferedReader(lector);
             PrintWriter escritor = new PrintWriter(archivoDecodificado);

             int numerodelineas = Integer.parseInt(buffer.readLine());
             escritor.println("----------------------HABLANDO EN LENGUAS 201314655-----------------------");
             escritor.println();
 
            
             for(int i = 0; i < numerodelineas; i++){

                 String linea = buffer.readLine();
                 String[] ContarPalabras = linea.split(" ");

              for (int j = 0; j < ContarPalabras.length; j++) {

                     char[] ImprimirLetra = ContarPalabras[j].toCharArray();

                     for(int k = 0; k < ImprimirLetra.length ; k++){
                         
// CAMBIO DE CADA LETRA MEDIANTE UN SWITCH

                       
                        switch (ImprimirLetra[k]){

                         case 'a':
                             ImprimirLetra[k] = 'y';
                             break;

                         case'b':
                             ImprimirLetra[k] = 'h';
                             break;

                         case'c':
                             ImprimirLetra[k] = 'e';
                             break;

                         case'd':
                              ImprimirLetra[k] = 's';
                             break;

                         case'e':
                             ImprimirLetra[k] = 'o';

                         case'f':
                             ImprimirLetra[k] = 'c';
                             break;

                         case'g':
                             ImprimirLetra[k] = 'v';
                             break;

                         case'h':

                            ImprimirLetra[k] = 'x';
                            break;


                         case'i':
                             ImprimirLetra[k] = 'd';
                             break;


                         case'j':
                             ImprimirLetra[k] = 'u';
                             break;


                         case'k':
                             ImprimirLetra[k] = 'i';
                             break;

                         case'l':
                             ImprimirLetra[k] = 'g';
                             break;


                         case'm':
                             ImprimirLetra[k] = 'l';
                             break;


                         case'n':
                             ImprimirLetra[k] = 'b';
                             break;


                         case'o':
                             ImprimirLetra[k] = 'k';
                             break;

                        case'p':
                             ImprimirLetra[k] = 'r';
                             break;

                         case'q':
                             ImprimirLetra[k] = 'z';
                             break;

                         case 'r':
                             ImprimirLetra[k] = 't';
                             break;

                         case's':
                             ImprimirLetra[k] = 'n';
                             break;


                         case't':
                             ImprimirLetra[k] = 'w';
                             break;


                         case'u':
                             ImprimirLetra[k] = 'j';
                             break;

                         case'v':
                             ImprimirLetra[k] = 'p';
                             break;


                         case 'w':
                             ImprimirLetra[k] = 'f';
                             break;


                         case'x':
                             ImprimirLetra[k] = 'm';
                             break;


                         case'y':
                             ImprimirLetra[k] = 'a';
                             break;


                         case'z':
                             ImprimirLetra[k] = 'q';
                             break;


                             default:
                             escritor.print("error de traduccion");
                             break;

                         }
                        

                         escritor.print(ImprimirLetra[k]);
                        
                     }
                     
                     escritor.print(" ");
                 }
                 
                 escritor.println();
             }
                 escritor.close();
            }catch(FileNotFoundException e){
                 System.out.println("Archivo no Encontrado");

         }catch(IOException e){}

    }

// FIN DEL METODO LEER  
//-------------------------------------------------------------------------------------------------------------

 
 }
 // FIN DE LA CLASE EXAMENFINAL_201314655
