package iteratorPackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [][]data = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		Matrix<Integer> m = new Matrix<Integer>(data);
		for(Integer m2 : m) {
			System.out.println(m2);

		}
	}

}
