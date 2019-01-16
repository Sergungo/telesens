package ua.sgolenko.telesens.tasks7;

public class ArrayCreator implements AutoCloseable {

	int count = 0;
	double[] nums = new double[10];

	public void add(double value) {

		nums[count] = value;
		count++;
	}

	@Override
	public void close() throws Exception {

		for (int i = 0; i < count; i++) {
			System.out.print(nums[i] + " ");

		}

	}
}
