import java.util.LinkedList;
import java.util.Queue;

    public class EvaluarExpresionCola {

        public static void main(String[] args) {
            // Se realizan pruebas con diferentes expresiones postfijas
            System.out.println(evaluarCola("5 1 2 + 4 * + 3 -")); // 13
            System.out.println(evaluarCola("2 4 5 3 / * +"));    // 15
            System.out.println(evaluarCola("6"));                // 6
            System.out.println(evaluarCola("3 5 4 + *"));        // 32
        }

        public static String evaluarCola(String expr) {
            // Se crea una cola para almacenar los operandos durante la evaluación
            Queue<Integer> cola = new LinkedList<>();
            // Se separan los elementos de la expresión usando espacios
            String[] valores = expr.split(" ");

            try {
                for (String token : valores) {
                    // Si el token es un número, se agrega a la cola
                    if (token.matches("\\d+")) {
                        cola.offer(Integer.parseInt(token)); // Usamos offer para agregar a la cola
                    } else {
                        // Si el valor actual es un operador, se sacan los dos operandos de la cola
                        int a = cola.poll(); // Primero extraemos el primer operando
                        int b = cola.poll(); // Luego extraemos el siguiente operando
                        // Se realiza la operación correspondiente
                        switch (token) {
                            case "+":
                                cola.offer(a + b); // Agregamos el resultado a la cola
                                break;
                            case "-":
                                cola.offer(a - b);
                                break;
                            case "*":
                                cola.offer(a * b);
                                break;
                            case "/":
                                if (b == 0) return "ERROR";  // Evitar división por cero
                                cola.offer(a / b);
                                break;
                            default:
                                return "ERROR";  // Si el operador no es válido
                        }
                    }
                }
                // El resultado final debe ser el único valor restante en la cola
                return cola.poll().toString();
            } catch (Exception e) {
                return "ERROR";  // Control de errores si la expresión no es válida
            }
        }
    }
