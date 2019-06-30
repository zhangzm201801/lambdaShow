package lambdaShow;

public class TestLambda {
	
	public static void main(String[] args) {
		ILike like = new Like();
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