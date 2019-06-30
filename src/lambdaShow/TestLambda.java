package lambdaShow;

/*
 * �Ƶ�lambda���ʽ
 */
public class TestLambda {
	
	static class Like2 implements ILike{

		@Override
		public void lambda() {
			System.out.println("I like lambda2");
		}
	}
	
	public static void main(String[] args) {
		ILike like = new Like();
		like.lambda();
		
		like = new Like2();
		like.lambda();
		
	}
}


interface ILike{
	void lambda();
}

class Like implements ILike{

	@Override
	public void lambda() {
		System.out.println("I like lambda");
	}

}