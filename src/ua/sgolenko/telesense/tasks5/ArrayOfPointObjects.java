package ua.sgolenko.telesense.tasks5;



public class ArrayOfPointObjects extends AbstractArrayOfPoints {

	private Point[] p = {};

	@Override
	public void setPoint(int i, double x, double y) {
		if (i < count()) {
			p[i].setPoint(x, y);
		}
	}

	@Override
	public double getX(int i) {
		return p[i].getX();
	}

	@Override
	public double getY(int i) {
		return p[i].getY();
	}

	@Override
	public int count() {
		return p.length;
	}

	@Override
	public void addPoint(double x, double y) {
		// ������� ������, ������� �� ���� �������:
		Point[] p1 = new Point[p.length + 1];
		// �������� ��� ��������:
		System.arraycopy(p, 0, p1, 0, p.length);
		// ���������� ����� ����� � ��������� �������:
		p1[p.length] = new Point(x, y);
		p = p1; // ������ p ��������� �� ����� ������
	}

	@Override
	public void removeLast() {
		if (p.length == 0)
			return; // ������ ��� ������
		// ������� ������, ������� �� ���� �������:
		Point[] p1 = new Point[p.length - 1];
		// �������� ��� ��������, ����� ����������:
		System.arraycopy(p, 0, p1, 0, p1.length);
		p = p1; // ������ p ��������� �� ����� ������
	}

	public static void main(String[] args) {
		// ����� ������� ���������� ������:
		new ArrayOfPointObjects().test();
	}

}
