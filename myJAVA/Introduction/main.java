package Introduction; // for only this text editor
import java.util.Scanner;
public class main /* because java file name's main */
{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input distance(km) : ");
        float Dist = Input.nextFloat();

        if (Dist <= 4.0) {
            System.out.println("Delivery Fee = Free!!!");
        } else if (Dist > 4.0 && Dist <= 10.0) {
            Dist -= 4.0f;
            Dist *= 10.0f;
            System.out.println("Delivery Fee = " + Dist + " Baht");
        } else if (Dist > 10.0) {
            float extraDist = Dist - 10.0f;
            float Fee = extraDist * 12.0f + 60.0f; // 60 คือคิดต่อจากราคาที่ไม่เกิน 10 km ทั้งหทดมารวมเพื่อคิดต่อ
            System.out.println("Delivery Fee = " + Fee + " Baht");
        }
    }
}
