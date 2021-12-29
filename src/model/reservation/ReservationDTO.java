package model.reservation;

public class ReservationDTO {
	private String reservationNo;//예약번호
	private String memberId;//멤버아이디참조
	private String carNumber;//차량번호 참조
	private String carPickupDate;//차량픽업일
	private String carReturnDate;//차량반납일
	public String getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarPickupDate() {
		return carPickupDate;
	}
	public void setCarPickupDate(String carPickupDate) {
		this.carPickupDate = carPickupDate;
	}
	public String getCarReturnDate() {
		return carReturnDate;
	}
	public void setCarReturnDate(String carReturnDate) {
		this.carReturnDate = carReturnDate;
	}
	
	

}
