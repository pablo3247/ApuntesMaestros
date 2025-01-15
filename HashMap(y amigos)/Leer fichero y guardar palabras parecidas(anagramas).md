## Leer fichero y guardar palabras parecidas(anagramas)


## Codigo 🇦🇱
```
import java.io.*;
import java.util.*;

public class anagramas {
    public static void main(String[] args) {

        try{
            String res = anagramas1(15);
            System.out.println(res);
        }catch (IOException e){
            System.out.println("Error al procesarlo xd "+ e.getMessage());
        }

    }

    public static String anagramas1(int minGroupSize) throws IOException{

        String resultado="";

        Map<String, List<String>> grupos = new HashMap<>();

        BufferedReader reader = null;

        try{
            String rutaArchivo = "C:\\Users\\moren\\Documents\\ProgramacionHome\\hashMap\\src\\spanish-dict.txt";

            File file = new File(rutaArchivo);

            if(!file.exists() || !file.canRead()){
                throw new FileNotFoundException("Estas pendejo! "+ rutaArchivo);
            }

            reader = new BufferedReader(new FileReader(rutaArchivo));

            String palabra;

            while((palabra = reader.readLine()) != null ){

                String ordenado = alphabetize(palabra);

                List<String> group = grupos.computeIfAbsent(ordenado, k -> new ArrayList<>());
                group.add(palabra);

            }

        }
        catch (FileNotFoundException e){
            throw new IOException("No encontrado "+ e.getMessage(), e);

        }catch(IOException e){
            throw new IOException("Error leyendolo "+ e.getMessage(),e);

        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    System.out.println("error al cerrarlo xd "+ e.getMessage());
                }
            }
        }

        for(List<String> group : grupos.values()){
            if(group.size() >= minGroupSize){
                resultado =resultado+"\n"+  group.size()+": "+ group;
            }
        }



        return resultado;
    }



    private static String alphabetize(String s) {
        char[] characters = s.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }


}

```
