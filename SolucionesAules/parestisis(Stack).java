import java.util.Stack;

public class Parentesis {

    public static void main(String[] args) {
        String[] cadena = {
                "{[()]}",
                "{[(])}",
                "{{[[(())]]}}",
                "(]",
                "[({})](]"
        };

        for (String s : cadena) {
            System.out.println(s + " -> " + (esBalancedo(s) ? "Balanceado" : "No balanceado"));
        }
    }

        public static boolean esBalancedo(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false; // Cierre sin apertura
                    }

                    char open = stack.pop();
                    if (!coincidePar(open, c)) {
                        return false; // No coinciden
                    }
                }
            }

            return stack.isEmpty(); // Si está vacío, está balanceado
        }

        private static boolean coincidePar(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }

    }


    }
}
