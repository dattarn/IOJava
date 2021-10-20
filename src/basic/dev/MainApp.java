package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	String fullname = sc.nextLine();
	int masv = sc.nextInt();
	int cmnd = sc.nextInt();
	String tenLop = sc.nextLine();
	String tenTruong = sc.nextLine();
	int diemTb = sc.nextInt();
	
	
	System.out.println("Ho va ten: " + fullname);
	System.out.println("Ma sinh vien: " + masv);
	System.out.println("Chung minh nhan dan: " + cmnd);
	System.out.println("Ten lop: " + tenLop);
	System.out.println("Ten truong: " + tenTruong);
	System.out.println("Diem trung binh: " + diemTb);
	
	}

}
