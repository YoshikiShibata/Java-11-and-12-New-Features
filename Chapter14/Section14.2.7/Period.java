import java.util.Date;

public record Period(Date start, Date end) {
	public Period {
		this.start = new Date(start.getTime());
		this.end   = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0) {
			throw new IllegalArgumentException(
				start + " after " + end);
		}
	}

	public Date start() { return new Date(start.getTime()); }
	public Date end() { return new Date(end.getTime()); }

	public boolean in(Date d) {
		return start.compareTo(d) <= 0 &&
				d.compareTo(end) <= 0;
	}
}
