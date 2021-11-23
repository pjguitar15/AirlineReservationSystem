public class FlightDetails {
  private String date, departureTime, flightNumber, fromBound, toBound, classType;
  private double chargeAmount;

  FlightDetails(String date, String departureTime, String flightNumber, String fromBound, String toBound,
      String classType, double chargeAmount) {
    this.date = date;
    this.departureTime = departureTime;
    this.flightNumber = flightNumber;
    this.fromBound = fromBound;
    this.toBound = toBound;
    this.classType = classType;
    this.chargeAmount = chargeAmount;
  }

  public String getDate() {
    return date;
  }

  public String getDepartureTime() {
    return departureTime;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public String getFromBound() {
    return fromBound;
  }

  public String getToBound() {
    return toBound;
  }

  public String getClassType() {
    return classType;
  }

  public double getChargeAmount() {
    return chargeAmount;
  }

  @Override
  public String toString() {
    return "Date: " + date + "\nTime: " + departureTime + "\nFlight number: " + flightNumber + "\nFrom: " + fromBound
        + "\nTo: " + toBound + "\nClass: " + classType + "\nAmount: " + chargeAmount;
  }
}
