package ru.sayfulin.springcourse.model;

public class Flight {

	private String DayofMonth;
	private String DayOfWeek;
	private String FlightDate;
	private String UniqueCarrier;
	private String TailNum;
	private String OriginAirportID;
	private String Origin;
	private String OriginStateName;
	private String DestAirportID;
	private String Dest;
	private String DestStateName;
	private String DepTime;
	private String DepDelay;
	private String WheelsOff;
	private String WheelsOn;
	private String ArrTime;
	private String ArrDelay;
	private String Cancelled;
	private String CancellationCode;
	private String Diverted;
	private String AirTime;
	private String Distance;

	public String getDayofMonth() {
		return DayofMonth;
	}

	public void setDayofMonth(String dayofMonth) {
		DayofMonth = dayofMonth;
	}

	public String getDayOfWeek() {
		return DayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		DayOfWeek = dayOfWeek;
	}

	public String getFlightDate() {
		return FlightDate;
	}

	public void setFlightDate(String flightDate) {
		FlightDate = flightDate;
	}

	public String getUniqueCarrier() {
		return UniqueCarrier;
	}

	public void setUniqueCarrier(String uniqueCarrier) {
		UniqueCarrier = uniqueCarrier;
	}

	public String getTailNum() {
		return TailNum;
	}

	public void setTailNum(String tailNum) {
		TailNum = tailNum;
	}

	public String getOriginAirportID() {
		return OriginAirportID;
	}

	public void setOriginAirportID(String originAirportID) {
		OriginAirportID = originAirportID;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	public String getOriginStateName() {
		return OriginStateName;
	}

	public void setOriginStateName(String originStateName) {
		OriginStateName = originStateName;
	}

	public String getDestAirportID() {
		return DestAirportID;
	}

	public void setDestAirportID(String destAirportID) {
		DestAirportID = destAirportID;
	}

	public String getDest() {
		return Dest;
	}

	public void setDest(String dest) {
		Dest = dest;
	}

	public String getDestStateName() {
		return DestStateName;
	}

	public void setDestStateName(String destStateName) {
		DestStateName = destStateName;
	}

	public String getDepTime() {
		return DepTime;
	}

	public void setDepTime(String depTime) {
		DepTime = depTime;
	}

	public String getDepDelay() {
		return DepDelay;
	}

	public void setDepDelay(String depDelay) {
		DepDelay = depDelay;
	}

	public String getWheelsOff() {
		return WheelsOff;
	}

	public void setWheelsOff(String wheelsOff) {
		WheelsOff = wheelsOff;
	}

	public String getWheelsOn() {
		return WheelsOn;
	}

	public void setWheelsOn(String wheelsOn) {
		WheelsOn = wheelsOn;
	}

	public String getArrTime() {
		return ArrTime;
	}

	public void setArrTime(String arrTime) {
		ArrTime = arrTime;
	}

	public String getArrDelay() {
		return ArrDelay;
	}

	public void setArrDelay(String arrDelay) {
		ArrDelay = arrDelay;
	}

	public String getCancelled() {
		return Cancelled;
	}

	public void setCancelled(String cancelled) {
		Cancelled = cancelled;
	}

	public String getCancellationCode() {
		return CancellationCode;
	}

	public void setCancellationCode(String cancellationCode) {
		CancellationCode = cancellationCode;
	}

	public String getDiverted() {
		return Diverted;
	}

	public void setDiverted(String diverted) {
		Diverted = diverted;
	}

	public String getAirTime() {
		return AirTime;
	}

	public void setAirTime(String airTime) {
		AirTime = airTime;
	}

	public String getDistance() {
		return Distance;
	}

	public void setDistance(String distance) {
		Distance = distance;
	}

	@Override
	public String toString() {
		return "Flight [DayofMonth=" + DayofMonth + ", DayOfWeek=" + DayOfWeek + ", FlightDate=" + FlightDate
				+ ", UniqueCarrier=" + UniqueCarrier + ", TailNum=" + TailNum + ", OriginAirportID=" + OriginAirportID
				+ ", Origin=" + Origin + ", OriginStateName=" + OriginStateName + ", DestAirportID=" + DestAirportID
				+ ", Dest=" + Dest + ", DestStateName=" + DestStateName + ", DepTime=" + DepTime + ", DepDelay="
				+ DepDelay + ", WheelsOff=" + WheelsOff + ", WheelsOn=" + WheelsOn + ", ArrTime=" + ArrTime
				+ ", ArrDelay=" + ArrDelay + ", Cancelled=" + Cancelled + ", CancellationCode=" + CancellationCode
				+ ", Diverted=" + Diverted + ", AirTime=" + AirTime + ", Distance=" + Distance + "]";
	}

}
