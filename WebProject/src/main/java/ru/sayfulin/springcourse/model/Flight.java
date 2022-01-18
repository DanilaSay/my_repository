package ru.sayfulin.springcourse.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;




@Getter
@Setter
@ToString
public class Flight {

	private Integer DayofMonth;
	private Integer DayOfWeek;
	private String FlightDate;
	private String UniqueCarrier;
	private String TailNum;
	private String OriginAirportID;
	private String Origin;
	private String OriginStateName;
	private String DestAirportID;
	private String Dest;
	private String DestStateName;
	private Integer DepTime;
	private Integer DepDelay;
	private String WheelsOff;
	private String WheelsOn;
	private Integer ArrTime;
	private Integer ArrDelay;
	private boolean Cancelled;
	private String CancellationCode;
	private boolean Diverted;
	private Integer AirTime;
	private Integer Distance;
	
	/**
	 * Вернуть флажок отмененного рейса
	 * @return cancelled
	 */
	public boolean isCancelled() {
		return Cancelled;
	}
	
	/**
	 * Вернуть флажок перенаправленного рейс
	 * @return diverted
	 */
	public boolean isDiverted() {
		return Diverted;
	}


}
