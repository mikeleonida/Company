package company;

public interface PaidOvertime {
	public final double OVERTIME_RATE = 1.5;
	public final double OVERTIME_HOURS_THRESHOLD = 40.0;
	
	public double calculateOvertimePay(Employee e);
}
