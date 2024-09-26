package iteratorPackage;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T>{

	private Matrix<T> matrix;
	private int i, j;

	public MatrixIterator(Matrix<T> matrix) {
		this.matrix = matrix;
		i = matrix.data[0].length-1;
	}

	@Override
	public boolean hasNext() {
		return i >= 0 && j < matrix.data[0].length;
	}
	/*
	 * 			{1,2,3},
				{4,5,6},
				{7,8,9}*/
	@Override
	public T next() {
		T elemento = matrix.data[i][j];
		j++;
		if (j == matrix.data[0].length) {
			i--;
			j = 0;
		}
		return elemento;
	}

}
