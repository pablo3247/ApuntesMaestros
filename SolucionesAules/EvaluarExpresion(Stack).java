import java.util.Stack;

public class EvaluarExpresion {

    public static void main(String[] args) {
        // Se realizan pruebas con diferentes expresiones postfijas
        System.out.println(evaluarPila("5 1 2 + 4 * + 3 -")); // 14
        System.out.println(evaluarPila("2 4 5 3 / * +"));    // 6
        System.out.println(evaluarPila("6"));                // 6
        System.out.println(evaluarPila("3 5 4 + *"));        // 27
    }
    public static String evaluarPila(String expr) {
        // Se crea una pila para almacenar los operandos durante la evaluación
        Stack<Integer> stack = new Stack<>();
        // Se separan los elementos de la expresión usando espacios
        String[] valores = expr.split(" ");

        try {
            for (String token : valores) {
                // Si el token es un número, se agrega a la pila
                if (token.matches("\\d+")) {
                    stack.push(Integer.parseInt(token));
                } else {
                    // Si el valor actual es un operador, se sacan los dos operandos de la pila
                    int b = stack.pop();
                    int a = stack.pop();
                    // Se realiza la operación correspondiente
                    switch (token) {
                        case "+": stack.push(a + b); break;
                        case "-": stack.push(a - b); break;
                        case "*": stack.push(a * b); break;
                        case "/":
                            if (b == 0) return "ERROR";  // Evitar división por cero
                            stack.push(a / b);
                            break;
                        default: return "ERROR";  // Si el operador no es válido
                    }
                }
            }
            // El resultado final queda en la parte de arriba de la pila
            return stack.pop().toString();
        } catch (Exception e) {
            return "ERROR";  // Control de errores si la expresión no es válida
        }
    }
}
