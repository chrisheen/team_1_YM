package model.reservation;

public class ReservationDTO {
	private String reservationNo;//�����ȣ
	private String memberId;//������̵�����
	private String carNumber;//������ȣ ����
	private String carPickupDate;//�����Ⱦ���
	private String carReturnDate;//�����ݳ���
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
