
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	/**
	 * 
	 * 課題
	 *FizzBuzzプログラムでは以下の要件を満たしてください。
	 *
     *  クラス名：FizzBuzz
	 *	1から100までの数値をループで処理する
	 *	3で割り切れる数値の場合、「Fizz」と表示する
	 *	5で割り切れる数値の場合、「Buzz」と表示する
	 *	3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
	 *	それ以外の数値は、その数値をそのまま表示する 
	 *
	 *	
	 **/
		for(int a = 1; a <= 100; a++) { 
			if((a % 3 == 0) && (a % 5 == 0)) {
			//3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
				System.out.println("FizzBuzz");			
			}
			//aが3で割り切れる場合「Fizz」を表示する。
			else if(a % 3 == 0) {
				System.out.println("Fizz");
			//5で割り切れる数値の場合、「Buzz」と表示する	
			}else if(a % 5 == 0){
				System.out.println("Buzz");
			//上記以外の場合その数値をそのまま表示する 、
			}else{
				System.out.println(a);
			}
			
		};

	}

}
