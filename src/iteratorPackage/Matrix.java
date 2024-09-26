package iteratorPackage;
import java.util.Iterator;


public class Matrix<T> implements Iterable<T>{

	T data[][];
	public Matrix(T[][] data) {
		super();
		this.data = data;
	}
	public Iterator<T> iterator(){
		return new MatrixIterator<T>(this);
	}
}
