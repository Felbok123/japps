package mvc;

public class CalcModel {
	float num1, num2, result;

	public CalcModel() {
		super();

	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	protected float divide(String n1, String n2) {
		num1 = Float.parseFloat(n1);
		num2 = Float.parseFloat(n2);
		result = num1 / num2;
		return result;

	}

	protected float minus(String n1, String n2) {
		num1 = Float.parseFloat(n1);
		num2 = Float.parseFloat(n2);
		result = num1 - num2;
		return result;
	}

	protected float plus(String n1, String n2) {
		num1 = Float.parseFloat(n1);
		num2 = Float.parseFloat(n2);
		result = num1 + num2;
		return result;
	}

	protected float modulo(String n1, String n2) {
		num1 = Float.parseFloat(n1);
		num2 = Float.parseFloat(n2);
		result = num1 % num2;
		return result;
	}

	protected float multiply(String n1, String n2) {
		num1 = Float.parseFloat(n1);
		num2 = Float.parseFloat(n2);
		result = num1 * num2;
		return result;
	}

}
