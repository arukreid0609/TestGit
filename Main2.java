import java.util.Scanner;
import main.*;

public class Main2{
	public static void main(String[] args){
		System.out.println("Hello Woooooorld!!");
		Scanner sc = new Scanner(System.in);
		System.out.print("あなたの名前は？:");
		String name = sc.nextLine();
		System.out.println(name + "さん、ようこそ！プログラミングの世界へ！");
		System.out.println("VSCodeで書き足しました");
		System.out.println(System.getenv("Tekitou"));
		Main3.AAA();
	}
}