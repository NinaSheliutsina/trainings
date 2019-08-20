package BinaryNumberSystem;
/**
 * Дано вещественное число от 0 до 1 (например 0.75). Напишите программу,
 * переводящую его в двоичный вид. Число передается как тип double в виде 0.75.
 * Если число не помещается в 32 бита, функция возвращает ошибку. Сигнатура
 * метода:
 *
 * string doubleToBinary(double num)
 */
public class Task1 {
    public static void main(String[] args) {
    }

    String doubleToBynary(double num) {
        if (num < 0 || num > 1) return "error";
        StringBuilder byn = new StringBuilder(".");
        while (num > 0) {
            if (byn.length() > 32) return "error";
            double ans = num * 2;
            if (ans >= 1) {
                byn.append("1");
                num = ans - 1;
            } else {
                byn.append("0");
                num = ans;
            }
        }
        return byn.toString();
    }

}
