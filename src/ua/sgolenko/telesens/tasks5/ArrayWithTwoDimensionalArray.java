package ua.sgolenko.telesens.tasks5;

public class ArrayWithTwoDimensionalArray extends AbstractArrayOfPoints {

	private double[][] xy = {};

	@Override
	public void setPoint(int i, double x, double y) {
		if (i < count()) {
			xy[i][i] = x;

		}
	}

	public static void main(String[] args) {

	}

	@Override
	public double getX(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getY(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addPoint(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub

	}

}
