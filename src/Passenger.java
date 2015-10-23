public class Passenger {
	public static final String CANCELED = "Canceled";
	public static final String WAITLIST = "Waitlist";
	public static final String CONFIRMED = "Confirmed";
	private String bookingStatus;
	private String name;
	private Route route;
    private Integer i;
	public Passenger(String name, Route route) {
		this.name = name;
		this.route = route;
		bookingStatus = WAITLIST;
	}
	public String getPassengerName() {
		return name;
	}
	public Route getRoute() {
		return route;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void confirm() {
		if (bookingStatus.equals(WAITLIST)) {
			bookingStatus = CONFIRMED;
		}
	}
	public void cancel() {
		if (bookingStatus.equals(WAITLIST)) {
			bookingStatus = CANCELED;
		}
	}
}
