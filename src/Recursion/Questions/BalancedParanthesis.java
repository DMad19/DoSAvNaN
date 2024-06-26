package Recursion.Questions;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String sequence = "}{]}";
        boolean result = isBalanced("", sequence);
        System.out.println(result);
    }

    public static boolean isBalanced(String p, String up) {
        if (p.isEmpty() && up.isEmpty()) {
            return true;
        }
        if (!p.isEmpty() && up.isEmpty()) {
            return false;
        }
        if (!p.isEmpty()) {
            if (isOpposite(p.charAt(p.length() - 1), up.charAt(0))) {
                return isBalanced(p.substring(0, p.length() - 1), up.substring(1));
            }
            return isBalanced(p + up.charAt(0), up.substring(1));
        }
        return isBalanced(up.substring(0, 1), up.substring(1));
    }

    public static boolean isOpposite(char p, char up) {
        return (p == '{' && up == '}') ||
                (p == '[' && up == ']') ||
                (p == '(' && up == ')');
    }
}
